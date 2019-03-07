import emul._
import emul.implicits._

/** BEGIN UnitPipe x780_inr_UnitPipe **/
object x780_inr_UnitPipe_kernel {
  def run(
    b493: FixedPoint
  ): Unit = {
    val x753_rd_x470 = x470_COLS.value
    val x754_mul = b493 * x753_rd_x470
    val x755 = x754_mul << FixedPoint(BigDecimal("1"),FixFormat(true,16,0))
    val x5915 = x755 & FixedPoint(BigDecimal("63"),FixFormat(true,32,0))
    val x758 = x753_rd_x470 << FixedPoint(BigDecimal("1"),FixFormat(true,16,0))
    val x759_sub = x755 - x5915
    val x760_sum = x755 + x758
    val x5916 = x760_sum & FixedPoint(BigDecimal("63"),FixFormat(true,32,0))
    val x762 = x5916 === FixedPoint(BigDecimal("0"),FixFormat(true,32,0))
    val x763_sub = FixedPoint(BigDecimal("64"),FixFormat(true,32,0)) - x5916
    val x764 = if (x762) FixedPoint(BigDecimal("0"),FixFormat(true,32,0)) else x763_sub
    val x765 = x5915 >> FixedPoint(BigDecimal("1"),FixFormat(true,16,0))
    val x766 = x764 >> FixedPoint(BigDecimal("1"),FixFormat(true,16,0))
    val x767_sum = x765 + x753_rd_x470
    val x768_sum = x753_rd_x470 + x765
    val x769_sum = x768_sum + x766
    val x770_sum = x758 + x5915
    val x771_sum = x770_sum + x764
    val x772 = x759_sub.toFixedPoint(FixFormat(true,64,0))
    val x773 = FixedPoint.fromInt(0)
    val x774_sum = x772 + x773
    val x775_tuple: Struct2 = new Struct2(x774_sum, x771_sum, Bool(true,true))
    val x776 = true
    val x777 = {
      if (x776) x750.enqueue(x775_tuple)
    }
    val x778_tuple: Struct3 = new Struct3(x769_sum, x765, x767_sum)
    val x779_enq_x751 = {
      if (Bool(true,true)) x751_fifo.enqueue(x778_tuple)
    }
  } 
}
/** END UnitPipe x780_inr_UnitPipe **/
