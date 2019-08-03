import emul._
import emul.implicits._

/** BEGIN UnitPipe x1228_outr_UnitPipe **/
object x1228_outr_UnitPipe_kernel {
  def run(
  ): Unit = {
    x1202_reg.initMem(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)))
    x1203_reg.initMem(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)))
    x1204_reg.initMem(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)))
    val x1213_inr_UnitPipe = x1213_inr_UnitPipe_kernel.run()
    val x5823_rd_x1204 = x1204_reg.value
    val x1215_ctr = Counter(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)), x5823_rd_x1204, FixedPoint(BigDecimal("1"),FixFormat(true,32,0)), FixedPoint(BigDecimal("1"),FixFormat(true,32,0)))
    val x1216_ctrchain = Array[Counterlike](x1215_ctr)
    val x1227_inr_Foreach = x1227_inr_Foreach_kernel.run(x1216_ctrchain)
  } 
}
/** END UnitPipe x1228_outr_UnitPipe **/
