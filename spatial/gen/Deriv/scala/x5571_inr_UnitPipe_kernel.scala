import emul._
import emul.implicits._

/** BEGIN UnitPipe x5571_inr_UnitPipe **/
object x5571_inr_UnitPipe_kernel {
  def run(
    b504: FixedPoint
  ): Unit = {
    val x6143 = b504 & FixedPoint(BigDecimal("127"),FixFormat(true,32,0))
    val x5556_deq_x552 = {
      val a0 = if (Bool(true,true) && x552_rising_0.nonEmpty) x552_rising_0.dequeue() else Struct1(FixedPoint.invalid(FixFormat(true,32,0)), FixedPoint.invalid(FixFormat(true,32,0)))
      Array[Struct1](a0)
    }
    val x5557_elem_0 = x5556_deq_x552.apply(0)
    val x5560_wr = x5550_best_rising_sram_0.update("Deriv.scala:108:45", Seq(Seq(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)))), Seq(x6143), Seq(TRUE), Seq(x5557_elem_0))
    val x5561_rd_x472 = x472_ROWS_TODO.value
    val x5562_sub = x5561_rd_x472 - FixedPoint(BigDecimal("1"),FixFormat(true,32,0))
    val x5563 = b504 === x5562_sub
    val x5564 = x6143 === FixedPoint(BigDecimal("127"),FixFormat(true,32,0))
    val x5565 = x5563 || x5564
    val x5566 = !x5565
    val x5567_wr_x5551 = if (TRUE) x5551_reg.set(x6143)
    val x5568_wr_x5552 = if (TRUE) x5552_reg.set(x5564)
    val x5569_wr_x5553 = if (TRUE) x5553_reg.set(x5565)
    val x5570_wr_x5554 = if (TRUE) x5554_reg.set(x5566)
  } 
}
/** END UnitPipe x5571_inr_UnitPipe **/
