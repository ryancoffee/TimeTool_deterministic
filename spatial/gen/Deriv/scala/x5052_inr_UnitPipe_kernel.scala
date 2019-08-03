import emul._
import emul.implicits._

/** BEGIN UnitPipe x5052_inr_UnitPipe **/
object x5052_inr_UnitPipe_kernel {
  def run(
  ): Unit = {
    val x5044_rd_x5036 = x5036_reg.value
    val x5045 = x5044_rd_x5036 << FixedPoint(BigDecimal("3"),FixFormat(true,16,0))
    val x5046 = x5045.toFixedPoint(FixFormat(true,64,0))
    val x5047 = FixedPoint.fromInt(0)
    val x5048_sum = x5046 + x5047
    val x5049_tuple: Struct2 = new Struct2(x5048_sum, FixedPoint(BigDecimal("1024"),FixFormat(true,32,0)), Bool(false,true))
    val x5050 = true
    val x5051 = {
      if (x5050) x5041.enqueue(x5049_tuple)
    }
  } 
}
/** END UnitPipe x5052_inr_UnitPipe **/
