import emul._
import emul.implicits._

/** BEGIN UnitPipe x5352_inr_UnitPipe **/
object x5352_inr_UnitPipe_kernel {
  def run(
  ): Unit = {
    val x5344_rd_x5336 = x5336_reg.value
    val x5345 = x5344_rd_x5336 << FixedPoint(BigDecimal("3"),FixFormat(true,16,0))
    val x5346 = x5345.toFixedPoint(FixFormat(true,64,0))
    val x5347 = FixedPoint.fromInt(0)
    val x5348_sum = x5346 + x5347
    val x5349_tuple: Struct2 = new Struct2(x5348_sum, FixedPoint(BigDecimal("1024"),FixFormat(true,32,0)), Bool(false,true))
    val x5350 = true
    val x5351 = {
      if (x5350) x5341.enqueue(x5349_tuple)
    }
  } 
}
/** END UnitPipe x5352_inr_UnitPipe **/
