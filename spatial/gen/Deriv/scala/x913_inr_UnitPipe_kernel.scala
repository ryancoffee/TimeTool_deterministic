import emul._
import emul.implicits._

/** BEGIN UnitPipe x913_inr_UnitPipe **/
object x913_inr_UnitPipe_kernel {
  def run(
  ): Unit = {
    val x905_deq_x871 = {
      val a0 = if (Bool(true,true) && x871_fifo.nonEmpty) x871_fifo.dequeue() else Struct3(FixedPoint.invalid(FixFormat(true,32,0)), FixedPoint.invalid(FixFormat(true,32,0)), FixedPoint.invalid(FixFormat(true,32,0)))
      Array[Struct3](a0)
    }
    val x906_elem_0 = x905_deq_x871.apply(0)
    val x907_apply = x906_elem_0.start
    val x908_wr_x902 = if (TRUE) x902_reg.set(x907_apply)
    val x909_apply = x906_elem_0.end
    val x910_wr_x903 = if (TRUE) x903_reg.set(x909_apply)
    val x911_apply = x906_elem_0.size
    val x912_wr_x904 = if (TRUE) x904_reg.set(x911_apply)
  } 
}
/** END UnitPipe x913_inr_UnitPipe **/
