import emul._
import emul.implicits._

/** BEGIN UnitPipe x5544_outr_UnitPipe **/
object x5544_outr_UnitPipe_kernel {
  def run(
  ): Unit = {
    val x5528_inr_UnitPipe = x5528_inr_UnitPipe_kernel.run()
    val x5529_ctr = Counter(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)), FixedPoint(BigDecimal("128"),FixFormat(true,32,0)), FixedPoint(BigDecimal("1"),FixFormat(true,32,0)), FixedPoint(BigDecimal("1"),FixFormat(true,32,0)))
    val x5530_ctrchain = Array[Counterlike](x5529_ctr)
    val x5539_inr_Foreach = x5539_inr_Foreach_kernel.run(x5530_ctrchain)
    val x5540 = x5517.foreach{cmd => 
      for (i <- cmd.offset until cmd.offset+cmd.size by 8) {
        val data = x5518.dequeue()
        try {
          if (data._2) x486_output_falling_dram(i / 8) = data._1
        }
        catch {case err: java.lang.ArrayIndexOutOfBoundsException => 
          System.out.println("[warn] Deriv.scala:112:141 Memory output_falling_dram: Out of bounds write at address " + err.getMessage)
        }
      }
      x5519.enqueue(true)
    }
    x5517.clear()
    val x5543_inr_UnitPipe = x5543_inr_UnitPipe_kernel.run()
  } 
}
/** END UnitPipe x5544_outr_UnitPipe **/
