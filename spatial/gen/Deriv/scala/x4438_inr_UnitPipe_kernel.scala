import emul._
import emul.implicits._

/** BEGIN UnitPipe x4438_inr_UnitPipe **/
object x4438_inr_UnitPipe_kernel {
  def run(
    b494: FixedPoint
  ): Unit = {
    val x4424_deq_x558 = {
      val a0 = if (Bool(true,true) && x558_falling_0.nonEmpty) x558_falling_0.dequeue() else Struct1(FixedPoint.invalid(FixFormat(true,32,0)), FixedPoint.invalid(FixFormat(true,32,0)))
      Array[Struct1](a0)
    }
    val x4425_elem_0 = x4424_deq_x558.apply(0)
    val x4426_rd_x4361 = x4361_reg.value
    val x4429_wr = x4421_best_falling_sram_0.update("Deriv.scala:111:46", Seq(Seq(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)))), Seq(x4426_rd_x4361), Seq(TRUE), Seq(x4425_elem_0))
    val x4430_rd_x472 = x472_ROWS_TODO.value
    val x4431_sub = x4430_rd_x472 - FixedPoint(BigDecimal("1"),FixFormat(true,32,0))
    val x4432 = b494 === x4431_sub
    val x4433_rd_x4362 = x4362_reg.value
    val x4434 = x4432 || x4433_rd_x4362
    val x4435 = !x4434
    val x4436_wr_x4422 = if (TRUE) x4422_reg.set(x4434)
    val x4437_wr_x4423 = if (TRUE) x4423_reg.set(x4435)
  } 
}
/** END UnitPipe x4438_inr_UnitPipe **/
