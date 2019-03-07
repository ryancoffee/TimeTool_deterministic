import emul._
import emul.implicits._

/** BEGIN UnitPipe x5397_inr_UnitPipe **/
object x5397_inr_UnitPipe_kernel {
  def run(
    b502: FixedPoint
  ): Unit = {
    val x6139 = b502 & FixedPoint(BigDecimal("127"),FixFormat(true,32,0))
    val x5395_x6 = b502 - x6139
    val x5396_wr_x5393 = if (TRUE) x5393_reg.set(x5395_x6)
  } 
}
/** END UnitPipe x5397_inr_UnitPipe **/
