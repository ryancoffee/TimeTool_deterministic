import emul._
import emul.implicits._

/** BEGIN UnitPipe x4976_inr_UnitPipe **/
object x4976_inr_UnitPipe_kernel {
  def run(
    b499: FixedPoint
  ): Unit = {
    val x6128 = b499 & FixedPoint(BigDecimal("127"),FixFormat(true,32,0))
    val x4961_deq_x547 = {
      val a0 = if (Bool(true,true) && x547_rising_0.nonEmpty) x547_rising_0.dequeue() else Struct1(FixedPoint.invalid(FixFormat(true,32,0)), FixedPoint.invalid(FixFormat(true,32,0)))
      Array[Struct1](a0)
    }
    val x4962_elem_0 = x4961_deq_x547.apply(0)
    val x4965_wr = x4955_best_rising_sram_0.update("Deriv.scala:108:45", Seq(Seq(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)))), Seq(x6128), Seq(TRUE), Seq(x4962_elem_0))
    val x4966_rd_x472 = x472_ROWS_TODO.value
    val x4967_sub = x4966_rd_x472 - FixedPoint(BigDecimal("1"),FixFormat(true,32,0))
    val x4968 = b499 === x4967_sub
    val x4969 = x6128 === FixedPoint(BigDecimal("127"),FixFormat(true,32,0))
    val x4970 = x4968 || x4969
    val x4971 = !x4970
    val x4972_wr_x4956 = if (TRUE) x4956_reg.set(x6128)
    val x4973_wr_x4957 = if (TRUE) x4957_reg.set(x4969)
    val x4974_wr_x4958 = if (TRUE) x4958_reg.set(x4970)
    val x4975_wr_x4959 = if (TRUE) x4959_reg.set(x4971)
  } 
}
/** END UnitPipe x4976_inr_UnitPipe **/
