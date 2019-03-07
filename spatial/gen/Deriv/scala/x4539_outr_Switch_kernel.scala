import emul._
import emul.implicits._

/** BEGIN Switch x4539_outr_Switch **/
object x4539_outr_Switch_kernel {
  def run(
    x5866_rd_x4483: Bool,
    x5865_rd_x4482: Bool,
    b495: FixedPoint
  ): Unit = {
    if (x5865_rd_x4482) {
      x4503_reg.initMem(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)))
      val x4507_inr_UnitPipe = x4507_inr_UnitPipe_kernel.run(b495)
      val x4535_outr_UnitPipe = x4535_outr_UnitPipe_kernel.run()
      ()
    }
    else if (x5866_rd_x4483) {
      ()
    }
    else ()
  } 
}
/** END Switch x4539_outr_Switch **/
