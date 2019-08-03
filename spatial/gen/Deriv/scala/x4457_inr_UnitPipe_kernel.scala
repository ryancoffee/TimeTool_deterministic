import emul._
import emul.implicits._

/** BEGIN UnitPipe x4457_inr_UnitPipe **/
object x4457_inr_UnitPipe_kernel {
  def run(
  ): Unit = {
    val x4449_rd_x4441 = x4441_reg.value
    val x4450 = x4449_rd_x4441 << FixedPoint(BigDecimal("3"),FixFormat(true,16,0))
    val x4451 = x4450.toFixedPoint(FixFormat(true,64,0))
    val x4452 = FixedPoint.fromInt(0)
    val x4453_sum = x4451 + x4452
    val x4454_tuple: Struct2 = new Struct2(x4453_sum, FixedPoint(BigDecimal("1024"),FixFormat(true,32,0)), Bool(false,true))
    val x4455 = true
    val x4456 = {
      if (x4455) x4446.enqueue(x4454_tuple)
    }
  } 
}
/** END UnitPipe x4457_inr_UnitPipe **/
