import emul._
import emul.implicits._

/** BEGIN UnitPipe x793_inr_UnitPipe **/
object x793_inr_UnitPipe_kernel {
  def run(
  ): Unit = {
    val x785_deq_x751 = {
      val a0 = if (Bool(true,true) && x751_fifo.nonEmpty) x751_fifo.dequeue() else Struct3(FixedPoint.invalid(FixFormat(true,32,0)), FixedPoint.invalid(FixFormat(true,32,0)), FixedPoint.invalid(FixFormat(true,32,0)))
      Array[Struct3](a0)
    }
    val x786_elem_0 = x785_deq_x751.apply(0)
    val x787_apply = x786_elem_0.start
    val x788_wr_x782 = if (TRUE) x782_reg.set(x787_apply)
    val x789_apply = x786_elem_0.end
    val x790_wr_x783 = if (TRUE) x783_reg.set(x789_apply)
    val x791_apply = x786_elem_0.size
    val x792_wr_x784 = if (TRUE) x784_reg.set(x791_apply)
  } 
}
/** END UnitPipe x793_inr_UnitPipe **/
