import emul._
import emul.implicits._

/** BEGIN UnrolledForeach x5601_inr_Foreach **/
object x5601_inr_Foreach_kernel {
  def run(
    x5592_ctrchain: Array[Counterlike]
  ): Unit = {
    x5592_ctrchain(0).foreach{case (is,vs) => 
      val b5593 = is(0)
      val b5594 = vs(0)
      val x5597_rd = x5550_best_rising_sram_0.apply("Deriv.scala:109:140", Seq(Seq(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)))), Seq(b5593), Seq(b5594))
      val x5598_elem_0 = x5597_rd.apply(0)
      val x5599_tuple: Struct4 = new Struct4(x5598_elem_0, Bool(true,true))
      val x5600 = {
        if (b5594) x5580.enqueue(x5599_tuple)
      }
    }
  } 
}
/** END UnrolledForeach x5601_inr_Foreach **/
