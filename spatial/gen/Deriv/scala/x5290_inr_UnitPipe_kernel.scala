import emul._
import emul.implicits._

/** BEGIN UnitPipe x5290_inr_UnitPipe **/
object x5290_inr_UnitPipe_kernel {
  def run(
  ): Unit = {
    val x5282_rd_x5274 = x5274_reg.value
    val x5283 = x5282_rd_x5274 << FixedPoint(BigDecimal("3"),FixFormat(true,16,0))
    val x5284 = x5283.toFixedPoint(FixFormat(true,64,0))
    val x5285 = FixedPoint.fromInt(0)
    val x5286_sum = x5284 + x5285
    val x5287_tuple: Struct2 = new Struct2(x5286_sum, FixedPoint(BigDecimal("1024"),FixFormat(true,32,0)), Bool(false,true))
    val x5288 = true
    val x5289 = {
      if (x5288) x5279.enqueue(x5287_tuple)
    }
  } 
}
/** END UnitPipe x5290_inr_UnitPipe **/
