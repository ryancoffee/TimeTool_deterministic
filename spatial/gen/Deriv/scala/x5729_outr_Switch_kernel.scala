import emul._
import emul.implicits._

/** BEGIN Switch x5729_outr_Switch **/
object x5729_outr_Switch_kernel {
  def run(
    x5906_rd_x5673: Bool,
    x5905_rd_x5672: Bool,
    b505: FixedPoint
  ): Unit = {
    if (x5905_rd_x5672) {
      x5693_reg.initMem(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)))
      val x5697_inr_UnitPipe = x5697_inr_UnitPipe_kernel.run(b505)
      val x5725_outr_UnitPipe = x5725_outr_UnitPipe_kernel.run()
      ()
    }
    else if (x5906_rd_x5673) {
      ()
    }
    else ()
  } 
}
/** END Switch x5729_outr_Switch **/
