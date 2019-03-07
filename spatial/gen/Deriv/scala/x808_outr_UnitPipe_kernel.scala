import emul._
import emul.implicits._

/** BEGIN UnitPipe x808_outr_UnitPipe **/
object x808_outr_UnitPipe_kernel {
  def run(
  ): Unit = {
    x782_reg.initMem(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)))
    x783_reg.initMem(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)))
    x784_reg.initMem(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)))
    val x793_inr_UnitPipe = x793_inr_UnitPipe_kernel.run()
    val x5816_rd_x784 = x784_reg.value
    val x795_ctr = Counter(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)), x5816_rd_x784, FixedPoint(BigDecimal("1"),FixFormat(true,32,0)), FixedPoint(BigDecimal("1"),FixFormat(true,32,0)))
    val x796_ctrchain = Array[Counterlike](x795_ctr)
    val x807_inr_Foreach = x807_inr_Foreach_kernel.run(x796_ctrchain)
  } 
}
/** END UnitPipe x808_outr_UnitPipe **/
