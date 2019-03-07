import emul._
import emul.implicits._

/** BEGIN UnitPipe x3997_outr_UnitPipe **/
object x3997_outr_UnitPipe_kernel {
  def run(
  ): Unit = {
    val x3981_inr_UnitPipe = x3981_inr_UnitPipe_kernel.run()
    val x3982_ctr = Counter(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)), FixedPoint(BigDecimal("128"),FixFormat(true,32,0)), FixedPoint(BigDecimal("1"),FixFormat(true,32,0)), FixedPoint(BigDecimal("1"),FixFormat(true,32,0)))
    val x3983_ctrchain = Array[Counterlike](x3982_ctr)
    val x3992_inr_Foreach = x3992_inr_Foreach_kernel.run(x3983_ctrchain)
    val x3993 = x3970.foreach{cmd => 
      for (i <- cmd.offset until cmd.offset+cmd.size by 8) {
        val data = x3971.dequeue()
        try {
          if (data._2) x486_output_falling_dram(i / 8) = data._1
        }
        catch {case err: java.lang.ArrayIndexOutOfBoundsException => 
          System.out.println("[warn] Deriv.scala:112:141 Memory output_falling_dram: Out of bounds write at address " + err.getMessage)
        }
      }
      x3972.enqueue(true)
    }
    x3970.clear()
    val x3996_inr_UnitPipe = x3996_inr_UnitPipe_kernel.run()
  } 
}
/** END UnitPipe x3997_outr_UnitPipe **/
