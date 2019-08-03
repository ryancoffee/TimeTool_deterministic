import emul._
import emul.implicits._

/** BEGIN UnitPipe x5430_outr_UnitPipe **/
object x5430_outr_UnitPipe_kernel {
  def run(
    b518: Bool,
    b502: FixedPoint
  ): Unit = if (b518){
    x5313_reg.initMem(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)))
    x5314_reg.initMem(Bool(false,true))
    x5315_reg.initMem(Bool(false,true))
    x5316_reg.initMem(Bool(false,true))
    val x5333_inr_UnitPipe = x5333_inr_UnitPipe_kernel.run(b502)
    val x5893_rd_x5315 = x5315_reg.value
    val x5894_rd_x5316 = x5316_reg.value
    val x5372_outr_Switch = x5372_outr_Switch_kernel.run(x5893_rd_x5315, x5894_rd_x5316, b502)
    x5374_reg.initMem(Bool(false,true))
    x5375_reg.initMem(Bool(false,true))
    val x5390_inr_UnitPipe = x5390_inr_UnitPipe_kernel.run(b502)
    val x5895_rd_x5374 = x5374_reg.value
    val x5896_rd_x5375 = x5375_reg.value
    val x5429_outr_Switch = x5429_outr_Switch_kernel.run(x5896_rd_x5375, b502, x5895_rd_x5374)
  } else null.asInstanceOf[Unit]
}
/** END UnitPipe x5430_outr_UnitPipe **/
