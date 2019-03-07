import emul._
import emul.implicits._

/** BEGIN UnitPipe x928_outr_UnitPipe **/
object x928_outr_UnitPipe_kernel {
  def run(
  ): Unit = {
    x902_reg.initMem(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)))
    x903_reg.initMem(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)))
    x904_reg.initMem(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)))
    val x913_inr_UnitPipe = x913_inr_UnitPipe_kernel.run()
    val x5818_rd_x904 = x904_reg.value
    val x915_ctr = Counter(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)), x5818_rd_x904, FixedPoint(BigDecimal("1"),FixFormat(true,32,0)), FixedPoint(BigDecimal("1"),FixFormat(true,32,0)))
    val x916_ctrchain = Array[Counterlike](x915_ctr)
    val x927_inr_Foreach = x927_inr_Foreach_kernel.run(x916_ctrchain)
  } 
}
/** END UnitPipe x928_outr_UnitPipe **/
