import emul._
import emul.implicits._

/** BEGIN UnitPipe x5233_inr_UnitPipe **/
object x5233_inr_UnitPipe_kernel {
  def run(
  ): Unit = {
    val x5225_rd_x5217 = x5217_reg.value
    val x5226 = x5225_rd_x5217 << FixedPoint(BigDecimal("3"),FixFormat(true,16,0))
    val x5227 = x5226.toFixedPoint(FixFormat(true,64,0))
    val x5228 = FixedPoint.fromInt(0)
    val x5229_sum = x5227 + x5228
    val x5230_tuple: Struct2 = new Struct2(x5229_sum, FixedPoint(BigDecimal("1024"),FixFormat(true,32,0)), Bool(false,true))
    val x5231 = true
    val x5232 = {
      if (x5231) x5222.enqueue(x5230_tuple)
    }
  } 
}
/** END UnitPipe x5233_inr_UnitPipe **/
