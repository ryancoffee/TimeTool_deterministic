import emul._
import emul.implicits._

/** BEGIN UnitPipe x4814_inr_UnitPipe **/
object x4814_inr_UnitPipe_kernel {
  def run(
  ): Unit = {
    val x4806_rd_x4798 = x4798_reg.value
    val x4807 = x4806_rd_x4798 << FixedPoint(BigDecimal("3"),FixFormat(true,16,0))
    val x4808 = x4807.toFixedPoint(FixFormat(true,64,0))
    val x4809 = FixedPoint.fromInt(0)
    val x4810_sum = x4808 + x4809
    val x4811_tuple: Struct2 = new Struct2(x4810_sum, FixedPoint(BigDecimal("1024"),FixFormat(true,32,0)), Bool(false,true))
    val x4812 = true
    val x4813 = {
      if (x4812) x4803.enqueue(x4811_tuple)
    }
  } 
}
/** END UnitPipe x4814_inr_UnitPipe **/
