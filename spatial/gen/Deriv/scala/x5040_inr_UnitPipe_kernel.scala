import emul._
import emul.implicits._

/** BEGIN UnitPipe x5040_inr_UnitPipe **/
object x5040_inr_UnitPipe_kernel {
  def run(
    b499: FixedPoint
  ): Unit = {
    val x6130 = b499 & FixedPoint(BigDecimal("127"),FixFormat(true,32,0))
    val x5038_x6 = b499 - x6130
    val x5039_wr_x5036 = if (TRUE) x5036_reg.set(x5038_x6)
  } 
}
/** END UnitPipe x5040_inr_UnitPipe **/
