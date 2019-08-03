import emul._
import emul.implicits._

/** BEGIN UnrolledForeach x4649_inr_Foreach **/
object x4649_inr_Foreach_kernel {
  def run(
    x4640_ctrchain: Array[Counterlike]
  ): Unit = {
    x4640_ctrchain(0).foreach{case (is,vs) => 
      val b4641 = is(0)
      val b4642 = vs(0)
      val x4645_rd = x4598_best_rising_sram_0.apply("Deriv.scala:109:140", Seq(Seq(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)))), Seq(b4641), Seq(b4642))
      val x4646_elem_0 = x4645_rd.apply(0)
      val x4647_tuple: Struct4 = new Struct4(x4646_elem_0, Bool(true,true))
      val x4648 = {
        if (b4642) x4628.enqueue(x4647_tuple)
      }
    }
  } 
}
/** END UnrolledForeach x4649_inr_Foreach **/
