import emul._
import emul.implicits._

/** BEGIN UnitPipe x3912_inr_UnitPipe **/
object x3912_inr_UnitPipe_kernel {
  def run(
    b490: FixedPoint
  ): Unit = {
    val x6102 = b490 & FixedPoint(BigDecimal("127"),FixFormat(true,32,0))
    val x3910_x5 = b490 - x6102
    val x3911_wr_x3908 = if (TRUE) x3908_reg.set(x3910_x5)
  } 
}
/** END UnitPipe x3912_inr_UnitPipe **/
