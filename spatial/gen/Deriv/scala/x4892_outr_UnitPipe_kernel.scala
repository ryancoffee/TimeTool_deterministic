import emul._
import emul.implicits._

/** BEGIN UnitPipe x4892_outr_UnitPipe **/
object x4892_outr_UnitPipe_kernel {
  def run(
  ): Unit = {
    val x4876_inr_UnitPipe = x4876_inr_UnitPipe_kernel.run()
    val x4877_ctr = Counter(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)), FixedPoint(BigDecimal("128"),FixFormat(true,32,0)), FixedPoint(BigDecimal("1"),FixFormat(true,32,0)), FixedPoint(BigDecimal("1"),FixFormat(true,32,0)))
    val x4878_ctrchain = Array[Counterlike](x4877_ctr)
    val x4887_inr_Foreach = x4887_inr_Foreach_kernel.run(x4878_ctrchain)
    val x4888 = x4865.foreach{cmd => 
      for (i <- cmd.offset until cmd.offset+cmd.size by 8) {
        val data = x4866.dequeue()
        try {
          if (data._2) x484_output_rising_dram(i / 8) = data._1
        }
        catch {case err: java.lang.ArrayIndexOutOfBoundsException => 
          System.out.println("[warn] Deriv.scala:109:140 Memory output_rising_dram: Out of bounds write at address " + err.getMessage)
        }
      }
      x4867.enqueue(true)
    }
    x4865.clear()
    val x4891_inr_UnitPipe = x4891_inr_UnitPipe_kernel.run()
  } 
}
/** END UnitPipe x4892_outr_UnitPipe **/
