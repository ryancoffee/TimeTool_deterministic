import emul._
import emul.implicits._

/** BEGIN UnitPipe x5590_inr_UnitPipe **/
object x5590_inr_UnitPipe_kernel {
  def run(
  ): Unit = {
    val x5582_rd_x5574 = x5574_reg.value
    val x5583 = x5582_rd_x5574 << FixedPoint(BigDecimal("3"),FixFormat(true,16,0))
    val x5584 = x5583.toFixedPoint(FixFormat(true,64,0))
    val x5585 = FixedPoint.fromInt(0)
    val x5586_sum = x5584 + x5585
    val x5587_tuple: Struct2 = new Struct2(x5586_sum, FixedPoint(BigDecimal("1024"),FixFormat(true,32,0)), Bool(false,true))
    val x5588 = true
    val x5589 = {
      if (x5588) x5579.enqueue(x5587_tuple)
    }
  } 
}
/** END UnitPipe x5590_inr_UnitPipe **/
