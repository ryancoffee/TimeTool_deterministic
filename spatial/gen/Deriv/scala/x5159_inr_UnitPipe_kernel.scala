import emul._
import emul.implicits._

/** BEGIN UnitPipe x5159_inr_UnitPipe **/
object x5159_inr_UnitPipe_kernel {
  def run(
    b500: FixedPoint
  ): Unit = {
    val x6133 = b500 & FixedPoint(BigDecimal("127"),FixFormat(true,32,0))
    val x5157_x6 = b500 - x6133
    val x5158_wr_x5155 = if (TRUE) x5155_reg.set(x5157_x6)
  } 
}
/** END UnitPipe x5159_inr_UnitPipe **/
