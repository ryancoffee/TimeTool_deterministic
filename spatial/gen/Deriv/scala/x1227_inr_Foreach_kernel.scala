import emul._
import emul.implicits._

/** BEGIN UnrolledForeach x1227_inr_Foreach **/
object x1227_inr_Foreach_kernel {
  def run(
    x1216_ctrchain: Array[Counterlike]
  ): Unit = {
    x1216_ctrchain(0).foreach{case (is,vs) => 
      val b1217 = is(0)
      val b1218 = vs(0)
      val x1219_rd_x1202 = x1202_reg.value
      val x1220 = x1219_rd_x1202 <= b1217
      val x1221_rd_x1203 = x1203_reg.value
      val x1222 = b1217 < x1221_rd_x1203
      val x1223 = x1220 && x1222
      val x1224 = {
        val a0 = if (b1218 && x1172.nonEmpty) x1172.dequeue() else FixedPoint.invalid(FixFormat(true,16,0))
        Array[FixedPoint](a0)
      }
      val x1225_elem_0 = x1224.apply(0)
      val x1226_enq_x532 = {
        if (x1223 & b1218) x532_input_fifo_0.enqueue(x1225_elem_0)
      }
    }
  } 
}
/** END UnrolledForeach x1227_inr_Foreach **/
