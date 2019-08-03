import emul._
import emul.implicits._

object x4209 extends StreamOut[Struct4]("defined at Deriv.scala:112:141", {elem => 
  val elem_field0 = elem._1
  val elem_field0_field0 = elem_field0.idx
  val elem_field0_fieldStr0 = elem_field0_field0.toString
  val elem_field0_field1 = elem_field0.v
  val elem_field0_fieldStr1 = elem_field0_field1.toString
  val elem_fieldStr0 = List(elem_field0_fieldStr0, elem_field0_fieldStr1).mkString("; ")
  val elem_field1 = elem._2
  val elem_fieldStr1 = elem_field1.toString
  val x = List(elem_fieldStr0, elem_fieldStr1).mkString("; ")
  x
})
