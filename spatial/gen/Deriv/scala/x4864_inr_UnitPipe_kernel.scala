import emul._
import emul.implicits._

/** BEGIN UnitPipe x4864_inr_UnitPipe **/
object x4864_inr_UnitPipe_kernel {
  def run(
    b498: FixedPoint
  ): Unit = {
    val x6126 = b498 & FixedPoint(BigDecimal("127"),FixFormat(true,32,0))
    val x4862_x5 = b498 - x6126
    val x4863_wr_x4860 = if (TRUE) x4860_reg.set(x4862_x5)
  } 
}
/** END UnitPipe x4864_inr_UnitPipe **/
