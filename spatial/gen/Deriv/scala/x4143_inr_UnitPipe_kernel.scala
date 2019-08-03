import emul._
import emul.implicits._

/** BEGIN UnitPipe x4143_inr_UnitPipe **/
object x4143_inr_UnitPipe_kernel {
  def run(
    b492: FixedPoint
  ): Unit = {
    val x6107 = b492 & FixedPoint(BigDecimal("127"),FixFormat(true,32,0))
    val x4128_deq_x540 = {
      val a0 = if (Bool(true,true) && x540_rising_0.nonEmpty) x540_rising_0.dequeue() else Struct1(FixedPoint.invalid(FixFormat(true,32,0)), FixedPoint.invalid(FixFormat(true,32,0)))
      Array[Struct1](a0)
    }
    val x4129_elem_0 = x4128_deq_x540.apply(0)
    val x4132_wr = x4122_best_rising_sram_0.update("Deriv.scala:108:45", Seq(Seq(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)))), Seq(x6107), Seq(TRUE), Seq(x4129_elem_0))
    val x4133_rd_x472 = x472_ROWS_TODO.value
    val x4134_sub = x4133_rd_x472 - FixedPoint(BigDecimal("1"),FixFormat(true,32,0))
    val x4135 = b492 === x4134_sub
    val x4136 = x6107 === FixedPoint(BigDecimal("127"),FixFormat(true,32,0))
    val x4137 = x4135 || x4136
    val x4138 = !x4137
    val x4139_wr_x4123 = if (TRUE) x4123_reg.set(x6107)
    val x4140_wr_x4124 = if (TRUE) x4124_reg.set(x4136)
    val x4141_wr_x4125 = if (TRUE) x4125_reg.set(x4137)
    val x4142_wr_x4126 = if (TRUE) x4126_reg.set(x4138)
  } 
}
/** END UnitPipe x4143_inr_UnitPipe **/
