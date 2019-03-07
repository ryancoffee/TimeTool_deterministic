import emul._
import emul.implicits._

/** BEGIN Switch x5310_outr_Switch **/
object x5310_outr_Switch_kernel {
  def run(
    x5892_rd_x5256: Bool,
    x5891_rd_x5255: Bool,
    b501: FixedPoint
  ): Unit = {
    if (x5891_rd_x5255) {
      x5274_reg.initMem(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)))
      val x5278_inr_UnitPipe = x5278_inr_UnitPipe_kernel.run(b501)
      val x5306_outr_UnitPipe = x5306_outr_UnitPipe_kernel.run()
      ()
    }
    else if (x5892_rd_x5256) {
      ()
    }
    else ()
  } 
}
/** END Switch x5310_outr_Switch **/
