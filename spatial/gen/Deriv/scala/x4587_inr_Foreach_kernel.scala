import emul._
import emul.implicits._

/** BEGIN UnrolledForeach x4587_inr_Foreach **/
object x4587_inr_Foreach_kernel {
  def run(
    x4578_ctrchain: Array[Counterlike]
  ): Unit = {
    x4578_ctrchain(0).foreach{case (is,vs) => 
      val b4579 = is(0)
      val b4580 = vs(0)
      val x4583_rd = x4540_best_falling_sram_0.apply("Deriv.scala:112:141", Seq(Seq(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)))), Seq(b4579), Seq(b4580))
      val x4584_elem_0 = x4583_rd.apply(0)
      val x4585_tuple: Struct4 = new Struct4(x4584_elem_0, Bool(true,true))
      val x4586 = {
        if (b4580) x4566.enqueue(x4585_tuple)
      }
    }
  } 
}
/** END UnrolledForeach x4587_inr_Foreach **/
