import emul._
import emul.implicits._

/** BEGIN UnitPipe x5709_inr_UnitPipe **/
object x5709_inr_UnitPipe_kernel {
  def run(
  ): Unit = {
    val x5701_rd_x5693 = x5693_reg.value
    val x5702 = x5701_rd_x5693 << FixedPoint(BigDecimal("3"),FixFormat(true,16,0))
    val x5703 = x5702.toFixedPoint(FixFormat(true,64,0))
    val x5704 = FixedPoint.fromInt(0)
    val x5705_sum = x5703 + x5704
    val x5706_tuple: Struct2 = new Struct2(x5705_sum, FixedPoint(BigDecimal("1024"),FixFormat(true,32,0)), Bool(false,true))
    val x5707 = true
    val x5708 = {
      if (x5707) x5698.enqueue(x5706_tuple)
    }
  } 
}
/** END UnitPipe x5709_inr_UnitPipe **/
