import emul._
import emul.implicits._

/** BEGIN UnitPipe x4200_inr_UnitPipe **/
object x4200_inr_UnitPipe_kernel {
  def run(
    b492: FixedPoint
  ): Unit = {
    val x4186_deq_x556 = {
      val a0 = if (Bool(true,true) && x556_falling_0.nonEmpty) x556_falling_0.dequeue() else Struct1(FixedPoint.invalid(FixFormat(true,32,0)), FixedPoint.invalid(FixFormat(true,32,0)))
      Array[Struct1](a0)
    }
    val x4187_elem_0 = x4186_deq_x556.apply(0)
    val x4188_rd_x4123 = x4123_reg.value
    val x4191_wr = x4183_best_falling_sram_0.update("Deriv.scala:111:46", Seq(Seq(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)))), Seq(x4188_rd_x4123), Seq(TRUE), Seq(x4187_elem_0))
    val x4192_rd_x472 = x472_ROWS_TODO.value
    val x4193_sub = x4192_rd_x472 - FixedPoint(BigDecimal("1"),FixFormat(true,32,0))
    val x4194 = b492 === x4193_sub
    val x4195_rd_x4124 = x4124_reg.value
    val x4196 = x4194 || x4195_rd_x4124
    val x4197 = !x4196
    val x4198_wr_x4184 = if (TRUE) x4184_reg.set(x4196)
    val x4199_wr_x4185 = if (TRUE) x4185_reg.set(x4197)
  } 
}
/** END UnitPipe x4200_inr_UnitPipe **/
