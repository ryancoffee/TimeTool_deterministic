import emul._
import emul.implicits._

/** BEGIN UnitPipe x4557_inr_UnitPipe **/
object x4557_inr_UnitPipe_kernel {
  def run(
    b495: FixedPoint
  ): Unit = {
    val x4543_deq_x559 = {
      val a0 = if (Bool(true,true) && x559_falling_0.nonEmpty) x559_falling_0.dequeue() else Struct1(FixedPoint.invalid(FixFormat(true,32,0)), FixedPoint.invalid(FixFormat(true,32,0)))
      Array[Struct1](a0)
    }
    val x4544_elem_0 = x4543_deq_x559.apply(0)
    val x4545_rd_x4480 = x4480_reg.value
    val x4548_wr = x4540_best_falling_sram_0.update("Deriv.scala:111:46", Seq(Seq(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)))), Seq(x4545_rd_x4480), Seq(TRUE), Seq(x4544_elem_0))
    val x4549_rd_x472 = x472_ROWS_TODO.value
    val x4550_sub = x4549_rd_x472 - FixedPoint(BigDecimal("1"),FixFormat(true,32,0))
    val x4551 = b495 === x4550_sub
    val x4552_rd_x4481 = x4481_reg.value
    val x4553 = x4551 || x4552_rd_x4481
    val x4554 = !x4553
    val x4555_wr_x4541 = if (TRUE) x4541_reg.set(x4553)
    val x4556_wr_x4542 = if (TRUE) x4542_reg.set(x4554)
  } 
}
/** END UnitPipe x4557_inr_UnitPipe **/
