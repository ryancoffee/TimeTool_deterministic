import emul._
import emul.implicits._

/** BEGIN Switch x4715_outr_Switch **/
object x4715_outr_Switch_kernel {
  def run(
    x5872_rd_x4661: Bool,
    x5871_rd_x4660: Bool,
    b496: FixedPoint
  ): Unit = {
    if (x5871_rd_x4660) {
      x4679_reg.initMem(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)))
      val x4683_inr_UnitPipe = x4683_inr_UnitPipe_kernel.run(b496)
      val x4711_outr_UnitPipe = x4711_outr_UnitPipe_kernel.run()
      ()
    }
    else if (x5872_rd_x4661) {
      ()
    }
    else ()
  } 
}
/** END Switch x4715_outr_Switch **/
