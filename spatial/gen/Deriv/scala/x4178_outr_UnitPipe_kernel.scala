import emul._
import emul.implicits._

/** BEGIN UnitPipe x4178_outr_UnitPipe **/
object x4178_outr_UnitPipe_kernel {
  def run(
  ): Unit = {
    val x4162_inr_UnitPipe = x4162_inr_UnitPipe_kernel.run()
    val x4163_ctr = Counter(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)), FixedPoint(BigDecimal("128"),FixFormat(true,32,0)), FixedPoint(BigDecimal("1"),FixFormat(true,32,0)), FixedPoint(BigDecimal("1"),FixFormat(true,32,0)))
    val x4164_ctrchain = Array[Counterlike](x4163_ctr)
    val x4173_inr_Foreach = x4173_inr_Foreach_kernel.run(x4164_ctrchain)
    val x4174 = x4151.foreach{cmd => 
      for (i <- cmd.offset until cmd.offset+cmd.size by 8) {
        val data = x4152.dequeue()
        try {
          if (data._2) x484_output_rising_dram(i / 8) = data._1
        }
        catch {case err: java.lang.ArrayIndexOutOfBoundsException => 
          System.out.println("[warn] Deriv.scala:109:140 Memory output_rising_dram: Out of bounds write at address " + err.getMessage)
        }
      }
      x4153.enqueue(true)
    }
    x4151.clear()
    val x4177_inr_UnitPipe = x4177_inr_UnitPipe_kernel.run()
  } 
}
/** END UnitPipe x4178_outr_UnitPipe **/
