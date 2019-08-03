import emul._
import emul.implicits._

/** BEGIN UnrolledForeach x3992_inr_Foreach **/
object x3992_inr_Foreach_kernel {
  def run(
    x3983_ctrchain: Array[Counterlike]
  ): Unit = {
    x3983_ctrchain(0).foreach{case (is,vs) => 
      val b3984 = is(0)
      val b3985 = vs(0)
      val x3988_rd = x3945_best_falling_sram_0.apply("Deriv.scala:112:141", Seq(Seq(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)))), Seq(b3984), Seq(b3985))
      val x3989_elem_0 = x3988_rd.apply(0)
      val x3990_tuple: Struct4 = new Struct4(x3989_elem_0, Bool(true,true))
      val x3991 = {
        if (b3985) x3971.enqueue(x3990_tuple)
      }
    }
  } 
}
/** END UnrolledForeach x3992_inr_Foreach **/
