import emul._
import emul.implicits._

/** BEGIN UnitPipe x4619_inr_UnitPipe **/
object x4619_inr_UnitPipe_kernel {
  def run(
    b496: FixedPoint
  ): Unit = {
    val x6119 = b496 & FixedPoint(BigDecimal("127"),FixFormat(true,32,0))
    val x4604_deq_x544 = {
      val a0 = if (Bool(true,true) && x544_rising_0.nonEmpty) x544_rising_0.dequeue() else Struct1(FixedPoint.invalid(FixFormat(true,32,0)), FixedPoint.invalid(FixFormat(true,32,0)))
      Array[Struct1](a0)
    }
    val x4605_elem_0 = x4604_deq_x544.apply(0)
    val x4608_wr = x4598_best_rising_sram_0.update("Deriv.scala:108:45", Seq(Seq(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)))), Seq(x6119), Seq(TRUE), Seq(x4605_elem_0))
    val x4609_rd_x472 = x472_ROWS_TODO.value
    val x4610_sub = x4609_rd_x472 - FixedPoint(BigDecimal("1"),FixFormat(true,32,0))
    val x4611 = b496 === x4610_sub
    val x4612 = x6119 === FixedPoint(BigDecimal("127"),FixFormat(true,32,0))
    val x4613 = x4611 || x4612
    val x4614 = !x4613
    val x4615_wr_x4599 = if (TRUE) x4599_reg.set(x6119)
    val x4616_wr_x4600 = if (TRUE) x4600_reg.set(x4612)
    val x4617_wr_x4601 = if (TRUE) x4601_reg.set(x4613)
    val x4618_wr_x4602 = if (TRUE) x4602_reg.set(x4614)
  } 
}
/** END UnitPipe x4619_inr_UnitPipe **/
