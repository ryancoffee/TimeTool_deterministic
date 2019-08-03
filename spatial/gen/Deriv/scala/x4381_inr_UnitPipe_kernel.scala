import emul._
import emul.implicits._

/** BEGIN UnitPipe x4381_inr_UnitPipe **/
object x4381_inr_UnitPipe_kernel {
  def run(
    b494: FixedPoint
  ): Unit = {
    val x6113 = b494 & FixedPoint(BigDecimal("127"),FixFormat(true,32,0))
    val x4366_deq_x542 = {
      val a0 = if (Bool(true,true) && x542_rising_0.nonEmpty) x542_rising_0.dequeue() else Struct1(FixedPoint.invalid(FixFormat(true,32,0)), FixedPoint.invalid(FixFormat(true,32,0)))
      Array[Struct1](a0)
    }
    val x4367_elem_0 = x4366_deq_x542.apply(0)
    val x4370_wr = x4360_best_rising_sram_0.update("Deriv.scala:108:45", Seq(Seq(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)))), Seq(x6113), Seq(TRUE), Seq(x4367_elem_0))
    val x4371_rd_x472 = x472_ROWS_TODO.value
    val x4372_sub = x4371_rd_x472 - FixedPoint(BigDecimal("1"),FixFormat(true,32,0))
    val x4373 = b494 === x4372_sub
    val x4374 = x6113 === FixedPoint(BigDecimal("127"),FixFormat(true,32,0))
    val x4375 = x4373 || x4374
    val x4376 = !x4375
    val x4377_wr_x4361 = if (TRUE) x4361_reg.set(x6113)
    val x4378_wr_x4362 = if (TRUE) x4362_reg.set(x4374)
    val x4379_wr_x4363 = if (TRUE) x4363_reg.set(x4375)
    val x4380_wr_x4364 = if (TRUE) x4364_reg.set(x4376)
  } 
}
/** END UnitPipe x4381_inr_UnitPipe **/
