import emul._
import emul.implicits._

/** BEGIN UnitPipe x5606_outr_UnitPipe **/
object x5606_outr_UnitPipe_kernel {
  def run(
  ): Unit = {
    val x5590_inr_UnitPipe = x5590_inr_UnitPipe_kernel.run()
    val x5591_ctr = Counter(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)), FixedPoint(BigDecimal("128"),FixFormat(true,32,0)), FixedPoint(BigDecimal("1"),FixFormat(true,32,0)), FixedPoint(BigDecimal("1"),FixFormat(true,32,0)))
    val x5592_ctrchain = Array[Counterlike](x5591_ctr)
    val x5601_inr_Foreach = x5601_inr_Foreach_kernel.run(x5592_ctrchain)
    val x5602 = x5579.foreach{cmd => 
      for (i <- cmd.offset until cmd.offset+cmd.size by 8) {
        val data = x5580.dequeue()
        try {
          if (data._2) x484_output_rising_dram(i / 8) = data._1
        }
        catch {case err: java.lang.ArrayIndexOutOfBoundsException => 
          System.out.println("[warn] Deriv.scala:109:140 Memory output_rising_dram: Out of bounds write at address " + err.getMessage)
        }
      }
      x5581.enqueue(true)
    }
    x5579.clear()
    val x5605_inr_UnitPipe = x5605_inr_UnitPipe_kernel.run()
  } 
}
/** END UnitPipe x5606_outr_UnitPipe **/
