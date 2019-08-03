import emul._
import emul.implicits._

/** BEGIN UnitPipe x4326_inr_UnitPipe **/
object x4326_inr_UnitPipe_kernel {
  def run(
    b493: FixedPoint
  ): Unit = {
    val x6112 = b493 & FixedPoint(BigDecimal("127"),FixFormat(true,32,0))
    val x4324_x6 = b493 - x6112
    val x4325_wr_x4322 = if (TRUE) x4322_reg.set(x4324_x6)
  } 
}
/** END UnitPipe x4326_inr_UnitPipe **/
