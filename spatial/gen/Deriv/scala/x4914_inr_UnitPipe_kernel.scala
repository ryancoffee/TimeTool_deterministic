import emul._
import emul.implicits._

/** BEGIN UnitPipe x4914_inr_UnitPipe **/
object x4914_inr_UnitPipe_kernel {
  def run(
    b498: FixedPoint
  ): Unit = {
    val x4900_deq_x562 = {
      val a0 = if (Bool(true,true) && x562_falling_0.nonEmpty) x562_falling_0.dequeue() else Struct1(FixedPoint.invalid(FixFormat(true,32,0)), FixedPoint.invalid(FixFormat(true,32,0)))
      Array[Struct1](a0)
    }
    val x4901_elem_0 = x4900_deq_x562.apply(0)
    val x4902_rd_x4837 = x4837_reg.value
    val x4905_wr = x4897_best_falling_sram_0.update("Deriv.scala:111:46", Seq(Seq(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)))), Seq(x4902_rd_x4837), Seq(TRUE), Seq(x4901_elem_0))
    val x4906_rd_x472 = x472_ROWS_TODO.value
    val x4907_sub = x4906_rd_x472 - FixedPoint(BigDecimal("1"),FixFormat(true,32,0))
    val x4908 = b498 === x4907_sub
    val x4909_rd_x4838 = x4838_reg.value
    val x4910 = x4908 || x4909_rd_x4838
    val x4911 = !x4910
    val x4912_wr_x4898 = if (TRUE) x4898_reg.set(x4910)
    val x4913_wr_x4899 = if (TRUE) x4899_reg.set(x4911)
  } 
}
/** END UnitPipe x4914_inr_UnitPipe **/
