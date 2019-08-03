import emul._
import emul.implicits._

/** BEGIN UnitPipe x1108_outr_UnitPipe **/
object x1108_outr_UnitPipe_kernel {
  def run(
  ): Unit = {
    x1082_reg.initMem(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)))
    x1083_reg.initMem(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)))
    x1084_reg.initMem(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)))
    val x1093_inr_UnitPipe = x1093_inr_UnitPipe_kernel.run()
    val x5821_rd_x1084 = x1084_reg.value
    val x1095_ctr = Counter(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)), x5821_rd_x1084, FixedPoint(BigDecimal("1"),FixFormat(true,32,0)), FixedPoint(BigDecimal("1"),FixFormat(true,32,0)))
    val x1096_ctrchain = Array[Counterlike](x1095_ctr)
    val x1107_inr_Foreach = x1107_inr_Foreach_kernel.run(x1096_ctrchain)
  } 
}
/** END UnitPipe x1108_outr_UnitPipe **/
