import emul._
import emul.implicits._

/** BEGIN UnitPipe x4954_outr_UnitPipe **/
object x4954_outr_UnitPipe_kernel {
  def run(
    b514: Bool,
    b498: FixedPoint
  ): Unit = if (b514){
    x4837_reg.initMem(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)))
    x4838_reg.initMem(Bool(false,true))
    x4839_reg.initMem(Bool(false,true))
    x4840_reg.initMem(Bool(false,true))
    val x4857_inr_UnitPipe = x4857_inr_UnitPipe_kernel.run(b498)
    val x5877_rd_x4839 = x4839_reg.value
    val x5878_rd_x4840 = x4840_reg.value
    val x4896_outr_Switch = x4896_outr_Switch_kernel.run(x5878_rd_x4840, b498, x5877_rd_x4839)
    x4898_reg.initMem(Bool(false,true))
    x4899_reg.initMem(Bool(false,true))
    val x4914_inr_UnitPipe = x4914_inr_UnitPipe_kernel.run(b498)
    val x5879_rd_x4898 = x4898_reg.value
    val x5880_rd_x4899 = x4899_reg.value
    val x4953_outr_Switch = x4953_outr_Switch_kernel.run(x5879_rd_x4898, b498, x5880_rd_x4899)
  } else null.asInstanceOf[Unit]
}
/** END UnitPipe x4954_outr_UnitPipe **/
