import emul._
import emul.implicits._

/** BEGIN UnrolledForeach x4349_inr_Foreach **/
object x4349_inr_Foreach_kernel {
  def run(
    x4340_ctrchain: Array[Counterlike]
  ): Unit = {
    x4340_ctrchain(0).foreach{case (is,vs) => 
      val b4341 = is(0)
      val b4342 = vs(0)
      val x4345_rd = x4302_best_falling_sram_0.apply("Deriv.scala:112:141", Seq(Seq(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)))), Seq(b4341), Seq(b4342))
      val x4346_elem_0 = x4345_rd.apply(0)
      val x4347_tuple: Struct4 = new Struct4(x4346_elem_0, Bool(true,true))
      val x4348 = {
        if (b4342) x4328.enqueue(x4347_tuple)
      }
    }
  } 
}
/** END UnrolledForeach x4349_inr_Foreach **/
