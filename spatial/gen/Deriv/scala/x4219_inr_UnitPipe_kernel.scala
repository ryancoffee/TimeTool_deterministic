import emul._
import emul.implicits._

/** BEGIN UnitPipe x4219_inr_UnitPipe **/
object x4219_inr_UnitPipe_kernel {
  def run(
  ): Unit = {
    val x4211_rd_x4203 = x4203_reg.value
    val x4212 = x4211_rd_x4203 << FixedPoint(BigDecimal("3"),FixFormat(true,16,0))
    val x4213 = x4212.toFixedPoint(FixFormat(true,64,0))
    val x4214 = FixedPoint.fromInt(0)
    val x4215_sum = x4213 + x4214
    val x4216_tuple: Struct2 = new Struct2(x4215_sum, FixedPoint(BigDecimal("1024"),FixFormat(true,32,0)), Bool(false,true))
    val x4217 = true
    val x4218 = {
      if (x4217) x4208.enqueue(x4216_tuple)
    }
  } 
}
/** END UnitPipe x4219_inr_UnitPipe **/
