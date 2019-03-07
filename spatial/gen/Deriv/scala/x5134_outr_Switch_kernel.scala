import emul._
import emul.implicits._

/** BEGIN Switch x5134_outr_Switch **/
object x5134_outr_Switch_kernel {
  def run(
    b500: FixedPoint,
    x5885_rd_x5077: Bool,
    x5886_rd_x5078: Bool
  ): Unit = {
    if (x5885_rd_x5077) {
      x5098_reg.initMem(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)))
      val x5102_inr_UnitPipe = x5102_inr_UnitPipe_kernel.run(b500)
      val x5130_outr_UnitPipe = x5130_outr_UnitPipe_kernel.run()
      ()
    }
    else if (x5886_rd_x5078) {
      ()
    }
    else ()
  } 
}
/** END Switch x5134_outr_Switch **/
