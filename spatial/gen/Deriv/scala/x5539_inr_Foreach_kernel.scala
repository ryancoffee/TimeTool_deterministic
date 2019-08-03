import emul._
import emul.implicits._

/** BEGIN UnrolledForeach x5539_inr_Foreach **/
object x5539_inr_Foreach_kernel {
  def run(
    x5530_ctrchain: Array[Counterlike]
  ): Unit = {
    x5530_ctrchain(0).foreach{case (is,vs) => 
      val b5531 = is(0)
      val b5532 = vs(0)
      val x5535_rd = x5492_best_falling_sram_0.apply("Deriv.scala:112:141", Seq(Seq(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)))), Seq(b5531), Seq(b5532))
      val x5536_elem_0 = x5535_rd.apply(0)
      val x5537_tuple: Struct4 = new Struct4(x5536_elem_0, Bool(true,true))
      val x5538 = {
        if (b5532) x5518.enqueue(x5537_tuple)
      }
    }
  } 
}
/** END UnrolledForeach x5539_inr_Foreach **/
