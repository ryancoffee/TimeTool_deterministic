import emul._
import emul.implicits._

/** BEGIN UnitPipe x4416_outr_UnitPipe **/
object x4416_outr_UnitPipe_kernel {
  def run(
  ): Unit = {
    val x4400_inr_UnitPipe = x4400_inr_UnitPipe_kernel.run()
    val x4401_ctr = Counter(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)), FixedPoint(BigDecimal("128"),FixFormat(true,32,0)), FixedPoint(BigDecimal("1"),FixFormat(true,32,0)), FixedPoint(BigDecimal("1"),FixFormat(true,32,0)))
    val x4402_ctrchain = Array[Counterlike](x4401_ctr)
    val x4411_inr_Foreach = x4411_inr_Foreach_kernel.run(x4402_ctrchain)
    val x4412 = x4389.foreach{cmd => 
      for (i <- cmd.offset until cmd.offset+cmd.size by 8) {
        val data = x4390.dequeue()
        try {
          if (data._2) x484_output_rising_dram(i / 8) = data._1
        }
        catch {case err: java.lang.ArrayIndexOutOfBoundsException => 
          System.out.println("[warn] Deriv.scala:109:140 Memory output_rising_dram: Out of bounds write at address " + err.getMessage)
        }
      }
      x4391.enqueue(true)
    }
    x4389.clear()
    val x4415_inr_UnitPipe = x4415_inr_UnitPipe_kernel.run()
  } 
}
/** END UnitPipe x4416_outr_UnitPipe **/
