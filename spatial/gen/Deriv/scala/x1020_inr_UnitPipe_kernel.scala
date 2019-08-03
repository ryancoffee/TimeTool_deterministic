import emul._
import emul.implicits._

/** BEGIN UnitPipe x1020_inr_UnitPipe **/
object x1020_inr_UnitPipe_kernel {
  def run(
    b497: FixedPoint
  ): Unit = {
    val x993_rd_x470 = x470_COLS.value
    val x994_mul = b497 * x993_rd_x470
    val x995 = x994_mul << FixedPoint(BigDecimal("1"),FixFormat(true,16,0))
    val x5923 = x995 & FixedPoint(BigDecimal("63"),FixFormat(true,32,0))
    val x998 = x993_rd_x470 << FixedPoint(BigDecimal("1"),FixFormat(true,16,0))
    val x999_sub = x995 - x5923
    val x1000_sum = x995 + x998
    val x5924 = x1000_sum & FixedPoint(BigDecimal("63"),FixFormat(true,32,0))
    val x1002 = x5924 === FixedPoint(BigDecimal("0"),FixFormat(true,32,0))
    val x1003_sub = FixedPoint(BigDecimal("64"),FixFormat(true,32,0)) - x5924
    val x1004 = if (x1002) FixedPoint(BigDecimal("0"),FixFormat(true,32,0)) else x1003_sub
    val x1005 = x5923 >> FixedPoint(BigDecimal("1"),FixFormat(true,16,0))
    val x1006 = x1004 >> FixedPoint(BigDecimal("1"),FixFormat(true,16,0))
    val x1007_sum = x1005 + x993_rd_x470
    val x1008_sum = x993_rd_x470 + x1005
    val x1009_sum = x1008_sum + x1006
    val x1010_sum = x998 + x5923
    val x1011_sum = x1010_sum + x1004
    val x1012 = x999_sub.toFixedPoint(FixFormat(true,64,0))
    val x1013 = FixedPoint.fromInt(0)
    val x1014_sum = x1012 + x1013
    val x1015_tuple: Struct2 = new Struct2(x1014_sum, x1011_sum, Bool(true,true))
    val x1016 = true
    val x1017 = {
      if (x1016) x990.enqueue(x1015_tuple)
    }
    val x1018_tuple: Struct3 = new Struct3(x1009_sum, x1005, x1007_sum)
    val x1019_enq_x991 = {
      if (Bool(true,true)) x991_fifo.enqueue(x1018_tuple)
    }
  } 
}
/** END UnitPipe x1020_inr_UnitPipe **/
