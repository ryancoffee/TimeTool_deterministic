import emul._
import emul.implicits._

/** BEGIN Switch x5372_outr_Switch **/
object x5372_outr_Switch_kernel {
  def run(
    x5893_rd_x5315: Bool,
    x5894_rd_x5316: Bool,
    b502: FixedPoint
  ): Unit = {
    if (x5893_rd_x5315) {
      x5336_reg.initMem(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)))
      val x5340_inr_UnitPipe = x5340_inr_UnitPipe_kernel.run(b502)
      val x5368_outr_UnitPipe = x5368_outr_UnitPipe_kernel.run()
      ()
    }
    else if (x5894_rd_x5316) {
      ()
    }
    else ()
  } 
}
/** END Switch x5372_outr_Switch **/
