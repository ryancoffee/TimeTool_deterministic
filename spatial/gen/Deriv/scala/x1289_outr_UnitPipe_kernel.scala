import emul._
import emul.implicits._

/** BEGIN UnitPipe x1289_outr_UnitPipe **/
object x1289_outr_UnitPipe_kernel {
  def run(
    b517: Bool,
    b501: FixedPoint
  ): Unit = if (b517){
    val x1260_inr_UnitPipe = x1260_inr_UnitPipe_kernel.run(b501)
    val x1261 = x1230.foreach{cmd => 
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
        x1232.enqueue(data)
      }
    }
    x1230.clear()
    val x1288_outr_UnitPipe = x1288_outr_UnitPipe_kernel.run()
  } else null.asInstanceOf[Unit]
}
/** END UnitPipe x1289_outr_UnitPipe **/
