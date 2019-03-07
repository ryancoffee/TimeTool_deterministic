import emul._
import emul.implicits._

/** BEGIN UnitPipe x4043_inr_UnitPipe **/
object x4043_inr_UnitPipe_kernel {
  def run(
  ): Unit = {
    val x4035_rd_x4027 = x4027_reg.value
    val x4036 = x4035_rd_x4027 << FixedPoint(BigDecimal("3"),FixFormat(true,16,0))
    val x4037 = x4036.toFixedPoint(FixFormat(true,64,0))
    val x4038 = FixedPoint.fromInt(0)
    val x4039_sum = x4037 + x4038
    val x4040_tuple: Struct2 = new Struct2(x4039_sum, FixedPoint(BigDecimal("1024"),FixFormat(true,32,0)), Bool(false,true))
    val x4041 = true
    val x4042 = {
      if (x4041) x4032.enqueue(x4040_tuple)
    }
  } 
}
/** END UnitPipe x4043_inr_UnitPipe **/
