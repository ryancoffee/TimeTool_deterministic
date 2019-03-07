import emul._
import emul.implicits._

/** BEGIN UnitPipe x5114_inr_UnitPipe **/
object x5114_inr_UnitPipe_kernel {
  def run(
  ): Unit = {
    val x5106_rd_x5098 = x5098_reg.value
    val x5107 = x5106_rd_x5098 << FixedPoint(BigDecimal("3"),FixFormat(true,16,0))
    val x5108 = x5107.toFixedPoint(FixFormat(true,64,0))
    val x5109 = FixedPoint.fromInt(0)
    val x5110_sum = x5108 + x5109
    val x5111_tuple: Struct2 = new Struct2(x5110_sum, FixedPoint(BigDecimal("1024"),FixFormat(true,32,0)), Bool(false,true))
    val x5112 = true
    val x5113 = {
      if (x5112) x5103.enqueue(x5111_tuple)
    }
  } 
}
/** END UnitPipe x5114_inr_UnitPipe **/
