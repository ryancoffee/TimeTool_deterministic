import emul._
import emul.implicits._

/** BEGIN UnrolledForeach x1407_inr_Foreach **/
object x1407_inr_Foreach_kernel {
  def run(
    x1396_ctrchain: Array[Counterlike]
  ): Unit = {
    x1396_ctrchain(0).foreach{case (is,vs) => 
      val b1397 = is(0)
      val b1398 = vs(0)
      val x1399_rd_x1382 = x1382_reg.value
      val x1400 = x1399_rd_x1382 <= b1397
      val x1401_rd_x1383 = x1383_reg.value
      val x1402 = b1397 < x1401_rd_x1383
      val x1403 = x1400 && x1402
      val x1404 = {
        val a0 = if (b1398 && x1352.nonEmpty) x1352.dequeue() else FixedPoint.invalid(FixFormat(true,16,0))
        Array[FixedPoint](a0)
      }
      val x1405_elem_0 = x1404.apply(0)
      val x1406_enq_x535 = {
        if (x1403 & b1398) x535_input_fifo_0.enqueue(x1405_elem_0)
      }
    }
  } 
}
/** END UnrolledForeach x1407_inr_Foreach **/
