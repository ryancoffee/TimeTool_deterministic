import emul._
import emul.implicits._

object x1112 extends StreamIn[FixedPoint]("defined at Deriv.scala:90:20", {str => 
  val x = FixedPoint(str, FixFormat(true,16,0))
  x
})
