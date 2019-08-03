import emul._
import emul.implicits._

/** BEGIN UnitPipe x1080_inr_UnitPipe **/
object x1080_inr_UnitPipe_kernel {
  def run(
    b498: FixedPoint
  ): Unit = {
    val x1053_rd_x470 = x470_COLS.value
    val x1054_mul = b498 * x1053_rd_x470
    val x1055 = x1054_mul << FixedPoint(BigDecimal("1"),FixFormat(true,16,0))
    val x5925 = x1055 & FixedPoint(BigDecimal("63"),FixFormat(true,32,0))
    val x1058 = x1053_rd_x470 << FixedPoint(BigDecimal("1"),FixFormat(true,16,0))
    val x1059_sub = x1055 - x5925
    val x1060_sum = x1055 + x1058
    val x5926 = x1060_sum & FixedPoint(BigDecimal("63"),FixFormat(true,32,0))
    val x1062 = x5926 === FixedPoint(BigDecimal("0"),FixFormat(true,32,0))
    val x1063_sub = FixedPoint(BigDecimal("64"),FixFormat(true,32,0)) - x5926
    val x1064 = if (x1062) FixedPoint(BigDecimal("0"),FixFormat(true,32,0)) else x1063_sub
    val x1065 = x5925 >> FixedPoint(BigDecimal("1"),FixFormat(true,16,0))
    val x1066 = x1064 >> FixedPoint(BigDecimal("1"),FixFormat(true,16,0))
    val x1067_sum = x1065 + x1053_rd_x470
    val x1068_sum = x1053_rd_x470 + x1065
    val x1069_sum = x1068_sum + x1066
    val x1070_sum = x1058 + x5925
    val x1071_sum = x1070_sum + x1064
    val x1072 = x1059_sub.toFixedPoint(FixFormat(true,64,0))
    val x1073 = FixedPoint.fromInt(0)
    val x1074_sum = x1072 + x1073
    val x1075_tuple: Struct2 = new Struct2(x1074_sum, x1071_sum, Bool(true,true))
    val x1076 = true
    val x1077 = {
      if (x1076) x1050.enqueue(x1075_tuple)
    }
    val x1078_tuple: Struct3 = new Struct3(x1069_sum, x1065, x1067_sum)
    val x1079_enq_x1051 = {
      if (Bool(true,true)) x1051_fifo.enqueue(x1078_tuple)
    }
  } 
}
/** END UnitPipe x1080_inr_UnitPipe **/
