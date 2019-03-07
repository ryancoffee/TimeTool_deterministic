import emul._
import emul.implicits._

/** BEGIN UnitPipe x4319_inr_UnitPipe **/
object x4319_inr_UnitPipe_kernel {
  def run(
    b493: FixedPoint
  ): Unit = {
    val x4305_deq_x557 = {
      val a0 = if (Bool(true,true) && x557_falling_0.nonEmpty) x557_falling_0.dequeue() else Struct1(FixedPoint.invalid(FixFormat(true,32,0)), FixedPoint.invalid(FixFormat(true,32,0)))
      Array[Struct1](a0)
    }
    val x4306_elem_0 = x4305_deq_x557.apply(0)
    val x4307_rd_x4242 = x4242_reg.value
    val x4310_wr = x4302_best_falling_sram_0.update("Deriv.scala:111:46", Seq(Seq(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)))), Seq(x4307_rd_x4242), Seq(TRUE), Seq(x4306_elem_0))
    val x4311_rd_x472 = x472_ROWS_TODO.value
    val x4312_sub = x4311_rd_x472 - FixedPoint(BigDecimal("1"),FixFormat(true,32,0))
    val x4313 = b493 === x4312_sub
    val x4314_rd_x4243 = x4243_reg.value
    val x4315 = x4313 || x4314_rd_x4243
    val x4316 = !x4315
    val x4317_wr_x4303 = if (TRUE) x4303_reg.set(x4315)
    val x4318_wr_x4304 = if (TRUE) x4304_reg.set(x4316)
  } 
}
/** END UnitPipe x4319_inr_UnitPipe **/
