import emul._
import emul.implicits._

/** BEGIN UnitPipe x5459_inr_UnitPipe **/
object x5459_inr_UnitPipe_kernel {
  def run(
    b503: FixedPoint
  ): Unit = {
    val x6141 = b503 & FixedPoint(BigDecimal("127"),FixFormat(true,32,0))
    val x5457_x5 = b503 - x6141
    val x5458_wr_x5455 = if (TRUE) x5455_reg.set(x5457_x5)
  } 
}
/** END UnitPipe x5459_inr_UnitPipe **/
