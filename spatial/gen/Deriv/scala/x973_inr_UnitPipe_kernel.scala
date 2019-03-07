import emul._
import emul.implicits._

/** BEGIN UnitPipe x973_inr_UnitPipe **/
object x973_inr_UnitPipe_kernel {
  def run(
  ): Unit = {
    val x965_deq_x931 = {
      val a0 = if (Bool(true,true) && x931_fifo.nonEmpty) x931_fifo.dequeue() else Struct3(FixedPoint.invalid(FixFormat(true,32,0)), FixedPoint.invalid(FixFormat(true,32,0)), FixedPoint.invalid(FixFormat(true,32,0)))
      Array[Struct3](a0)
    }
    val x966_elem_0 = x965_deq_x931.apply(0)
    val x967_apply = x966_elem_0.start
    val x968_wr_x962 = if (TRUE) x962_reg.set(x967_apply)
    val x969_apply = x966_elem_0.end
    val x970_wr_x963 = if (TRUE) x963_reg.set(x969_apply)
    val x971_apply = x966_elem_0.size
    val x972_wr_x964 = if (TRUE) x964_reg.set(x971_apply)
  } 
}
/** END UnitPipe x973_inr_UnitPipe **/
