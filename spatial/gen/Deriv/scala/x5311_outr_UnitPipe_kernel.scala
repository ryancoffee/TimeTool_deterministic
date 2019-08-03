import emul._
import emul.implicits._

/** BEGIN UnitPipe x5311_outr_UnitPipe **/
object x5311_outr_UnitPipe_kernel {
  def run(
    b517: Bool,
    b501: FixedPoint
  ): Unit = if (b517){
    x5194_reg.initMem(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)))
    x5195_reg.initMem(Bool(false,true))
    x5196_reg.initMem(Bool(false,true))
    x5197_reg.initMem(Bool(false,true))
    val x5214_inr_UnitPipe = x5214_inr_UnitPipe_kernel.run(b501)
    val x5889_rd_x5196 = x5196_reg.value
    val x5890_rd_x5197 = x5197_reg.value
    val x5253_outr_Switch = x5253_outr_Switch_kernel.run(x5889_rd_x5196, x5890_rd_x5197, b501)
    x5255_reg.initMem(Bool(false,true))
    x5256_reg.initMem(Bool(false,true))
    val x5271_inr_UnitPipe = x5271_inr_UnitPipe_kernel.run(b501)
    val x5891_rd_x5255 = x5255_reg.value
    val x5892_rd_x5256 = x5256_reg.value
    val x5310_outr_Switch = x5310_outr_Switch_kernel.run(x5892_rd_x5256, x5891_rd_x5255, b501)
  } else null.asInstanceOf[Unit]
}
/** END UnitPipe x5311_outr_UnitPipe **/
