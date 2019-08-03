import emul._
import emul.implicits._

/** BEGIN Switch x4777_outr_Switch **/
object x4777_outr_Switch_kernel {
  def run(
    x5874_rd_x4721: Bool,
    b497: FixedPoint,
    x5873_rd_x4720: Bool
  ): Unit = {
    if (x5873_rd_x4720) {
      x4741_reg.initMem(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)))
      val x4745_inr_UnitPipe = x4745_inr_UnitPipe_kernel.run(b497)
      val x4773_outr_UnitPipe = x4773_outr_UnitPipe_kernel.run()
      ()
    }
    else if (x5874_rd_x4721) {
      ()
    }
    else ()
  } 
}
/** END Switch x4777_outr_Switch **/
