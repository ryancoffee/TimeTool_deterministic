import emul._
import emul.implicits._

/** BEGIN UnitPipe x4535_outr_UnitPipe **/
object x4535_outr_UnitPipe_kernel {
  def run(
  ): Unit = {
    val x4519_inr_UnitPipe = x4519_inr_UnitPipe_kernel.run()
    val x4520_ctr = Counter(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)), FixedPoint(BigDecimal("128"),FixFormat(true,32,0)), FixedPoint(BigDecimal("1"),FixFormat(true,32,0)), FixedPoint(BigDecimal("1"),FixFormat(true,32,0)))
    val x4521_ctrchain = Array[Counterlike](x4520_ctr)
    val x4530_inr_Foreach = x4530_inr_Foreach_kernel.run(x4521_ctrchain)
    val x4531 = x4508.foreach{cmd => 
      for (i <- cmd.offset until cmd.offset+cmd.size by 8) {
        val data = x4509.dequeue()
        try {
          if (data._2) x484_output_rising_dram(i / 8) = data._1
        }
        catch {case err: java.lang.ArrayIndexOutOfBoundsException => 
          System.out.println("[warn] Deriv.scala:109:140 Memory output_rising_dram: Out of bounds write at address " + err.getMessage)
        }
      }
      x4510.enqueue(true)
    }
    x4508.clear()
    val x4534_inr_UnitPipe = x4534_inr_UnitPipe_kernel.run()
  } 
}
/** END UnitPipe x4535_outr_UnitPipe **/
