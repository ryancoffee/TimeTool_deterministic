import emul._
import emul.implicits._

/** BEGIN UnitPipe x4597_outr_UnitPipe **/
object x4597_outr_UnitPipe_kernel {
  def run(
    b511: Bool,
    b495: FixedPoint
  ): Unit = if (b511){
    x4480_reg.initMem(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)))
    x4481_reg.initMem(Bool(false,true))
    x4482_reg.initMem(Bool(false,true))
    x4483_reg.initMem(Bool(false,true))
    val x4500_inr_UnitPipe = x4500_inr_UnitPipe_kernel.run(b495)
    val x5865_rd_x4482 = x4482_reg.value
    val x5866_rd_x4483 = x4483_reg.value
    val x4539_outr_Switch = x4539_outr_Switch_kernel.run(x5866_rd_x4483, x5865_rd_x4482, b495)
    x4541_reg.initMem(Bool(false,true))
    x4542_reg.initMem(Bool(false,true))
    val x4557_inr_UnitPipe = x4557_inr_UnitPipe_kernel.run(b495)
    val x5867_rd_x4541 = x4541_reg.value
    val x5868_rd_x4542 = x4542_reg.value
    val x4596_outr_Switch = x4596_outr_Switch_kernel.run(x5868_rd_x4542, b495, x5867_rd_x4541)
  } else null.asInstanceOf[Unit]
}
/** END UnitPipe x4597_outr_UnitPipe **/
