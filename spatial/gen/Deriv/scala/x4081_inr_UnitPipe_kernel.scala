import emul._
import emul.implicits._

/** BEGIN UnitPipe x4081_inr_UnitPipe **/
object x4081_inr_UnitPipe_kernel {
  def run(
    b491: FixedPoint
  ): Unit = {
    val x4067_deq_x555 = {
      val a0 = if (Bool(true,true) && x555_falling_0.nonEmpty) x555_falling_0.dequeue() else Struct1(FixedPoint.invalid(FixFormat(true,32,0)), FixedPoint.invalid(FixFormat(true,32,0)))
      Array[Struct1](a0)
    }
    val x4068_elem_0 = x4067_deq_x555.apply(0)
    val x4069_rd_x4004 = x4004_reg.value
    val x4072_wr = x4064_best_falling_sram_0.update("Deriv.scala:111:46", Seq(Seq(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)))), Seq(x4069_rd_x4004), Seq(TRUE), Seq(x4068_elem_0))
    val x4073_rd_x472 = x472_ROWS_TODO.value
    val x4074_sub = x4073_rd_x472 - FixedPoint(BigDecimal("1"),FixFormat(true,32,0))
    val x4075 = b491 === x4074_sub
    val x4076_rd_x4005 = x4005_reg.value
    val x4077 = x4075 || x4076_rd_x4005
    val x4078 = !x4077
    val x4079_wr_x4065 = if (TRUE) x4065_reg.set(x4077)
    val x4080_wr_x4066 = if (TRUE) x4066_reg.set(x4078)
  } 
}
/** END UnitPipe x4081_inr_UnitPipe **/
