import emul._
import emul.implicits._

/** BEGIN UnitPipe x3962_inr_UnitPipe **/
object x3962_inr_UnitPipe_kernel {
  def run(
    b490: FixedPoint
  ): Unit = {
    val x3948_deq_x554 = {
      val a0 = if (Bool(true,true) && x554_falling_0.nonEmpty) x554_falling_0.dequeue() else Struct1(FixedPoint.invalid(FixFormat(true,32,0)), FixedPoint.invalid(FixFormat(true,32,0)))
      Array[Struct1](a0)
    }
    val x3949_elem_0 = x3948_deq_x554.apply(0)
    val x3950_rd_x3885 = x3885_reg.value
    val x3953_wr = x3945_best_falling_sram_0.update("Deriv.scala:111:46", Seq(Seq(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)))), Seq(x3950_rd_x3885), Seq(TRUE), Seq(x3949_elem_0))
    val x3954_rd_x472 = x472_ROWS_TODO.value
    val x3955_sub = x3954_rd_x472 - FixedPoint(BigDecimal("1"),FixFormat(true,32,0))
    val x3956 = b490 === x3955_sub
    val x3957_rd_x3886 = x3886_reg.value
    val x3958 = x3956 || x3957_rd_x3886
    val x3959 = !x3958
    val x3960_wr_x3946 = if (TRUE) x3946_reg.set(x3958)
    val x3961_wr_x3947 = if (TRUE) x3947_reg.set(x3959)
  } 
}
/** END UnitPipe x3962_inr_UnitPipe **/
