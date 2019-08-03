import emul._
import emul.implicits._

/** BEGIN UnrolledForeach x4173_inr_Foreach **/
object x4173_inr_Foreach_kernel {
  def run(
    x4164_ctrchain: Array[Counterlike]
  ): Unit = {
    x4164_ctrchain(0).foreach{case (is,vs) => 
      val b4165 = is(0)
      val b4166 = vs(0)
      val x4169_rd = x4122_best_rising_sram_0.apply("Deriv.scala:109:140", Seq(Seq(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)))), Seq(b4165), Seq(b4166))
      val x4170_elem_0 = x4169_rd.apply(0)
      val x4171_tuple: Struct4 = new Struct4(x4170_elem_0, Bool(true,true))
      val x4172 = {
        if (b4166) x4152.enqueue(x4171_tuple)
      }
    }
  } 
}
/** END UnrolledForeach x4173_inr_Foreach **/
