import emul._
import emul.implicits._

/** BEGIN UnitPipe x629_outr_UnitPipe **/
object x629_outr_UnitPipe_kernel {
  def run(
    b490: FixedPoint,
    b506: Bool
  ): Unit = if (b506){
    val x600_inr_UnitPipe = x600_inr_UnitPipe_kernel.run(b490)
    val x601 = x570.foreach{cmd => 
      for (i <- cmd.offset until cmd.offset+cmd.size by 2) {
        val data = {
          try {
            x480_input_dram.apply(i / 2)
          }
          catch {case err: java.lang.ArrayIndexOutOfBoundsException => 
            System.out.println("[warn] Deriv.scala:90:20 Memory input_dram: Out of bounds read at address " + err.getMessage)
            FixedPoint.invalid(FixFormat(true,16,0))
          }
        }
        x572.enqueue(data)
      }
    }
    x570.clear()
    val x628_outr_UnitPipe = x628_outr_UnitPipe_kernel.run()
  } else null.asInstanceOf[Unit]
}
/** END UnitPipe x629_outr_UnitPipe **/
