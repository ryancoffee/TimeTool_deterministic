import emul._
import emul.implicits._

/** BEGIN UnitPipe x4500_inr_UnitPipe **/
object x4500_inr_UnitPipe_kernel {
  def run(
    b495: FixedPoint
  ): Unit = {
    val x6116 = b495 & FixedPoint(BigDecimal("127"),FixFormat(true,32,0))
    val x4485_deq_x543 = {
      val a0 = if (Bool(true,true) && x543_rising_0.nonEmpty) x543_rising_0.dequeue() else Struct1(FixedPoint.invalid(FixFormat(true,32,0)), FixedPoint.invalid(FixFormat(true,32,0)))
      Array[Struct1](a0)
    }
    val x4486_elem_0 = x4485_deq_x543.apply(0)
    val x4489_wr = x4479_best_rising_sram_0.update("Deriv.scala:108:45", Seq(Seq(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)))), Seq(x6116), Seq(TRUE), Seq(x4486_elem_0))
    val x4490_rd_x472 = x472_ROWS_TODO.value
    val x4491_sub = x4490_rd_x472 - FixedPoint(BigDecimal("1"),FixFormat(true,32,0))
    val x4492 = b495 === x4491_sub
    val x4493 = x6116 === FixedPoint(BigDecimal("127"),FixFormat(true,32,0))
    val x4494 = x4492 || x4493
    val x4495 = !x4494
    val x4496_wr_x4480 = if (TRUE) x4480_reg.set(x6116)
    val x4497_wr_x4481 = if (TRUE) x4481_reg.set(x4493)
    val x4498_wr_x4482 = if (TRUE) x4482_reg.set(x4494)
    val x4499_wr_x4483 = if (TRUE) x4483_reg.set(x4495)
  } 
}
/** END UnitPipe x4500_inr_UnitPipe **/
