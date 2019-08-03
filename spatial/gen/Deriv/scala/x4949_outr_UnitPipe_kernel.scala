import emul._
import emul.implicits._

/** BEGIN UnitPipe x4949_outr_UnitPipe **/
object x4949_outr_UnitPipe_kernel {
  def run(
  ): Unit = {
    val x4933_inr_UnitPipe = x4933_inr_UnitPipe_kernel.run()
    val x4934_ctr = Counter(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)), FixedPoint(BigDecimal("128"),FixFormat(true,32,0)), FixedPoint(BigDecimal("1"),FixFormat(true,32,0)), FixedPoint(BigDecimal("1"),FixFormat(true,32,0)))
    val x4935_ctrchain = Array[Counterlike](x4934_ctr)
    val x4944_inr_Foreach = x4944_inr_Foreach_kernel.run(x4935_ctrchain)
    val x4945 = x4922.foreach{cmd => 
      for (i <- cmd.offset until cmd.offset+cmd.size by 8) {
        val data = x4923.dequeue()
        try {
          if (data._2) x486_output_falling_dram(i / 8) = data._1
        }
        catch {case err: java.lang.ArrayIndexOutOfBoundsException => 
          System.out.println("[warn] Deriv.scala:112:141 Memory output_falling_dram: Out of bounds write at address " + err.getMessage)
        }
      }
      x4924.enqueue(true)
    }
    x4922.clear()
    val x4948_inr_UnitPipe = x4948_inr_UnitPipe_kernel.run()
  } 
}
/** END UnitPipe x4949_outr_UnitPipe **/
