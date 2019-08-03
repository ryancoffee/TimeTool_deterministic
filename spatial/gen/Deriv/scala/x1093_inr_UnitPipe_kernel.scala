import emul._
import emul.implicits._

/** BEGIN UnitPipe x1093_inr_UnitPipe **/
object x1093_inr_UnitPipe_kernel {
  def run(
  ): Unit = {
    val x1085_deq_x1051 = {
      val a0 = if (Bool(true,true) && x1051_fifo.nonEmpty) x1051_fifo.dequeue() else Struct3(FixedPoint.invalid(FixFormat(true,32,0)), FixedPoint.invalid(FixFormat(true,32,0)), FixedPoint.invalid(FixFormat(true,32,0)))
      Array[Struct3](a0)
    }
    val x1086_elem_0 = x1085_deq_x1051.apply(0)
    val x1087_apply = x1086_elem_0.start
    val x1088_wr_x1082 = if (TRUE) x1082_reg.set(x1087_apply)
    val x1089_apply = x1086_elem_0.end
    val x1090_wr_x1083 = if (TRUE) x1083_reg.set(x1089_apply)
    val x1091_apply = x1086_elem_0.size
    val x1092_wr_x1084 = if (TRUE) x1084_reg.set(x1091_apply)
  } 
}
/** END UnitPipe x1093_inr_UnitPipe **/
