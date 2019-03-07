import emul._
import emul.implicits._

/** BEGIN UnrolledForeach x5363_inr_Foreach **/
object x5363_inr_Foreach_kernel {
  def run(
    x5354_ctrchain: Array[Counterlike]
  ): Unit = {
    x5354_ctrchain(0).foreach{case (is,vs) => 
      val b5355 = is(0)
      val b5356 = vs(0)
      val x5359_rd = x5312_best_rising_sram_0.apply("Deriv.scala:109:140", Seq(Seq(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)))), Seq(b5355), Seq(b5356))
      val x5360_elem_0 = x5359_rd.apply(0)
      val x5361_tuple: Struct4 = new Struct4(x5360_elem_0, Bool(true,true))
      val x5362 = {
        if (b5356) x5342.enqueue(x5361_tuple)
      }
    }
  } 
}
/** END UnrolledForeach x5363_inr_Foreach **/
