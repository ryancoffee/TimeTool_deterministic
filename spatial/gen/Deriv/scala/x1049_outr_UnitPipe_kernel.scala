import emul._
import emul.implicits._

/** BEGIN UnitPipe x1049_outr_UnitPipe **/
object x1049_outr_UnitPipe_kernel {
  def run(
    b513: Bool,
    b497: FixedPoint
  ): Unit = if (b513){
    val x1020_inr_UnitPipe = x1020_inr_UnitPipe_kernel.run(b497)
    val x1021 = x990.foreach{cmd => 
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
        x992.enqueue(data)
      }
    }
    x990.clear()
    val x1048_outr_UnitPipe = x1048_outr_UnitPipe_kernel.run()
  } else null.asInstanceOf[Unit]
}
/** END UnitPipe x1049_outr_UnitPipe **/
