import emul._
import emul.implicits._

/** BEGIN UnitPipe x1169_outr_UnitPipe **/
object x1169_outr_UnitPipe_kernel {
  def run(
    b499: FixedPoint,
    b515: Bool
  ): Unit = if (b515){
    val x1140_inr_UnitPipe = x1140_inr_UnitPipe_kernel.run(b499)
    val x1141 = x1110.foreach{cmd => 
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
        x1112.enqueue(data)
      }
    }
    x1110.clear()
    val x1168_outr_UnitPipe = x1168_outr_UnitPipe_kernel.run()
  } else null.asInstanceOf[Unit]
}
/** END UnitPipe x1169_outr_UnitPipe **/
