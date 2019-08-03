import emul._
import emul.implicits._

/** BEGIN UnitPipe x5452_inr_UnitPipe **/
object x5452_inr_UnitPipe_kernel {
  def run(
    b503: FixedPoint
  ): Unit = {
    val x6140 = b503 & FixedPoint(BigDecimal("127"),FixFormat(true,32,0))
    val x5437_deq_x551 = {
      val a0 = if (Bool(true,true) && x551_rising_0.nonEmpty) x551_rising_0.dequeue() else Struct1(FixedPoint.invalid(FixFormat(true,32,0)), FixedPoint.invalid(FixFormat(true,32,0)))
      Array[Struct1](a0)
    }
    val x5438_elem_0 = x5437_deq_x551.apply(0)
    val x5441_wr = x5431_best_rising_sram_0.update("Deriv.scala:108:45", Seq(Seq(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)))), Seq(x6140), Seq(TRUE), Seq(x5438_elem_0))
    val x5442_rd_x472 = x472_ROWS_TODO.value
    val x5443_sub = x5442_rd_x472 - FixedPoint(BigDecimal("1"),FixFormat(true,32,0))
    val x5444 = b503 === x5443_sub
    val x5445 = x6140 === FixedPoint(BigDecimal("127"),FixFormat(true,32,0))
    val x5446 = x5444 || x5445
    val x5447 = !x5446
    val x5448_wr_x5432 = if (TRUE) x5432_reg.set(x6140)
    val x5449_wr_x5433 = if (TRUE) x5433_reg.set(x5445)
    val x5450_wr_x5434 = if (TRUE) x5434_reg.set(x5446)
    val x5451_wr_x5435 = if (TRUE) x5435_reg.set(x5447)
  } 
}
/** END UnitPipe x5452_inr_UnitPipe **/
