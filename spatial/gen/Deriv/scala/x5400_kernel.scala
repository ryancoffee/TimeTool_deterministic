import emul._
import emul.implicits._

object x5400 extends StreamIn[Bool]("defined at Deriv.scala:112:141", {str => 
  val x = Bool(str.toBoolean, true)
  x
})
