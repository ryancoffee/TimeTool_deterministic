import emul._
import emul.implicits._

/** BEGIN UnitPipe x4738_inr_UnitPipe **/
object x4738_inr_UnitPipe_kernel {
  def run(
    b497: FixedPoint
  ): Unit = {
    val x6122 = b497 & FixedPoint(BigDecimal("127"),FixFormat(true,32,0))
    val x4723_deq_x545 = {
      val a0 = if (Bool(true,true) && x545_rising_0.nonEmpty) x545_rising_0.dequeue() else Struct1(FixedPoint.invalid(FixFormat(true,32,0)), FixedPoint.invalid(FixFormat(true,32,0)))
      Array[Struct1](a0)
    }
    val x4724_elem_0 = x4723_deq_x545.apply(0)
    val x4727_wr = x4717_best_rising_sram_0.update("Deriv.scala:108:45", Seq(Seq(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)))), Seq(x6122), Seq(TRUE), Seq(x4724_elem_0))
    val x4728_rd_x472 = x472_ROWS_TODO.value
    val x4729_sub = x4728_rd_x472 - FixedPoint(BigDecimal("1"),FixFormat(true,32,0))
    val x4730 = b497 === x4729_sub
    val x4731 = x6122 === FixedPoint(BigDecimal("127"),FixFormat(true,32,0))
    val x4732 = x4730 || x4731
    val x4733 = !x4732
    val x4734_wr_x4718 = if (TRUE) x4718_reg.set(x6122)
    val x4735_wr_x4719 = if (TRUE) x4719_reg.set(x4731)
    val x4736_wr_x4720 = if (TRUE) x4720_reg.set(x4732)
    val x4737_wr_x4721 = if (TRUE) x4721_reg.set(x4733)
  } 
}
/** END UnitPipe x4738_inr_UnitPipe **/
