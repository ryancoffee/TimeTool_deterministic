import emul._
import emul.implicits._

/** BEGIN UnitPipe x749_outr_UnitPipe **/
object x749_outr_UnitPipe_kernel {
  def run(
    b492: FixedPoint,
    b508: Bool
  ): Unit = if (b508){
    val x720_inr_UnitPipe = x720_inr_UnitPipe_kernel.run(b492)
    val x721 = x690.foreach{cmd => 
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
        x692.enqueue(data)
      }
    }
    x690.clear()
    val x748_outr_UnitPipe = x748_outr_UnitPipe_kernel.run()
  } else null.asInstanceOf[Unit]
}
/** END UnitPipe x749_outr_UnitPipe **/
