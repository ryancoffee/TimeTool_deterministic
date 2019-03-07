import emul._
import emul.implicits._

/** BEGIN Switch x4001_outr_Switch **/
object x4001_outr_Switch_kernel {
  def run(
    x5847_rd_x3946: Bool,
    x5848_rd_x3947: Bool,
    b490: FixedPoint
  ): Unit = {
    if (x5847_rd_x3946) {
      x3965_reg.initMem(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)))
      val x3969_inr_UnitPipe = x3969_inr_UnitPipe_kernel.run(b490)
      val x3997_outr_UnitPipe = x3997_outr_UnitPipe_kernel.run()
      ()
    }
    else if (x5848_rd_x3947) {
      ()
    }
    else ()
  } 
}
/** END Switch x4001_outr_Switch **/
