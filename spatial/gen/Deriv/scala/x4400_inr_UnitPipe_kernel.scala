import emul._
import emul.implicits._

/** BEGIN UnitPipe x4400_inr_UnitPipe **/
object x4400_inr_UnitPipe_kernel {
  def run(
  ): Unit = {
    val x4392_rd_x4384 = x4384_reg.value
    val x4393 = x4392_rd_x4384 << FixedPoint(BigDecimal("3"),FixFormat(true,16,0))
    val x4394 = x4393.toFixedPoint(FixFormat(true,64,0))
    val x4395 = FixedPoint.fromInt(0)
    val x4396_sum = x4394 + x4395
    val x4397_tuple: Struct2 = new Struct2(x4396_sum, FixedPoint(BigDecimal("1024"),FixFormat(true,32,0)), Bool(false,true))
    val x4398 = true
    val x4399 = {
      if (x4398) x4389.enqueue(x4397_tuple)
    }
  } 
}
/** END UnitPipe x4400_inr_UnitPipe **/
