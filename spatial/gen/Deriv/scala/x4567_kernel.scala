import emul._
import emul.implicits._

object x4567 extends StreamIn[Bool]("defined at Deriv.scala:112:141", {str => 
  val x = Bool(str.toBoolean, true)
  x
})
