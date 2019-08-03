import emul._
import emul.implicits._

/** BEGIN UnrolledForeach x4768_inr_Foreach **/
object x4768_inr_Foreach_kernel {
  def run(
    x4759_ctrchain: Array[Counterlike]
  ): Unit = {
    x4759_ctrchain(0).foreach{case (is,vs) => 
      val b4760 = is(0)
      val b4761 = vs(0)
      val x4764_rd = x4717_best_rising_sram_0.apply("Deriv.scala:109:140", Seq(Seq(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)))), Seq(b4760), Seq(b4761))
      val x4765_elem_0 = x4764_rd.apply(0)
      val x4766_tuple: Struct4 = new Struct4(x4765_elem_0, Bool(true,true))
      val x4767 = {
        if (b4761) x4747.enqueue(x4766_tuple)
      }
    }
  } 
}
/** END UnrolledForeach x4768_inr_Foreach **/
