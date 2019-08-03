import emul._
import emul.implicits._

/** BEGIN UnitPipe x4676_inr_UnitPipe **/
object x4676_inr_UnitPipe_kernel {
  def run(
    b496: FixedPoint
  ): Unit = {
    val x4662_deq_x560 = {
      val a0 = if (Bool(true,true) && x560_falling_0.nonEmpty) x560_falling_0.dequeue() else Struct1(FixedPoint.invalid(FixFormat(true,32,0)), FixedPoint.invalid(FixFormat(true,32,0)))
      Array[Struct1](a0)
    }
    val x4663_elem_0 = x4662_deq_x560.apply(0)
    val x4664_rd_x4599 = x4599_reg.value
    val x4667_wr = x4659_best_falling_sram_0.update("Deriv.scala:111:46", Seq(Seq(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)))), Seq(x4664_rd_x4599), Seq(TRUE), Seq(x4663_elem_0))
    val x4668_rd_x472 = x472_ROWS_TODO.value
    val x4669_sub = x4668_rd_x472 - FixedPoint(BigDecimal("1"),FixFormat(true,32,0))
    val x4670 = b496 === x4669_sub
    val x4671_rd_x4600 = x4600_reg.value
    val x4672 = x4670 || x4671_rd_x4600
    val x4673 = !x4672
    val x4674_wr_x4660 = if (TRUE) x4660_reg.set(x4672)
    val x4675_wr_x4661 = if (TRUE) x4661_reg.set(x4673)
  } 
}
/** END UnitPipe x4676_inr_UnitPipe **/
