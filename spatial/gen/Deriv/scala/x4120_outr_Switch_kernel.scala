import emul._
import emul.implicits._

/** BEGIN Switch x4120_outr_Switch **/
object x4120_outr_Switch_kernel {
  def run(
    x5851_rd_x4065: Bool,
    x5852_rd_x4066: Bool,
    b491: FixedPoint
  ): Unit = {
    if (x5851_rd_x4065) {
      x4084_reg.initMem(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)))
      val x4088_inr_UnitPipe = x4088_inr_UnitPipe_kernel.run(b491)
      val x4116_outr_UnitPipe = x4116_outr_UnitPipe_kernel.run()
      ()
    }
    else if (x5852_rd_x4066) {
      ()
    }
    else ()
  } 
}
/** END Switch x4120_outr_Switch **/
