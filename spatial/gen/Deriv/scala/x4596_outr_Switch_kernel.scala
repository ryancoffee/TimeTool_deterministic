import emul._
import emul.implicits._

/** BEGIN Switch x4596_outr_Switch **/
object x4596_outr_Switch_kernel {
  def run(
    x5868_rd_x4542: Bool,
    b495: FixedPoint,
    x5867_rd_x4541: Bool
  ): Unit = {
    if (x5867_rd_x4541) {
      x4560_reg.initMem(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)))
      val x4564_inr_UnitPipe = x4564_inr_UnitPipe_kernel.run(b495)
      val x4592_outr_UnitPipe = x4592_outr_UnitPipe_kernel.run()
      ()
    }
    else if (x5868_rd_x4542) {
      ()
    }
    else ()
  } 
}
/** END Switch x4596_outr_Switch **/
