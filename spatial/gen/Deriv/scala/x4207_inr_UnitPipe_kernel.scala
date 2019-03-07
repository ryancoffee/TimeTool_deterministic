import emul._
import emul.implicits._

/** BEGIN UnitPipe x4207_inr_UnitPipe **/
object x4207_inr_UnitPipe_kernel {
  def run(
    b492: FixedPoint
  ): Unit = {
    val x6109 = b492 & FixedPoint(BigDecimal("127"),FixFormat(true,32,0))
    val x4205_x6 = b492 - x6109
    val x4206_wr_x4203 = if (TRUE) x4203_reg.set(x4205_x6)
  } 
}
/** END UnitPipe x4207_inr_UnitPipe **/
