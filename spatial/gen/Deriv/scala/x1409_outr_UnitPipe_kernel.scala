import emul._
import emul.implicits._

/** BEGIN UnitPipe x1409_outr_UnitPipe **/
object x1409_outr_UnitPipe_kernel {
  def run(
    b519: Bool,
    b503: FixedPoint
  ): Unit = if (b519){
    val x1380_inr_UnitPipe = x1380_inr_UnitPipe_kernel.run(b503)
    val x1381 = x1350.foreach{cmd => 
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
        x1352.enqueue(data)
      }
    }
    x1350.clear()
    val x1408_outr_UnitPipe = x1408_outr_UnitPipe_kernel.run()
  } else null.asInstanceOf[Unit]
}
/** END UnitPipe x1409_outr_UnitPipe **/
