import emul._
import emul.implicits._

/** BEGIN UnitPipe x5192_outr_UnitPipe **/
object x5192_outr_UnitPipe_kernel {
  def run(
    b500: FixedPoint,
    b516: Bool
  ): Unit = if (b516){
    x5075_reg.initMem(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)))
    x5076_reg.initMem(Bool(false,true))
    x5077_reg.initMem(Bool(false,true))
    x5078_reg.initMem(Bool(false,true))
    val x5095_inr_UnitPipe = x5095_inr_UnitPipe_kernel.run(b500)
    val x5885_rd_x5077 = x5077_reg.value
    val x5886_rd_x5078 = x5078_reg.value
    val x5134_outr_Switch = x5134_outr_Switch_kernel.run(b500, x5885_rd_x5077, x5886_rd_x5078)
    x5136_reg.initMem(Bool(false,true))
    x5137_reg.initMem(Bool(false,true))
    val x5152_inr_UnitPipe = x5152_inr_UnitPipe_kernel.run(b500)
    val x5887_rd_x5136 = x5136_reg.value
    val x5888_rd_x5137 = x5137_reg.value
    val x5191_outr_Switch = x5191_outr_Switch_kernel.run(b500, x5888_rd_x5137, x5887_rd_x5136)
  } else null.asInstanceOf[Unit]
}
/** END UnitPipe x5192_outr_UnitPipe **/
