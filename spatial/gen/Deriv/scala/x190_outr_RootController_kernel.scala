import emul._
import emul.implicits._

/** BEGIN AccelScope x190_outr_RootController **/
object x190_outr_RootController_kernel {
  def run(
  ): Unit = {
    try {
      val x5812_rd_x472 = x472_ROWS_TODO.value
      val x488_ctr = Counter(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)), x5812_rd_x472, FixedPoint(BigDecimal("1"),FixFormat(true,32,0)), FixedPoint(BigDecimal("16"),FixFormat(true,32,0)))
      val x489_ctrchain = Array[Counterlike](x488_ctr)
      val x5789_outr_Foreach = x5789_outr_Foreach_kernel.run(x489_ctrchain)
    }
    catch {
      case x: Exception if x.getMessage == "exit" =>  
      case t: Throwable => throw t
    }
  } 
}
/** END AccelScope x190_outr_RootController **/
