import emul._
import emul.implicits._

/** BEGIN UnitPipe x689_outr_UnitPipe **/
object x689_outr_UnitPipe_kernel {
  def run(
    b507: Bool,
    b491: FixedPoint
  ): Unit = if (b507){
    val x660_inr_UnitPipe = x660_inr_UnitPipe_kernel.run(b491)
    val x661 = x630.foreach{cmd => 
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
        x632.enqueue(data)
      }
    }
    x630.clear()
    val x688_outr_UnitPipe = x688_outr_UnitPipe_kernel.run()
  } else null.asInstanceOf[Unit]
}
/** END UnitPipe x689_outr_UnitPipe **/
