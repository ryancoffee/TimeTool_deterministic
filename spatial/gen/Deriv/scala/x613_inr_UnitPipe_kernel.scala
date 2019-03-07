import emul._
import emul.implicits._

/** BEGIN UnitPipe x613_inr_UnitPipe **/
object x613_inr_UnitPipe_kernel {
  def run(
  ): Unit = {
    val x605_deq_x571 = {
      val a0 = if (Bool(true,true) && x571_fifo.nonEmpty) x571_fifo.dequeue() else Struct3(FixedPoint.invalid(FixFormat(true,32,0)), FixedPoint.invalid(FixFormat(true,32,0)), FixedPoint.invalid(FixFormat(true,32,0)))
      Array[Struct3](a0)
    }
    val x606_elem_0 = x605_deq_x571.apply(0)
    val x607_apply = x606_elem_0.start
    val x608_wr_x602 = if (TRUE) x602_reg.set(x607_apply)
    val x609_apply = x606_elem_0.end
    val x610_wr_x603 = if (TRUE) x603_reg.set(x609_apply)
    val x611_apply = x606_elem_0.size
    val x612_wr_x604 = if (TRUE) x604_reg.set(x611_apply)
  } 
}
/** END UnitPipe x613_inr_UnitPipe **/
