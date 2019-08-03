import emul._
import emul.implicits._

/** BEGIN UnitPipe x5690_inr_UnitPipe **/
object x5690_inr_UnitPipe_kernel {
  def run(
    b505: FixedPoint
  ): Unit = {
    val x6146 = b505 & FixedPoint(BigDecimal("127"),FixFormat(true,32,0))
    val x5675_deq_x553 = {
      val a0 = if (Bool(true,true) && x553_rising_0.nonEmpty) x553_rising_0.dequeue() else Struct1(FixedPoint.invalid(FixFormat(true,32,0)), FixedPoint.invalid(FixFormat(true,32,0)))
      Array[Struct1](a0)
    }
    val x5676_elem_0 = x5675_deq_x553.apply(0)
    val x5679_wr = x5669_best_rising_sram_0.update("Deriv.scala:108:45", Seq(Seq(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)))), Seq(x6146), Seq(TRUE), Seq(x5676_elem_0))
    val x5680_rd_x472 = x472_ROWS_TODO.value
    val x5681_sub = x5680_rd_x472 - FixedPoint(BigDecimal("1"),FixFormat(true,32,0))
    val x5682 = b505 === x5681_sub
    val x5683 = x6146 === FixedPoint(BigDecimal("127"),FixFormat(true,32,0))
    val x5684 = x5682 || x5683
    val x5685 = !x5684
    val x5686_wr_x5670 = if (TRUE) x5670_reg.set(x6146)
    val x5687_wr_x5671 = if (TRUE) x5671_reg.set(x5683)
    val x5688_wr_x5672 = if (TRUE) x5672_reg.set(x5684)
    val x5689_wr_x5673 = if (TRUE) x5673_reg.set(x5685)
  } 
}
/** END UnitPipe x5690_inr_UnitPipe **/
