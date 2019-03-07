import emul._
import emul.implicits._

/** BEGIN UnitPipe x868_outr_UnitPipe **/
object x868_outr_UnitPipe_kernel {
  def run(
  ): Unit = {
    x842_reg.initMem(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)))
    x843_reg.initMem(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)))
    x844_reg.initMem(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)))
    val x853_inr_UnitPipe = x853_inr_UnitPipe_kernel.run()
    val x5817_rd_x844 = x844_reg.value
    val x855_ctr = Counter(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)), x5817_rd_x844, FixedPoint(BigDecimal("1"),FixFormat(true,32,0)), FixedPoint(BigDecimal("1"),FixFormat(true,32,0)))
    val x856_ctrchain = Array[Counterlike](x855_ctr)
    val x867_inr_Foreach = x867_inr_Foreach_kernel.run(x856_ctrchain)
  } 
}
/** END UnitPipe x868_outr_UnitPipe **/
