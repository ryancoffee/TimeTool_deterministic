import emul._
import emul.implicits._

/** BEGIN UnrolledForeach x5420_inr_Foreach **/
object x5420_inr_Foreach_kernel {
  def run(
    x5411_ctrchain: Array[Counterlike]
  ): Unit = {
    x5411_ctrchain(0).foreach{case (is,vs) => 
      val b5412 = is(0)
      val b5413 = vs(0)
      val x5416_rd = x5373_best_falling_sram_0.apply("Deriv.scala:112:141", Seq(Seq(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)))), Seq(b5412), Seq(b5413))
      val x5417_elem_0 = x5416_rd.apply(0)
      val x5418_tuple: Struct4 = new Struct4(x5417_elem_0, Bool(true,true))
      val x5419 = {
        if (b5413) x5399.enqueue(x5418_tuple)
      }
    }
  } 
}
/** END UnrolledForeach x5420_inr_Foreach **/
