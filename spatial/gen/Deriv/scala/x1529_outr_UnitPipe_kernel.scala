import emul._
import emul.implicits._

/** BEGIN UnitPipe x1529_outr_UnitPipe **/
object x1529_outr_UnitPipe_kernel {
  def run(
    b521: Bool,
    b505: FixedPoint
  ): Unit = if (b521){
    val x1500_inr_UnitPipe = x1500_inr_UnitPipe_kernel.run(b505)
    val x1501 = x1470.foreach{cmd => 
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
        x1472.enqueue(data)
      }
    }
    x1470.clear()
    val x1528_outr_UnitPipe = x1528_outr_UnitPipe_kernel.run()
  } else null.asInstanceOf[Unit]
}
/** END UnitPipe x1529_outr_UnitPipe **/
