import emul._
import emul.implicits._

/** BEGIN UnitPipe x960_inr_UnitPipe **/
object x960_inr_UnitPipe_kernel {
  def run(
    b496: FixedPoint
  ): Unit = {
    val x933_rd_x470 = x470_COLS.value
    val x934_mul = b496 * x933_rd_x470
    val x935 = x934_mul << FixedPoint(BigDecimal("1"),FixFormat(true,16,0))
    val x5921 = x935 & FixedPoint(BigDecimal("63"),FixFormat(true,32,0))
    val x938 = x933_rd_x470 << FixedPoint(BigDecimal("1"),FixFormat(true,16,0))
    val x939_sub = x935 - x5921
    val x940_sum = x935 + x938
    val x5922 = x940_sum & FixedPoint(BigDecimal("63"),FixFormat(true,32,0))
    val x942 = x5922 === FixedPoint(BigDecimal("0"),FixFormat(true,32,0))
    val x943_sub = FixedPoint(BigDecimal("64"),FixFormat(true,32,0)) - x5922
    val x944 = if (x942) FixedPoint(BigDecimal("0"),FixFormat(true,32,0)) else x943_sub
    val x945 = x5921 >> FixedPoint(BigDecimal("1"),FixFormat(true,16,0))
    val x946 = x944 >> FixedPoint(BigDecimal("1"),FixFormat(true,16,0))
    val x947_sum = x945 + x933_rd_x470
    val x948_sum = x933_rd_x470 + x945
    val x949_sum = x948_sum + x946
    val x950_sum = x938 + x5921
    val x951_sum = x950_sum + x944
    val x952 = x939_sub.toFixedPoint(FixFormat(true,64,0))
    val x953 = FixedPoint.fromInt(0)
    val x954_sum = x952 + x953
    val x955_tuple: Struct2 = new Struct2(x954_sum, x951_sum, Bool(true,true))
    val x956 = true
    val x957 = {
      if (x956) x930.enqueue(x955_tuple)
    }
    val x958_tuple: Struct3 = new Struct3(x949_sum, x945, x947_sum)
    val x959_enq_x931 = {
      if (Bool(true,true)) x931_fifo.enqueue(x958_tuple)
    }
  } 
}
/** END UnitPipe x960_inr_UnitPipe **/
