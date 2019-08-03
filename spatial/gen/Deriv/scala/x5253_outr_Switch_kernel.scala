import emul._
import emul.implicits._

/** BEGIN Switch x5253_outr_Switch **/
object x5253_outr_Switch_kernel {
  def run(
    x5889_rd_x5196: Bool,
    x5890_rd_x5197: Bool,
    b501: FixedPoint
  ): Unit = {
    if (x5889_rd_x5196) {
      x5217_reg.initMem(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)))
      val x5221_inr_UnitPipe = x5221_inr_UnitPipe_kernel.run(b501)
      val x5249_outr_UnitPipe = x5249_outr_UnitPipe_kernel.run()
      ()
    }
    else if (x5890_rd_x5197) {
      ()
    }
    else ()
  } 
}
/** END Switch x5253_outr_Switch **/
