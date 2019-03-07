import emul._
import emul.implicits._

/** BEGIN UnitPipe x4031_inr_UnitPipe **/
object x4031_inr_UnitPipe_kernel {
  def run(
    b491: FixedPoint
  ): Unit = {
    val x6105 = b491 & FixedPoint(BigDecimal("127"),FixFormat(true,32,0))
    val x4029_x5 = b491 - x6105
    val x4030_wr_x4027 = if (TRUE) x4027_reg.set(x4029_x5)
  } 
}
/** END UnitPipe x4031_inr_UnitPipe **/
