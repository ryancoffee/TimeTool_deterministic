import emul._
import emul.implicits._

/** BEGIN UnitPipe x809_outr_UnitPipe **/
object x809_outr_UnitPipe_kernel {
  def run(
    b493: FixedPoint,
    b509: Bool
  ): Unit = if (b509){
    val x780_inr_UnitPipe = x780_inr_UnitPipe_kernel.run(b493)
    val x781 = x750.foreach{cmd => 
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
        x752.enqueue(data)
      }
    }
    x750.clear()
    val x808_outr_UnitPipe = x808_outr_UnitPipe_kernel.run()
  } else null.asInstanceOf[Unit]
}
/** END UnitPipe x809_outr_UnitPipe **/
