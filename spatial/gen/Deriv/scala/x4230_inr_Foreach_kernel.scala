import emul._
import emul.implicits._

/** BEGIN UnrolledForeach x4230_inr_Foreach **/
object x4230_inr_Foreach_kernel {
  def run(
    x4221_ctrchain: Array[Counterlike]
  ): Unit = {
    x4221_ctrchain(0).foreach{case (is,vs) => 
      val b4222 = is(0)
      val b4223 = vs(0)
      val x4226_rd = x4183_best_falling_sram_0.apply("Deriv.scala:112:141", Seq(Seq(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)))), Seq(b4222), Seq(b4223))
      val x4227_elem_0 = x4226_rd.apply(0)
      val x4228_tuple: Struct4 = new Struct4(x4227_elem_0, Bool(true,true))
      val x4229 = {
        if (b4223) x4209.enqueue(x4228_tuple)
      }
    }
  } 
}
/** END UnrolledForeach x4230_inr_Foreach **/
