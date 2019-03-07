import emul._
import emul.implicits._

/** BEGIN UnrolledForeach x1167_inr_Foreach **/
object x1167_inr_Foreach_kernel {
  def run(
    x1156_ctrchain: Array[Counterlike]
  ): Unit = {
    x1156_ctrchain(0).foreach{case (is,vs) => 
      val b1157 = is(0)
      val b1158 = vs(0)
      val x1159_rd_x1142 = x1142_reg.value
      val x1160 = x1159_rd_x1142 <= b1157
      val x1161_rd_x1143 = x1143_reg.value
      val x1162 = b1157 < x1161_rd_x1143
      val x1163 = x1160 && x1162
      val x1164 = {
        val a0 = if (b1158 && x1112.nonEmpty) x1112.dequeue() else FixedPoint.invalid(FixFormat(true,16,0))
        Array[FixedPoint](a0)
      }
      val x1165_elem_0 = x1164.apply(0)
      val x1166_enq_x531 = {
        if (x1163 & b1158) x531_input_fifo_0.enqueue(x1165_elem_0)
      }
    }
  } 
}
/** END UnrolledForeach x1167_inr_Foreach **/
