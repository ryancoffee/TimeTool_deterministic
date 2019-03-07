import emul._
import emul.implicits._

/** BEGIN UnitPipe x1140_inr_UnitPipe **/
object x1140_inr_UnitPipe_kernel {
  def run(
    b499: FixedPoint
  ): Unit = {
    val x1113_rd_x470 = x470_COLS.value
    val x1114_mul = b499 * x1113_rd_x470
    val x1115 = x1114_mul << FixedPoint(BigDecimal("1"),FixFormat(true,16,0))
    val x5927 = x1115 & FixedPoint(BigDecimal("63"),FixFormat(true,32,0))
    val x1118 = x1113_rd_x470 << FixedPoint(BigDecimal("1"),FixFormat(true,16,0))
    val x1119_sub = x1115 - x5927
    val x1120_sum = x1115 + x1118
    val x5928 = x1120_sum & FixedPoint(BigDecimal("63"),FixFormat(true,32,0))
    val x1122 = x5928 === FixedPoint(BigDecimal("0"),FixFormat(true,32,0))
    val x1123_sub = FixedPoint(BigDecimal("64"),FixFormat(true,32,0)) - x5928
    val x1124 = if (x1122) FixedPoint(BigDecimal("0"),FixFormat(true,32,0)) else x1123_sub
    val x1125 = x5927 >> FixedPoint(BigDecimal("1"),FixFormat(true,16,0))
    val x1126 = x1124 >> FixedPoint(BigDecimal("1"),FixFormat(true,16,0))
    val x1127_sum = x1125 + x1113_rd_x470
    val x1128_sum = x1113_rd_x470 + x1125
    val x1129_sum = x1128_sum + x1126
    val x1130_sum = x1118 + x5927
    val x1131_sum = x1130_sum + x1124
    val x1132 = x1119_sub.toFixedPoint(FixFormat(true,64,0))
    val x1133 = FixedPoint.fromInt(0)
    val x1134_sum = x1132 + x1133
    val x1135_tuple: Struct2 = new Struct2(x1134_sum, x1131_sum, Bool(true,true))
    val x1136 = true
    val x1137 = {
      if (x1136) x1110.enqueue(x1135_tuple)
    }
    val x1138_tuple: Struct3 = new Struct3(x1129_sum, x1125, x1127_sum)
    val x1139_enq_x1111 = {
      if (Bool(true,true)) x1111_fifo.enqueue(x1138_tuple)
    }
  } 
}
/** END UnitPipe x1140_inr_UnitPipe **/
