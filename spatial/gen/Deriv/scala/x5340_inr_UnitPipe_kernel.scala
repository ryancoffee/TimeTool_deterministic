import emul._
import emul.implicits._

/** BEGIN UnitPipe x5340_inr_UnitPipe **/
object x5340_inr_UnitPipe_kernel {
  def run(
    b502: FixedPoint
  ): Unit = {
    val x6138 = b502 & FixedPoint(BigDecimal("127"),FixFormat(true,32,0))
    val x5338_x5 = b502 - x6138
    val x5339_wr_x5336 = if (TRUE) x5336_reg.set(x5338_x5)
  } 
}
/** END UnitPipe x5340_inr_UnitPipe **/
