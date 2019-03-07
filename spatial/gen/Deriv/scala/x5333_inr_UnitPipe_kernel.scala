import emul._
import emul.implicits._

/** BEGIN UnitPipe x5333_inr_UnitPipe **/
object x5333_inr_UnitPipe_kernel {
  def run(
    b502: FixedPoint
  ): Unit = {
    val x6137 = b502 & FixedPoint(BigDecimal("127"),FixFormat(true,32,0))
    val x5318_deq_x550 = {
      val a0 = if (Bool(true,true) && x550_rising_0.nonEmpty) x550_rising_0.dequeue() else Struct1(FixedPoint.invalid(FixFormat(true,32,0)), FixedPoint.invalid(FixFormat(true,32,0)))
      Array[Struct1](a0)
    }
    val x5319_elem_0 = x5318_deq_x550.apply(0)
    val x5322_wr = x5312_best_rising_sram_0.update("Deriv.scala:108:45", Seq(Seq(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)))), Seq(x6137), Seq(TRUE), Seq(x5319_elem_0))
    val x5323_rd_x472 = x472_ROWS_TODO.value
    val x5324_sub = x5323_rd_x472 - FixedPoint(BigDecimal("1"),FixFormat(true,32,0))
    val x5325 = b502 === x5324_sub
    val x5326 = x6137 === FixedPoint(BigDecimal("127"),FixFormat(true,32,0))
    val x5327 = x5325 || x5326
    val x5328 = !x5327
    val x5329_wr_x5313 = if (TRUE) x5313_reg.set(x6137)
    val x5330_wr_x5314 = if (TRUE) x5314_reg.set(x5326)
    val x5331_wr_x5315 = if (TRUE) x5315_reg.set(x5327)
    val x5332_wr_x5316 = if (TRUE) x5316_reg.set(x5328)
  } 
}
/** END UnitPipe x5333_inr_UnitPipe **/
