import emul._
import emul.implicits._

/** BEGIN UnitPipe x5152_inr_UnitPipe **/
object x5152_inr_UnitPipe_kernel {
  def run(
    b500: FixedPoint
  ): Unit = {
    val x5138_deq_x564 = {
      val a0 = if (Bool(true,true) && x564_falling_0.nonEmpty) x564_falling_0.dequeue() else Struct1(FixedPoint.invalid(FixFormat(true,32,0)), FixedPoint.invalid(FixFormat(true,32,0)))
      Array[Struct1](a0)
    }
    val x5139_elem_0 = x5138_deq_x564.apply(0)
    val x5140_rd_x5075 = x5075_reg.value
    val x5143_wr = x5135_best_falling_sram_0.update("Deriv.scala:111:46", Seq(Seq(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)))), Seq(x5140_rd_x5075), Seq(TRUE), Seq(x5139_elem_0))
    val x5144_rd_x472 = x472_ROWS_TODO.value
    val x5145_sub = x5144_rd_x472 - FixedPoint(BigDecimal("1"),FixFormat(true,32,0))
    val x5146 = b500 === x5145_sub
    val x5147_rd_x5076 = x5076_reg.value
    val x5148 = x5146 || x5147_rd_x5076
    val x5149 = !x5148
    val x5150_wr_x5136 = if (TRUE) x5136_reg.set(x5148)
    val x5151_wr_x5137 = if (TRUE) x5137_reg.set(x5149)
  } 
}
/** END UnitPipe x5152_inr_UnitPipe **/
