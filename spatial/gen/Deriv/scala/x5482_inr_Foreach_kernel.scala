import emul._
import emul.implicits._

/** BEGIN UnrolledForeach x5482_inr_Foreach **/
object x5482_inr_Foreach_kernel {
  def run(
    x5473_ctrchain: Array[Counterlike]
  ): Unit = {
    x5473_ctrchain(0).foreach{case (is,vs) => 
      val b5474 = is(0)
      val b5475 = vs(0)
      val x5478_rd = x5431_best_rising_sram_0.apply("Deriv.scala:109:140", Seq(Seq(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)))), Seq(b5474), Seq(b5475))
      val x5479_elem_0 = x5478_rd.apply(0)
      val x5480_tuple: Struct4 = new Struct4(x5479_elem_0, Bool(true,true))
      val x5481 = {
        if (b5475) x5461.enqueue(x5480_tuple)
      }
    }
  } 
}
/** END UnrolledForeach x5482_inr_Foreach **/
