import emul._
import emul.implicits._

/** BEGIN UnitPipe x4695_inr_UnitPipe **/
object x4695_inr_UnitPipe_kernel {
  def run(
  ): Unit = {
    val x4687_rd_x4679 = x4679_reg.value
    val x4688 = x4687_rd_x4679 << FixedPoint(BigDecimal("3"),FixFormat(true,16,0))
    val x4689 = x4688.toFixedPoint(FixFormat(true,64,0))
    val x4690 = FixedPoint.fromInt(0)
    val x4691_sum = x4689 + x4690
    val x4692_tuple: Struct2 = new Struct2(x4691_sum, FixedPoint(BigDecimal("1024"),FixFormat(true,32,0)), Bool(false,true))
    val x4693 = true
    val x4694 = {
      if (x4693) x4684.enqueue(x4692_tuple)
    }
  } 
}
/** END UnitPipe x4695_inr_UnitPipe **/
