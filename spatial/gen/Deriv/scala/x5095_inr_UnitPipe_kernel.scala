import emul._
import emul.implicits._

/** BEGIN UnitPipe x5095_inr_UnitPipe **/
object x5095_inr_UnitPipe_kernel {
  def run(
    b500: FixedPoint
  ): Unit = {
    val x6131 = b500 & FixedPoint(BigDecimal("127"),FixFormat(true,32,0))
    val x5080_deq_x548 = {
      val a0 = if (Bool(true,true) && x548_rising_0.nonEmpty) x548_rising_0.dequeue() else Struct1(FixedPoint.invalid(FixFormat(true,32,0)), FixedPoint.invalid(FixFormat(true,32,0)))
      Array[Struct1](a0)
    }
    val x5081_elem_0 = x5080_deq_x548.apply(0)
    val x5084_wr = x5074_best_rising_sram_0.update("Deriv.scala:108:45", Seq(Seq(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)))), Seq(x6131), Seq(TRUE), Seq(x5081_elem_0))
    val x5085_rd_x472 = x472_ROWS_TODO.value
    val x5086_sub = x5085_rd_x472 - FixedPoint(BigDecimal("1"),FixFormat(true,32,0))
    val x5087 = b500 === x5086_sub
    val x5088 = x6131 === FixedPoint(BigDecimal("127"),FixFormat(true,32,0))
    val x5089 = x5087 || x5088
    val x5090 = !x5089
    val x5091_wr_x5075 = if (TRUE) x5075_reg.set(x6131)
    val x5092_wr_x5076 = if (TRUE) x5076_reg.set(x5088)
    val x5093_wr_x5077 = if (TRUE) x5077_reg.set(x5089)
    val x5094_wr_x5078 = if (TRUE) x5078_reg.set(x5090)
  } 
}
/** END UnitPipe x5095_inr_UnitPipe **/
