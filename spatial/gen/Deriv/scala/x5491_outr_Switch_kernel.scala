import emul._
import emul.implicits._

/** BEGIN Switch x5491_outr_Switch **/
object x5491_outr_Switch_kernel {
  def run(
    x5898_rd_x5435: Bool,
    x5897_rd_x5434: Bool,
    b503: FixedPoint
  ): Unit = {
    if (x5897_rd_x5434) {
      x5455_reg.initMem(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)))
      val x5459_inr_UnitPipe = x5459_inr_UnitPipe_kernel.run(b503)
      val x5487_outr_UnitPipe = x5487_outr_UnitPipe_kernel.run()
      ()
    }
    else if (x5898_rd_x5435) {
      ()
    }
    else ()
  } 
}
/** END Switch x5491_outr_Switch **/
