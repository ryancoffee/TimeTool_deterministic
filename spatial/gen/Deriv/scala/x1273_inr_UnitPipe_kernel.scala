import emul._
import emul.implicits._

/** BEGIN UnitPipe x1273_inr_UnitPipe **/
object x1273_inr_UnitPipe_kernel {
  def run(
  ): Unit = {
    val x1265_deq_x1231 = {
      val a0 = if (Bool(true,true) && x1231_fifo.nonEmpty) x1231_fifo.dequeue() else Struct3(FixedPoint.invalid(FixFormat(true,32,0)), FixedPoint.invalid(FixFormat(true,32,0)), FixedPoint.invalid(FixFormat(true,32,0)))
      Array[Struct3](a0)
    }
    val x1266_elem_0 = x1265_deq_x1231.apply(0)
    val x1267_apply = x1266_elem_0.start
    val x1268_wr_x1262 = if (TRUE) x1262_reg.set(x1267_apply)
    val x1269_apply = x1266_elem_0.end
    val x1270_wr_x1263 = if (TRUE) x1263_reg.set(x1269_apply)
    val x1271_apply = x1266_elem_0.size
    val x1272_wr_x1264 = if (TRUE) x1264_reg.set(x1271_apply)
  } 
}
/** END UnitPipe x1273_inr_UnitPipe **/
