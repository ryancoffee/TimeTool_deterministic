import emul._
import emul.implicits._

/** BEGIN UnrolledForeach x5720_inr_Foreach **/
object x5720_inr_Foreach_kernel {
  def run(
    x5711_ctrchain: Array[Counterlike]
  ): Unit = {
    x5711_ctrchain(0).foreach{case (is,vs) => 
      val b5712 = is(0)
      val b5713 = vs(0)
      val x5716_rd = x5669_best_rising_sram_0.apply("Deriv.scala:109:140", Seq(Seq(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)))), Seq(b5712), Seq(b5713))
      val x5717_elem_0 = x5716_rd.apply(0)
      val x5718_tuple: Struct4 = new Struct4(x5717_elem_0, Bool(true,true))
      val x5719 = {
        if (b5713) x5699.enqueue(x5718_tuple)
      }
    }
  } 
}
/** END UnrolledForeach x5720_inr_Foreach **/
