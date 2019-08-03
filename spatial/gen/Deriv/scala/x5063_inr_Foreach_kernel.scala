import emul._
import emul.implicits._

/** BEGIN UnrolledForeach x5063_inr_Foreach **/
object x5063_inr_Foreach_kernel {
  def run(
    x5054_ctrchain: Array[Counterlike]
  ): Unit = {
    x5054_ctrchain(0).foreach{case (is,vs) => 
      val b5055 = is(0)
      val b5056 = vs(0)
      val x5059_rd = x5016_best_falling_sram_0.apply("Deriv.scala:112:141", Seq(Seq(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)))), Seq(b5055), Seq(b5056))
      val x5060_elem_0 = x5059_rd.apply(0)
      val x5061_tuple: Struct4 = new Struct4(x5060_elem_0, Bool(true,true))
      val x5062 = {
        if (b5056) x5042.enqueue(x5061_tuple)
      }
    }
  } 
}
/** END UnrolledForeach x5063_inr_Foreach **/
