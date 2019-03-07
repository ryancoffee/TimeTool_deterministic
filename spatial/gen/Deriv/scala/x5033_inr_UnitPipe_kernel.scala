import emul._
import emul.implicits._

/** BEGIN UnitPipe x5033_inr_UnitPipe **/
object x5033_inr_UnitPipe_kernel {
  def run(
    b499: FixedPoint
  ): Unit = {
    val x5019_deq_x563 = {
      val a0 = if (Bool(true,true) && x563_falling_0.nonEmpty) x563_falling_0.dequeue() else Struct1(FixedPoint.invalid(FixFormat(true,32,0)), FixedPoint.invalid(FixFormat(true,32,0)))
      Array[Struct1](a0)
    }
    val x5020_elem_0 = x5019_deq_x563.apply(0)
    val x5021_rd_x4956 = x4956_reg.value
    val x5024_wr = x5016_best_falling_sram_0.update("Deriv.scala:111:46", Seq(Seq(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)))), Seq(x5021_rd_x4956), Seq(TRUE), Seq(x5020_elem_0))
    val x5025_rd_x472 = x472_ROWS_TODO.value
    val x5026_sub = x5025_rd_x472 - FixedPoint(BigDecimal("1"),FixFormat(true,32,0))
    val x5027 = b499 === x5026_sub
    val x5028_rd_x4957 = x4957_reg.value
    val x5029 = x5027 || x5028_rd_x4957
    val x5030 = !x5029
    val x5031_wr_x5017 = if (TRUE) x5017_reg.set(x5029)
    val x5032_wr_x5018 = if (TRUE) x5018_reg.set(x5030)
  } 
}
/** END UnitPipe x5033_inr_UnitPipe **/
