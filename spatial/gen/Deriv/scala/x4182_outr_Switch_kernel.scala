import emul._
import emul.implicits._

/** BEGIN Switch x4182_outr_Switch **/
object x4182_outr_Switch_kernel {
  def run(
    b492: FixedPoint,
    x5854_rd_x4126: Bool,
    x5853_rd_x4125: Bool
  ): Unit = {
    if (x5853_rd_x4125) {
      x4146_reg.initMem(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)))
      val x4150_inr_UnitPipe = x4150_inr_UnitPipe_kernel.run(b492)
      val x4178_outr_UnitPipe = x4178_outr_UnitPipe_kernel.run()
      ()
    }
    else if (x5854_rd_x4126) {
      ()
    }
    else ()
  } 
}
/** END Switch x4182_outr_Switch **/
