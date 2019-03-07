import emul._
import emul.implicits._

/** BEGIN UnitPipe x5628_inr_UnitPipe **/
object x5628_inr_UnitPipe_kernel {
  def run(
    b504: FixedPoint
  ): Unit = {
    val x5614_deq_x568 = {
      val a0 = if (Bool(true,true) && x568_falling_0.nonEmpty) x568_falling_0.dequeue() else Struct1(FixedPoint.invalid(FixFormat(true,32,0)), FixedPoint.invalid(FixFormat(true,32,0)))
      Array[Struct1](a0)
    }
    val x5615_elem_0 = x5614_deq_x568.apply(0)
    val x5616_rd_x5551 = x5551_reg.value
    val x5619_wr = x5611_best_falling_sram_0.update("Deriv.scala:111:46", Seq(Seq(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)))), Seq(x5616_rd_x5551), Seq(TRUE), Seq(x5615_elem_0))
    val x5620_rd_x472 = x472_ROWS_TODO.value
    val x5621_sub = x5620_rd_x472 - FixedPoint(BigDecimal("1"),FixFormat(true,32,0))
    val x5622 = b504 === x5621_sub
    val x5623_rd_x5552 = x5552_reg.value
    val x5624 = x5622 || x5623_rd_x5552
    val x5625 = !x5624
    val x5626_wr_x5612 = if (TRUE) x5612_reg.set(x5624)
    val x5627_wr_x5613 = if (TRUE) x5613_reg.set(x5625)
  } 
}
/** END UnitPipe x5628_inr_UnitPipe **/
