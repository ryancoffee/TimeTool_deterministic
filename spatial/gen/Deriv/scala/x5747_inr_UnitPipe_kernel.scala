import emul._
import emul.implicits._

/** BEGIN UnitPipe x5747_inr_UnitPipe **/
object x5747_inr_UnitPipe_kernel {
  def run(
    b505: FixedPoint
  ): Unit = {
    val x5733_deq_x569 = {
      val a0 = if (Bool(true,true) && x569_falling_0.nonEmpty) x569_falling_0.dequeue() else Struct1(FixedPoint.invalid(FixFormat(true,32,0)), FixedPoint.invalid(FixFormat(true,32,0)))
      Array[Struct1](a0)
    }
    val x5734_elem_0 = x5733_deq_x569.apply(0)
    val x5735_rd_x5670 = x5670_reg.value
    val x5738_wr = x5730_best_falling_sram_0.update("Deriv.scala:111:46", Seq(Seq(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)))), Seq(x5735_rd_x5670), Seq(TRUE), Seq(x5734_elem_0))
    val x5739_rd_x472 = x472_ROWS_TODO.value
    val x5740_sub = x5739_rd_x472 - FixedPoint(BigDecimal("1"),FixFormat(true,32,0))
    val x5741 = b505 === x5740_sub
    val x5742_rd_x5671 = x5671_reg.value
    val x5743 = x5741 || x5742_rd_x5671
    val x5744 = !x5743
    val x5745_wr_x5731 = if (TRUE) x5731_reg.set(x5743)
    val x5746_wr_x5732 = if (TRUE) x5732_reg.set(x5744)
  } 
}
/** END UnitPipe x5747_inr_UnitPipe **/
