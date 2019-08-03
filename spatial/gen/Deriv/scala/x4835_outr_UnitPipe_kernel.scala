import emul._
import emul.implicits._

/** BEGIN UnitPipe x4835_outr_UnitPipe **/
object x4835_outr_UnitPipe_kernel {
  def run(
    b513: Bool,
    b497: FixedPoint
  ): Unit = if (b513){
    x4718_reg.initMem(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)))
    x4719_reg.initMem(Bool(false,true))
    x4720_reg.initMem(Bool(false,true))
    x4721_reg.initMem(Bool(false,true))
    val x4738_inr_UnitPipe = x4738_inr_UnitPipe_kernel.run(b497)
    val x5873_rd_x4720 = x4720_reg.value
    val x5874_rd_x4721 = x4721_reg.value
    val x4777_outr_Switch = x4777_outr_Switch_kernel.run(x5874_rd_x4721, b497, x5873_rd_x4720)
    x4779_reg.initMem(Bool(false,true))
    x4780_reg.initMem(Bool(false,true))
    val x4795_inr_UnitPipe = x4795_inr_UnitPipe_kernel.run(b497)
    val x5875_rd_x4779 = x4779_reg.value
    val x5876_rd_x4780 = x4780_reg.value
    val x4834_outr_Switch = x4834_outr_Switch_kernel.run(x5875_rd_x4779, x5876_rd_x4780, b497)
  } else null.asInstanceOf[Unit]
}
/** END UnitPipe x4835_outr_UnitPipe **/
