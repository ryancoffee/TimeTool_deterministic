import emul._
import emul.implicits._

/** BEGIN UnitPipe x1513_inr_UnitPipe **/
object x1513_inr_UnitPipe_kernel {
  def run(
  ): Unit = {
    val x1505_deq_x1471 = {
      val a0 = if (Bool(true,true) && x1471_fifo.nonEmpty) x1471_fifo.dequeue() else Struct3(FixedPoint.invalid(FixFormat(true,32,0)), FixedPoint.invalid(FixFormat(true,32,0)), FixedPoint.invalid(FixFormat(true,32,0)))
      Array[Struct3](a0)
    }
    val x1506_elem_0 = x1505_deq_x1471.apply(0)
    val x1507_apply = x1506_elem_0.start
    val x1508_wr_x1502 = if (TRUE) x1502_reg.set(x1507_apply)
    val x1509_apply = x1506_elem_0.end
    val x1510_wr_x1503 = if (TRUE) x1503_reg.set(x1509_apply)
    val x1511_apply = x1506_elem_0.size
    val x1512_wr_x1504 = if (TRUE) x1504_reg.set(x1511_apply)
  } 
}
/** END UnitPipe x1513_inr_UnitPipe **/
