import emul._
import emul.implicits._

/** BEGIN UnitPipe x840_inr_UnitPipe **/
object x840_inr_UnitPipe_kernel {
  def run(
    b494: FixedPoint
  ): Unit = {
    val x813_rd_x470 = x470_COLS.value
    val x814_mul = b494 * x813_rd_x470
    val x815 = x814_mul << FixedPoint(BigDecimal("1"),FixFormat(true,16,0))
    val x5917 = x815 & FixedPoint(BigDecimal("63"),FixFormat(true,32,0))
    val x818 = x813_rd_x470 << FixedPoint(BigDecimal("1"),FixFormat(true,16,0))
    val x819_sub = x815 - x5917
    val x820_sum = x815 + x818
    val x5918 = x820_sum & FixedPoint(BigDecimal("63"),FixFormat(true,32,0))
    val x822 = x5918 === FixedPoint(BigDecimal("0"),FixFormat(true,32,0))
    val x823_sub = FixedPoint(BigDecimal("64"),FixFormat(true,32,0)) - x5918
    val x824 = if (x822) FixedPoint(BigDecimal("0"),FixFormat(true,32,0)) else x823_sub
    val x825 = x5917 >> FixedPoint(BigDecimal("1"),FixFormat(true,16,0))
    val x826 = x824 >> FixedPoint(BigDecimal("1"),FixFormat(true,16,0))
    val x827_sum = x825 + x813_rd_x470
    val x828_sum = x813_rd_x470 + x825
    val x829_sum = x828_sum + x826
    val x830_sum = x818 + x5917
    val x831_sum = x830_sum + x824
    val x832 = x819_sub.toFixedPoint(FixFormat(true,64,0))
    val x833 = FixedPoint.fromInt(0)
    val x834_sum = x832 + x833
    val x835_tuple: Struct2 = new Struct2(x834_sum, x831_sum, Bool(true,true))
    val x836 = true
    val x837 = {
      if (x836) x810.enqueue(x835_tuple)
    }
    val x838_tuple: Struct3 = new Struct3(x829_sum, x825, x827_sum)
    val x839_enq_x811 = {
      if (Bool(true,true)) x811_fifo.enqueue(x838_tuple)
    }
  } 
}
/** END UnitPipe x840_inr_UnitPipe **/
