import emul._
import emul.implicits._

/** BEGIN UnitPipe x688_outr_UnitPipe **/
object x688_outr_UnitPipe_kernel {
  def run(
  ): Unit = {
    x662_reg.initMem(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)))
    x663_reg.initMem(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)))
    x664_reg.initMem(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)))
    val x673_inr_UnitPipe = x673_inr_UnitPipe_kernel.run()
    val x5814_rd_x664 = x664_reg.value
    val x675_ctr = Counter(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)), x5814_rd_x664, FixedPoint(BigDecimal("1"),FixFormat(true,32,0)), FixedPoint(BigDecimal("1"),FixFormat(true,32,0)))
    val x676_ctrchain = Array[Counterlike](x675_ctr)
    val x687_inr_Foreach = x687_inr_Foreach_kernel.run(x676_ctrchain)
  } 
}
/** END UnitPipe x688_outr_UnitPipe **/
