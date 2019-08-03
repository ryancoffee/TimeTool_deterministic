import emul._
import emul.implicits._

/** BEGIN Switch x4063_outr_Switch **/
object x4063_outr_Switch_kernel {
  def run(
    x5850_rd_x4007: Bool,
    x5849_rd_x4006: Bool,
    b491: FixedPoint
  ): Unit = {
    if (x5849_rd_x4006) {
      x4027_reg.initMem(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)))
      val x4031_inr_UnitPipe = x4031_inr_UnitPipe_kernel.run(b491)
      val x4059_outr_UnitPipe = x4059_outr_UnitPipe_kernel.run()
      ()
    }
    else if (x5850_rd_x4007) {
      ()
    }
    else ()
  } 
}
/** END Switch x4063_outr_Switch **/
