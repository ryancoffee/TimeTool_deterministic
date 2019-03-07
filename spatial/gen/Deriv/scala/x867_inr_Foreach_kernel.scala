import emul._
import emul.implicits._

/** BEGIN UnrolledForeach x867_inr_Foreach **/
object x867_inr_Foreach_kernel {
  def run(
    x856_ctrchain: Array[Counterlike]
  ): Unit = {
    x856_ctrchain(0).foreach{case (is,vs) => 
      val b857 = is(0)
      val b858 = vs(0)
      val x859_rd_x842 = x842_reg.value
      val x860 = x859_rd_x842 <= b857
      val x861_rd_x843 = x843_reg.value
      val x862 = b857 < x861_rd_x843
      val x863 = x860 && x862
      val x864 = {
        val a0 = if (b858 && x812.nonEmpty) x812.dequeue() else FixedPoint.invalid(FixFormat(true,16,0))
        Array[FixedPoint](a0)
      }
      val x865_elem_0 = x864.apply(0)
      val x866_enq_x526 = {
        if (x863 & b858) x526_input_fifo_0.enqueue(x865_elem_0)
      }
    }
  } 
}
/** END UnrolledForeach x867_inr_Foreach **/
