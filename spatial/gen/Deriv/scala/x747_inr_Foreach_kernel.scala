import emul._
import emul.implicits._

/** BEGIN UnrolledForeach x747_inr_Foreach **/
object x747_inr_Foreach_kernel {
  def run(
    x736_ctrchain: Array[Counterlike]
  ): Unit = {
    x736_ctrchain(0).foreach{case (is,vs) => 
      val b737 = is(0)
      val b738 = vs(0)
      val x739_rd_x722 = x722_reg.value
      val x740 = x739_rd_x722 <= b737
      val x741_rd_x723 = x723_reg.value
      val x742 = b737 < x741_rd_x723
      val x743 = x740 && x742
      val x744 = {
        val a0 = if (b738 && x692.nonEmpty) x692.dequeue() else FixedPoint.invalid(FixFormat(true,16,0))
        Array[FixedPoint](a0)
      }
      val x745_elem_0 = x744.apply(0)
      val x746_enq_x524 = {
        if (x743 & b738) x524_input_fifo_0.enqueue(x745_elem_0)
      }
    }
  } 
}
/** END UnrolledForeach x747_inr_Foreach **/
