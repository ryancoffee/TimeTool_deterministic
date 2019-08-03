import emul._
import emul.implicits._

/** BEGIN UnrolledForeach x5777_inr_Foreach **/
object x5777_inr_Foreach_kernel {
  def run(
    x5768_ctrchain: Array[Counterlike]
  ): Unit = {
    x5768_ctrchain(0).foreach{case (is,vs) => 
      val b5769 = is(0)
      val b5770 = vs(0)
      val x5773_rd = x5730_best_falling_sram_0.apply("Deriv.scala:112:141", Seq(Seq(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)))), Seq(b5769), Seq(b5770))
      val x5774_elem_0 = x5773_rd.apply(0)
      val x5775_tuple: Struct4 = new Struct4(x5774_elem_0, Bool(true,true))
      val x5776 = {
        if (b5770) x5756.enqueue(x5775_tuple)
      }
    }
  } 
}
/** END UnrolledForeach x5777_inr_Foreach **/
