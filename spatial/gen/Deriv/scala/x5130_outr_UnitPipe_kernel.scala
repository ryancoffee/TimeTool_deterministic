import emul._
import emul.implicits._

/** BEGIN UnitPipe x5130_outr_UnitPipe **/
object x5130_outr_UnitPipe_kernel {
  def run(
  ): Unit = {
    val x5114_inr_UnitPipe = x5114_inr_UnitPipe_kernel.run()
    val x5115_ctr = Counter(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)), FixedPoint(BigDecimal("128"),FixFormat(true,32,0)), FixedPoint(BigDecimal("1"),FixFormat(true,32,0)), FixedPoint(BigDecimal("1"),FixFormat(true,32,0)))
    val x5116_ctrchain = Array[Counterlike](x5115_ctr)
    val x5125_inr_Foreach = x5125_inr_Foreach_kernel.run(x5116_ctrchain)
    val x5126 = x5103.foreach{cmd => 
      for (i <- cmd.offset until cmd.offset+cmd.size by 8) {
        val data = x5104.dequeue()
        try {
          if (data._2) x484_output_rising_dram(i / 8) = data._1
        }
        catch {case err: java.lang.ArrayIndexOutOfBoundsException => 
          System.out.println("[warn] Deriv.scala:109:140 Memory output_rising_dram: Out of bounds write at address " + err.getMessage)
        }
      }
      x5105.enqueue(true)
    }
    x5103.clear()
    val x5129_inr_UnitPipe = x5129_inr_UnitPipe_kernel.run()
  } 
}
/** END UnitPipe x5130_outr_UnitPipe **/
