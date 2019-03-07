import emul._
import emul.implicits._

/** BEGIN UnrolledForeach x927_inr_Foreach **/
object x927_inr_Foreach_kernel {
  def run(
    x916_ctrchain: Array[Counterlike]
  ): Unit = {
    x916_ctrchain(0).foreach{case (is,vs) => 
      val b917 = is(0)
      val b918 = vs(0)
      val x919_rd_x902 = x902_reg.value
      val x920 = x919_rd_x902 <= b917
      val x921_rd_x903 = x903_reg.value
      val x922 = b917 < x921_rd_x903
      val x923 = x920 && x922
      val x924 = {
        val a0 = if (b918 && x872.nonEmpty) x872.dequeue() else FixedPoint.invalid(FixFormat(true,16,0))
        Array[FixedPoint](a0)
      }
      val x925_elem_0 = x924.apply(0)
      val x926_enq_x527 = {
        if (x923 & b918) x527_input_fifo_0.enqueue(x925_elem_0)
      }
    }
  } 
}
/** END UnrolledForeach x927_inr_Foreach **/
