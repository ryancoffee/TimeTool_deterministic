import emul._
import emul.implicits._

/** BEGIN UnitPipe x4933_inr_UnitPipe **/
object x4933_inr_UnitPipe_kernel {
  def run(
  ): Unit = {
    val x4925_rd_x4917 = x4917_reg.value
    val x4926 = x4925_rd_x4917 << FixedPoint(BigDecimal("3"),FixFormat(true,16,0))
    val x4927 = x4926.toFixedPoint(FixFormat(true,64,0))
    val x4928 = FixedPoint.fromInt(0)
    val x4929_sum = x4927 + x4928
    val x4930_tuple: Struct2 = new Struct2(x4929_sum, FixedPoint(BigDecimal("1024"),FixFormat(true,32,0)), Bool(false,true))
    val x4931 = true
    val x4932 = {
      if (x4931) x4922.enqueue(x4930_tuple)
    }
  } 
}
/** END UnitPipe x4933_inr_UnitPipe **/
