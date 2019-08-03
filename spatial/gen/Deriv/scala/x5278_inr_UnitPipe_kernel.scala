import emul._
import emul.implicits._

/** BEGIN UnitPipe x5278_inr_UnitPipe **/
object x5278_inr_UnitPipe_kernel {
  def run(
    b501: FixedPoint
  ): Unit = {
    val x6136 = b501 & FixedPoint(BigDecimal("127"),FixFormat(true,32,0))
    val x5276_x6 = b501 - x6136
    val x5277_wr_x5274 = if (TRUE) x5274_reg.set(x5276_x6)
  } 
}
/** END UnitPipe x5278_inr_UnitPipe **/
