import emul._
import emul.implicits._

/** BEGIN UnitPipe x989_outr_UnitPipe **/
object x989_outr_UnitPipe_kernel {
  def run(
    b512: Bool,
    b496: FixedPoint
  ): Unit = if (b512){
    val x960_inr_UnitPipe = x960_inr_UnitPipe_kernel.run(b496)
    val x961 = x930.foreach{cmd => 
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
        x932.enqueue(data)
      }
    }
    x930.clear()
    val x988_outr_UnitPipe = x988_outr_UnitPipe_kernel.run()
  } else null.asInstanceOf[Unit]
}
/** END UnitPipe x989_outr_UnitPipe **/
