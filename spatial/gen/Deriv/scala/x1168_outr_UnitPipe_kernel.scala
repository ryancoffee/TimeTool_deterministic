import emul._
import emul.implicits._

/** BEGIN UnitPipe x1168_outr_UnitPipe **/
object x1168_outr_UnitPipe_kernel {
  def run(
  ): Unit = {
    x1142_reg.initMem(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)))
    x1143_reg.initMem(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)))
    x1144_reg.initMem(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)))
    val x1153_inr_UnitPipe = x1153_inr_UnitPipe_kernel.run()
    val x5822_rd_x1144 = x1144_reg.value
    val x1155_ctr = Counter(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)), x5822_rd_x1144, FixedPoint(BigDecimal("1"),FixFormat(true,32,0)), FixedPoint(BigDecimal("1"),FixFormat(true,32,0)))
    val x1156_ctrchain = Array[Counterlike](x1155_ctr)
    val x1167_inr_Foreach = x1167_inr_Foreach_kernel.run(x1156_ctrchain)
  } 
}
/** END UnitPipe x1168_outr_UnitPipe **/
