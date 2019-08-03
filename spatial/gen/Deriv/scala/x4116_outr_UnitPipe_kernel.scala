import emul._
import emul.implicits._

/** BEGIN UnitPipe x4116_outr_UnitPipe **/
object x4116_outr_UnitPipe_kernel {
  def run(
  ): Unit = {
    val x4100_inr_UnitPipe = x4100_inr_UnitPipe_kernel.run()
    val x4101_ctr = Counter(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)), FixedPoint(BigDecimal("128"),FixFormat(true,32,0)), FixedPoint(BigDecimal("1"),FixFormat(true,32,0)), FixedPoint(BigDecimal("1"),FixFormat(true,32,0)))
    val x4102_ctrchain = Array[Counterlike](x4101_ctr)
    val x4111_inr_Foreach = x4111_inr_Foreach_kernel.run(x4102_ctrchain)
    val x4112 = x4089.foreach{cmd => 
      for (i <- cmd.offset until cmd.offset+cmd.size by 8) {
        val data = x4090.dequeue()
        try {
          if (data._2) x486_output_falling_dram(i / 8) = data._1
        }
        catch {case err: java.lang.ArrayIndexOutOfBoundsException => 
          System.out.println("[warn] Deriv.scala:112:141 Memory output_falling_dram: Out of bounds write at address " + err.getMessage)
        }
      }
      x4091.enqueue(true)
    }
    x4089.clear()
    val x4115_inr_UnitPipe = x4115_inr_UnitPipe_kernel.run()
  } 
}
/** END UnitPipe x4116_outr_UnitPipe **/
