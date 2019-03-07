import emul._
import emul.implicits._

/** BEGIN UnrolledForeach x4411_inr_Foreach **/
object x4411_inr_Foreach_kernel {
  def run(
    x4402_ctrchain: Array[Counterlike]
  ): Unit = {
    x4402_ctrchain(0).foreach{case (is,vs) => 
      val b4403 = is(0)
      val b4404 = vs(0)
      val x4407_rd = x4360_best_rising_sram_0.apply("Deriv.scala:109:140", Seq(Seq(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)))), Seq(b4403), Seq(b4404))
      val x4408_elem_0 = x4407_rd.apply(0)
      val x4409_tuple: Struct4 = new Struct4(x4408_elem_0, Bool(true,true))
      val x4410 = {
        if (b4404) x4390.enqueue(x4409_tuple)
      }
    }
  } 
}
/** END UnrolledForeach x4411_inr_Foreach **/
