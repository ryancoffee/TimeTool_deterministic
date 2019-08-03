import emul._
import emul.implicits._

/** BEGIN UnitPipe x5471_inr_UnitPipe **/
object x5471_inr_UnitPipe_kernel {
  def run(
  ): Unit = {
    val x5463_rd_x5455 = x5455_reg.value
    val x5464 = x5463_rd_x5455 << FixedPoint(BigDecimal("3"),FixFormat(true,16,0))
    val x5465 = x5464.toFixedPoint(FixFormat(true,64,0))
    val x5466 = FixedPoint.fromInt(0)
    val x5467_sum = x5465 + x5466
    val x5468_tuple: Struct2 = new Struct2(x5467_sum, FixedPoint(BigDecimal("1024"),FixFormat(true,32,0)), Bool(false,true))
    val x5469 = true
    val x5470 = {
      if (x5469) x5460.enqueue(x5468_tuple)
    }
  } 
}
/** END UnitPipe x5471_inr_UnitPipe **/
