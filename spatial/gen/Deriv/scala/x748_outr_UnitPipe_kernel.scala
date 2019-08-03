import emul._
import emul.implicits._

/** BEGIN UnitPipe x748_outr_UnitPipe **/
object x748_outr_UnitPipe_kernel {
  def run(
  ): Unit = {
    x722_reg.initMem(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)))
    x723_reg.initMem(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)))
    x724_reg.initMem(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)))
    val x733_inr_UnitPipe = x733_inr_UnitPipe_kernel.run()
    val x5815_rd_x724 = x724_reg.value
    val x735_ctr = Counter(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)), x5815_rd_x724, FixedPoint(BigDecimal("1"),FixFormat(true,32,0)), FixedPoint(BigDecimal("1"),FixFormat(true,32,0)))
    val x736_ctrchain = Array[Counterlike](x735_ctr)
    val x747_inr_Foreach = x747_inr_Foreach_kernel.run(x736_ctrchain)
  } 
}
/** END UnitPipe x748_outr_UnitPipe **/
