import emul._
import emul.implicits._

/** BEGIN UnrolledForeach x4468_inr_Foreach **/
object x4468_inr_Foreach_kernel {
  def run(
    x4459_ctrchain: Array[Counterlike]
  ): Unit = {
    x4459_ctrchain(0).foreach{case (is,vs) => 
      val b4460 = is(0)
      val b4461 = vs(0)
      val x4464_rd = x4421_best_falling_sram_0.apply("Deriv.scala:112:141", Seq(Seq(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)))), Seq(b4460), Seq(b4461))
      val x4465_elem_0 = x4464_rd.apply(0)
      val x4466_tuple: Struct4 = new Struct4(x4465_elem_0, Bool(true,true))
      val x4467 = {
        if (b4461) x4447.enqueue(x4466_tuple)
      }
    }
  } 
}
/** END UnrolledForeach x4468_inr_Foreach **/
