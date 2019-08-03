import emul._
import emul.implicits._

/** BEGIN UnitPipe x988_outr_UnitPipe **/
object x988_outr_UnitPipe_kernel {
  def run(
  ): Unit = {
    x962_reg.initMem(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)))
    x963_reg.initMem(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)))
    x964_reg.initMem(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)))
    val x973_inr_UnitPipe = x973_inr_UnitPipe_kernel.run()
    val x5819_rd_x964 = x964_reg.value
    val x975_ctr = Counter(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)), x5819_rd_x964, FixedPoint(BigDecimal("1"),FixFormat(true,32,0)), FixedPoint(BigDecimal("1"),FixFormat(true,32,0)))
    val x976_ctrchain = Array[Counterlike](x975_ctr)
    val x987_inr_Foreach = x987_inr_Foreach_kernel.run(x976_ctrchain)
  } 
}
/** END UnitPipe x988_outr_UnitPipe **/
