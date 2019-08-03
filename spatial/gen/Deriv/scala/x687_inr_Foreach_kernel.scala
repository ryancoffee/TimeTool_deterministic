import emul._
import emul.implicits._

/** BEGIN UnrolledForeach x687_inr_Foreach **/
object x687_inr_Foreach_kernel {
  def run(
    x676_ctrchain: Array[Counterlike]
  ): Unit = {
    x676_ctrchain(0).foreach{case (is,vs) => 
      val b677 = is(0)
      val b678 = vs(0)
      val x679_rd_x662 = x662_reg.value
      val x680 = x679_rd_x662 <= b677
      val x681_rd_x663 = x663_reg.value
      val x682 = b677 < x681_rd_x663
      val x683 = x680 && x682
      val x684 = {
        val a0 = if (b678 && x632.nonEmpty) x632.dequeue() else FixedPoint.invalid(FixFormat(true,16,0))
        Array[FixedPoint](a0)
      }
      val x685_elem_0 = x684.apply(0)
      val x686_enq_x523 = {
        if (x683 & b678) x523_input_fifo_0.enqueue(x685_elem_0)
      }
    }
  } 
}
/** END UnrolledForeach x687_inr_Foreach **/
