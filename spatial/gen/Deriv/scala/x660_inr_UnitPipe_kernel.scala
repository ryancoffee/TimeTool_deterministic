import emul._
import emul.implicits._

/** BEGIN UnitPipe x660_inr_UnitPipe **/
object x660_inr_UnitPipe_kernel {
  def run(
    b491: FixedPoint
  ): Unit = {
    val x633_rd_x470 = x470_COLS.value
    val x634_mul = b491 * x633_rd_x470
    val x635 = x634_mul << FixedPoint(BigDecimal("1"),FixFormat(true,16,0))
    val x5911 = x635 & FixedPoint(BigDecimal("63"),FixFormat(true,32,0))
    val x638 = x633_rd_x470 << FixedPoint(BigDecimal("1"),FixFormat(true,16,0))
    val x639_sub = x635 - x5911
    val x640_sum = x635 + x638
    val x5912 = x640_sum & FixedPoint(BigDecimal("63"),FixFormat(true,32,0))
    val x642 = x5912 === FixedPoint(BigDecimal("0"),FixFormat(true,32,0))
    val x643_sub = FixedPoint(BigDecimal("64"),FixFormat(true,32,0)) - x5912
    val x644 = if (x642) FixedPoint(BigDecimal("0"),FixFormat(true,32,0)) else x643_sub
    val x645 = x5911 >> FixedPoint(BigDecimal("1"),FixFormat(true,16,0))
    val x646 = x644 >> FixedPoint(BigDecimal("1"),FixFormat(true,16,0))
    val x647_sum = x645 + x633_rd_x470
    val x648_sum = x633_rd_x470 + x645
    val x649_sum = x648_sum + x646
    val x650_sum = x638 + x5911
    val x651_sum = x650_sum + x644
    val x652 = x639_sub.toFixedPoint(FixFormat(true,64,0))
    val x653 = FixedPoint.fromInt(0)
    val x654_sum = x652 + x653
    val x655_tuple: Struct2 = new Struct2(x654_sum, x651_sum, Bool(true,true))
    val x656 = true
    val x657 = {
      if (x656) x630.enqueue(x655_tuple)
    }
    val x658_tuple: Struct3 = new Struct3(x649_sum, x645, x647_sum)
    val x659_enq_x631 = {
      if (Bool(true,true)) x631_fifo.enqueue(x658_tuple)
    }
  } 
}
/** END UnitPipe x660_inr_UnitPipe **/
