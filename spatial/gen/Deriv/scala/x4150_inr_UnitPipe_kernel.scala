import emul._
import emul.implicits._

/** BEGIN UnitPipe x4150_inr_UnitPipe **/
object x4150_inr_UnitPipe_kernel {
  def run(
    b492: FixedPoint
  ): Unit = {
    val x6108 = b492 & FixedPoint(BigDecimal("127"),FixFormat(true,32,0))
    val x4148_x5 = b492 - x6108
    val x4149_wr_x4146 = if (TRUE) x4146_reg.set(x4148_x5)
  } 
}
/** END UnitPipe x4150_inr_UnitPipe **/
