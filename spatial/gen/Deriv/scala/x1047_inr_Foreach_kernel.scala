import emul._
import emul.implicits._

/** BEGIN UnrolledForeach x1047_inr_Foreach **/
object x1047_inr_Foreach_kernel {
  def run(
    x1036_ctrchain: Array[Counterlike]
  ): Unit = {
    x1036_ctrchain(0).foreach{case (is,vs) => 
      val b1037 = is(0)
      val b1038 = vs(0)
      val x1039_rd_x1022 = x1022_reg.value
      val x1040 = x1039_rd_x1022 <= b1037
      val x1041_rd_x1023 = x1023_reg.value
      val x1042 = b1037 < x1041_rd_x1023
      val x1043 = x1040 && x1042
      val x1044 = {
        val a0 = if (b1038 && x992.nonEmpty) x992.dequeue() else FixedPoint.invalid(FixFormat(true,16,0))
        Array[FixedPoint](a0)
      }
      val x1045_elem_0 = x1044.apply(0)
      val x1046_enq_x529 = {
        if (x1043 & b1038) x529_input_fifo_0.enqueue(x1045_elem_0)
      }
    }
  } 
}
/** END UnrolledForeach x1047_inr_Foreach **/
