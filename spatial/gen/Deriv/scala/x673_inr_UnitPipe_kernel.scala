import emul._
import emul.implicits._

/** BEGIN UnitPipe x673_inr_UnitPipe **/
object x673_inr_UnitPipe_kernel {
  def run(
  ): Unit = {
    val x665_deq_x631 = {
      val a0 = if (Bool(true,true) && x631_fifo.nonEmpty) x631_fifo.dequeue() else Struct3(FixedPoint.invalid(FixFormat(true,32,0)), FixedPoint.invalid(FixFormat(true,32,0)), FixedPoint.invalid(FixFormat(true,32,0)))
      Array[Struct3](a0)
    }
    val x666_elem_0 = x665_deq_x631.apply(0)
    val x667_apply = x666_elem_0.start
    val x668_wr_x662 = if (TRUE) x662_reg.set(x667_apply)
    val x669_apply = x666_elem_0.end
    val x670_wr_x663 = if (TRUE) x663_reg.set(x669_apply)
    val x671_apply = x666_elem_0.size
    val x672_wr_x664 = if (TRUE) x664_reg.set(x671_apply)
  } 
}
/** END UnitPipe x673_inr_UnitPipe **/
