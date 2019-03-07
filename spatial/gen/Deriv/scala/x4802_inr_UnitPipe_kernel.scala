import emul._
import emul.implicits._

/** BEGIN UnitPipe x4802_inr_UnitPipe **/
object x4802_inr_UnitPipe_kernel {
  def run(
    b497: FixedPoint
  ): Unit = {
    val x6124 = b497 & FixedPoint(BigDecimal("127"),FixFormat(true,32,0))
    val x4800_x6 = b497 - x6124
    val x4801_wr_x4798 = if (TRUE) x4798_reg.set(x4800_x6)
  } 
}
/** END UnitPipe x4802_inr_UnitPipe **/
