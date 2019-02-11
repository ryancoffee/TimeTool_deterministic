object Helpers {
  /** h(t) = low pass = gaussian
    * y(t) = real data lineout
    * d/dt (h * y) = d/dt (h) * y
    *
    * d/dt (h) = d/dt 1/(s*sqrt(2pi)) * e^(-t^2/[2s^2]) = -t/(s^3*sqrt(2pi)) * e^(-t^2/[2s^2])
    *
    */
  def build_derivkernel(sig: Double, window: Int): Seq[Double] = {
    import scala.math._

    val data = Seq.tabulate(window){i => 
      val t = i - (window-1)/2
      val exp = -pow(t,2)/2/pow(sig,2)
      val coef = -t/pow(sig,3)/sqrt(2*Pi)
      coef * pow(E,exp)
    }
    val factor = 1.0/data.map(abs).sum
    // offsets_p = [i for i in range(0,2*offset,1)]
    // offsets_n = [offset+i for i in range(0,2*offset,1)]
    // sp_mat_p = sparse.dia_matrix((data,offsets_p),shape=(npixels,npixels)) 
    // sp_mat_n = sparse.dia_matrix((data,offsets_n),shape=(npixels,npixels))
    // norm = np.sum(sp_mat_p,axis=0)
    // return sparse.csr_matrix((sp_mat_p-sp_mat_n)/norm).T
    println(s"factor is $factor")
    val d2 = data.map(_*factor)
    println(data.map(abs).sum)
    println(d2.map(abs).sum)
    d2
  }

}

import spatial.dsl._

@spatial object Deriv extends SpatialApp {

  type T = FixPt[TRUE, _16, _16]
  val colTileSize = 64
  val rowTileSize = 128
  val deriv_window = 20
  @struct case class score(idx: Int, v: I32)
  def main(args: Array[String]): Unit = {

    // Get hard/soft derivative kernels
    val sharp_kernel = Helpers.build_derivkernel(deriv_window/8, deriv_window)

    // Get input data
    val input_data = loadCSV2D[I16](sys.env("DATA_FS") + "/processed/xppc00117_r136_refsub_ipm4_del3.out", " ", "\n")

    // Set up dram
    val COLS = ArgIn[Int]
    val ROWS = ArgIn[Int]
    val ROWS_TODO = ArgIn[Int]
    setArg(COLS, input_data.cols)
    setArg(ROWS, input_data.rows)
    setArg(ROWS_TODO, args(0).to[Int])
    val input_dram = DRAM[I16](ROWS, COLS)
    setMem(input_dram, input_data)
    val output_rising_dram = DRAM[score](ROWS_TODO)
    val output_falling_dram = DRAM[score](ROWS_TODO)

    Accel{
      Foreach(ROWS_TODO by 1){r => 
        val input_fifo = FIFO[I16](colTileSize)
        val rising = FIFO[score](4)//(score(0,-999.to[I32]))
        val falling = FIFO[score](4)//(score(0,999.to[I32]))

        // Stage 1: Load
        input_fifo load input_dram(r, 0::COLS)

        // Stage 2: Process
        Foreach(COLS by 1){c => 
          val best_rising = Reg[score](score(0, -999.to[I32])).buffer
          val best_falling = Reg[score](score(0, -999.to[I32])).buffer
          val sr = RegFile[I16](deriv_window)
          val sharp_lut = LUT[T](deriv_window)(sharp_kernel.map(_.to[T]):_*)
          sr <<= input_fifo.deq()
          val t = Reduce(Reg[T])(deriv_window by 1){i => sr(i).to[T] * sharp_lut(i)}{_+_}
          if (c == deriv_window || (c > deriv_window && t.value.to[I32] > best_rising.value.v)) {best_rising := score(c,t.value.to[I32])}
          if (c == COLS-1) rising.enq(best_rising.value)
          if (c == deriv_window || (c > deriv_window && t.value.to[I32] < best_falling.value.v)) {best_falling := score(c,t.value.to[I32])}
          if (c == COLS-1) falling.enq(best_falling.value)
        }

        // Stage 3: Store
        Pipe{
          val best_rising_sram = SRAM[score](rowTileSize)
          best_rising_sram(r % rowTileSize) = rising.deq()
          if (r == ROWS_TODO-1 || r % rowTileSize == rowTileSize-1) output_rising_dram(r-(r%rowTileSize)::r-(r%rowTileSize) + rowTileSize) store best_rising_sram
          val best_falling_sram = SRAM[score](rowTileSize)
          best_falling_sram(r % rowTileSize) = falling.deq()
          if (r == ROWS_TODO-1 || r % rowTileSize == rowTileSize-1) output_falling_dram(r-(r%rowTileSize)::r-(r%rowTileSize) + rowTileSize) store best_falling_sram
        }
      }
    }

    val result_rising_dram = getMem(output_rising_dram)
    printArray(result_rising_dram, "Rising:")
    val result_falling_dram = getMem(output_falling_dram)
    printArray(result_falling_dram, "Falling:")

  }
}

