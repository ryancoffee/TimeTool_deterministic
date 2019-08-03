import emul._
import emul.implicits._

/** BEGIN Switch x5072_outr_Switch **/
object x5072_outr_Switch_kernel {
  def run(
    x5883_rd_x5017: Bool,
    b499: FixedPoint,
    x5884_rd_x5018: Bool
  ): Unit = {
    if (x5883_rd_x5017) {
      x5036_reg.initMem(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)))
      val x5040_inr_UnitPipe = x5040_inr_UnitPipe_kernel.run(b499)
      val x5068_outr_UnitPipe = x5068_outr_UnitPipe_kernel.run()
      ()
    }
    else if (x5884_rd_x5018) {
      ()
    }
    else ()
  } 
}
/** END Switch x5072_outr_Switch **/
