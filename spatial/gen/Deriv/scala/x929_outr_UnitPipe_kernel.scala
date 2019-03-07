import emul._
import emul.implicits._

/** BEGIN UnitPipe x929_outr_UnitPipe **/
object x929_outr_UnitPipe_kernel {
  def run(
    b511: Bool,
    b495: FixedPoint
  ): Unit = if (b511){
    val x900_inr_UnitPipe = x900_inr_UnitPipe_kernel.run(b495)
    val x901 = x870.foreach{cmd => 
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
        x872.enqueue(data)
      }
    }
    x870.clear()
    val x928_outr_UnitPipe = x928_outr_UnitPipe_kernel.run()
  } else null.asInstanceOf[Unit]
}
/** END UnitPipe x929_outr_UnitPipe **/
