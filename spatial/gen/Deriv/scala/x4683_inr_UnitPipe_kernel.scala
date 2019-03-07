import emul._
import emul.implicits._

/** BEGIN UnitPipe x4683_inr_UnitPipe **/
object x4683_inr_UnitPipe_kernel {
  def run(
    b496: FixedPoint
  ): Unit = {
    val x6121 = b496 & FixedPoint(BigDecimal("127"),FixFormat(true,32,0))
    val x4681_x6 = b496 - x6121
    val x4682_wr_x4679 = if (TRUE) x4679_reg.set(x4681_x6)
  } 
}
/** END UnitPipe x4683_inr_UnitPipe **/
