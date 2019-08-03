import emul._
import emul.implicits._

/** BEGIN UnitPipe x4281_inr_UnitPipe **/
object x4281_inr_UnitPipe_kernel {
  def run(
  ): Unit = {
    val x4273_rd_x4265 = x4265_reg.value
    val x4274 = x4273_rd_x4265 << FixedPoint(BigDecimal("3"),FixFormat(true,16,0))
    val x4275 = x4274.toFixedPoint(FixFormat(true,64,0))
    val x4276 = FixedPoint.fromInt(0)
    val x4277_sum = x4275 + x4276
    val x4278_tuple: Struct2 = new Struct2(x4277_sum, FixedPoint(BigDecimal("1024"),FixFormat(true,32,0)), Bool(false,true))
    val x4279 = true
    val x4280 = {
      if (x4279) x4270.enqueue(x4278_tuple)
    }
  } 
}
/** END UnitPipe x4281_inr_UnitPipe **/
