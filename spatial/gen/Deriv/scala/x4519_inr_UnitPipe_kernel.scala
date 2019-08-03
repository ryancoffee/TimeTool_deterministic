import emul._
import emul.implicits._

/** BEGIN UnitPipe x4519_inr_UnitPipe **/
object x4519_inr_UnitPipe_kernel {
  def run(
  ): Unit = {
    val x4511_rd_x4503 = x4503_reg.value
    val x4512 = x4511_rd_x4503 << FixedPoint(BigDecimal("3"),FixFormat(true,16,0))
    val x4513 = x4512.toFixedPoint(FixFormat(true,64,0))
    val x4514 = FixedPoint.fromInt(0)
    val x4515_sum = x4513 + x4514
    val x4516_tuple: Struct2 = new Struct2(x4515_sum, FixedPoint(BigDecimal("1024"),FixFormat(true,32,0)), Bool(false,true))
    val x4517 = true
    val x4518 = {
      if (x4517) x4508.enqueue(x4516_tuple)
    }
  } 
}
/** END UnitPipe x4519_inr_UnitPipe **/
