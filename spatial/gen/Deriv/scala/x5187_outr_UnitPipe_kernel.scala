import emul._
import emul.implicits._

/** BEGIN UnitPipe x5187_outr_UnitPipe **/
object x5187_outr_UnitPipe_kernel {
  def run(
  ): Unit = {
    val x5171_inr_UnitPipe = x5171_inr_UnitPipe_kernel.run()
    val x5172_ctr = Counter(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)), FixedPoint(BigDecimal("128"),FixFormat(true,32,0)), FixedPoint(BigDecimal("1"),FixFormat(true,32,0)), FixedPoint(BigDecimal("1"),FixFormat(true,32,0)))
    val x5173_ctrchain = Array[Counterlike](x5172_ctr)
    val x5182_inr_Foreach = x5182_inr_Foreach_kernel.run(x5173_ctrchain)
    val x5183 = x5160.foreach{cmd => 
      for (i <- cmd.offset until cmd.offset+cmd.size by 8) {
        val data = x5161.dequeue()
        try {
          if (data._2) x486_output_falling_dram(i / 8) = data._1
        }
        catch {case err: java.lang.ArrayIndexOutOfBoundsException => 
          System.out.println("[warn] Deriv.scala:112:141 Memory output_falling_dram: Out of bounds write at address " + err.getMessage)
        }
      }
      x5162.enqueue(true)
    }
    x5160.clear()
    val x5186_inr_UnitPipe = x5186_inr_UnitPipe_kernel.run()
  } 
}
/** END UnitPipe x5187_outr_UnitPipe **/
