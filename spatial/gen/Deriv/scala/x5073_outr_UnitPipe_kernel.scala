import emul._
import emul.implicits._

/** BEGIN UnitPipe x5073_outr_UnitPipe **/
object x5073_outr_UnitPipe_kernel {
  def run(
    b499: FixedPoint,
    b515: Bool
  ): Unit = if (b515){
    x4956_reg.initMem(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)))
    x4957_reg.initMem(Bool(false,true))
    x4958_reg.initMem(Bool(false,true))
    x4959_reg.initMem(Bool(false,true))
    val x4976_inr_UnitPipe = x4976_inr_UnitPipe_kernel.run(b499)
    val x5881_rd_x4958 = x4958_reg.value
    val x5882_rd_x4959 = x4959_reg.value
    val x5015_outr_Switch = x5015_outr_Switch_kernel.run(b499, x5882_rd_x4959, x5881_rd_x4958)
    x5017_reg.initMem(Bool(false,true))
    x5018_reg.initMem(Bool(false,true))
    val x5033_inr_UnitPipe = x5033_inr_UnitPipe_kernel.run(b499)
    val x5883_rd_x5017 = x5017_reg.value
    val x5884_rd_x5018 = x5018_reg.value
    val x5072_outr_Switch = x5072_outr_Switch_kernel.run(x5883_rd_x5017, b499, x5884_rd_x5018)
  } else null.asInstanceOf[Unit]
}
/** END UnitPipe x5073_outr_UnitPipe **/
