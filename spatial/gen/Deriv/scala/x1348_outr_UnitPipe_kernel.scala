import emul._
import emul.implicits._

/** BEGIN UnitPipe x1348_outr_UnitPipe **/
object x1348_outr_UnitPipe_kernel {
  def run(
  ): Unit = {
    x1322_reg.initMem(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)))
    x1323_reg.initMem(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)))
    x1324_reg.initMem(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)))
    val x1333_inr_UnitPipe = x1333_inr_UnitPipe_kernel.run()
    val x5825_rd_x1324 = x1324_reg.value
    val x1335_ctr = Counter(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)), x5825_rd_x1324, FixedPoint(BigDecimal("1"),FixFormat(true,32,0)), FixedPoint(BigDecimal("1"),FixFormat(true,32,0)))
    val x1336_ctrchain = Array[Counterlike](x1335_ctr)
    val x1347_inr_Foreach = x1347_inr_Foreach_kernel.run(x1336_ctrchain)
  } 
}
/** END UnitPipe x1348_outr_UnitPipe **/
