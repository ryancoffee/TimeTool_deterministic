import emul._
import emul.implicits._

/** BEGIN UnrolledForeach x1347_inr_Foreach **/
object x1347_inr_Foreach_kernel {
  def run(
    x1336_ctrchain: Array[Counterlike]
  ): Unit = {
    x1336_ctrchain(0).foreach{case (is,vs) => 
      val b1337 = is(0)
      val b1338 = vs(0)
      val x1339_rd_x1322 = x1322_reg.value
      val x1340 = x1339_rd_x1322 <= b1337
      val x1341_rd_x1323 = x1323_reg.value
      val x1342 = b1337 < x1341_rd_x1323
      val x1343 = x1340 && x1342
      val x1344 = {
        val a0 = if (b1338 && x1292.nonEmpty) x1292.dequeue() else FixedPoint.invalid(FixFormat(true,16,0))
        Array[FixedPoint](a0)
      }
      val x1345_elem_0 = x1344.apply(0)
      val x1346_enq_x534 = {
        if (x1343 & b1338) x534_input_fifo_0.enqueue(x1345_elem_0)
      }
    }
  } 
}
/** END UnrolledForeach x1347_inr_Foreach **/
