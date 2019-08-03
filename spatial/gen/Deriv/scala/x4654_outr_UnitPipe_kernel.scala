import emul._
import emul.implicits._

/** BEGIN UnitPipe x4654_outr_UnitPipe **/
object x4654_outr_UnitPipe_kernel {
  def run(
  ): Unit = {
    val x4638_inr_UnitPipe = x4638_inr_UnitPipe_kernel.run()
    val x4639_ctr = Counter(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)), FixedPoint(BigDecimal("128"),FixFormat(true,32,0)), FixedPoint(BigDecimal("1"),FixFormat(true,32,0)), FixedPoint(BigDecimal("1"),FixFormat(true,32,0)))
    val x4640_ctrchain = Array[Counterlike](x4639_ctr)
    val x4649_inr_Foreach = x4649_inr_Foreach_kernel.run(x4640_ctrchain)
    val x4650 = x4627.foreach{cmd => 
      for (i <- cmd.offset until cmd.offset+cmd.size by 8) {
        val data = x4628.dequeue()
        try {
          if (data._2) x484_output_rising_dram(i / 8) = data._1
        }
        catch {case err: java.lang.ArrayIndexOutOfBoundsException => 
          System.out.println("[warn] Deriv.scala:109:140 Memory output_rising_dram: Out of bounds write at address " + err.getMessage)
        }
      }
      x4629.enqueue(true)
    }
    x4627.clear()
    val x4653_inr_UnitPipe = x4653_inr_UnitPipe_kernel.run()
  } 
}
/** END UnitPipe x4654_outr_UnitPipe **/
