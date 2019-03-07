import emul._
import emul.implicits._

/** BEGIN UnrolledForeach x4944_inr_Foreach **/
object x4944_inr_Foreach_kernel {
  def run(
    x4935_ctrchain: Array[Counterlike]
  ): Unit = {
    x4935_ctrchain(0).foreach{case (is,vs) => 
      val b4936 = is(0)
      val b4937 = vs(0)
      val x4940_rd = x4897_best_falling_sram_0.apply("Deriv.scala:112:141", Seq(Seq(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)))), Seq(b4936), Seq(b4937))
      val x4941_elem_0 = x4940_rd.apply(0)
      val x4942_tuple: Struct4 = new Struct4(x4941_elem_0, Bool(true,true))
      val x4943 = {
        if (b4937) x4923.enqueue(x4942_tuple)
      }
    }
  } 
}
/** END UnrolledForeach x4944_inr_Foreach **/
