import emul._
import emul.implicits._

/** BEGIN UnitPipe x4745_inr_UnitPipe **/
object x4745_inr_UnitPipe_kernel {
  def run(
    b497: FixedPoint
  ): Unit = {
    val x6123 = b497 & FixedPoint(BigDecimal("127"),FixFormat(true,32,0))
    val x4743_x5 = b497 - x6123
    val x4744_wr_x4741 = if (TRUE) x4741_reg.set(x4743_x5)
  } 
}
/** END UnitPipe x4745_inr_UnitPipe **/
