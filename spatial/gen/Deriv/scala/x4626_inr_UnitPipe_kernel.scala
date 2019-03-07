import emul._
import emul.implicits._

/** BEGIN UnitPipe x4626_inr_UnitPipe **/
object x4626_inr_UnitPipe_kernel {
  def run(
    b496: FixedPoint
  ): Unit = {
    val x6120 = b496 & FixedPoint(BigDecimal("127"),FixFormat(true,32,0))
    val x4624_x5 = b496 - x6120
    val x4625_wr_x4622 = if (TRUE) x4622_reg.set(x4624_x5)
  } 
}
/** END UnitPipe x4626_inr_UnitPipe **/
