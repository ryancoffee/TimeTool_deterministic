import emul._
import emul.implicits._

/** BEGIN UnrolledForeach x5658_inr_Foreach **/
object x5658_inr_Foreach_kernel {
  def run(
    x5649_ctrchain: Array[Counterlike]
  ): Unit = {
    x5649_ctrchain(0).foreach{case (is,vs) => 
      val b5650 = is(0)
      val b5651 = vs(0)
      val x5654_rd = x5611_best_falling_sram_0.apply("Deriv.scala:112:141", Seq(Seq(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)))), Seq(b5650), Seq(b5651))
      val x5655_elem_0 = x5654_rd.apply(0)
      val x5656_tuple: Struct4 = new Struct4(x5655_elem_0, Bool(true,true))
      val x5657 = {
        if (b5651) x5637.enqueue(x5656_tuple)
      }
    }
  } 
}
/** END UnrolledForeach x5658_inr_Foreach **/
