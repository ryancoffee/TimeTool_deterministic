import emul._
import emul.implicits._

/** BEGIN UnrolledForeach x4054_inr_Foreach **/
object x4054_inr_Foreach_kernel {
  def run(
    x4045_ctrchain: Array[Counterlike]
  ): Unit = {
    x4045_ctrchain(0).foreach{case (is,vs) => 
      val b4046 = is(0)
      val b4047 = vs(0)
      val x4050_rd = x4003_best_rising_sram_0.apply("Deriv.scala:109:140", Seq(Seq(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)))), Seq(b4046), Seq(b4047))
      val x4051_elem_0 = x4050_rd.apply(0)
      val x4052_tuple: Struct4 = new Struct4(x4051_elem_0, Bool(true,true))
      val x4053 = {
        if (b4047) x4033.enqueue(x4052_tuple)
      }
    }
  } 
}
/** END UnrolledForeach x4054_inr_Foreach **/
