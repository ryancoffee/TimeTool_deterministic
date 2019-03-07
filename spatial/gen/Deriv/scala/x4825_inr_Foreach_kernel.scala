import emul._
import emul.implicits._

/** BEGIN UnrolledForeach x4825_inr_Foreach **/
object x4825_inr_Foreach_kernel {
  def run(
    x4816_ctrchain: Array[Counterlike]
  ): Unit = {
    x4816_ctrchain(0).foreach{case (is,vs) => 
      val b4817 = is(0)
      val b4818 = vs(0)
      val x4821_rd = x4778_best_falling_sram_0.apply("Deriv.scala:112:141", Seq(Seq(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)))), Seq(b4817), Seq(b4818))
      val x4822_elem_0 = x4821_rd.apply(0)
      val x4823_tuple: Struct4 = new Struct4(x4822_elem_0, Bool(true,true))
      val x4824 = {
        if (b4818) x4804.enqueue(x4823_tuple)
      }
    }
  } 
}
/** END UnrolledForeach x4825_inr_Foreach **/
