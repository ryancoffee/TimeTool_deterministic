import emul._
import emul.implicits._

/** BEGIN UnitPipe x5549_outr_UnitPipe **/
object x5549_outr_UnitPipe_kernel {
  def run(
    b519: Bool,
    b503: FixedPoint
  ): Unit = if (b519){
    x5432_reg.initMem(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)))
    x5433_reg.initMem(Bool(false,true))
    x5434_reg.initMem(Bool(false,true))
    x5435_reg.initMem(Bool(false,true))
    val x5452_inr_UnitPipe = x5452_inr_UnitPipe_kernel.run(b503)
    val x5897_rd_x5434 = x5434_reg.value
    val x5898_rd_x5435 = x5435_reg.value
    val x5491_outr_Switch = x5491_outr_Switch_kernel.run(x5898_rd_x5435, x5897_rd_x5434, b503)
    x5493_reg.initMem(Bool(false,true))
    x5494_reg.initMem(Bool(false,true))
    val x5509_inr_UnitPipe = x5509_inr_UnitPipe_kernel.run(b503)
    val x5899_rd_x5493 = x5493_reg.value
    val x5900_rd_x5494 = x5494_reg.value
    val x5548_outr_Switch = x5548_outr_Switch_kernel.run(x5900_rd_x5494, b503, x5899_rd_x5493)
  } else null.asInstanceOf[Unit]
}
/** END UnitPipe x5549_outr_UnitPipe **/
