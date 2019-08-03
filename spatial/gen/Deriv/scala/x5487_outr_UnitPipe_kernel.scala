import emul._
import emul.implicits._

/** BEGIN UnitPipe x5487_outr_UnitPipe **/
object x5487_outr_UnitPipe_kernel {
  def run(
  ): Unit = {
    val x5471_inr_UnitPipe = x5471_inr_UnitPipe_kernel.run()
    val x5472_ctr = Counter(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)), FixedPoint(BigDecimal("128"),FixFormat(true,32,0)), FixedPoint(BigDecimal("1"),FixFormat(true,32,0)), FixedPoint(BigDecimal("1"),FixFormat(true,32,0)))
    val x5473_ctrchain = Array[Counterlike](x5472_ctr)
    val x5482_inr_Foreach = x5482_inr_Foreach_kernel.run(x5473_ctrchain)
    val x5483 = x5460.foreach{cmd => 
      for (i <- cmd.offset until cmd.offset+cmd.size by 8) {
        val data = x5461.dequeue()
        try {
          if (data._2) x484_output_rising_dram(i / 8) = data._1
        }
        catch {case err: java.lang.ArrayIndexOutOfBoundsException => 
          System.out.println("[warn] Deriv.scala:109:140 Memory output_rising_dram: Out of bounds write at address " + err.getMessage)
        }
      }
      x5462.enqueue(true)
    }
    x5460.clear()
    val x5486_inr_UnitPipe = x5486_inr_UnitPipe_kernel.run()
  } 
}
/** END UnitPipe x5487_outr_UnitPipe **/
