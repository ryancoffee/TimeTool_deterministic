import emul._
import emul.implicits._

/** BEGIN UnitPipe x628_outr_UnitPipe **/
object x628_outr_UnitPipe_kernel {
  def run(
  ): Unit = {
    x602_reg.initMem(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)))
    x603_reg.initMem(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)))
    x604_reg.initMem(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)))
    val x613_inr_UnitPipe = x613_inr_UnitPipe_kernel.run()
    val x5813_rd_x604 = x604_reg.value
    val x615_ctr = Counter(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)), x5813_rd_x604, FixedPoint(BigDecimal("1"),FixFormat(true,32,0)), FixedPoint(BigDecimal("1"),FixFormat(true,32,0)))
    val x616_ctrchain = Array[Counterlike](x615_ctr)
    val x627_inr_Foreach = x627_inr_Foreach_kernel.run(x616_ctrchain)
  } 
}
/** END UnitPipe x628_outr_UnitPipe **/
