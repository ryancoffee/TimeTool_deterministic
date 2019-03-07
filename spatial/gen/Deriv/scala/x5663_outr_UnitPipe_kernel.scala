import emul._
import emul.implicits._

/** BEGIN UnitPipe x5663_outr_UnitPipe **/
object x5663_outr_UnitPipe_kernel {
  def run(
  ): Unit = {
    val x5647_inr_UnitPipe = x5647_inr_UnitPipe_kernel.run()
    val x5648_ctr = Counter(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)), FixedPoint(BigDecimal("128"),FixFormat(true,32,0)), FixedPoint(BigDecimal("1"),FixFormat(true,32,0)), FixedPoint(BigDecimal("1"),FixFormat(true,32,0)))
    val x5649_ctrchain = Array[Counterlike](x5648_ctr)
    val x5658_inr_Foreach = x5658_inr_Foreach_kernel.run(x5649_ctrchain)
    val x5659 = x5636.foreach{cmd => 
      for (i <- cmd.offset until cmd.offset+cmd.size by 8) {
        val data = x5637.dequeue()
        try {
          if (data._2) x486_output_falling_dram(i / 8) = data._1
        }
        catch {case err: java.lang.ArrayIndexOutOfBoundsException => 
          System.out.println("[warn] Deriv.scala:112:141 Memory output_falling_dram: Out of bounds write at address " + err.getMessage)
        }
      }
      x5638.enqueue(true)
    }
    x5636.clear()
    val x5662_inr_UnitPipe = x5662_inr_UnitPipe_kernel.run()
  } 
}
/** END UnitPipe x5663_outr_UnitPipe **/
