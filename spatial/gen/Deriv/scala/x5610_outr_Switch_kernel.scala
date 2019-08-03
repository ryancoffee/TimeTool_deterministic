import emul._
import emul.implicits._

/** BEGIN Switch x5610_outr_Switch **/
object x5610_outr_Switch_kernel {
  def run(
    b504: FixedPoint,
    x5901_rd_x5553: Bool,
    x5902_rd_x5554: Bool
  ): Unit = {
    if (x5901_rd_x5553) {
      x5574_reg.initMem(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)))
      val x5578_inr_UnitPipe = x5578_inr_UnitPipe_kernel.run(b504)
      val x5606_outr_UnitPipe = x5606_outr_UnitPipe_kernel.run()
      ()
    }
    else if (x5902_rd_x5554) {
      ()
    }
    else ()
  } 
}
/** END Switch x5610_outr_Switch **/
