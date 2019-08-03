import emul._
import emul.implicits._

/** BEGIN UnitPipe x853_inr_UnitPipe **/
object x853_inr_UnitPipe_kernel {
  def run(
  ): Unit = {
    val x845_deq_x811 = {
      val a0 = if (Bool(true,true) && x811_fifo.nonEmpty) x811_fifo.dequeue() else Struct3(FixedPoint.invalid(FixFormat(true,32,0)), FixedPoint.invalid(FixFormat(true,32,0)), FixedPoint.invalid(FixFormat(true,32,0)))
      Array[Struct3](a0)
    }
    val x846_elem_0 = x845_deq_x811.apply(0)
    val x847_apply = x846_elem_0.start
    val x848_wr_x842 = if (TRUE) x842_reg.set(x847_apply)
    val x849_apply = x846_elem_0.end
    val x850_wr_x843 = if (TRUE) x843_reg.set(x849_apply)
    val x851_apply = x846_elem_0.size
    val x852_wr_x844 = if (TRUE) x844_reg.set(x851_apply)
  } 
}
/** END UnitPipe x853_inr_UnitPipe **/
