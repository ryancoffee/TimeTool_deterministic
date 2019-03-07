import emul._
import emul.implicits._

/** BEGIN UnitPipe x4507_inr_UnitPipe **/
object x4507_inr_UnitPipe_kernel {
  def run(
    b495: FixedPoint
  ): Unit = {
    val x6117 = b495 & FixedPoint(BigDecimal("127"),FixFormat(true,32,0))
    val x4505_x5 = b495 - x6117
    val x4506_wr_x4503 = if (TRUE) x4503_reg.set(x4505_x5)
  } 
}
/** END UnitPipe x4507_inr_UnitPipe **/
