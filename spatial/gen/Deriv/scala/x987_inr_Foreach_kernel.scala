import emul._
import emul.implicits._

/** BEGIN UnrolledForeach x987_inr_Foreach **/
object x987_inr_Foreach_kernel {
  def run(
    x976_ctrchain: Array[Counterlike]
  ): Unit = {
    x976_ctrchain(0).foreach{case (is,vs) => 
      val b977 = is(0)
      val b978 = vs(0)
      val x979_rd_x962 = x962_reg.value
      val x980 = x979_rd_x962 <= b977
      val x981_rd_x963 = x963_reg.value
      val x982 = b977 < x981_rd_x963
      val x983 = x980 && x982
      val x984 = {
        val a0 = if (b978 && x932.nonEmpty) x932.dequeue() else FixedPoint.invalid(FixFormat(true,16,0))
        Array[FixedPoint](a0)
      }
      val x985_elem_0 = x984.apply(0)
      val x986_enq_x528 = {
        if (x983 & b978) x528_input_fifo_0.enqueue(x985_elem_0)
      }
    }
  } 
}
/** END UnrolledForeach x987_inr_Foreach **/
