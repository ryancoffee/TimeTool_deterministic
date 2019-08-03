import emul._
import emul.implicits._

/** BEGIN UnitPipe x5409_inr_UnitPipe **/
object x5409_inr_UnitPipe_kernel {
  def run(
  ): Unit = {
    val x5401_rd_x5393 = x5393_reg.value
    val x5402 = x5401_rd_x5393 << FixedPoint(BigDecimal("3"),FixFormat(true,16,0))
    val x5403 = x5402.toFixedPoint(FixFormat(true,64,0))
    val x5404 = FixedPoint.fromInt(0)
    val x5405_sum = x5403 + x5404
    val x5406_tuple: Struct2 = new Struct2(x5405_sum, FixedPoint(BigDecimal("1024"),FixFormat(true,32,0)), Bool(false,true))
    val x5407 = true
    val x5408 = {
      if (x5407) x5398.enqueue(x5406_tuple)
    }
  } 
}
/** END UnitPipe x5409_inr_UnitPipe **/
