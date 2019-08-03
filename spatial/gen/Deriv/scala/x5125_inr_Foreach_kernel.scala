import emul._
import emul.implicits._

/** BEGIN UnrolledForeach x5125_inr_Foreach **/
object x5125_inr_Foreach_kernel {
  def run(
    x5116_ctrchain: Array[Counterlike]
  ): Unit = {
    x5116_ctrchain(0).foreach{case (is,vs) => 
      val b5117 = is(0)
      val b5118 = vs(0)
      val x5121_rd = x5074_best_rising_sram_0.apply("Deriv.scala:109:140", Seq(Seq(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)))), Seq(b5117), Seq(b5118))
      val x5122_elem_0 = x5121_rd.apply(0)
      val x5123_tuple: Struct4 = new Struct4(x5122_elem_0, Bool(true,true))
      val x5124 = {
        if (b5118) x5104.enqueue(x5123_tuple)
      }
    }
  } 
}
/** END UnrolledForeach x5125_inr_Foreach **/
