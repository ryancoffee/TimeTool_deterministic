import emul._
import emul.implicits._

/** BEGIN UnitPipe x1408_outr_UnitPipe **/
object x1408_outr_UnitPipe_kernel {
  def run(
  ): Unit = {
    x1382_reg.initMem(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)))
    x1383_reg.initMem(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)))
    x1384_reg.initMem(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)))
    val x1393_inr_UnitPipe = x1393_inr_UnitPipe_kernel.run()
    val x5826_rd_x1384 = x1384_reg.value
    val x1395_ctr = Counter(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)), x5826_rd_x1384, FixedPoint(BigDecimal("1"),FixFormat(true,32,0)), FixedPoint(BigDecimal("1"),FixFormat(true,32,0)))
    val x1396_ctrchain = Array[Counterlike](x1395_ctr)
    val x1407_inr_Foreach = x1407_inr_Foreach_kernel.run(x1396_ctrchain)
  } 
}
/** END UnitPipe x1408_outr_UnitPipe **/
