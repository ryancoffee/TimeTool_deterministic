import emul._
import emul.implicits._

/** BEGIN UnitPipe x4757_inr_UnitPipe **/
object x4757_inr_UnitPipe_kernel {
  def run(
  ): Unit = {
    val x4749_rd_x4741 = x4741_reg.value
    val x4750 = x4749_rd_x4741 << FixedPoint(BigDecimal("3"),FixFormat(true,16,0))
    val x4751 = x4750.toFixedPoint(FixFormat(true,64,0))
    val x4752 = FixedPoint.fromInt(0)
    val x4753_sum = x4751 + x4752
    val x4754_tuple: Struct2 = new Struct2(x4753_sum, FixedPoint(BigDecimal("1024"),FixFormat(true,32,0)), Bool(false,true))
    val x4755 = true
    val x4756 = {
      if (x4755) x4746.enqueue(x4754_tuple)
    }
  } 
}
/** END UnitPipe x4757_inr_UnitPipe **/
