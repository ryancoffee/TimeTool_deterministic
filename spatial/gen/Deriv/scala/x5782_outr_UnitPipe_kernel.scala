import emul._
import emul.implicits._

/** BEGIN UnitPipe x5782_outr_UnitPipe **/
object x5782_outr_UnitPipe_kernel {
  def run(
  ): Unit = {
    val x5766_inr_UnitPipe = x5766_inr_UnitPipe_kernel.run()
    val x5767_ctr = Counter(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)), FixedPoint(BigDecimal("128"),FixFormat(true,32,0)), FixedPoint(BigDecimal("1"),FixFormat(true,32,0)), FixedPoint(BigDecimal("1"),FixFormat(true,32,0)))
    val x5768_ctrchain = Array[Counterlike](x5767_ctr)
    val x5777_inr_Foreach = x5777_inr_Foreach_kernel.run(x5768_ctrchain)
    val x5778 = x5755.foreach{cmd => 
      for (i <- cmd.offset until cmd.offset+cmd.size by 8) {
        val data = x5756.dequeue()
        try {
          if (data._2) x486_output_falling_dram(i / 8) = data._1
        }
        catch {case err: java.lang.ArrayIndexOutOfBoundsException => 
          System.out.println("[warn] Deriv.scala:112:141 Memory output_falling_dram: Out of bounds write at address " + err.getMessage)
        }
      }
      x5757.enqueue(true)
    }
    x5755.clear()
    val x5781_inr_UnitPipe = x5781_inr_UnitPipe_kernel.run()
  } 
}
/** END UnitPipe x5782_outr_UnitPipe **/
