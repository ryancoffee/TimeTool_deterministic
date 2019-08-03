import emul._
import emul.implicits._

/** BEGIN UnrolledForeach x4706_inr_Foreach **/
object x4706_inr_Foreach_kernel {
  def run(
    x4697_ctrchain: Array[Counterlike]
  ): Unit = {
    x4697_ctrchain(0).foreach{case (is,vs) => 
      val b4698 = is(0)
      val b4699 = vs(0)
      val x4702_rd = x4659_best_falling_sram_0.apply("Deriv.scala:112:141", Seq(Seq(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)))), Seq(b4698), Seq(b4699))
      val x4703_elem_0 = x4702_rd.apply(0)
      val x4704_tuple: Struct4 = new Struct4(x4703_elem_0, Bool(true,true))
      val x4705 = {
        if (b4699) x4685.enqueue(x4704_tuple)
      }
    }
  } 
}
/** END UnrolledForeach x4706_inr_Foreach **/
