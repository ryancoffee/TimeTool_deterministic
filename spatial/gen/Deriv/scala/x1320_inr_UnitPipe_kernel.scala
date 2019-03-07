import emul._
import emul.implicits._

/** BEGIN UnitPipe x1320_inr_UnitPipe **/
object x1320_inr_UnitPipe_kernel {
  def run(
    b502: FixedPoint
  ): Unit = {
    val x1293_rd_x470 = x470_COLS.value
    val x1294_mul = b502 * x1293_rd_x470
    val x1295 = x1294_mul << FixedPoint(BigDecimal("1"),FixFormat(true,16,0))
    val x5933 = x1295 & FixedPoint(BigDecimal("63"),FixFormat(true,32,0))
    val x1298 = x1293_rd_x470 << FixedPoint(BigDecimal("1"),FixFormat(true,16,0))
    val x1299_sub = x1295 - x5933
    val x1300_sum = x1295 + x1298
    val x5934 = x1300_sum & FixedPoint(BigDecimal("63"),FixFormat(true,32,0))
    val x1302 = x5934 === FixedPoint(BigDecimal("0"),FixFormat(true,32,0))
    val x1303_sub = FixedPoint(BigDecimal("64"),FixFormat(true,32,0)) - x5934
    val x1304 = if (x1302) FixedPoint(BigDecimal("0"),FixFormat(true,32,0)) else x1303_sub
    val x1305 = x5933 >> FixedPoint(BigDecimal("1"),FixFormat(true,16,0))
    val x1306 = x1304 >> FixedPoint(BigDecimal("1"),FixFormat(true,16,0))
    val x1307_sum = x1305 + x1293_rd_x470
    val x1308_sum = x1293_rd_x470 + x1305
    val x1309_sum = x1308_sum + x1306
    val x1310_sum = x1298 + x5933
    val x1311_sum = x1310_sum + x1304
    val x1312 = x1299_sub.toFixedPoint(FixFormat(true,64,0))
    val x1313 = FixedPoint.fromInt(0)
    val x1314_sum = x1312 + x1313
    val x1315_tuple: Struct2 = new Struct2(x1314_sum, x1311_sum, Bool(true,true))
    val x1316 = true
    val x1317 = {
      if (x1316) x1290.enqueue(x1315_tuple)
    }
    val x1318_tuple: Struct3 = new Struct3(x1309_sum, x1305, x1307_sum)
    val x1319_enq_x1291 = {
      if (Bool(true,true)) x1291_fifo.enqueue(x1318_tuple)
    }
  } 
}
/** END UnitPipe x1320_inr_UnitPipe **/
