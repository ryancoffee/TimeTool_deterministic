import emul._
import emul.implicits._

/** BEGIN UnitPipe x5647_inr_UnitPipe **/
object x5647_inr_UnitPipe_kernel {
  def run(
  ): Unit = {
    val x5639_rd_x5631 = x5631_reg.value
    val x5640 = x5639_rd_x5631 << FixedPoint(BigDecimal("3"),FixFormat(true,16,0))
    val x5641 = x5640.toFixedPoint(FixFormat(true,64,0))
    val x5642 = FixedPoint.fromInt(0)
    val x5643_sum = x5641 + x5642
    val x5644_tuple: Struct2 = new Struct2(x5643_sum, FixedPoint(BigDecimal("1024"),FixFormat(true,32,0)), Bool(false,true))
    val x5645 = true
    val x5646 = {
      if (x5645) x5636.enqueue(x5644_tuple)
    }
  } 
}
/** END UnitPipe x5647_inr_UnitPipe **/
