import emul._
import emul.implicits._

/** BEGIN Switch x4358_outr_Switch **/
object x4358_outr_Switch_kernel {
  def run(
    b493: FixedPoint,
    x5859_rd_x4303: Bool,
    x5860_rd_x4304: Bool
  ): Unit = {
    if (x5859_rd_x4303) {
      x4322_reg.initMem(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)))
      val x4326_inr_UnitPipe = x4326_inr_UnitPipe_kernel.run(b493)
      val x4354_outr_UnitPipe = x4354_outr_UnitPipe_kernel.run()
      ()
    }
    else if (x5860_rd_x4304) {
      ()
    }
    else ()
  } 
}
/** END Switch x4358_outr_Switch **/
