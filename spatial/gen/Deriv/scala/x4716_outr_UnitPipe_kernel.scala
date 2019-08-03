import emul._
import emul.implicits._

/** BEGIN UnitPipe x4716_outr_UnitPipe **/
object x4716_outr_UnitPipe_kernel {
  def run(
    b512: Bool,
    b496: FixedPoint
  ): Unit = if (b512){
    x4599_reg.initMem(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)))
    x4600_reg.initMem(Bool(false,true))
    x4601_reg.initMem(Bool(false,true))
    x4602_reg.initMem(Bool(false,true))
    val x4619_inr_UnitPipe = x4619_inr_UnitPipe_kernel.run(b496)
    val x5869_rd_x4601 = x4601_reg.value
    val x5870_rd_x4602 = x4602_reg.value
    val x4658_outr_Switch = x4658_outr_Switch_kernel.run(x5870_rd_x4602, x5869_rd_x4601, b496)
    x4660_reg.initMem(Bool(false,true))
    x4661_reg.initMem(Bool(false,true))
    val x4676_inr_UnitPipe = x4676_inr_UnitPipe_kernel.run(b496)
    val x5871_rd_x4660 = x4660_reg.value
    val x5872_rd_x4661 = x4661_reg.value
    val x4715_outr_Switch = x4715_outr_Switch_kernel.run(x5872_rd_x4661, x5871_rd_x4660, b496)
  } else null.asInstanceOf[Unit]
}
/** END UnitPipe x4716_outr_UnitPipe **/
