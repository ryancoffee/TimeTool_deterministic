import emul._
import emul.implicits._

/** BEGIN UnitPipe x3981_inr_UnitPipe **/
object x3981_inr_UnitPipe_kernel {
  def run(
  ): Unit = {
    val x3973_rd_x3965 = x3965_reg.value
    val x3974 = x3973_rd_x3965 << FixedPoint(BigDecimal("3"),FixFormat(true,16,0))
    val x3975 = x3974.toFixedPoint(FixFormat(true,64,0))
    val x3976 = FixedPoint.fromInt(0)
    val x3977_sum = x3975 + x3976
    val x3978_tuple: Struct2 = new Struct2(x3977_sum, FixedPoint(BigDecimal("1024"),FixFormat(true,32,0)), Bool(false,true))
    val x3979 = true
    val x3980 = {
      if (x3979) x3970.enqueue(x3978_tuple)
    }
  } 
}
/** END UnitPipe x3981_inr_UnitPipe **/
