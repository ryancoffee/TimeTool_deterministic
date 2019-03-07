import emul._
import emul.implicits._

/** BEGIN UnitPipe x3940_outr_UnitPipe **/
object x3940_outr_UnitPipe_kernel {
  def run(
  ): Unit = {
    val x3924_inr_UnitPipe = x3924_inr_UnitPipe_kernel.run()
    val x3925_ctr = Counter(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)), FixedPoint(BigDecimal("128"),FixFormat(true,32,0)), FixedPoint(BigDecimal("1"),FixFormat(true,32,0)), FixedPoint(BigDecimal("1"),FixFormat(true,32,0)))
    val x3926_ctrchain = Array[Counterlike](x3925_ctr)
    val x3935_inr_Foreach = x3935_inr_Foreach_kernel.run(x3926_ctrchain)
    val x3936 = x3913.foreach{cmd => 
      for (i <- cmd.offset until cmd.offset+cmd.size by 8) {
        val data = x3914.dequeue()
        try {
          if (data._2) x484_output_rising_dram(i / 8) = data._1
        }
        catch {case err: java.lang.ArrayIndexOutOfBoundsException => 
          System.out.println("[warn] Deriv.scala:109:140 Memory output_rising_dram: Out of bounds write at address " + err.getMessage)
        }
      }
      x3915.enqueue(true)
    }
    x3913.clear()
    val x3939_inr_UnitPipe = x3939_inr_UnitPipe_kernel.run()
  } 
}
/** END UnitPipe x3940_outr_UnitPipe **/
