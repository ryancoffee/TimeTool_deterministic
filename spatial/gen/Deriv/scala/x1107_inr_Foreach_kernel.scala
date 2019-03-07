import emul._
import emul.implicits._

/** BEGIN UnrolledForeach x1107_inr_Foreach **/
object x1107_inr_Foreach_kernel {
  def run(
    x1096_ctrchain: Array[Counterlike]
  ): Unit = {
    x1096_ctrchain(0).foreach{case (is,vs) => 
      val b1097 = is(0)
      val b1098 = vs(0)
      val x1099_rd_x1082 = x1082_reg.value
      val x1100 = x1099_rd_x1082 <= b1097
      val x1101_rd_x1083 = x1083_reg.value
      val x1102 = b1097 < x1101_rd_x1083
      val x1103 = x1100 && x1102
      val x1104 = {
        val a0 = if (b1098 && x1052.nonEmpty) x1052.dequeue() else FixedPoint.invalid(FixFormat(true,16,0))
        Array[FixedPoint](a0)
      }
      val x1105_elem_0 = x1104.apply(0)
      val x1106_enq_x530 = {
        if (x1103 & b1098) x530_input_fifo_0.enqueue(x1105_elem_0)
      }
    }
  } 
}
/** END UnrolledForeach x1107_inr_Foreach **/
