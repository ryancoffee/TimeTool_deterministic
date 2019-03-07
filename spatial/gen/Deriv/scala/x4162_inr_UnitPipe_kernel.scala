import emul._
import emul.implicits._

/** BEGIN UnitPipe x4162_inr_UnitPipe **/
object x4162_inr_UnitPipe_kernel {
  def run(
  ): Unit = {
    val x4154_rd_x4146 = x4146_reg.value
    val x4155 = x4154_rd_x4146 << FixedPoint(BigDecimal("3"),FixFormat(true,16,0))
    val x4156 = x4155.toFixedPoint(FixFormat(true,64,0))
    val x4157 = FixedPoint.fromInt(0)
    val x4158_sum = x4156 + x4157
    val x4159_tuple: Struct2 = new Struct2(x4158_sum, FixedPoint(BigDecimal("1024"),FixFormat(true,32,0)), Bool(false,true))
    val x4160 = true
    val x4161 = {
      if (x4160) x4151.enqueue(x4159_tuple)
    }
  } 
}
/** END UnitPipe x4162_inr_UnitPipe **/
