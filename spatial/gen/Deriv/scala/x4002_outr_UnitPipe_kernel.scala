import emul._
import emul.implicits._

/** BEGIN UnitPipe x4002_outr_UnitPipe **/
object x4002_outr_UnitPipe_kernel {
  def run(
    b490: FixedPoint,
    b506: Bool
  ): Unit = if (b506){
    x3885_reg.initMem(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)))
    x3886_reg.initMem(Bool(false,true))
    x3887_reg.initMem(Bool(false,true))
    x3888_reg.initMem(Bool(false,true))
    val x3905_inr_UnitPipe = x3905_inr_UnitPipe_kernel.run(b490)
    val x5845_rd_x3887 = x3887_reg.value
    val x5846_rd_x3888 = x3888_reg.value
    val x3944_outr_Switch = x3944_outr_Switch_kernel.run(x5846_rd_x3888, b490, x5845_rd_x3887)
    x3946_reg.initMem(Bool(false,true))
    x3947_reg.initMem(Bool(false,true))
    val x3962_inr_UnitPipe = x3962_inr_UnitPipe_kernel.run(b490)
    val x5847_rd_x3946 = x3946_reg.value
    val x5848_rd_x3947 = x3947_reg.value
    val x4001_outr_Switch = x4001_outr_Switch_kernel.run(x5847_rd_x3946, x5848_rd_x3947, b490)
  } else null.asInstanceOf[Unit]
}
/** END UnitPipe x4002_outr_UnitPipe **/
