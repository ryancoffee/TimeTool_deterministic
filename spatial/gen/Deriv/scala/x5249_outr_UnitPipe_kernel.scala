import emul._
import emul.implicits._

/** BEGIN UnitPipe x5249_outr_UnitPipe **/
object x5249_outr_UnitPipe_kernel {
  def run(
  ): Unit = {
    val x5233_inr_UnitPipe = x5233_inr_UnitPipe_kernel.run()
    val x5234_ctr = Counter(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)), FixedPoint(BigDecimal("128"),FixFormat(true,32,0)), FixedPoint(BigDecimal("1"),FixFormat(true,32,0)), FixedPoint(BigDecimal("1"),FixFormat(true,32,0)))
    val x5235_ctrchain = Array[Counterlike](x5234_ctr)
    val x5244_inr_Foreach = x5244_inr_Foreach_kernel.run(x5235_ctrchain)
    val x5245 = x5222.foreach{cmd => 
      for (i <- cmd.offset until cmd.offset+cmd.size by 8) {
        val data = x5223.dequeue()
        try {
          if (data._2) x484_output_rising_dram(i / 8) = data._1
        }
        catch {case err: java.lang.ArrayIndexOutOfBoundsException => 
          System.out.println("[warn] Deriv.scala:109:140 Memory output_rising_dram: Out of bounds write at address " + err.getMessage)
        }
      }
      x5224.enqueue(true)
    }
    x5222.clear()
    val x5248_inr_UnitPipe = x5248_inr_UnitPipe_kernel.run()
  } 
}
/** END UnitPipe x5249_outr_UnitPipe **/
