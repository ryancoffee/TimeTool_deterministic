import emul._
import emul.implicits._

/** BEGIN Switch x4477_outr_Switch **/
object x4477_outr_Switch_kernel {
  def run(
    b494: FixedPoint,
    x5863_rd_x4422: Bool,
    x5864_rd_x4423: Bool
  ): Unit = {
    if (x5863_rd_x4422) {
      x4441_reg.initMem(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)))
      val x4445_inr_UnitPipe = x4445_inr_UnitPipe_kernel.run(b494)
      val x4473_outr_UnitPipe = x4473_outr_UnitPipe_kernel.run()
      ()
    }
    else if (x5864_rd_x4423) {
      ()
    }
    else ()
  } 
}
/** END Switch x4477_outr_Switch **/
