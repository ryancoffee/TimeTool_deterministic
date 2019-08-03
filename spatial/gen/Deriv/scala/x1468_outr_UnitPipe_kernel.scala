import emul._
import emul.implicits._

/** BEGIN UnitPipe x1468_outr_UnitPipe **/
object x1468_outr_UnitPipe_kernel {
  def run(
  ): Unit = {
    x1442_reg.initMem(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)))
    x1443_reg.initMem(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)))
    x1444_reg.initMem(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)))
    val x1453_inr_UnitPipe = x1453_inr_UnitPipe_kernel.run()
    val x5827_rd_x1444 = x1444_reg.value
    val x1455_ctr = Counter(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)), x5827_rd_x1444, FixedPoint(BigDecimal("1"),FixFormat(true,32,0)), FixedPoint(BigDecimal("1"),FixFormat(true,32,0)))
    val x1456_ctrchain = Array[Counterlike](x1455_ctr)
    val x1467_inr_Foreach = x1467_inr_Foreach_kernel.run(x1456_ctrchain)
  } 
}
/** END UnitPipe x1468_outr_UnitPipe **/
