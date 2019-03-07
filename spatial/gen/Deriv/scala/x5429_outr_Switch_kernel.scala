import emul._
import emul.implicits._

/** BEGIN Switch x5429_outr_Switch **/
object x5429_outr_Switch_kernel {
  def run(
    x5896_rd_x5375: Bool,
    b502: FixedPoint,
    x5895_rd_x5374: Bool
  ): Unit = {
    if (x5895_rd_x5374) {
      x5393_reg.initMem(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)))
      val x5397_inr_UnitPipe = x5397_inr_UnitPipe_kernel.run(b502)
      val x5425_outr_UnitPipe = x5425_outr_UnitPipe_kernel.run()
      ()
    }
    else if (x5896_rd_x5375) {
      ()
    }
    else ()
  } 
}
/** END Switch x5429_outr_Switch **/
