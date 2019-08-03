import emul._
import emul.implicits._

/** BEGIN UnitPipe x5271_inr_UnitPipe **/
object x5271_inr_UnitPipe_kernel {
  def run(
    b501: FixedPoint
  ): Unit = {
    val x5257_deq_x565 = {
      val a0 = if (Bool(true,true) && x565_falling_0.nonEmpty) x565_falling_0.dequeue() else Struct1(FixedPoint.invalid(FixFormat(true,32,0)), FixedPoint.invalid(FixFormat(true,32,0)))
      Array[Struct1](a0)
    }
    val x5258_elem_0 = x5257_deq_x565.apply(0)
    val x5259_rd_x5194 = x5194_reg.value
    val x5262_wr = x5254_best_falling_sram_0.update("Deriv.scala:111:46", Seq(Seq(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)))), Seq(x5259_rd_x5194), Seq(TRUE), Seq(x5258_elem_0))
    val x5263_rd_x472 = x472_ROWS_TODO.value
    val x5264_sub = x5263_rd_x472 - FixedPoint(BigDecimal("1"),FixFormat(true,32,0))
    val x5265 = b501 === x5264_sub
    val x5266_rd_x5195 = x5195_reg.value
    val x5267 = x5265 || x5266_rd_x5195
    val x5268 = !x5267
    val x5269_wr_x5255 = if (TRUE) x5255_reg.set(x5267)
    val x5270_wr_x5256 = if (TRUE) x5256_reg.set(x5268)
  } 
}
/** END UnitPipe x5271_inr_UnitPipe **/
