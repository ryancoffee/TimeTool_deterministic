import emul._
import emul.implicits._

/** BEGIN UnitPipe x1260_inr_UnitPipe **/
object x1260_inr_UnitPipe_kernel {
  def run(
    b501: FixedPoint
  ): Unit = {
    val x1233_rd_x470 = x470_COLS.value
    val x1234_mul = b501 * x1233_rd_x470
    val x1235 = x1234_mul << FixedPoint(BigDecimal("1"),FixFormat(true,16,0))
    val x5931 = x1235 & FixedPoint(BigDecimal("63"),FixFormat(true,32,0))
    val x1238 = x1233_rd_x470 << FixedPoint(BigDecimal("1"),FixFormat(true,16,0))
    val x1239_sub = x1235 - x5931
    val x1240_sum = x1235 + x1238
    val x5932 = x1240_sum & FixedPoint(BigDecimal("63"),FixFormat(true,32,0))
    val x1242 = x5932 === FixedPoint(BigDecimal("0"),FixFormat(true,32,0))
    val x1243_sub = FixedPoint(BigDecimal("64"),FixFormat(true,32,0)) - x5932
    val x1244 = if (x1242) FixedPoint(BigDecimal("0"),FixFormat(true,32,0)) else x1243_sub
    val x1245 = x5931 >> FixedPoint(BigDecimal("1"),FixFormat(true,16,0))
    val x1246 = x1244 >> FixedPoint(BigDecimal("1"),FixFormat(true,16,0))
    val x1247_sum = x1245 + x1233_rd_x470
    val x1248_sum = x1233_rd_x470 + x1245
    val x1249_sum = x1248_sum + x1246
    val x1250_sum = x1238 + x5931
    val x1251_sum = x1250_sum + x1244
    val x1252 = x1239_sub.toFixedPoint(FixFormat(true,64,0))
    val x1253 = FixedPoint.fromInt(0)
    val x1254_sum = x1252 + x1253
    val x1255_tuple: Struct2 = new Struct2(x1254_sum, x1251_sum, Bool(true,true))
    val x1256 = true
    val x1257 = {
      if (x1256) x1230.enqueue(x1255_tuple)
    }
    val x1258_tuple: Struct3 = new Struct3(x1249_sum, x1245, x1247_sum)
    val x1259_enq_x1231 = {
      if (Bool(true,true)) x1231_fifo.enqueue(x1258_tuple)
    }
  } 
}
/** END UnitPipe x1260_inr_UnitPipe **/
