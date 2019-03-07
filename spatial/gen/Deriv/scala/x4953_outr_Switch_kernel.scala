import emul._
import emul.implicits._

/** BEGIN Switch x4953_outr_Switch **/
object x4953_outr_Switch_kernel {
  def run(
    x5879_rd_x4898: Bool,
    b498: FixedPoint,
    x5880_rd_x4899: Bool
  ): Unit = {
    if (x5879_rd_x4898) {
      x4917_reg.initMem(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)))
      val x4921_inr_UnitPipe = x4921_inr_UnitPipe_kernel.run(b498)
      val x4949_outr_UnitPipe = x4949_outr_UnitPipe_kernel.run()
      ()
    }
    else if (x5880_rd_x4899) {
      ()
    }
    else ()
  } 
}
/** END Switch x4953_outr_Switch **/
