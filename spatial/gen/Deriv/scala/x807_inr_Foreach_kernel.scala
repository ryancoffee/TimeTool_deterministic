import emul._
import emul.implicits._

/** BEGIN UnrolledForeach x807_inr_Foreach **/
object x807_inr_Foreach_kernel {
  def run(
    x796_ctrchain: Array[Counterlike]
  ): Unit = {
    x796_ctrchain(0).foreach{case (is,vs) => 
      val b797 = is(0)
      val b798 = vs(0)
      val x799_rd_x782 = x782_reg.value
      val x800 = x799_rd_x782 <= b797
      val x801_rd_x783 = x783_reg.value
      val x802 = b797 < x801_rd_x783
      val x803 = x800 && x802
      val x804 = {
        val a0 = if (b798 && x752.nonEmpty) x752.dequeue() else FixedPoint.invalid(FixFormat(true,16,0))
        Array[FixedPoint](a0)
      }
      val x805_elem_0 = x804.apply(0)
      val x806_enq_x525 = {
        if (x803 & b798) x525_input_fifo_0.enqueue(x805_elem_0)
      }
    }
  } 
}
/** END UnrolledForeach x807_inr_Foreach **/
