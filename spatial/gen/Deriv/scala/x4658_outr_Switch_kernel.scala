import emul._
import emul.implicits._

/** BEGIN Switch x4658_outr_Switch **/
object x4658_outr_Switch_kernel {
  def run(
    x5870_rd_x4602: Bool,
    x5869_rd_x4601: Bool,
    b496: FixedPoint
  ): Unit = {
    if (x5869_rd_x4601) {
      x4622_reg.initMem(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)))
      val x4626_inr_UnitPipe = x4626_inr_UnitPipe_kernel.run(b496)
      val x4654_outr_UnitPipe = x4654_outr_UnitPipe_kernel.run()
      ()
    }
    else if (x5870_rd_x4602) {
      ()
    }
    else ()
  } 
}
/** END Switch x4658_outr_Switch **/
