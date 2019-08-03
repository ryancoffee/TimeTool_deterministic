import emul._
import emul.implicits._

object x4540_best_falling_sram_0 extends BankedMemory(
  name  = "best_falling_sram_0 (x4540)",
  dims  = Seq(128),
  banks = Seq(1),
  data  = Array.fill(1){ Array.fill(128)(Struct1(FixedPoint.invalid(FixFormat(true,32,0)), FixedPoint.invalid(FixFormat(true,32,0)))) },
  invalid = Struct1(FixedPoint.invalid(FixFormat(true,32,0)), FixedPoint.invalid(FixFormat(true,32,0))),
  saveInit = false
)
