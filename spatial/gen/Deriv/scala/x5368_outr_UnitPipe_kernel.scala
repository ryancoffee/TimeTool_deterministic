import emul._
import emul.implicits._

/** BEGIN UnitPipe x5368_outr_UnitPipe **/
object x5368_outr_UnitPipe_kernel {
  def run(
  ): Unit = {
    val x5352_inr_UnitPipe = x5352_inr_UnitPipe_kernel.run()
    val x5353_ctr = Counter(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)), FixedPoint(BigDecimal("128"),FixFormat(true,32,0)), FixedPoint(BigDecimal("1"),FixFormat(true,32,0)), FixedPoint(BigDecimal("1"),FixFormat(true,32,0)))
    val x5354_ctrchain = Array[Counterlike](x5353_ctr)
    val x5363_inr_Foreach = x5363_inr_Foreach_kernel.run(x5354_ctrchain)
    val x5364 = x5341.foreach{cmd => 
      for (i <- cmd.offset until cmd.offset+cmd.size by 8) {
        val data = x5342.dequeue()
        try {
          if (data._2) x484_output_rising_dram(i / 8) = data._1
        }
        catch {case err: java.lang.ArrayIndexOutOfBoundsException => 
          System.out.println("[warn] Deriv.scala:109:140 Memory output_rising_dram: Out of bounds write at address " + err.getMessage)
        }
      }
      x5343.enqueue(true)
    }
    x5341.clear()
    val x5367_inr_UnitPipe = x5367_inr_UnitPipe_kernel.run()
  } 
}
/** END UnitPipe x5368_outr_UnitPipe **/
