import emul._
import emul.implicits._

/** BEGIN UnitPipe x4121_outr_UnitPipe **/
object x4121_outr_UnitPipe_kernel {
  def run(
    b507: Bool,
    b491: FixedPoint
  ): Unit = if (b507){
    x4004_reg.initMem(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)))
    x4005_reg.initMem(Bool(false,true))
    x4006_reg.initMem(Bool(false,true))
    x4007_reg.initMem(Bool(false,true))
    val x4024_inr_UnitPipe = x4024_inr_UnitPipe_kernel.run(b491)
    val x5849_rd_x4006 = x4006_reg.value
    val x5850_rd_x4007 = x4007_reg.value
    val x4063_outr_Switch = x4063_outr_Switch_kernel.run(x5850_rd_x4007, x5849_rd_x4006, b491)
    x4065_reg.initMem(Bool(false,true))
    x4066_reg.initMem(Bool(false,true))
    val x4081_inr_UnitPipe = x4081_inr_UnitPipe_kernel.run(b491)
    val x5851_rd_x4065 = x4065_reg.value
    val x5852_rd_x4066 = x4066_reg.value
    val x4120_outr_Switch = x4120_outr_Switch_kernel.run(x5851_rd_x4065, x5852_rd_x4066, b491)
  } else null.asInstanceOf[Unit]
}
/** END UnitPipe x4121_outr_UnitPipe **/
