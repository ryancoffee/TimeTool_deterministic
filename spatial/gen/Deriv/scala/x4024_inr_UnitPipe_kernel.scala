import emul._
import emul.implicits._

/** BEGIN UnitPipe x4024_inr_UnitPipe **/
object x4024_inr_UnitPipe_kernel {
  def run(
    b491: FixedPoint
  ): Unit = {
    val x6104 = b491 & FixedPoint(BigDecimal("127"),FixFormat(true,32,0))
    val x4009_deq_x539 = {
      val a0 = if (Bool(true,true) && x539_rising_0.nonEmpty) x539_rising_0.dequeue() else Struct1(FixedPoint.invalid(FixFormat(true,32,0)), FixedPoint.invalid(FixFormat(true,32,0)))
      Array[Struct1](a0)
    }
    val x4010_elem_0 = x4009_deq_x539.apply(0)
    val x4013_wr = x4003_best_rising_sram_0.update("Deriv.scala:108:45", Seq(Seq(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)))), Seq(x6104), Seq(TRUE), Seq(x4010_elem_0))
    val x4014_rd_x472 = x472_ROWS_TODO.value
    val x4015_sub = x4014_rd_x472 - FixedPoint(BigDecimal("1"),FixFormat(true,32,0))
    val x4016 = b491 === x4015_sub
    val x4017 = x6104 === FixedPoint(BigDecimal("127"),FixFormat(true,32,0))
    val x4018 = x4016 || x4017
    val x4019 = !x4018
    val x4020_wr_x4004 = if (TRUE) x4004_reg.set(x6104)
    val x4021_wr_x4005 = if (TRUE) x4005_reg.set(x4017)
    val x4022_wr_x4006 = if (TRUE) x4006_reg.set(x4018)
    val x4023_wr_x4007 = if (TRUE) x4007_reg.set(x4019)
  } 
}
/** END UnitPipe x4024_inr_UnitPipe **/
