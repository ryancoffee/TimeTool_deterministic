import emul._
import emul.implicits._

/** BEGIN UnitPipe x733_inr_UnitPipe **/
object x733_inr_UnitPipe_kernel {
  def run(
  ): Unit = {
    val x725_deq_x691 = {
      val a0 = if (Bool(true,true) && x691_fifo.nonEmpty) x691_fifo.dequeue() else Struct3(FixedPoint.invalid(FixFormat(true,32,0)), FixedPoint.invalid(FixFormat(true,32,0)), FixedPoint.invalid(FixFormat(true,32,0)))
      Array[Struct3](a0)
    }
    val x726_elem_0 = x725_deq_x691.apply(0)
    val x727_apply = x726_elem_0.start
    val x728_wr_x722 = if (TRUE) x722_reg.set(x727_apply)
    val x729_apply = x726_elem_0.end
    val x730_wr_x723 = if (TRUE) x723_reg.set(x729_apply)
    val x731_apply = x726_elem_0.size
    val x732_wr_x724 = if (TRUE) x724_reg.set(x731_apply)
  } 
}
/** END UnitPipe x733_inr_UnitPipe **/
