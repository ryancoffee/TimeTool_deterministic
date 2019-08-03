import emul._
import emul.implicits._

/** BEGIN UnitPipe x5635_inr_UnitPipe **/
object x5635_inr_UnitPipe_kernel {
  def run(
    b504: FixedPoint
  ): Unit = {
    val x6145 = b504 & FixedPoint(BigDecimal("127"),FixFormat(true,32,0))
    val x5633_x6 = b504 - x6145
    val x5634_wr_x5631 = if (TRUE) x5631_reg.set(x5633_x6)
  } 
}
/** END UnitPipe x5635_inr_UnitPipe **/
