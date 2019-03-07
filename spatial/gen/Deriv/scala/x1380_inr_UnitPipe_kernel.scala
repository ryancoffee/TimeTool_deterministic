import emul._
import emul.implicits._

/** BEGIN UnitPipe x1380_inr_UnitPipe **/
object x1380_inr_UnitPipe_kernel {
  def run(
    b503: FixedPoint
  ): Unit = {
    val x1353_rd_x470 = x470_COLS.value
    val x1354_mul = b503 * x1353_rd_x470
    val x1355 = x1354_mul << FixedPoint(BigDecimal("1"),FixFormat(true,16,0))
    val x5935 = x1355 & FixedPoint(BigDecimal("63"),FixFormat(true,32,0))
    val x1358 = x1353_rd_x470 << FixedPoint(BigDecimal("1"),FixFormat(true,16,0))
    val x1359_sub = x1355 - x5935
    val x1360_sum = x1355 + x1358
    val x5936 = x1360_sum & FixedPoint(BigDecimal("63"),FixFormat(true,32,0))
    val x1362 = x5936 === FixedPoint(BigDecimal("0"),FixFormat(true,32,0))
    val x1363_sub = FixedPoint(BigDecimal("64"),FixFormat(true,32,0)) - x5936
    val x1364 = if (x1362) FixedPoint(BigDecimal("0"),FixFormat(true,32,0)) else x1363_sub
    val x1365 = x5935 >> FixedPoint(BigDecimal("1"),FixFormat(true,16,0))
    val x1366 = x1364 >> FixedPoint(BigDecimal("1"),FixFormat(true,16,0))
    val x1367_sum = x1365 + x1353_rd_x470
    val x1368_sum = x1353_rd_x470 + x1365
    val x1369_sum = x1368_sum + x1366
    val x1370_sum = x1358 + x5935
    val x1371_sum = x1370_sum + x1364
    val x1372 = x1359_sub.toFixedPoint(FixFormat(true,64,0))
    val x1373 = FixedPoint.fromInt(0)
    val x1374_sum = x1372 + x1373
    val x1375_tuple: Struct2 = new Struct2(x1374_sum, x1371_sum, Bool(true,true))
    val x1376 = true
    val x1377 = {
      if (x1376) x1350.enqueue(x1375_tuple)
    }
    val x1378_tuple: Struct3 = new Struct3(x1369_sum, x1365, x1367_sum)
    val x1379_enq_x1351 = {
      if (Bool(true,true)) x1351_fifo.enqueue(x1378_tuple)
    }
  } 
}
/** END UnitPipe x1380_inr_UnitPipe **/
