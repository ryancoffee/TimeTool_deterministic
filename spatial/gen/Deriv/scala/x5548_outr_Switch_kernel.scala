import emul._
import emul.implicits._

/** BEGIN Switch x5548_outr_Switch **/
object x5548_outr_Switch_kernel {
  def run(
    x5900_rd_x5494: Bool,
    b503: FixedPoint,
    x5899_rd_x5493: Bool
  ): Unit = {
    if (x5899_rd_x5493) {
      x5512_reg.initMem(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)))
      val x5516_inr_UnitPipe = x5516_inr_UnitPipe_kernel.run(b503)
      val x5544_outr_UnitPipe = x5544_outr_UnitPipe_kernel.run()
      ()
    }
    else if (x5900_rd_x5494) {
      ()
    }
    else ()
  } 
}
/** END Switch x5548_outr_Switch **/
