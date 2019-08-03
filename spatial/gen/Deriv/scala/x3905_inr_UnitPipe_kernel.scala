import emul._
import emul.implicits._

/** BEGIN UnitPipe x3905_inr_UnitPipe **/
object x3905_inr_UnitPipe_kernel {
  def run(
    b490: FixedPoint
  ): Unit = {
    val x6101 = b490 & FixedPoint(BigDecimal("127"),FixFormat(true,32,0))
    val x3890_deq_x538 = {
      val a0 = if (Bool(true,true) && x538_rising_0.nonEmpty) x538_rising_0.dequeue() else Struct1(FixedPoint.invalid(FixFormat(true,32,0)), FixedPoint.invalid(FixFormat(true,32,0)))
      Array[Struct1](a0)
    }
    val x3891_elem_0 = x3890_deq_x538.apply(0)
    val x3894_wr = x3884_best_rising_sram_0.update("Deriv.scala:108:45", Seq(Seq(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)))), Seq(x6101), Seq(TRUE), Seq(x3891_elem_0))
    val x3895_rd_x472 = x472_ROWS_TODO.value
    val x3896_sub = x3895_rd_x472 - FixedPoint(BigDecimal("1"),FixFormat(true,32,0))
    val x3897 = b490 === x3896_sub
    val x3898 = x6101 === FixedPoint(BigDecimal("127"),FixFormat(true,32,0))
    val x3899 = x3897 || x3898
    val x3900 = !x3899
    val x3901_wr_x3885 = if (TRUE) x3885_reg.set(x6101)
    val x3902_wr_x3886 = if (TRUE) x3886_reg.set(x3898)
    val x3903_wr_x3887 = if (TRUE) x3887_reg.set(x3899)
    val x3904_wr_x3888 = if (TRUE) x3888_reg.set(x3900)
  } 
}
/** END UnitPipe x3905_inr_UnitPipe **/
