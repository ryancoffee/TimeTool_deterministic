import emul._
import emul.implicits._

/** BEGIN UnitPipe x720_inr_UnitPipe **/
object x720_inr_UnitPipe_kernel {
  def run(
    b492: FixedPoint
  ): Unit = {
    val x693_rd_x470 = x470_COLS.value
    val x694_mul = b492 * x693_rd_x470
    val x695 = x694_mul << FixedPoint(BigDecimal("1"),FixFormat(true,16,0))
    val x5913 = x695 & FixedPoint(BigDecimal("63"),FixFormat(true,32,0))
    val x698 = x693_rd_x470 << FixedPoint(BigDecimal("1"),FixFormat(true,16,0))
    val x699_sub = x695 - x5913
    val x700_sum = x695 + x698
    val x5914 = x700_sum & FixedPoint(BigDecimal("63"),FixFormat(true,32,0))
    val x702 = x5914 === FixedPoint(BigDecimal("0"),FixFormat(true,32,0))
    val x703_sub = FixedPoint(BigDecimal("64"),FixFormat(true,32,0)) - x5914
    val x704 = if (x702) FixedPoint(BigDecimal("0"),FixFormat(true,32,0)) else x703_sub
    val x705 = x5913 >> FixedPoint(BigDecimal("1"),FixFormat(true,16,0))
    val x706 = x704 >> FixedPoint(BigDecimal("1"),FixFormat(true,16,0))
    val x707_sum = x705 + x693_rd_x470
    val x708_sum = x693_rd_x470 + x705
    val x709_sum = x708_sum + x706
    val x710_sum = x698 + x5913
    val x711_sum = x710_sum + x704
    val x712 = x699_sub.toFixedPoint(FixFormat(true,64,0))
    val x713 = FixedPoint.fromInt(0)
    val x714_sum = x712 + x713
    val x715_tuple: Struct2 = new Struct2(x714_sum, x711_sum, Bool(true,true))
    val x716 = true
    val x717 = {
      if (x716) x690.enqueue(x715_tuple)
    }
    val x718_tuple: Struct3 = new Struct3(x709_sum, x705, x707_sum)
    val x719_enq_x691 = {
      if (Bool(true,true)) x691_fifo.enqueue(x718_tuple)
    }
  } 
}
/** END UnitPipe x720_inr_UnitPipe **/
