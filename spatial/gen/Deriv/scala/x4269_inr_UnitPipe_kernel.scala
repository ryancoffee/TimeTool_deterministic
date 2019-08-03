import emul._
import emul.implicits._

/** BEGIN UnitPipe x4269_inr_UnitPipe **/
object x4269_inr_UnitPipe_kernel {
  def run(
    b493: FixedPoint
  ): Unit = {
    val x6111 = b493 & FixedPoint(BigDecimal("127"),FixFormat(true,32,0))
    val x4267_x5 = b493 - x6111
    val x4268_wr_x4265 = if (TRUE) x4265_reg.set(x4267_x5)
  } 
}
/** END UnitPipe x4269_inr_UnitPipe **/
