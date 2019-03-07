import emul._
import emul.implicits._

/** BEGIN UnitPipe x5509_inr_UnitPipe **/
object x5509_inr_UnitPipe_kernel {
  def run(
    b503: FixedPoint
  ): Unit = {
    val x5495_deq_x567 = {
      val a0 = if (Bool(true,true) && x567_falling_0.nonEmpty) x567_falling_0.dequeue() else Struct1(FixedPoint.invalid(FixFormat(true,32,0)), FixedPoint.invalid(FixFormat(true,32,0)))
      Array[Struct1](a0)
    }
    val x5496_elem_0 = x5495_deq_x567.apply(0)
    val x5497_rd_x5432 = x5432_reg.value
    val x5500_wr = x5492_best_falling_sram_0.update("Deriv.scala:111:46", Seq(Seq(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)))), Seq(x5497_rd_x5432), Seq(TRUE), Seq(x5496_elem_0))
    val x5501_rd_x472 = x472_ROWS_TODO.value
    val x5502_sub = x5501_rd_x472 - FixedPoint(BigDecimal("1"),FixFormat(true,32,0))
    val x5503 = b503 === x5502_sub
    val x5504_rd_x5433 = x5433_reg.value
    val x5505 = x5503 || x5504_rd_x5433
    val x5506 = !x5505
    val x5507_wr_x5493 = if (TRUE) x5493_reg.set(x5505)
    val x5508_wr_x5494 = if (TRUE) x5494_reg.set(x5506)
  } 
}
/** END UnitPipe x5509_inr_UnitPipe **/
