import emul._
import emul.implicits._

/** BEGIN UnitPipe x1440_inr_UnitPipe **/
object x1440_inr_UnitPipe_kernel {
  def run(
    b504: FixedPoint
  ): Unit = {
    val x1413_rd_x470 = x470_COLS.value
    val x1414_mul = b504 * x1413_rd_x470
    val x1415 = x1414_mul << FixedPoint(BigDecimal("1"),FixFormat(true,16,0))
    val x5937 = x1415 & FixedPoint(BigDecimal("63"),FixFormat(true,32,0))
    val x1418 = x1413_rd_x470 << FixedPoint(BigDecimal("1"),FixFormat(true,16,0))
    val x1419_sub = x1415 - x5937
    val x1420_sum = x1415 + x1418
    val x5938 = x1420_sum & FixedPoint(BigDecimal("63"),FixFormat(true,32,0))
    val x1422 = x5938 === FixedPoint(BigDecimal("0"),FixFormat(true,32,0))
    val x1423_sub = FixedPoint(BigDecimal("64"),FixFormat(true,32,0)) - x5938
    val x1424 = if (x1422) FixedPoint(BigDecimal("0"),FixFormat(true,32,0)) else x1423_sub
    val x1425 = x5937 >> FixedPoint(BigDecimal("1"),FixFormat(true,16,0))
    val x1426 = x1424 >> FixedPoint(BigDecimal("1"),FixFormat(true,16,0))
    val x1427_sum = x1425 + x1413_rd_x470
    val x1428_sum = x1413_rd_x470 + x1425
    val x1429_sum = x1428_sum + x1426
    val x1430_sum = x1418 + x5937
    val x1431_sum = x1430_sum + x1424
    val x1432 = x1419_sub.toFixedPoint(FixFormat(true,64,0))
    val x1433 = FixedPoint.fromInt(0)
    val x1434_sum = x1432 + x1433
    val x1435_tuple: Struct2 = new Struct2(x1434_sum, x1431_sum, Bool(true,true))
    val x1436 = true
    val x1437 = {
      if (x1436) x1410.enqueue(x1435_tuple)
    }
    val x1438_tuple: Struct3 = new Struct3(x1429_sum, x1425, x1427_sum)
    val x1439_enq_x1411 = {
      if (Bool(true,true)) x1411_fifo.enqueue(x1438_tuple)
    }
  } 
}
/** END UnitPipe x1440_inr_UnitPipe **/
