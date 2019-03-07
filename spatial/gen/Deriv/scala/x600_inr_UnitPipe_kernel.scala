import emul._
import emul.implicits._

/** BEGIN UnitPipe x600_inr_UnitPipe **/
object x600_inr_UnitPipe_kernel {
  def run(
    b490: FixedPoint
  ): Unit = {
    val x573_rd_x470 = x470_COLS.value
    val x574_mul = b490 * x573_rd_x470
    val x575 = x574_mul << FixedPoint(BigDecimal("1"),FixFormat(true,16,0))
    val x5909 = x575 & FixedPoint(BigDecimal("63"),FixFormat(true,32,0))
    val x578 = x573_rd_x470 << FixedPoint(BigDecimal("1"),FixFormat(true,16,0))
    val x579_sub = x575 - x5909
    val x580_sum = x575 + x578
    val x5910 = x580_sum & FixedPoint(BigDecimal("63"),FixFormat(true,32,0))
    val x582 = x5910 === FixedPoint(BigDecimal("0"),FixFormat(true,32,0))
    val x583_sub = FixedPoint(BigDecimal("64"),FixFormat(true,32,0)) - x5910
    val x584 = if (x582) FixedPoint(BigDecimal("0"),FixFormat(true,32,0)) else x583_sub
    val x585 = x5909 >> FixedPoint(BigDecimal("1"),FixFormat(true,16,0))
    val x586 = x584 >> FixedPoint(BigDecimal("1"),FixFormat(true,16,0))
    val x587_sum = x585 + x573_rd_x470
    val x588_sum = x573_rd_x470 + x585
    val x589_sum = x588_sum + x586
    val x590_sum = x578 + x5909
    val x591_sum = x590_sum + x584
    val x592 = x579_sub.toFixedPoint(FixFormat(true,64,0))
    val x593 = FixedPoint.fromInt(0)
    val x594_sum = x592 + x593
    val x595_tuple: Struct2 = new Struct2(x594_sum, x591_sum, Bool(true,true))
    val x596 = true
    val x597 = {
      if (x596) x570.enqueue(x595_tuple)
    }
    val x598_tuple: Struct3 = new Struct3(x589_sum, x585, x587_sum)
    val x599_enq_x571 = {
      if (Bool(true,true)) x571_fifo.enqueue(x598_tuple)
    }
  } 
}
/** END UnitPipe x600_inr_UnitPipe **/
