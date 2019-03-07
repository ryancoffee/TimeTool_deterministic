import emul._
import emul.implicits._

/** BEGIN UnrolledForeach x1287_inr_Foreach **/
object x1287_inr_Foreach_kernel {
  def run(
    x1276_ctrchain: Array[Counterlike]
  ): Unit = {
    x1276_ctrchain(0).foreach{case (is,vs) => 
      val b1277 = is(0)
      val b1278 = vs(0)
      val x1279_rd_x1262 = x1262_reg.value
      val x1280 = x1279_rd_x1262 <= b1277
      val x1281_rd_x1263 = x1263_reg.value
      val x1282 = b1277 < x1281_rd_x1263
      val x1283 = x1280 && x1282
      val x1284 = {
        val a0 = if (b1278 && x1232.nonEmpty) x1232.dequeue() else FixedPoint.invalid(FixFormat(true,16,0))
        Array[FixedPoint](a0)
      }
      val x1285_elem_0 = x1284.apply(0)
      val x1286_enq_x533 = {
        if (x1283 & b1278) x533_input_fifo_0.enqueue(x1285_elem_0)
      }
    }
  } 
}
/** END UnrolledForeach x1287_inr_Foreach **/
