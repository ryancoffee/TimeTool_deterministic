import emul._
import emul.implicits._

/** BEGIN UnitPipe x4773_outr_UnitPipe **/
object x4773_outr_UnitPipe_kernel {
  def run(
  ): Unit = {
    val x4757_inr_UnitPipe = x4757_inr_UnitPipe_kernel.run()
    val x4758_ctr = Counter(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)), FixedPoint(BigDecimal("128"),FixFormat(true,32,0)), FixedPoint(BigDecimal("1"),FixFormat(true,32,0)), FixedPoint(BigDecimal("1"),FixFormat(true,32,0)))
    val x4759_ctrchain = Array[Counterlike](x4758_ctr)
    val x4768_inr_Foreach = x4768_inr_Foreach_kernel.run(x4759_ctrchain)
    val x4769 = x4746.foreach{cmd => 
      for (i <- cmd.offset until cmd.offset+cmd.size by 8) {
        val data = x4747.dequeue()
        try {
          if (data._2) x484_output_rising_dram(i / 8) = data._1
        }
        catch {case err: java.lang.ArrayIndexOutOfBoundsException => 
          System.out.println("[warn] Deriv.scala:109:140 Memory output_rising_dram: Out of bounds write at address " + err.getMessage)
        }
      }
      x4748.enqueue(true)
    }
    x4746.clear()
    val x4772_inr_UnitPipe = x4772_inr_UnitPipe_kernel.run()
  } 
}
/** END UnitPipe x4773_outr_UnitPipe **/
