import emul._
import emul.implicits._

/** BEGIN UnitPipe x4445_inr_UnitPipe **/
object x4445_inr_UnitPipe_kernel {
  def run(
    b494: FixedPoint
  ): Unit = {
    val x6115 = b494 & FixedPoint(BigDecimal("127"),FixFormat(true,32,0))
    val x4443_x6 = b494 - x6115
    val x4444_wr_x4441 = if (TRUE) x4441_reg.set(x4443_x6)
  } 
}
/** END UnitPipe x4445_inr_UnitPipe **/
