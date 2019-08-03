import emul._
import emul.implicits._

/** BEGIN UnitPipe x4354_outr_UnitPipe **/
object x4354_outr_UnitPipe_kernel {
  def run(
  ): Unit = {
    val x4338_inr_UnitPipe = x4338_inr_UnitPipe_kernel.run()
    val x4339_ctr = Counter(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)), FixedPoint(BigDecimal("128"),FixFormat(true,32,0)), FixedPoint(BigDecimal("1"),FixFormat(true,32,0)), FixedPoint(BigDecimal("1"),FixFormat(true,32,0)))
    val x4340_ctrchain = Array[Counterlike](x4339_ctr)
    val x4349_inr_Foreach = x4349_inr_Foreach_kernel.run(x4340_ctrchain)
    val x4350 = x4327.foreach{cmd => 
      for (i <- cmd.offset until cmd.offset+cmd.size by 8) {
        val data = x4328.dequeue()
        try {
          if (data._2) x486_output_falling_dram(i / 8) = data._1
        }
        catch {case err: java.lang.ArrayIndexOutOfBoundsException => 
          System.out.println("[warn] Deriv.scala:112:141 Memory output_falling_dram: Out of bounds write at address " + err.getMessage)
        }
      }
      x4329.enqueue(true)
    }
    x4327.clear()
    val x4353_inr_UnitPipe = x4353_inr_UnitPipe_kernel.run()
  } 
}
/** END UnitPipe x4354_outr_UnitPipe **/
