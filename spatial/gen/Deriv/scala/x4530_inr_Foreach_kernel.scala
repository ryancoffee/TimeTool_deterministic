import emul._
import emul.implicits._

/** BEGIN UnrolledForeach x4530_inr_Foreach **/
object x4530_inr_Foreach_kernel {
  def run(
    x4521_ctrchain: Array[Counterlike]
  ): Unit = {
    x4521_ctrchain(0).foreach{case (is,vs) => 
      val b4522 = is(0)
      val b4523 = vs(0)
      val x4526_rd = x4479_best_rising_sram_0.apply("Deriv.scala:109:140", Seq(Seq(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)))), Seq(b4522), Seq(b4523))
      val x4527_elem_0 = x4526_rd.apply(0)
      val x4528_tuple: Struct4 = new Struct4(x4527_elem_0, Bool(true,true))
      val x4529 = {
        if (b4523) x4509.enqueue(x4528_tuple)
      }
    }
  } 
}
/** END UnrolledForeach x4530_inr_Foreach **/
