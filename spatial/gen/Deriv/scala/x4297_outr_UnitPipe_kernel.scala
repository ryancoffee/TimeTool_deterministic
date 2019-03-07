import emul._
import emul.implicits._

/** BEGIN UnitPipe x4297_outr_UnitPipe **/
object x4297_outr_UnitPipe_kernel {
  def run(
  ): Unit = {
    val x4281_inr_UnitPipe = x4281_inr_UnitPipe_kernel.run()
    val x4282_ctr = Counter(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)), FixedPoint(BigDecimal("128"),FixFormat(true,32,0)), FixedPoint(BigDecimal("1"),FixFormat(true,32,0)), FixedPoint(BigDecimal("1"),FixFormat(true,32,0)))
    val x4283_ctrchain = Array[Counterlike](x4282_ctr)
    val x4292_inr_Foreach = x4292_inr_Foreach_kernel.run(x4283_ctrchain)
    val x4293 = x4270.foreach{cmd => 
      for (i <- cmd.offset until cmd.offset+cmd.size by 8) {
        val data = x4271.dequeue()
        try {
          if (data._2) x484_output_rising_dram(i / 8) = data._1
        }
        catch {case err: java.lang.ArrayIndexOutOfBoundsException => 
          System.out.println("[warn] Deriv.scala:109:140 Memory output_rising_dram: Out of bounds write at address " + err.getMessage)
        }
      }
      x4272.enqueue(true)
    }
    x4270.clear()
    val x4296_inr_UnitPipe = x4296_inr_UnitPipe_kernel.run()
  } 
}
/** END UnitPipe x4297_outr_UnitPipe **/
