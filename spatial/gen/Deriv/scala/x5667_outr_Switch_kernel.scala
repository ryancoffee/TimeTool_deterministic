import emul._
import emul.implicits._

/** BEGIN Switch x5667_outr_Switch **/
object x5667_outr_Switch_kernel {
  def run(
    x5903_rd_x5612: Bool,
    b504: FixedPoint,
    x5904_rd_x5613: Bool
  ): Unit = {
    if (x5903_rd_x5612) {
      x5631_reg.initMem(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)))
      val x5635_inr_UnitPipe = x5635_inr_UnitPipe_kernel.run(b504)
      val x5663_outr_UnitPipe = x5663_outr_UnitPipe_kernel.run()
      ()
    }
    else if (x5904_rd_x5613) {
      ()
    }
    else ()
  } 
}
/** END Switch x5667_outr_Switch **/
