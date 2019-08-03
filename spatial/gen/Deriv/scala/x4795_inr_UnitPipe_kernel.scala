import emul._
import emul.implicits._

/** BEGIN UnitPipe x4795_inr_UnitPipe **/
object x4795_inr_UnitPipe_kernel {
  def run(
    b497: FixedPoint
  ): Unit = {
    val x4781_deq_x561 = {
      val a0 = if (Bool(true,true) && x561_falling_0.nonEmpty) x561_falling_0.dequeue() else Struct1(FixedPoint.invalid(FixFormat(true,32,0)), FixedPoint.invalid(FixFormat(true,32,0)))
      Array[Struct1](a0)
    }
    val x4782_elem_0 = x4781_deq_x561.apply(0)
    val x4783_rd_x4718 = x4718_reg.value
    val x4786_wr = x4778_best_falling_sram_0.update("Deriv.scala:111:46", Seq(Seq(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)))), Seq(x4783_rd_x4718), Seq(TRUE), Seq(x4782_elem_0))
    val x4787_rd_x472 = x472_ROWS_TODO.value
    val x4788_sub = x4787_rd_x472 - FixedPoint(BigDecimal("1"),FixFormat(true,32,0))
    val x4789 = b497 === x4788_sub
    val x4790_rd_x4719 = x4719_reg.value
    val x4791 = x4789 || x4790_rd_x4719
    val x4792 = !x4791
    val x4793_wr_x4779 = if (TRUE) x4779_reg.set(x4791)
    val x4794_wr_x4780 = if (TRUE) x4780_reg.set(x4792)
  } 
}
/** END UnitPipe x4795_inr_UnitPipe **/
