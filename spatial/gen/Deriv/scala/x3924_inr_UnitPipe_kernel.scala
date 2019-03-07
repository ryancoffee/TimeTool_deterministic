import emul._
import emul.implicits._

/** BEGIN UnitPipe x3924_inr_UnitPipe **/
object x3924_inr_UnitPipe_kernel {
  def run(
  ): Unit = {
    val x3916_rd_x3908 = x3908_reg.value
    val x3917 = x3916_rd_x3908 << FixedPoint(BigDecimal("3"),FixFormat(true,16,0))
    val x3918 = x3917.toFixedPoint(FixFormat(true,64,0))
    val x3919 = FixedPoint.fromInt(0)
    val x3920_sum = x3918 + x3919
    val x3921_tuple: Struct2 = new Struct2(x3920_sum, FixedPoint(BigDecimal("1024"),FixFormat(true,32,0)), Bool(false,true))
    val x3922 = true
    val x3923 = {
      if (x3922) x3913.enqueue(x3921_tuple)
    }
  } 
}
/** END UnitPipe x3924_inr_UnitPipe **/
