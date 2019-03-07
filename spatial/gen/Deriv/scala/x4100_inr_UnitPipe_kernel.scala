import emul._
import emul.implicits._

/** BEGIN UnitPipe x4100_inr_UnitPipe **/
object x4100_inr_UnitPipe_kernel {
  def run(
  ): Unit = {
    val x4092_rd_x4084 = x4084_reg.value
    val x4093 = x4092_rd_x4084 << FixedPoint(BigDecimal("3"),FixFormat(true,16,0))
    val x4094 = x4093.toFixedPoint(FixFormat(true,64,0))
    val x4095 = FixedPoint.fromInt(0)
    val x4096_sum = x4094 + x4095
    val x4097_tuple: Struct2 = new Struct2(x4096_sum, FixedPoint(BigDecimal("1024"),FixFormat(true,32,0)), Bool(false,true))
    val x4098 = true
    val x4099 = {
      if (x4098) x4089.enqueue(x4097_tuple)
    }
  } 
}
/** END UnitPipe x4100_inr_UnitPipe **/
