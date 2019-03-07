import emul._
import emul.implicits._

/** BEGIN UnitPipe x5221_inr_UnitPipe **/
object x5221_inr_UnitPipe_kernel {
  def run(
    b501: FixedPoint
  ): Unit = {
    val x6135 = b501 & FixedPoint(BigDecimal("127"),FixFormat(true,32,0))
    val x5219_x5 = b501 - x6135
    val x5220_wr_x5217 = if (TRUE) x5217_reg.set(x5219_x5)
  } 
}
/** END UnitPipe x5221_inr_UnitPipe **/
