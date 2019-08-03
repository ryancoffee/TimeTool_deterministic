import emul._
import emul.implicits._

/** BEGIN Switch x5191_outr_Switch **/
object x5191_outr_Switch_kernel {
  def run(
    b500: FixedPoint,
    x5888_rd_x5137: Bool,
    x5887_rd_x5136: Bool
  ): Unit = {
    if (x5887_rd_x5136) {
      x5155_reg.initMem(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)))
      val x5159_inr_UnitPipe = x5159_inr_UnitPipe_kernel.run(b500)
      val x5187_outr_UnitPipe = x5187_outr_UnitPipe_kernel.run()
      ()
    }
    else if (x5888_rd_x5137) {
      ()
    }
    else ()
  } 
}
/** END Switch x5191_outr_Switch **/
