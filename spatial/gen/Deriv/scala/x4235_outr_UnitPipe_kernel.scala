import emul._
import emul.implicits._

/** BEGIN UnitPipe x4235_outr_UnitPipe **/
object x4235_outr_UnitPipe_kernel {
  def run(
  ): Unit = {
    val x4219_inr_UnitPipe = x4219_inr_UnitPipe_kernel.run()
    val x4220_ctr = Counter(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)), FixedPoint(BigDecimal("128"),FixFormat(true,32,0)), FixedPoint(BigDecimal("1"),FixFormat(true,32,0)), FixedPoint(BigDecimal("1"),FixFormat(true,32,0)))
    val x4221_ctrchain = Array[Counterlike](x4220_ctr)
    val x4230_inr_Foreach = x4230_inr_Foreach_kernel.run(x4221_ctrchain)
    val x4231 = x4208.foreach{cmd => 
      for (i <- cmd.offset until cmd.offset+cmd.size by 8) {
        val data = x4209.dequeue()
        try {
          if (data._2) x486_output_falling_dram(i / 8) = data._1
        }
        catch {case err: java.lang.ArrayIndexOutOfBoundsException => 
          System.out.println("[warn] Deriv.scala:112:141 Memory output_falling_dram: Out of bounds write at address " + err.getMessage)
        }
      }
      x4210.enqueue(true)
    }
    x4208.clear()
    val x4234_inr_UnitPipe = x4234_inr_UnitPipe_kernel.run()
  } 
}
/** END UnitPipe x4235_outr_UnitPipe **/
