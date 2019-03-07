import emul._
import emul.implicits._

/** BEGIN UnitPipe x5171_inr_UnitPipe **/
object x5171_inr_UnitPipe_kernel {
  def run(
  ): Unit = {
    val x5163_rd_x5155 = x5155_reg.value
    val x5164 = x5163_rd_x5155 << FixedPoint(BigDecimal("3"),FixFormat(true,16,0))
    val x5165 = x5164.toFixedPoint(FixFormat(true,64,0))
    val x5166 = FixedPoint.fromInt(0)
    val x5167_sum = x5165 + x5166
    val x5168_tuple: Struct2 = new Struct2(x5167_sum, FixedPoint(BigDecimal("1024"),FixFormat(true,32,0)), Bool(false,true))
    val x5169 = true
    val x5170 = {
      if (x5169) x5160.enqueue(x5168_tuple)
    }
  } 
}
/** END UnitPipe x5171_inr_UnitPipe **/
