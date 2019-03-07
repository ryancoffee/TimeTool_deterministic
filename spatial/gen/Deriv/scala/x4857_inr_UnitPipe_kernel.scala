import emul._
import emul.implicits._

/** BEGIN UnitPipe x4857_inr_UnitPipe **/
object x4857_inr_UnitPipe_kernel {
  def run(
    b498: FixedPoint
  ): Unit = {
    val x6125 = b498 & FixedPoint(BigDecimal("127"),FixFormat(true,32,0))
    val x4842_deq_x546 = {
      val a0 = if (Bool(true,true) && x546_rising_0.nonEmpty) x546_rising_0.dequeue() else Struct1(FixedPoint.invalid(FixFormat(true,32,0)), FixedPoint.invalid(FixFormat(true,32,0)))
      Array[Struct1](a0)
    }
    val x4843_elem_0 = x4842_deq_x546.apply(0)
    val x4846_wr = x4836_best_rising_sram_0.update("Deriv.scala:108:45", Seq(Seq(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)))), Seq(x6125), Seq(TRUE), Seq(x4843_elem_0))
    val x4847_rd_x472 = x472_ROWS_TODO.value
    val x4848_sub = x4847_rd_x472 - FixedPoint(BigDecimal("1"),FixFormat(true,32,0))
    val x4849 = b498 === x4848_sub
    val x4850 = x6125 === FixedPoint(BigDecimal("127"),FixFormat(true,32,0))
    val x4851 = x4849 || x4850
    val x4852 = !x4851
    val x4853_wr_x4837 = if (TRUE) x4837_reg.set(x6125)
    val x4854_wr_x4838 = if (TRUE) x4838_reg.set(x4850)
    val x4855_wr_x4839 = if (TRUE) x4839_reg.set(x4851)
    val x4856_wr_x4840 = if (TRUE) x4840_reg.set(x4852)
  } 
}
/** END UnitPipe x4857_inr_UnitPipe **/
