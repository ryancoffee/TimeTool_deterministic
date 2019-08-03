import emul._
import emul.implicits._

/** BEGIN UnitPipe x1153_inr_UnitPipe **/
object x1153_inr_UnitPipe_kernel {
  def run(
  ): Unit = {
    val x1145_deq_x1111 = {
      val a0 = if (Bool(true,true) && x1111_fifo.nonEmpty) x1111_fifo.dequeue() else Struct3(FixedPoint.invalid(FixFormat(true,32,0)), FixedPoint.invalid(FixFormat(true,32,0)), FixedPoint.invalid(FixFormat(true,32,0)))
      Array[Struct3](a0)
    }
    val x1146_elem_0 = x1145_deq_x1111.apply(0)
    val x1147_apply = x1146_elem_0.start
    val x1148_wr_x1142 = if (TRUE) x1142_reg.set(x1147_apply)
    val x1149_apply = x1146_elem_0.end
    val x1150_wr_x1143 = if (TRUE) x1143_reg.set(x1149_apply)
    val x1151_apply = x1146_elem_0.size
    val x1152_wr_x1144 = if (TRUE) x1144_reg.set(x1151_apply)
  } 
}
/** END UnitPipe x1153_inr_UnitPipe **/
