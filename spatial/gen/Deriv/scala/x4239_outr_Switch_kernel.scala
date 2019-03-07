import emul._
import emul.implicits._

/** BEGIN Switch x4239_outr_Switch **/
object x4239_outr_Switch_kernel {
  def run(
    b492: FixedPoint,
    x5856_rd_x4185: Bool,
    x5855_rd_x4184: Bool
  ): Unit = {
    if (x5855_rd_x4184) {
      x4203_reg.initMem(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)))
      val x4207_inr_UnitPipe = x4207_inr_UnitPipe_kernel.run(b492)
      val x4235_outr_UnitPipe = x4235_outr_UnitPipe_kernel.run()
      ()
    }
    else if (x5856_rd_x4185) {
      ()
    }
    else ()
  } 
}
/** END Switch x4239_outr_Switch **/
