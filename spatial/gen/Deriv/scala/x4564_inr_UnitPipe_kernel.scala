import emul._
import emul.implicits._

/** BEGIN UnitPipe x4564_inr_UnitPipe **/
object x4564_inr_UnitPipe_kernel {
  def run(
    b495: FixedPoint
  ): Unit = {
    val x6118 = b495 & FixedPoint(BigDecimal("127"),FixFormat(true,32,0))
    val x4562_x6 = b495 - x6118
    val x4563_wr_x4560 = if (TRUE) x4560_reg.set(x4562_x6)
  } 
}
/** END UnitPipe x4564_inr_UnitPipe **/
