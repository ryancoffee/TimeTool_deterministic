import emul._
import emul.implicits._

/** BEGIN UnitPipe x5754_inr_UnitPipe **/
object x5754_inr_UnitPipe_kernel {
  def run(
    b505: FixedPoint
  ): Unit = {
    val x6148 = b505 & FixedPoint(BigDecimal("127"),FixFormat(true,32,0))
    val x5752_x6 = b505 - x6148
    val x5753_wr_x5750 = if (TRUE) x5750_reg.set(x5752_x6)
  } 
}
/** END UnitPipe x5754_inr_UnitPipe **/
