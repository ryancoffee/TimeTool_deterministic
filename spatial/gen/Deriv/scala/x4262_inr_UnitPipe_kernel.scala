import emul._
import emul.implicits._

/** BEGIN UnitPipe x4262_inr_UnitPipe **/
object x4262_inr_UnitPipe_kernel {
  def run(
    b493: FixedPoint
  ): Unit = {
    val x6110 = b493 & FixedPoint(BigDecimal("127"),FixFormat(true,32,0))
    val x4247_deq_x541 = {
      val a0 = if (Bool(true,true) && x541_rising_0.nonEmpty) x541_rising_0.dequeue() else Struct1(FixedPoint.invalid(FixFormat(true,32,0)), FixedPoint.invalid(FixFormat(true,32,0)))
      Array[Struct1](a0)
    }
    val x4248_elem_0 = x4247_deq_x541.apply(0)
    val x4251_wr = x4241_best_rising_sram_0.update("Deriv.scala:108:45", Seq(Seq(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)))), Seq(x6110), Seq(TRUE), Seq(x4248_elem_0))
    val x4252_rd_x472 = x472_ROWS_TODO.value
    val x4253_sub = x4252_rd_x472 - FixedPoint(BigDecimal("1"),FixFormat(true,32,0))
    val x4254 = b493 === x4253_sub
    val x4255 = x6110 === FixedPoint(BigDecimal("127"),FixFormat(true,32,0))
    val x4256 = x4254 || x4255
    val x4257 = !x4256
    val x4258_wr_x4242 = if (TRUE) x4242_reg.set(x6110)
    val x4259_wr_x4243 = if (TRUE) x4243_reg.set(x4255)
    val x4260_wr_x4244 = if (TRUE) x4244_reg.set(x4256)
    val x4261_wr_x4245 = if (TRUE) x4245_reg.set(x4257)
  } 
}
/** END UnitPipe x4262_inr_UnitPipe **/
