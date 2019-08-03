import emul._
import emul.implicits._

/** BEGIN UnitPipe x5516_inr_UnitPipe **/
object x5516_inr_UnitPipe_kernel {
  def run(
    b503: FixedPoint
  ): Unit = {
    val x6142 = b503 & FixedPoint(BigDecimal("127"),FixFormat(true,32,0))
    val x5514_x6 = b503 - x6142
    val x5515_wr_x5512 = if (TRUE) x5512_reg.set(x5514_x6)
  } 
}
/** END UnitPipe x5516_inr_UnitPipe **/
