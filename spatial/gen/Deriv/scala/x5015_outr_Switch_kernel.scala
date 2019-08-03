import emul._
import emul.implicits._

/** BEGIN Switch x5015_outr_Switch **/
object x5015_outr_Switch_kernel {
  def run(
    b499: FixedPoint,
    x5882_rd_x4959: Bool,
    x5881_rd_x4958: Bool
  ): Unit = {
    if (x5881_rd_x4958) {
      x4979_reg.initMem(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)))
      val x4983_inr_UnitPipe = x4983_inr_UnitPipe_kernel.run(b499)
      val x5011_outr_UnitPipe = x5011_outr_UnitPipe_kernel.run()
      ()
    }
    else if (x5882_rd_x4959) {
      ()
    }
    else ()
  } 
}
/** END Switch x5015_outr_Switch **/
