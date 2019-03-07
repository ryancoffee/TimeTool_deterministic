import emul._
import emul.implicits._

/** BEGIN Switch x3944_outr_Switch **/
object x3944_outr_Switch_kernel {
  def run(
    x5846_rd_x3888: Bool,
    b490: FixedPoint,
    x5845_rd_x3887: Bool
  ): Unit = {
    if (x5845_rd_x3887) {
      x3908_reg.initMem(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)))
      val x3912_inr_UnitPipe = x3912_inr_UnitPipe_kernel.run(b490)
      val x3940_outr_UnitPipe = x3940_outr_UnitPipe_kernel.run()
      ()
    }
    else if (x5846_rd_x3888) {
      ()
    }
    else ()
  } 
}
/** END Switch x3944_outr_Switch **/
