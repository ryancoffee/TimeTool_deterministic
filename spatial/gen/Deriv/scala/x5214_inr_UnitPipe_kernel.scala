import emul._
import emul.implicits._

/** BEGIN UnitPipe x5214_inr_UnitPipe **/
object x5214_inr_UnitPipe_kernel {
  def run(
    b501: FixedPoint
  ): Unit = {
    val x6134 = b501 & FixedPoint(BigDecimal("127"),FixFormat(true,32,0))
    val x5199_deq_x549 = {
      val a0 = if (Bool(true,true) && x549_rising_0.nonEmpty) x549_rising_0.dequeue() else Struct1(FixedPoint.invalid(FixFormat(true,32,0)), FixedPoint.invalid(FixFormat(true,32,0)))
      Array[Struct1](a0)
    }
    val x5200_elem_0 = x5199_deq_x549.apply(0)
    val x5203_wr = x5193_best_rising_sram_0.update("Deriv.scala:108:45", Seq(Seq(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)))), Seq(x6134), Seq(TRUE), Seq(x5200_elem_0))
    val x5204_rd_x472 = x472_ROWS_TODO.value
    val x5205_sub = x5204_rd_x472 - FixedPoint(BigDecimal("1"),FixFormat(true,32,0))
    val x5206 = b501 === x5205_sub
    val x5207 = x6134 === FixedPoint(BigDecimal("127"),FixFormat(true,32,0))
    val x5208 = x5206 || x5207
    val x5209 = !x5208
    val x5210_wr_x5194 = if (TRUE) x5194_reg.set(x6134)
    val x5211_wr_x5195 = if (TRUE) x5195_reg.set(x5207)
    val x5212_wr_x5196 = if (TRUE) x5196_reg.set(x5208)
    val x5213_wr_x5197 = if (TRUE) x5197_reg.set(x5209)
  } 
}
/** END UnitPipe x5214_inr_UnitPipe **/
