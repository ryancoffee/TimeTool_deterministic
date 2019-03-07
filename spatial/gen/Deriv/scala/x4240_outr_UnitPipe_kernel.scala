import emul._
import emul.implicits._

/** BEGIN UnitPipe x4240_outr_UnitPipe **/
object x4240_outr_UnitPipe_kernel {
  def run(
    b492: FixedPoint,
    b508: Bool
  ): Unit = if (b508){
    x4123_reg.initMem(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)))
    x4124_reg.initMem(Bool(false,true))
    x4125_reg.initMem(Bool(false,true))
    x4126_reg.initMem(Bool(false,true))
    val x4143_inr_UnitPipe = x4143_inr_UnitPipe_kernel.run(b492)
    val x5853_rd_x4125 = x4125_reg.value
    val x5854_rd_x4126 = x4126_reg.value
    val x4182_outr_Switch = x4182_outr_Switch_kernel.run(b492, x5854_rd_x4126, x5853_rd_x4125)
    x4184_reg.initMem(Bool(false,true))
    x4185_reg.initMem(Bool(false,true))
    val x4200_inr_UnitPipe = x4200_inr_UnitPipe_kernel.run(b492)
    val x5855_rd_x4184 = x4184_reg.value
    val x5856_rd_x4185 = x4185_reg.value
    val x4239_outr_Switch = x4239_outr_Switch_kernel.run(b492, x5856_rd_x4185, x5855_rd_x4184)
  } else null.asInstanceOf[Unit]
}
/** END UnitPipe x4240_outr_UnitPipe **/
