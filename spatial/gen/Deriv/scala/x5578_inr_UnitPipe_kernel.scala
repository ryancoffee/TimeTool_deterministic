import emul._
import emul.implicits._

/** BEGIN UnitPipe x5578_inr_UnitPipe **/
object x5578_inr_UnitPipe_kernel {
  def run(
    b504: FixedPoint
  ): Unit = {
    val x6144 = b504 & FixedPoint(BigDecimal("127"),FixFormat(true,32,0))
    val x5576_x5 = b504 - x6144
    val x5577_wr_x5574 = if (TRUE) x5574_reg.set(x5576_x5)
  } 
}
/** END UnitPipe x5578_inr_UnitPipe **/
