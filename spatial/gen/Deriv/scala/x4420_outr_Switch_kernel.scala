import emul._
import emul.implicits._

/** BEGIN Switch x4420_outr_Switch **/
object x4420_outr_Switch_kernel {
  def run(
    x5861_rd_x4363: Bool,
    x5862_rd_x4364: Bool,
    b494: FixedPoint
  ): Unit = {
    if (x5861_rd_x4363) {
      x4384_reg.initMem(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)))
      val x4388_inr_UnitPipe = x4388_inr_UnitPipe_kernel.run(b494)
      val x4416_outr_UnitPipe = x4416_outr_UnitPipe_kernel.run()
      ()
    }
    else if (x5862_rd_x4364) {
      ()
    }
    else ()
  } 
}
/** END Switch x4420_outr_Switch **/
