import emul._
import emul.implicits._

/** BEGIN UnitPipe x5668_outr_UnitPipe **/
object x5668_outr_UnitPipe_kernel {
  def run(
    b504: FixedPoint,
    b520: Bool
  ): Unit = if (b520){
    x5551_reg.initMem(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)))
    x5552_reg.initMem(Bool(false,true))
    x5553_reg.initMem(Bool(false,true))
    x5554_reg.initMem(Bool(false,true))
    val x5571_inr_UnitPipe = x5571_inr_UnitPipe_kernel.run(b504)
    val x5901_rd_x5553 = x5553_reg.value
    val x5902_rd_x5554 = x5554_reg.value
    val x5610_outr_Switch = x5610_outr_Switch_kernel.run(b504, x5901_rd_x5553, x5902_rd_x5554)
    x5612_reg.initMem(Bool(false,true))
    x5613_reg.initMem(Bool(false,true))
    val x5628_inr_UnitPipe = x5628_inr_UnitPipe_kernel.run(b504)
    val x5903_rd_x5612 = x5612_reg.value
    val x5904_rd_x5613 = x5613_reg.value
    val x5667_outr_Switch = x5667_outr_Switch_kernel.run(x5903_rd_x5612, b504, x5904_rd_x5613)
  } else null.asInstanceOf[Unit]
}
/** END UnitPipe x5668_outr_UnitPipe **/
