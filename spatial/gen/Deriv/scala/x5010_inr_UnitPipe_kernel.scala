import emul._
import emul.implicits._

/** BEGIN UnitPipe x5010_inr_UnitPipe **/
object x5010_inr_UnitPipe_kernel {
  def run(
  ): Unit = {
    val x5008 = {
      val a0 = if (TRUE && x4986.nonEmpty) x4986.dequeue() else Bool(false,false)
      Array[Bool](a0)
    }
  } 
}
/** END UnitPipe x5010_inr_UnitPipe **/
