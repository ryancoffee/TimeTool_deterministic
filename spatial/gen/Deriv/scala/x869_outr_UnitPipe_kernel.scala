import emul._
import emul.implicits._

/** BEGIN UnitPipe x869_outr_UnitPipe **/
object x869_outr_UnitPipe_kernel {
  def run(
    b494: FixedPoint,
    b510: Bool
  ): Unit = if (b510){
    val x840_inr_UnitPipe = x840_inr_UnitPipe_kernel.run(b494)
    val x841 = x810.foreach{cmd => 
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
        x812.enqueue(data)
      }
    }
    x810.clear()
    val x868_outr_UnitPipe = x868_outr_UnitPipe_kernel.run()
  } else null.asInstanceOf[Unit]
}
/** END UnitPipe x869_outr_UnitPipe **/
