import emul._
import emul.implicits._

/** BEGIN UnrolledForeach x627_inr_Foreach **/
object x627_inr_Foreach_kernel {
  def run(
    x616_ctrchain: Array[Counterlike]
  ): Unit = {
    x616_ctrchain(0).foreach{case (is,vs) => 
      val b617 = is(0)
      val b618 = vs(0)
      val x619_rd_x602 = x602_reg.value
      val x620 = x619_rd_x602 <= b617
      val x621_rd_x603 = x603_reg.value
      val x622 = b617 < x621_rd_x603
      val x623 = x620 && x622
      val x624 = {
        val a0 = if (b618 && x572.nonEmpty) x572.dequeue() else FixedPoint.invalid(FixFormat(true,16,0))
        Array[FixedPoint](a0)
      }
      val x625_elem_0 = x624.apply(0)
      val x626_enq_x522 = {
        if (x623 & b618) x522_input_fifo_0.enqueue(x625_elem_0)
      }
    }
  } 
}
/** END UnrolledForeach x627_inr_Foreach **/
