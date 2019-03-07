import emul._
import emul.implicits._

/** BEGIN UnitPipe x5425_outr_UnitPipe **/
object x5425_outr_UnitPipe_kernel {
  def run(
  ): Unit = {
    val x5409_inr_UnitPipe = x5409_inr_UnitPipe_kernel.run()
    val x5410_ctr = Counter(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)), FixedPoint(BigDecimal("128"),FixFormat(true,32,0)), FixedPoint(BigDecimal("1"),FixFormat(true,32,0)), FixedPoint(BigDecimal("1"),FixFormat(true,32,0)))
    val x5411_ctrchain = Array[Counterlike](x5410_ctr)
    val x5420_inr_Foreach = x5420_inr_Foreach_kernel.run(x5411_ctrchain)
    val x5421 = x5398.foreach{cmd => 
      for (i <- cmd.offset until cmd.offset+cmd.size by 8) {
        val data = x5399.dequeue()
        try {
          if (data._2) x486_output_falling_dram(i / 8) = data._1
        }
        catch {case err: java.lang.ArrayIndexOutOfBoundsException => 
          System.out.println("[warn] Deriv.scala:112:141 Memory output_falling_dram: Out of bounds write at address " + err.getMessage)
        }
      }
      x5400.enqueue(true)
    }
    x5398.clear()
    val x5424_inr_UnitPipe = x5424_inr_UnitPipe_kernel.run()
  } 
}
/** END UnitPipe x5425_outr_UnitPipe **/
