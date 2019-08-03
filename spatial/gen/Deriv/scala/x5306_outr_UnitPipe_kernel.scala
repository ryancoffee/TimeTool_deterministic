import emul._
import emul.implicits._

/** BEGIN UnitPipe x5306_outr_UnitPipe **/
object x5306_outr_UnitPipe_kernel {
  def run(
  ): Unit = {
    val x5290_inr_UnitPipe = x5290_inr_UnitPipe_kernel.run()
    val x5291_ctr = Counter(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)), FixedPoint(BigDecimal("128"),FixFormat(true,32,0)), FixedPoint(BigDecimal("1"),FixFormat(true,32,0)), FixedPoint(BigDecimal("1"),FixFormat(true,32,0)))
    val x5292_ctrchain = Array[Counterlike](x5291_ctr)
    val x5301_inr_Foreach = x5301_inr_Foreach_kernel.run(x5292_ctrchain)
    val x5302 = x5279.foreach{cmd => 
      for (i <- cmd.offset until cmd.offset+cmd.size by 8) {
        val data = x5280.dequeue()
        try {
          if (data._2) x486_output_falling_dram(i / 8) = data._1
        }
        catch {case err: java.lang.ArrayIndexOutOfBoundsException => 
          System.out.println("[warn] Deriv.scala:112:141 Memory output_falling_dram: Out of bounds write at address " + err.getMessage)
        }
      }
      x5281.enqueue(true)
    }
    x5279.clear()
    val x5305_inr_UnitPipe = x5305_inr_UnitPipe_kernel.run()
  } 
}
/** END UnitPipe x5306_outr_UnitPipe **/
