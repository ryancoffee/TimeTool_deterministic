import emul._
import emul.implicits._

/** BEGIN UnitPipe x1200_inr_UnitPipe **/
object x1200_inr_UnitPipe_kernel {
  def run(
    b500: FixedPoint
  ): Unit = {
    val x1173_rd_x470 = x470_COLS.value
    val x1174_mul = b500 * x1173_rd_x470
    val x1175 = x1174_mul << FixedPoint(BigDecimal("1"),FixFormat(true,16,0))
    val x5929 = x1175 & FixedPoint(BigDecimal("63"),FixFormat(true,32,0))
    val x1178 = x1173_rd_x470 << FixedPoint(BigDecimal("1"),FixFormat(true,16,0))
    val x1179_sub = x1175 - x5929
    val x1180_sum = x1175 + x1178
    val x5930 = x1180_sum & FixedPoint(BigDecimal("63"),FixFormat(true,32,0))
    val x1182 = x5930 === FixedPoint(BigDecimal("0"),FixFormat(true,32,0))
    val x1183_sub = FixedPoint(BigDecimal("64"),FixFormat(true,32,0)) - x5930
    val x1184 = if (x1182) FixedPoint(BigDecimal("0"),FixFormat(true,32,0)) else x1183_sub
    val x1185 = x5929 >> FixedPoint(BigDecimal("1"),FixFormat(true,16,0))
    val x1186 = x1184 >> FixedPoint(BigDecimal("1"),FixFormat(true,16,0))
    val x1187_sum = x1185 + x1173_rd_x470
    val x1188_sum = x1173_rd_x470 + x1185
    val x1189_sum = x1188_sum + x1186
    val x1190_sum = x1178 + x5929
    val x1191_sum = x1190_sum + x1184
    val x1192 = x1179_sub.toFixedPoint(FixFormat(true,64,0))
    val x1193 = FixedPoint.fromInt(0)
    val x1194_sum = x1192 + x1193
    val x1195_tuple: Struct2 = new Struct2(x1194_sum, x1191_sum, Bool(true,true))
    val x1196 = true
    val x1197 = {
      if (x1196) x1170.enqueue(x1195_tuple)
    }
    val x1198_tuple: Struct3 = new Struct3(x1189_sum, x1185, x1187_sum)
    val x1199_enq_x1171 = {
      if (Bool(true,true)) x1171_fifo.enqueue(x1198_tuple)
    }
  } 
}
/** END UnitPipe x1200_inr_UnitPipe **/
