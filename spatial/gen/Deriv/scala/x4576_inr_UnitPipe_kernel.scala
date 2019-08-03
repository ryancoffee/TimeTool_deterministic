import emul._
import emul.implicits._

/** BEGIN UnitPipe x4576_inr_UnitPipe **/
object x4576_inr_UnitPipe_kernel {
  def run(
  ): Unit = {
    val x4568_rd_x4560 = x4560_reg.value
    val x4569 = x4568_rd_x4560 << FixedPoint(BigDecimal("3"),FixFormat(true,16,0))
    val x4570 = x4569.toFixedPoint(FixFormat(true,64,0))
    val x4571 = FixedPoint.fromInt(0)
    val x4572_sum = x4570 + x4571
    val x4573_tuple: Struct2 = new Struct2(x4572_sum, FixedPoint(BigDecimal("1024"),FixFormat(true,32,0)), Bool(false,true))
    val x4574 = true
    val x4575 = {
      if (x4574) x4565.enqueue(x4573_tuple)
    }
  } 
}
/** END UnitPipe x4576_inr_UnitPipe **/
