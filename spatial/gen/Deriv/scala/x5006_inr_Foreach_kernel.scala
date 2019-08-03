import emul._
import emul.implicits._

/** BEGIN UnrolledForeach x5006_inr_Foreach **/
object x5006_inr_Foreach_kernel {
  def run(
    x4997_ctrchain: Array[Counterlike]
  ): Unit = {
    x4997_ctrchain(0).foreach{case (is,vs) => 
      val b4998 = is(0)
      val b4999 = vs(0)
      val x5002_rd = x4955_best_rising_sram_0.apply("Deriv.scala:109:140", Seq(Seq(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)))), Seq(b4998), Seq(b4999))
      val x5003_elem_0 = x5002_rd.apply(0)
      val x5004_tuple: Struct4 = new Struct4(x5003_elem_0, Bool(true,true))
      val x5005 = {
        if (b4999) x4985.enqueue(x5004_tuple)
      }
    }
  } 
}
/** END UnrolledForeach x5006_inr_Foreach **/
