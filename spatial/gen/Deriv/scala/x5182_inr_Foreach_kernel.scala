import emul._
import emul.implicits._

/** BEGIN UnrolledForeach x5182_inr_Foreach **/
object x5182_inr_Foreach_kernel {
  def run(
    x5173_ctrchain: Array[Counterlike]
  ): Unit = {
    x5173_ctrchain(0).foreach{case (is,vs) => 
      val b5174 = is(0)
      val b5175 = vs(0)
      val x5178_rd = x5135_best_falling_sram_0.apply("Deriv.scala:112:141", Seq(Seq(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)))), Seq(b5174), Seq(b5175))
      val x5179_elem_0 = x5178_rd.apply(0)
      val x5180_tuple: Struct4 = new Struct4(x5179_elem_0, Bool(true,true))
      val x5181 = {
        if (b5175) x5161.enqueue(x5180_tuple)
      }
    }
  } 
}
/** END UnrolledForeach x5182_inr_Foreach **/
