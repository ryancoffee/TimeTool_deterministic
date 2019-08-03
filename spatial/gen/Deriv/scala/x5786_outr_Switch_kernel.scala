import emul._
import emul.implicits._

/** BEGIN Switch x5786_outr_Switch **/
object x5786_outr_Switch_kernel {
  def run(
    x5908_rd_x5732: Bool,
    b505: FixedPoint,
    x5907_rd_x5731: Bool
  ): Unit = {
    if (x5907_rd_x5731) {
      x5750_reg.initMem(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)))
      val x5754_inr_UnitPipe = x5754_inr_UnitPipe_kernel.run(b505)
      val x5782_outr_UnitPipe = x5782_outr_UnitPipe_kernel.run()
      ()
    }
    else if (x5908_rd_x5732) {
      ()
    }
    else ()
  } 
}
/** END Switch x5786_outr_Switch **/
