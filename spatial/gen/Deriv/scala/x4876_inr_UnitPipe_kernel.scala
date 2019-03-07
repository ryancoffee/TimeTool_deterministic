import emul._
import emul.implicits._

/** BEGIN UnitPipe x4876_inr_UnitPipe **/
object x4876_inr_UnitPipe_kernel {
  def run(
  ): Unit = {
    val x4868_rd_x4860 = x4860_reg.value
    val x4869 = x4868_rd_x4860 << FixedPoint(BigDecimal("3"),FixFormat(true,16,0))
    val x4870 = x4869.toFixedPoint(FixFormat(true,64,0))
    val x4871 = FixedPoint.fromInt(0)
    val x4872_sum = x4870 + x4871
    val x4873_tuple: Struct2 = new Struct2(x4872_sum, FixedPoint(BigDecimal("1024"),FixFormat(true,32,0)), Bool(false,true))
    val x4874 = true
    val x4875 = {
      if (x4874) x4865.enqueue(x4873_tuple)
    }
  } 
}
/** END UnitPipe x4876_inr_UnitPipe **/
