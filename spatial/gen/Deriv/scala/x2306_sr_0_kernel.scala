import emul._
import emul.implicits._

object x2306_sr_0 extends ShiftableMemory[FixedPoint](
  name = "sr_0 (x2306)",
  dims = Seq(38),
  data = Array.fill(38){ FixedPoint.invalid(FixFormat(true,16,0)) },
  invalid = FixedPoint.invalid(FixFormat(true,16,0)),
  saveInit = false
)
