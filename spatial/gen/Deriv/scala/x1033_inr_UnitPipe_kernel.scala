import emul._
import emul.implicits._

/** BEGIN UnitPipe x1033_inr_UnitPipe **/
object x1033_inr_UnitPipe_kernel {
  def run(
  ): Unit = {
    val x1025_deq_x991 = {
      val a0 = if (Bool(true,true) && x991_fifo.nonEmpty) x991_fifo.dequeue() else Struct3(FixedPoint.invalid(FixFormat(true,32,0)), FixedPoint.invalid(FixFormat(true,32,0)), FixedPoint.invalid(FixFormat(true,32,0)))
      Array[Struct3](a0)
    }
    val x1026_elem_0 = x1025_deq_x991.apply(0)
    val x1027_apply = x1026_elem_0.start
    val x1028_wr_x1022 = if (TRUE) x1022_reg.set(x1027_apply)
    val x1029_apply = x1026_elem_0.end
    val x1030_wr_x1023 = if (TRUE) x1023_reg.set(x1029_apply)
    val x1031_apply = x1026_elem_0.size
    val x1032_wr_x1024 = if (TRUE) x1024_reg.set(x1031_apply)
  } 
}
/** END UnitPipe x1033_inr_UnitPipe **/
