import emul._
import emul.implicits._

/** BEGIN UnitPipe x1213_inr_UnitPipe **/
object x1213_inr_UnitPipe_kernel {
  def run(
  ): Unit = {
    val x1205_deq_x1171 = {
      val a0 = if (Bool(true,true) && x1171_fifo.nonEmpty) x1171_fifo.dequeue() else Struct3(FixedPoint.invalid(FixFormat(true,32,0)), FixedPoint.invalid(FixFormat(true,32,0)), FixedPoint.invalid(FixFormat(true,32,0)))
      Array[Struct3](a0)
    }
    val x1206_elem_0 = x1205_deq_x1171.apply(0)
    val x1207_apply = x1206_elem_0.start
    val x1208_wr_x1202 = if (TRUE) x1202_reg.set(x1207_apply)
    val x1209_apply = x1206_elem_0.end
    val x1210_wr_x1203 = if (TRUE) x1203_reg.set(x1209_apply)
    val x1211_apply = x1206_elem_0.size
    val x1212_wr_x1204 = if (TRUE) x1204_reg.set(x1211_apply)
  } 
}
/** END UnitPipe x1213_inr_UnitPipe **/
