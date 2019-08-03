import emul._
import emul.implicits._

/** BEGIN UnitPipe x4338_inr_UnitPipe **/
object x4338_inr_UnitPipe_kernel {
  def run(
  ): Unit = {
    val x4330_rd_x4322 = x4322_reg.value
    val x4331 = x4330_rd_x4322 << FixedPoint(BigDecimal("3"),FixFormat(true,16,0))
    val x4332 = x4331.toFixedPoint(FixFormat(true,64,0))
    val x4333 = FixedPoint.fromInt(0)
    val x4334_sum = x4332 + x4333
    val x4335_tuple: Struct2 = new Struct2(x4334_sum, FixedPoint(BigDecimal("1024"),FixFormat(true,32,0)), Bool(false,true))
    val x4336 = true
    val x4337 = {
      if (x4336) x4327.enqueue(x4335_tuple)
    }
  } 
}
/** END UnitPipe x4338_inr_UnitPipe **/
