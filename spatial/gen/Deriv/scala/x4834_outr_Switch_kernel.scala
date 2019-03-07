import emul._
import emul.implicits._

/** BEGIN Switch x4834_outr_Switch **/
object x4834_outr_Switch_kernel {
  def run(
    x5875_rd_x4779: Bool,
    x5876_rd_x4780: Bool,
    b497: FixedPoint
  ): Unit = {
    if (x5875_rd_x4779) {
      x4798_reg.initMem(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)))
      val x4802_inr_UnitPipe = x4802_inr_UnitPipe_kernel.run(b497)
      val x4830_outr_UnitPipe = x4830_outr_UnitPipe_kernel.run()
      ()
    }
    else if (x5876_rd_x4780) {
      ()
    }
    else ()
  } 
}
/** END Switch x4834_outr_Switch **/
