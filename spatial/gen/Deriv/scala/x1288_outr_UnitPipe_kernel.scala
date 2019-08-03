import emul._
import emul.implicits._

/** BEGIN UnitPipe x1288_outr_UnitPipe **/
object x1288_outr_UnitPipe_kernel {
  def run(
  ): Unit = {
    x1262_reg.initMem(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)))
    x1263_reg.initMem(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)))
    x1264_reg.initMem(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)))
    val x1273_inr_UnitPipe = x1273_inr_UnitPipe_kernel.run()
    val x5824_rd_x1264 = x1264_reg.value
    val x1275_ctr = Counter(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)), x5824_rd_x1264, FixedPoint(BigDecimal("1"),FixFormat(true,32,0)), FixedPoint(BigDecimal("1"),FixFormat(true,32,0)))
    val x1276_ctrchain = Array[Counterlike](x1275_ctr)
    val x1287_inr_Foreach = x1287_inr_Foreach_kernel.run(x1276_ctrchain)
  } 
}
/** END UnitPipe x1288_outr_UnitPipe **/
