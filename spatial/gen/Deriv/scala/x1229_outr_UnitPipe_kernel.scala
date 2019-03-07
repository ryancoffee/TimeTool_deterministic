import emul._
import emul.implicits._

/** BEGIN UnitPipe x1229_outr_UnitPipe **/
object x1229_outr_UnitPipe_kernel {
  def run(
    b500: FixedPoint,
    b516: Bool
  ): Unit = if (b516){
    val x1200_inr_UnitPipe = x1200_inr_UnitPipe_kernel.run(b500)
    val x1201 = x1170.foreach{cmd => 
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
        x1172.enqueue(data)
      }
    }
    x1170.clear()
    val x1228_outr_UnitPipe = x1228_outr_UnitPipe_kernel.run()
  } else null.asInstanceOf[Unit]
}
/** END UnitPipe x1229_outr_UnitPipe **/
