import emul._
import emul.implicits._

/** BEGIN UnrolledForeach x4111_inr_Foreach **/
object x4111_inr_Foreach_kernel {
  def run(
    x4102_ctrchain: Array[Counterlike]
  ): Unit = {
    x4102_ctrchain(0).foreach{case (is,vs) => 
      val b4103 = is(0)
      val b4104 = vs(0)
      val x4107_rd = x4064_best_falling_sram_0.apply("Deriv.scala:112:141", Seq(Seq(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)))), Seq(b4103), Seq(b4104))
      val x4108_elem_0 = x4107_rd.apply(0)
      val x4109_tuple: Struct4 = new Struct4(x4108_elem_0, Bool(true,true))
      val x4110 = {
        if (b4104) x4090.enqueue(x4109_tuple)
      }
    }
  } 
}
/** END UnrolledForeach x4111_inr_Foreach **/
