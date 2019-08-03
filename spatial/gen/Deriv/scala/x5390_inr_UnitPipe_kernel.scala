import emul._
import emul.implicits._

/** BEGIN UnitPipe x5390_inr_UnitPipe **/
object x5390_inr_UnitPipe_kernel {
  def run(
    b502: FixedPoint
  ): Unit = {
    val x5376_deq_x566 = {
      val a0 = if (Bool(true,true) && x566_falling_0.nonEmpty) x566_falling_0.dequeue() else Struct1(FixedPoint.invalid(FixFormat(true,32,0)), FixedPoint.invalid(FixFormat(true,32,0)))
      Array[Struct1](a0)
    }
    val x5377_elem_0 = x5376_deq_x566.apply(0)
    val x5378_rd_x5313 = x5313_reg.value
    val x5381_wr = x5373_best_falling_sram_0.update("Deriv.scala:111:46", Seq(Seq(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)))), Seq(x5378_rd_x5313), Seq(TRUE), Seq(x5377_elem_0))
    val x5382_rd_x472 = x472_ROWS_TODO.value
    val x5383_sub = x5382_rd_x472 - FixedPoint(BigDecimal("1"),FixFormat(true,32,0))
    val x5384 = b502 === x5383_sub
    val x5385_rd_x5314 = x5314_reg.value
    val x5386 = x5384 || x5385_rd_x5314
    val x5387 = !x5386
    val x5388_wr_x5374 = if (TRUE) x5374_reg.set(x5386)
    val x5389_wr_x5375 = if (TRUE) x5375_reg.set(x5387)
  } 
}
/** END UnitPipe x5390_inr_UnitPipe **/
