import emul._
import emul.implicits._

/** BEGIN UnitPipe x4359_outr_UnitPipe **/
object x4359_outr_UnitPipe_kernel {
  def run(
    b493: FixedPoint,
    b509: Bool
  ): Unit = if (b509){
    x4242_reg.initMem(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)))
    x4243_reg.initMem(Bool(false,true))
    x4244_reg.initMem(Bool(false,true))
    x4245_reg.initMem(Bool(false,true))
    val x4262_inr_UnitPipe = x4262_inr_UnitPipe_kernel.run(b493)
    val x5857_rd_x4244 = x4244_reg.value
    val x5858_rd_x4245 = x4245_reg.value
    val x4301_outr_Switch = x4301_outr_Switch_kernel.run(x5857_rd_x4244, b493, x5858_rd_x4245)
    x4303_reg.initMem(Bool(false,true))
    x4304_reg.initMem(Bool(false,true))
    val x4319_inr_UnitPipe = x4319_inr_UnitPipe_kernel.run(b493)
    val x5859_rd_x4303 = x4303_reg.value
    val x5860_rd_x4304 = x4304_reg.value
    val x4358_outr_Switch = x4358_outr_Switch_kernel.run(b493, x5859_rd_x4303, x5860_rd_x4304)
  } else null.asInstanceOf[Unit]
}
/** END UnitPipe x4359_outr_UnitPipe **/
