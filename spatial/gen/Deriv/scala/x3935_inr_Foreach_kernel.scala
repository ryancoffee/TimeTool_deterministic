import emul._
import emul.implicits._

/** BEGIN UnrolledForeach x3935_inr_Foreach **/
object x3935_inr_Foreach_kernel {
  def run(
    x3926_ctrchain: Array[Counterlike]
  ): Unit = {
    x3926_ctrchain(0).foreach{case (is,vs) => 
      val b3927 = is(0)
      val b3928 = vs(0)
      val x3931_rd = x3884_best_rising_sram_0.apply("Deriv.scala:109:140", Seq(Seq(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)))), Seq(b3927), Seq(b3928))
      val x3932_elem_0 = x3931_rd.apply(0)
      val x3933_tuple: Struct4 = new Struct4(x3932_elem_0, Bool(true,true))
      val x3934 = {
        if (b3928) x3914.enqueue(x3933_tuple)
      }
    }
  } 
}
/** END UnrolledForeach x3935_inr_Foreach **/
