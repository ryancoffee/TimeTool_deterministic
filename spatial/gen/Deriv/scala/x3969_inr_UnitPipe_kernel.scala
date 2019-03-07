import emul._
import emul.implicits._

/** BEGIN UnitPipe x3969_inr_UnitPipe **/
object x3969_inr_UnitPipe_kernel {
  def run(
    b490: FixedPoint
  ): Unit = {
    val x6103 = b490 & FixedPoint(BigDecimal("127"),FixFormat(true,32,0))
    val x3967_x6 = b490 - x6103
    val x3968_wr_x3965 = if (TRUE) x3965_reg.set(x3967_x6)
  } 
}
/** END UnitPipe x3969_inr_UnitPipe **/
