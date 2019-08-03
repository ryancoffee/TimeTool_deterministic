import emul._
import emul.implicits._

/** BEGIN UnitPipe x4711_outr_UnitPipe **/
object x4711_outr_UnitPipe_kernel {
  def run(
  ): Unit = {
    val x4695_inr_UnitPipe = x4695_inr_UnitPipe_kernel.run()
    val x4696_ctr = Counter(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)), FixedPoint(BigDecimal("128"),FixFormat(true,32,0)), FixedPoint(BigDecimal("1"),FixFormat(true,32,0)), FixedPoint(BigDecimal("1"),FixFormat(true,32,0)))
    val x4697_ctrchain = Array[Counterlike](x4696_ctr)
    val x4706_inr_Foreach = x4706_inr_Foreach_kernel.run(x4697_ctrchain)
    val x4707 = x4684.foreach{cmd => 
      for (i <- cmd.offset until cmd.offset+cmd.size by 8) {
        val data = x4685.dequeue()
        try {
          if (data._2) x486_output_falling_dram(i / 8) = data._1
        }
        catch {case err: java.lang.ArrayIndexOutOfBoundsException => 
          System.out.println("[warn] Deriv.scala:112:141 Memory output_falling_dram: Out of bounds write at address " + err.getMessage)
        }
      }
      x4686.enqueue(true)
    }
    x4684.clear()
    val x4710_inr_UnitPipe = x4710_inr_UnitPipe_kernel.run()
  } 
}
/** END UnitPipe x4711_outr_UnitPipe **/
