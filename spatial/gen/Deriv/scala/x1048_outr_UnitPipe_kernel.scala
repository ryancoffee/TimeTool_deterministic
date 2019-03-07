import emul._
import emul.implicits._

/** BEGIN UnitPipe x1048_outr_UnitPipe **/
object x1048_outr_UnitPipe_kernel {
  def run(
  ): Unit = {
    x1022_reg.initMem(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)))
    x1023_reg.initMem(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)))
    x1024_reg.initMem(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)))
    val x1033_inr_UnitPipe = x1033_inr_UnitPipe_kernel.run()
    val x5820_rd_x1024 = x1024_reg.value
    val x1035_ctr = Counter(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)), x5820_rd_x1024, FixedPoint(BigDecimal("1"),FixFormat(true,32,0)), FixedPoint(BigDecimal("1"),FixFormat(true,32,0)))
    val x1036_ctrchain = Array[Counterlike](x1035_ctr)
    val x1047_inr_Foreach = x1047_inr_Foreach_kernel.run(x1036_ctrchain)
  } 
}
/** END UnitPipe x1048_outr_UnitPipe **/
