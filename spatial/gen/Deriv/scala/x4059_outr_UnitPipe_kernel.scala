import emul._
import emul.implicits._

/** BEGIN UnitPipe x4059_outr_UnitPipe **/
object x4059_outr_UnitPipe_kernel {
  def run(
  ): Unit = {
    val x4043_inr_UnitPipe = x4043_inr_UnitPipe_kernel.run()
    val x4044_ctr = Counter(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)), FixedPoint(BigDecimal("128"),FixFormat(true,32,0)), FixedPoint(BigDecimal("1"),FixFormat(true,32,0)), FixedPoint(BigDecimal("1"),FixFormat(true,32,0)))
    val x4045_ctrchain = Array[Counterlike](x4044_ctr)
    val x4054_inr_Foreach = x4054_inr_Foreach_kernel.run(x4045_ctrchain)
    val x4055 = x4032.foreach{cmd => 
      for (i <- cmd.offset until cmd.offset+cmd.size by 8) {
        val data = x4033.dequeue()
        try {
          if (data._2) x484_output_rising_dram(i / 8) = data._1
        }
        catch {case err: java.lang.ArrayIndexOutOfBoundsException => 
          System.out.println("[warn] Deriv.scala:109:140 Memory output_rising_dram: Out of bounds write at address " + err.getMessage)
        }
      }
      x4034.enqueue(true)
    }
    x4032.clear()
    val x4058_inr_UnitPipe = x4058_inr_UnitPipe_kernel.run()
  } 
}
/** END UnitPipe x4059_outr_UnitPipe **/
