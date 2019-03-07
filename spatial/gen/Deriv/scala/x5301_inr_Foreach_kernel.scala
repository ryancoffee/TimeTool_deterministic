import emul._
import emul.implicits._

/** BEGIN UnrolledForeach x5301_inr_Foreach **/
object x5301_inr_Foreach_kernel {
  def run(
    x5292_ctrchain: Array[Counterlike]
  ): Unit = {
    x5292_ctrchain(0).foreach{case (is,vs) => 
      val b5293 = is(0)
      val b5294 = vs(0)
      val x5297_rd = x5254_best_falling_sram_0.apply("Deriv.scala:112:141", Seq(Seq(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)))), Seq(b5293), Seq(b5294))
      val x5298_elem_0 = x5297_rd.apply(0)
      val x5299_tuple: Struct4 = new Struct4(x5298_elem_0, Bool(true,true))
      val x5300 = {
        if (b5294) x5280.enqueue(x5299_tuple)
      }
    }
  } 
}
/** END UnrolledForeach x5301_inr_Foreach **/
