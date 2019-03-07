import emul._
import emul.implicits._

/** BEGIN Switch x4301_outr_Switch **/
object x4301_outr_Switch_kernel {
  def run(
    x5857_rd_x4244: Bool,
    b493: FixedPoint,
    x5858_rd_x4245: Bool
  ): Unit = {
    if (x5857_rd_x4244) {
      x4265_reg.initMem(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)))
      val x4269_inr_UnitPipe = x4269_inr_UnitPipe_kernel.run(b493)
      val x4297_outr_UnitPipe = x4297_outr_UnitPipe_kernel.run()
      ()
    }
    else if (x5858_rd_x4245) {
      ()
    }
    else ()
  } 
}
/** END Switch x4301_outr_Switch **/
