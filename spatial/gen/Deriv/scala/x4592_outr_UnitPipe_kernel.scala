import emul._
import emul.implicits._

/** BEGIN UnitPipe x4592_outr_UnitPipe **/
object x4592_outr_UnitPipe_kernel {
  def run(
  ): Unit = {
    val x4576_inr_UnitPipe = x4576_inr_UnitPipe_kernel.run()
    val x4577_ctr = Counter(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)), FixedPoint(BigDecimal("128"),FixFormat(true,32,0)), FixedPoint(BigDecimal("1"),FixFormat(true,32,0)), FixedPoint(BigDecimal("1"),FixFormat(true,32,0)))
    val x4578_ctrchain = Array[Counterlike](x4577_ctr)
    val x4587_inr_Foreach = x4587_inr_Foreach_kernel.run(x4578_ctrchain)
    val x4588 = x4565.foreach{cmd => 
      for (i <- cmd.offset until cmd.offset+cmd.size by 8) {
        val data = x4566.dequeue()
        try {
          if (data._2) x486_output_falling_dram(i / 8) = data._1
        }
        catch {case err: java.lang.ArrayIndexOutOfBoundsException => 
          System.out.println("[warn] Deriv.scala:112:141 Memory output_falling_dram: Out of bounds write at address " + err.getMessage)
        }
      }
      x4567.enqueue(true)
    }
    x4565.clear()
    val x4591_inr_UnitPipe = x4591_inr_UnitPipe_kernel.run()
  } 
}
/** END UnitPipe x4592_outr_UnitPipe **/
