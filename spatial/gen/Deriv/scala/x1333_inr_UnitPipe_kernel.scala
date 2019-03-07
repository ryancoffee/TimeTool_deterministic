import emul._
import emul.implicits._

/** BEGIN UnitPipe x1333_inr_UnitPipe **/
object x1333_inr_UnitPipe_kernel {
  def run(
  ): Unit = {
    val x1325_deq_x1291 = {
      val a0 = if (Bool(true,true) && x1291_fifo.nonEmpty) x1291_fifo.dequeue() else Struct3(FixedPoint.invalid(FixFormat(true,32,0)), FixedPoint.invalid(FixFormat(true,32,0)), FixedPoint.invalid(FixFormat(true,32,0)))
      Array[Struct3](a0)
    }
    val x1326_elem_0 = x1325_deq_x1291.apply(0)
    val x1327_apply = x1326_elem_0.start
    val x1328_wr_x1322 = if (TRUE) x1322_reg.set(x1327_apply)
    val x1329_apply = x1326_elem_0.end
    val x1330_wr_x1323 = if (TRUE) x1323_reg.set(x1329_apply)
    val x1331_apply = x1326_elem_0.size
    val x1332_wr_x1324 = if (TRUE) x1324_reg.set(x1331_apply)
  } 
}
/** END UnitPipe x1333_inr_UnitPipe **/
