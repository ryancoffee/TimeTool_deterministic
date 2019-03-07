import emul._
import emul.implicits._

/** BEGIN UnitPipe x4921_inr_UnitPipe **/
object x4921_inr_UnitPipe_kernel {
  def run(
    b498: FixedPoint
  ): Unit = {
    val x6127 = b498 & FixedPoint(BigDecimal("127"),FixFormat(true,32,0))
    val x4919_x6 = b498 - x6127
    val x4920_wr_x4917 = if (TRUE) x4917_reg.set(x4919_x6)
  } 
}
/** END UnitPipe x4921_inr_UnitPipe **/
