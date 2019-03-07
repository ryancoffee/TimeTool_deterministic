import emul._
import emul.implicits._

/** BEGIN UnitPipe x5068_outr_UnitPipe **/
object x5068_outr_UnitPipe_kernel {
  def run(
  ): Unit = {
    val x5052_inr_UnitPipe = x5052_inr_UnitPipe_kernel.run()
    val x5053_ctr = Counter(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)), FixedPoint(BigDecimal("128"),FixFormat(true,32,0)), FixedPoint(BigDecimal("1"),FixFormat(true,32,0)), FixedPoint(BigDecimal("1"),FixFormat(true,32,0)))
    val x5054_ctrchain = Array[Counterlike](x5053_ctr)
    val x5063_inr_Foreach = x5063_inr_Foreach_kernel.run(x5054_ctrchain)
    val x5064 = x5041.foreach{cmd => 
      for (i <- cmd.offset until cmd.offset+cmd.size by 8) {
        val data = x5042.dequeue()
        try {
          if (data._2) x486_output_falling_dram(i / 8) = data._1
        }
        catch {case err: java.lang.ArrayIndexOutOfBoundsException => 
          System.out.println("[warn] Deriv.scala:112:141 Memory output_falling_dram: Out of bounds write at address " + err.getMessage)
        }
      }
      x5043.enqueue(true)
    }
    x5041.clear()
    val x5067_inr_UnitPipe = x5067_inr_UnitPipe_kernel.run()
  } 
}
/** END UnitPipe x5068_outr_UnitPipe **/
