import emul._
import emul.implicits._

case class Struct3(
  var size: FixedPoint,
  var start: FixedPoint,
  var end: FixedPoint,
) {

  override def productPrefix = "IssuedCmd"
}

case class Struct2(
  var offset: FixedPoint,
  var size: FixedPoint,
  var isLoad: Bool,
) {

  override def productPrefix = "BurstCmd"
}

case class Struct1(
  var idx: FixedPoint,
  var v: FixedPoint,
) {

  override def productPrefix = "score"
}

case class Struct4(
  var _1: Struct1,
  var _2: Bool,
) {

  override def productPrefix = "Tup2[score,Bit]"
}

