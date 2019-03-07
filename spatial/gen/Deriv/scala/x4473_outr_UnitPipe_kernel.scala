import emul._
import emul.implicits._

/** BEGIN UnitPipe x4473_outr_UnitPipe **/
object x4473_outr_UnitPipe_kernel {
  def run(
  ): Unit = {
    val x4457_inr_UnitPipe = x4457_inr_UnitPipe_kernel.run()
    val x4458_ctr = Counter(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)), FixedPoint(BigDecimal("128"),FixFormat(true,32,0)), FixedPoint(BigDecimal("1"),FixFormat(true,32,0)), FixedPoint(BigDecimal("1"),FixFormat(true,32,0)))
    val x4459_ctrchain = Array[Counterlike](x4458_ctr)
    val x4468_inr_Foreach = x4468_inr_Foreach_kernel.run(x4459_ctrchain)
    val x4469 = x4446.foreach{cmd => 
      for (i <- cmd.offset until cmd.offset+cmd.size by 8) {
        val data = x4447.dequeue()
        try {
          if (data._2) x486_output_falling_dram(i / 8) = data._1
        }
        catch {case err: java.lang.ArrayIndexOutOfBoundsException => 
          System.out.println("[warn] Deriv.scala:112:141 Memory output_falling_dram: Out of bounds write at address " + err.getMessage)
        }
      }
      x4448.enqueue(true)
    }
    x4446.clear()
    val x4472_inr_UnitPipe = x4472_inr_UnitPipe_kernel.run()
  } 
}
/** END UnitPipe x4473_outr_UnitPipe **/
