import emul._
import emul.implicits._

object x5103 extends StreamOut[Struct2]("defined at Deriv.scala:109:140", {elem => 
  val elem_field0 = elem.offset
  val elem_fieldStr0 = elem_field0.toString
  val elem_field1 = elem.size
  val elem_fieldStr1 = elem_field1.toString
  val elem_field2 = elem.isLoad
  val elem_fieldStr2 = elem_field2.toString
  val x = List(elem_fieldStr0, elem_fieldStr1, elem_fieldStr2).mkString("; ")
  x
})
