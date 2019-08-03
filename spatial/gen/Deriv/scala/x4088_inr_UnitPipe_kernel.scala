import emul._
import emul.implicits._

/** BEGIN UnitPipe x4088_inr_UnitPipe **/
object x4088_inr_UnitPipe_kernel {
  def run(
    b491: FixedPoint
  ): Unit = {
    val x6106 = b491 & FixedPoint(BigDecimal("127"),FixFormat(true,32,0))
    val x4086_x6 = b491 - x6106
    val x4087_wr_x4084 = if (TRUE) x4084_reg.set(x4086_x6)
  } 
}
/** END UnitPipe x4088_inr_UnitPipe **/
