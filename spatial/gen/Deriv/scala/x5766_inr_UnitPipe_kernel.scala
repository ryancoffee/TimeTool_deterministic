import emul._
import emul.implicits._

/** BEGIN UnitPipe x5766_inr_UnitPipe **/
object x5766_inr_UnitPipe_kernel {
  def run(
  ): Unit = {
    val x5758_rd_x5750 = x5750_reg.value
    val x5759 = x5758_rd_x5750 << FixedPoint(BigDecimal("3"),FixFormat(true,16,0))
    val x5760 = x5759.toFixedPoint(FixFormat(true,64,0))
    val x5761 = FixedPoint.fromInt(0)
    val x5762_sum = x5760 + x5761
    val x5763_tuple: Struct2 = new Struct2(x5762_sum, FixedPoint(BigDecimal("1024"),FixFormat(true,32,0)), Bool(false,true))
    val x5764 = true
    val x5765 = {
      if (x5764) x5755.enqueue(x5763_tuple)
    }
  } 
}
/** END UnitPipe x5766_inr_UnitPipe **/
