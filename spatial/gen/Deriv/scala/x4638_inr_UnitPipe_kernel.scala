import emul._
import emul.implicits._

/** BEGIN UnitPipe x4638_inr_UnitPipe **/
object x4638_inr_UnitPipe_kernel {
  def run(
  ): Unit = {
    val x4630_rd_x4622 = x4622_reg.value
    val x4631 = x4630_rd_x4622 << FixedPoint(BigDecimal("3"),FixFormat(true,16,0))
    val x4632 = x4631.toFixedPoint(FixFormat(true,64,0))
    val x4633 = FixedPoint.fromInt(0)
    val x4634_sum = x4632 + x4633
    val x4635_tuple: Struct2 = new Struct2(x4634_sum, FixedPoint(BigDecimal("1024"),FixFormat(true,32,0)), Bool(false,true))
    val x4636 = true
    val x4637 = {
      if (x4636) x4627.enqueue(x4635_tuple)
    }
  } 
}
/** END UnitPipe x4638_inr_UnitPipe **/
