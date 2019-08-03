import emul._
import emul.implicits._

/** BEGIN UnitPipe x1469_outr_UnitPipe **/
object x1469_outr_UnitPipe_kernel {
  def run(
    b504: FixedPoint,
    b520: Bool
  ): Unit = if (b520){
    val x1440_inr_UnitPipe = x1440_inr_UnitPipe_kernel.run(b504)
    val x1441 = x1410.foreach{cmd => 
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
        x1412.enqueue(data)
      }
    }
    x1410.clear()
    val x1468_outr_UnitPipe = x1468_outr_UnitPipe_kernel.run()
  } else null.asInstanceOf[Unit]
}
/** END UnitPipe x1469_outr_UnitPipe **/
