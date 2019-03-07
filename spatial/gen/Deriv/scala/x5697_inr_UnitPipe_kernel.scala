import emul._
import emul.implicits._

/** BEGIN UnitPipe x5697_inr_UnitPipe **/
object x5697_inr_UnitPipe_kernel {
  def run(
    b505: FixedPoint
  ): Unit = {
    val x6147 = b505 & FixedPoint(BigDecimal("127"),FixFormat(true,32,0))
    val x5695_x5 = b505 - x6147
    val x5696_wr_x5693 = if (TRUE) x5693_reg.set(x5695_x5)
  } 
}
/** END UnitPipe x5697_inr_UnitPipe **/
