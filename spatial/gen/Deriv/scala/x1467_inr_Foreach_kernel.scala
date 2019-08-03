import emul._
import emul.implicits._

/** BEGIN UnrolledForeach x1467_inr_Foreach **/
object x1467_inr_Foreach_kernel {
  def run(
    x1456_ctrchain: Array[Counterlike]
  ): Unit = {
    x1456_ctrchain(0).foreach{case (is,vs) => 
      val b1457 = is(0)
      val b1458 = vs(0)
      val x1459_rd_x1442 = x1442_reg.value
      val x1460 = x1459_rd_x1442 <= b1457
      val x1461_rd_x1443 = x1443_reg.value
      val x1462 = b1457 < x1461_rd_x1443
      val x1463 = x1460 && x1462
      val x1464 = {
        val a0 = if (b1458 && x1412.nonEmpty) x1412.dequeue() else FixedPoint.invalid(FixFormat(true,16,0))
        Array[FixedPoint](a0)
      }
      val x1465_elem_0 = x1464.apply(0)
      val x1466_enq_x536 = {
        if (x1463 & b1458) x536_input_fifo_0.enqueue(x1465_elem_0)
      }
    }
  } 
}
/** END UnrolledForeach x1467_inr_Foreach **/
