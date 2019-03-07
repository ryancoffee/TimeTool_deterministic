import emul._
import emul.implicits._

/** BEGIN UnitPipe x1528_outr_UnitPipe **/
object x1528_outr_UnitPipe_kernel {
  def run(
  ): Unit = {
    x1502_reg.initMem(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)))
    x1503_reg.initMem(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)))
    x1504_reg.initMem(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)))
    val x1513_inr_UnitPipe = x1513_inr_UnitPipe_kernel.run()
    val x5828_rd_x1504 = x1504_reg.value
    val x1515_ctr = Counter(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)), x5828_rd_x1504, FixedPoint(BigDecimal("1"),FixFormat(true,32,0)), FixedPoint(BigDecimal("1"),FixFormat(true,32,0)))
    val x1516_ctrchain = Array[Counterlike](x1515_ctr)
    val x1527_inr_Foreach = x1527_inr_Foreach_kernel.run(x1516_ctrchain)
  } 
}
/** END UnitPipe x1528_outr_UnitPipe **/
