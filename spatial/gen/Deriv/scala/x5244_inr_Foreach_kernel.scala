import emul._
import emul.implicits._

/** BEGIN UnrolledForeach x5244_inr_Foreach **/
object x5244_inr_Foreach_kernel {
  def run(
    x5235_ctrchain: Array[Counterlike]
  ): Unit = {
    x5235_ctrchain(0).foreach{case (is,vs) => 
      val b5236 = is(0)
      val b5237 = vs(0)
      val x5240_rd = x5193_best_rising_sram_0.apply("Deriv.scala:109:140", Seq(Seq(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)))), Seq(b5236), Seq(b5237))
      val x5241_elem_0 = x5240_rd.apply(0)
      val x5242_tuple: Struct4 = new Struct4(x5241_elem_0, Bool(true,true))
      val x5243 = {
        if (b5237) x5223.enqueue(x5242_tuple)
      }
    }
  } 
}
/** END UnrolledForeach x5244_inr_Foreach **/
