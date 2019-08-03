import emul._
import emul.implicits._

/** BEGIN UnrolledForeach x4887_inr_Foreach **/
object x4887_inr_Foreach_kernel {
  def run(
    x4878_ctrchain: Array[Counterlike]
  ): Unit = {
    x4878_ctrchain(0).foreach{case (is,vs) => 
      val b4879 = is(0)
      val b4880 = vs(0)
      val x4883_rd = x4836_best_rising_sram_0.apply("Deriv.scala:109:140", Seq(Seq(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)))), Seq(b4879), Seq(b4880))
      val x4884_elem_0 = x4883_rd.apply(0)
      val x4885_tuple: Struct4 = new Struct4(x4884_elem_0, Bool(true,true))
      val x4886 = {
        if (b4880) x4866.enqueue(x4885_tuple)
      }
    }
  } 
}
/** END UnrolledForeach x4887_inr_Foreach **/
