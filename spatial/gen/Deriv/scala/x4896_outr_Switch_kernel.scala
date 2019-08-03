import emul._
import emul.implicits._

/** BEGIN Switch x4896_outr_Switch **/
object x4896_outr_Switch_kernel {
  def run(
    x5878_rd_x4840: Bool,
    b498: FixedPoint,
    x5877_rd_x4839: Bool
  ): Unit = {
    if (x5877_rd_x4839) {
      x4860_reg.initMem(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)))
      val x4864_inr_UnitPipe = x4864_inr_UnitPipe_kernel.run(b498)
      val x4892_outr_UnitPipe = x4892_outr_UnitPipe_kernel.run()
      ()
    }
    else if (x5878_rd_x4840) {
      ()
    }
    else ()
  } 
}
/** END Switch x4896_outr_Switch **/
