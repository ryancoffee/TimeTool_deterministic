import emul._
import emul.implicits._

/** BEGIN UnitPipe x4388_inr_UnitPipe **/
object x4388_inr_UnitPipe_kernel {
  def run(
    b494: FixedPoint
  ): Unit = {
    val x6114 = b494 & FixedPoint(BigDecimal("127"),FixFormat(true,32,0))
    val x4386_x5 = b494 - x6114
    val x4387_wr_x4384 = if (TRUE) x4384_reg.set(x4386_x5)
  } 
}
/** END UnitPipe x4388_inr_UnitPipe **/
