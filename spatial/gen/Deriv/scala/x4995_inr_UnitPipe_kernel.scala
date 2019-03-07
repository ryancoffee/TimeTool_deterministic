import emul._
import emul.implicits._

/** BEGIN UnitPipe x4995_inr_UnitPipe **/
object x4995_inr_UnitPipe_kernel {
  def run(
  ): Unit = {
    val x4987_rd_x4979 = x4979_reg.value
    val x4988 = x4987_rd_x4979 << FixedPoint(BigDecimal("3"),FixFormat(true,16,0))
    val x4989 = x4988.toFixedPoint(FixFormat(true,64,0))
    val x4990 = FixedPoint.fromInt(0)
    val x4991_sum = x4989 + x4990
    val x4992_tuple: Struct2 = new Struct2(x4991_sum, FixedPoint(BigDecimal("1024"),FixFormat(true,32,0)), Bool(false,true))
    val x4993 = true
    val x4994 = {
      if (x4993) x4984.enqueue(x4992_tuple)
    }
  } 
}
/** END UnitPipe x4995_inr_UnitPipe **/
