import emul._
import emul.implicits._

/** BEGIN UnitPipe x1393_inr_UnitPipe **/
object x1393_inr_UnitPipe_kernel {
  def run(
  ): Unit = {
    val x1385_deq_x1351 = {
      val a0 = if (Bool(true,true) && x1351_fifo.nonEmpty) x1351_fifo.dequeue() else Struct3(FixedPoint.invalid(FixFormat(true,32,0)), FixedPoint.invalid(FixFormat(true,32,0)), FixedPoint.invalid(FixFormat(true,32,0)))
      Array[Struct3](a0)
    }
    val x1386_elem_0 = x1385_deq_x1351.apply(0)
    val x1387_apply = x1386_elem_0.start
    val x1388_wr_x1382 = if (TRUE) x1382_reg.set(x1387_apply)
    val x1389_apply = x1386_elem_0.end
    val x1390_wr_x1383 = if (TRUE) x1383_reg.set(x1389_apply)
    val x1391_apply = x1386_elem_0.size
    val x1392_wr_x1384 = if (TRUE) x1384_reg.set(x1391_apply)
  } 
}
/** END UnitPipe x1393_inr_UnitPipe **/
