import emul._
import emul.implicits._

/** BEGIN UnitPipe x5725_outr_UnitPipe **/
object x5725_outr_UnitPipe_kernel {
  def run(
  ): Unit = {
    val x5709_inr_UnitPipe = x5709_inr_UnitPipe_kernel.run()
    val x5710_ctr = Counter(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)), FixedPoint(BigDecimal("128"),FixFormat(true,32,0)), FixedPoint(BigDecimal("1"),FixFormat(true,32,0)), FixedPoint(BigDecimal("1"),FixFormat(true,32,0)))
    val x5711_ctrchain = Array[Counterlike](x5710_ctr)
    val x5720_inr_Foreach = x5720_inr_Foreach_kernel.run(x5711_ctrchain)
    val x5721 = x5698.foreach{cmd => 
      for (i <- cmd.offset until cmd.offset+cmd.size by 8) {
        val data = x5699.dequeue()
        try {
          if (data._2) x484_output_rising_dram(i / 8) = data._1
        }
        catch {case err: java.lang.ArrayIndexOutOfBoundsException => 
          System.out.println("[warn] Deriv.scala:109:140 Memory output_rising_dram: Out of bounds write at address " + err.getMessage)
        }
      }
      x5700.enqueue(true)
    }
    x5698.clear()
    val x5724_inr_UnitPipe = x5724_inr_UnitPipe_kernel.run()
  } 
}
/** END UnitPipe x5725_outr_UnitPipe **/
