import emul._
import emul.implicits._

/** BEGIN UnitPipe x5787_outr_UnitPipe **/
object x5787_outr_UnitPipe_kernel {
  def run(
    b521: Bool,
    b505: FixedPoint
  ): Unit = if (b521){
    x5670_reg.initMem(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)))
    x5671_reg.initMem(Bool(false,true))
    x5672_reg.initMem(Bool(false,true))
    x5673_reg.initMem(Bool(false,true))
    val x5690_inr_UnitPipe = x5690_inr_UnitPipe_kernel.run(b505)
    val x5905_rd_x5672 = x5672_reg.value
    val x5906_rd_x5673 = x5673_reg.value
    val x5729_outr_Switch = x5729_outr_Switch_kernel.run(x5906_rd_x5673, x5905_rd_x5672, b505)
    x5731_reg.initMem(Bool(false,true))
    x5732_reg.initMem(Bool(false,true))
    val x5747_inr_UnitPipe = x5747_inr_UnitPipe_kernel.run(b505)
    val x5907_rd_x5731 = x5731_reg.value
    val x5908_rd_x5732 = x5732_reg.value
    val x5786_outr_Switch = x5786_outr_Switch_kernel.run(x5908_rd_x5732, b505, x5907_rd_x5731)
  } else null.asInstanceOf[Unit]
}
/** END UnitPipe x5787_outr_UnitPipe **/
