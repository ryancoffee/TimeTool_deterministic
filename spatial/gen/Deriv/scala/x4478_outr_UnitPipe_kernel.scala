import emul._
import emul.implicits._

/** BEGIN UnitPipe x4478_outr_UnitPipe **/
object x4478_outr_UnitPipe_kernel {
  def run(
    b494: FixedPoint,
    b510: Bool
  ): Unit = if (b510){
    x4361_reg.initMem(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)))
    x4362_reg.initMem(Bool(false,true))
    x4363_reg.initMem(Bool(false,true))
    x4364_reg.initMem(Bool(false,true))
    val x4381_inr_UnitPipe = x4381_inr_UnitPipe_kernel.run(b494)
    val x5861_rd_x4363 = x4363_reg.value
    val x5862_rd_x4364 = x4364_reg.value
    val x4420_outr_Switch = x4420_outr_Switch_kernel.run(x5861_rd_x4363, x5862_rd_x4364, b494)
    x4422_reg.initMem(Bool(false,true))
    x4423_reg.initMem(Bool(false,true))
    val x4438_inr_UnitPipe = x4438_inr_UnitPipe_kernel.run(b494)
    val x5863_rd_x4422 = x4422_reg.value
    val x5864_rd_x4423 = x4423_reg.value
    val x4477_outr_Switch = x4477_outr_Switch_kernel.run(b494, x5863_rd_x4422, x5864_rd_x4423)
  } else null.asInstanceOf[Unit]
}
/** END UnitPipe x4478_outr_UnitPipe **/
