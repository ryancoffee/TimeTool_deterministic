import emul._
import emul.implicits._

/** BEGIN UnitPipe x5011_outr_UnitPipe **/
object x5011_outr_UnitPipe_kernel {
  def run(
  ): Unit = {
    val x4995_inr_UnitPipe = x4995_inr_UnitPipe_kernel.run()
    val x4996_ctr = Counter(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)), FixedPoint(BigDecimal("128"),FixFormat(true,32,0)), FixedPoint(BigDecimal("1"),FixFormat(true,32,0)), FixedPoint(BigDecimal("1"),FixFormat(true,32,0)))
    val x4997_ctrchain = Array[Counterlike](x4996_ctr)
    val x5006_inr_Foreach = x5006_inr_Foreach_kernel.run(x4997_ctrchain)
    val x5007 = x4984.foreach{cmd => 
      for (i <- cmd.offset until cmd.offset+cmd.size by 8) {
        val data = x4985.dequeue()
        try {
          if (data._2) x484_output_rising_dram(i / 8) = data._1
        }
        catch {case err: java.lang.ArrayIndexOutOfBoundsException => 
          System.out.println("[warn] Deriv.scala:109:140 Memory output_rising_dram: Out of bounds write at address " + err.getMessage)
        }
      }
      x4986.enqueue(true)
    }
    x4984.clear()
    val x5010_inr_UnitPipe = x5010_inr_UnitPipe_kernel.run()
  } 
}
/** END UnitPipe x5011_outr_UnitPipe **/
