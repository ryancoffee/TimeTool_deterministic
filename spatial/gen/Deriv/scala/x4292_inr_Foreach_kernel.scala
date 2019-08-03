import emul._
import emul.implicits._

/** BEGIN UnrolledForeach x4292_inr_Foreach **/
object x4292_inr_Foreach_kernel {
  def run(
    x4283_ctrchain: Array[Counterlike]
  ): Unit = {
    x4283_ctrchain(0).foreach{case (is,vs) => 
      val b4284 = is(0)
      val b4285 = vs(0)
      val x4288_rd = x4241_best_rising_sram_0.apply("Deriv.scala:109:140", Seq(Seq(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)))), Seq(b4284), Seq(b4285))
      val x4289_elem_0 = x4288_rd.apply(0)
      val x4290_tuple: Struct4 = new Struct4(x4289_elem_0, Bool(true,true))
      val x4291 = {
        if (b4285) x4271.enqueue(x4290_tuple)
      }
    }
  } 
}
/** END UnrolledForeach x4292_inr_Foreach **/
