import emul._
import emul.implicits._

/** BEGIN UnitPipe x4983_inr_UnitPipe **/
object x4983_inr_UnitPipe_kernel {
  def run(
    b499: FixedPoint
  ): Unit = {
    val x6129 = b499 & FixedPoint(BigDecimal("127"),FixFormat(true,32,0))
    val x4981_x5 = b499 - x6129
    val x4982_wr_x4979 = if (TRUE) x4979_reg.set(x4981_x5)
  } 
}
/** END UnitPipe x4983_inr_UnitPipe **/
