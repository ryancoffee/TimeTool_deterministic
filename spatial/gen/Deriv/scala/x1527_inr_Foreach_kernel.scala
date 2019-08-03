import emul._
import emul.implicits._

/** BEGIN UnrolledForeach x1527_inr_Foreach **/
object x1527_inr_Foreach_kernel {
  def run(
    x1516_ctrchain: Array[Counterlike]
  ): Unit = {
    x1516_ctrchain(0).foreach{case (is,vs) => 
      val b1517 = is(0)
      val b1518 = vs(0)
      val x1519_rd_x1502 = x1502_reg.value
      val x1520 = x1519_rd_x1502 <= b1517
      val x1521_rd_x1503 = x1503_reg.value
      val x1522 = b1517 < x1521_rd_x1503
      val x1523 = x1520 && x1522
      val x1524 = {
        val a0 = if (b1518 && x1472.nonEmpty) x1472.dequeue() else FixedPoint.invalid(FixFormat(true,16,0))
        Array[FixedPoint](a0)
      }
      val x1525_elem_0 = x1524.apply(0)
      val x1526_enq_x537 = {
        if (x1523 & b1518) x537_input_fifo_0.enqueue(x1525_elem_0)
      }
    }
  } 
}
/** END UnrolledForeach x1527_inr_Foreach **/
