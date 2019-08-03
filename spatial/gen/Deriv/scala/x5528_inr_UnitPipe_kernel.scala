import emul._
import emul.implicits._

/** BEGIN UnitPipe x5528_inr_UnitPipe **/
object x5528_inr_UnitPipe_kernel {
  def run(
  ): Unit = {
    val x5520_rd_x5512 = x5512_reg.value
    val x5521 = x5520_rd_x5512 << FixedPoint(BigDecimal("3"),FixFormat(true,16,0))
    val x5522 = x5521.toFixedPoint(FixFormat(true,64,0))
    val x5523 = FixedPoint.fromInt(0)
    val x5524_sum = x5522 + x5523
    val x5525_tuple: Struct2 = new Struct2(x5524_sum, FixedPoint(BigDecimal("1024"),FixFormat(true,32,0)), Bool(false,true))
    val x5526 = true
    val x5527 = {
      if (x5526) x5517.enqueue(x5525_tuple)
    }
  } 
}
/** END UnitPipe x5528_inr_UnitPipe **/
