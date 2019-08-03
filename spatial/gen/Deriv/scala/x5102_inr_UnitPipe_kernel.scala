import emul._
import emul.implicits._

/** BEGIN UnitPipe x5102_inr_UnitPipe **/
object x5102_inr_UnitPipe_kernel {
  def run(
    b500: FixedPoint
  ): Unit = {
    val x6132 = b500 & FixedPoint(BigDecimal("127"),FixFormat(true,32,0))
    val x5100_x5 = b500 - x6132
    val x5101_wr_x5098 = if (TRUE) x5098_reg.set(x5100_x5)
  } 
}
/** END UnitPipe x5102_inr_UnitPipe **/
