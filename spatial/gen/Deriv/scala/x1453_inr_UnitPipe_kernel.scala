import emul._
import emul.implicits._

/** BEGIN UnitPipe x1453_inr_UnitPipe **/
object x1453_inr_UnitPipe_kernel {
  def run(
  ): Unit = {
    val x1445_deq_x1411 = {
      val a0 = if (Bool(true,true) && x1411_fifo.nonEmpty) x1411_fifo.dequeue() else Struct3(FixedPoint.invalid(FixFormat(true,32,0)), FixedPoint.invalid(FixFormat(true,32,0)), FixedPoint.invalid(FixFormat(true,32,0)))
      Array[Struct3](a0)
    }
    val x1446_elem_0 = x1445_deq_x1411.apply(0)
    val x1447_apply = x1446_elem_0.start
    val x1448_wr_x1442 = if (TRUE) x1442_reg.set(x1447_apply)
    val x1449_apply = x1446_elem_0.end
    val x1450_wr_x1443 = if (TRUE) x1443_reg.set(x1449_apply)
    val x1451_apply = x1446_elem_0.size
    val x1452_wr_x1444 = if (TRUE) x1444_reg.set(x1451_apply)
  } 
}
/** END UnitPipe x1453_inr_UnitPipe **/
