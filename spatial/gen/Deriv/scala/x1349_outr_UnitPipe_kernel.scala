import emul._
import emul.implicits._

/** BEGIN UnitPipe x1349_outr_UnitPipe **/
object x1349_outr_UnitPipe_kernel {
  def run(
    b518: Bool,
    b502: FixedPoint
  ): Unit = if (b518){
    val x1320_inr_UnitPipe = x1320_inr_UnitPipe_kernel.run(b502)
    val x1321 = x1290.foreach{cmd => 
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
        x1292.enqueue(data)
      }
    }
    x1290.clear()
    val x1348_outr_UnitPipe = x1348_outr_UnitPipe_kernel.run()
  } else null.asInstanceOf[Unit]
}
/** END UnitPipe x1349_outr_UnitPipe **/
