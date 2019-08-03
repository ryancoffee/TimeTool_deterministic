import emul._
import emul.implicits._

/** BEGIN UnitPipe x900_inr_UnitPipe **/
object x900_inr_UnitPipe_kernel {
  def run(
    b495: FixedPoint
  ): Unit = {
    val x873_rd_x470 = x470_COLS.value
    val x874_mul = b495 * x873_rd_x470
    val x875 = x874_mul << FixedPoint(BigDecimal("1"),FixFormat(true,16,0))
    val x5919 = x875 & FixedPoint(BigDecimal("63"),FixFormat(true,32,0))
    val x878 = x873_rd_x470 << FixedPoint(BigDecimal("1"),FixFormat(true,16,0))
    val x879_sub = x875 - x5919
    val x880_sum = x875 + x878
    val x5920 = x880_sum & FixedPoint(BigDecimal("63"),FixFormat(true,32,0))
    val x882 = x5920 === FixedPoint(BigDecimal("0"),FixFormat(true,32,0))
    val x883_sub = FixedPoint(BigDecimal("64"),FixFormat(true,32,0)) - x5920
    val x884 = if (x882) FixedPoint(BigDecimal("0"),FixFormat(true,32,0)) else x883_sub
    val x885 = x5919 >> FixedPoint(BigDecimal("1"),FixFormat(true,16,0))
    val x886 = x884 >> FixedPoint(BigDecimal("1"),FixFormat(true,16,0))
    val x887_sum = x885 + x873_rd_x470
    val x888_sum = x873_rd_x470 + x885
    val x889_sum = x888_sum + x886
    val x890_sum = x878 + x5919
    val x891_sum = x890_sum + x884
    val x892 = x879_sub.toFixedPoint(FixFormat(true,64,0))
    val x893 = FixedPoint.fromInt(0)
    val x894_sum = x892 + x893
    val x895_tuple: Struct2 = new Struct2(x894_sum, x891_sum, Bool(true,true))
    val x896 = true
    val x897 = {
      if (x896) x870.enqueue(x895_tuple)
    }
    val x898_tuple: Struct3 = new Struct3(x889_sum, x885, x887_sum)
    val x899_enq_x871 = {
      if (Bool(true,true)) x871_fifo.enqueue(x898_tuple)
    }
  } 
}
/** END UnitPipe x900_inr_UnitPipe **/
