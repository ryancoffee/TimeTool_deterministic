import emul._
import emul.implicits._

/** BEGIN UnitPipe x1109_outr_UnitPipe **/
object x1109_outr_UnitPipe_kernel {
  def run(
    b514: Bool,
    b498: FixedPoint
  ): Unit = if (b514){
    val x1080_inr_UnitPipe = x1080_inr_UnitPipe_kernel.run(b498)
    val x1081 = x1050.foreach{cmd => 
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
        x1052.enqueue(data)
      }
    }
    x1050.clear()
    val x1108_outr_UnitPipe = x1108_outr_UnitPipe_kernel.run()
  } else null.asInstanceOf[Unit]
}
/** END UnitPipe x1109_outr_UnitPipe **/
