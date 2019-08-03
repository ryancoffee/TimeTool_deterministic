import emul._
import emul.implicits._

/** BEGIN UnitPipe x1500_inr_UnitPipe **/
object x1500_inr_UnitPipe_kernel {
  def run(
    b505: FixedPoint
  ): Unit = {
    val x1473_rd_x470 = x470_COLS.value
    val x1474_mul = b505 * x1473_rd_x470
    val x1475 = x1474_mul << FixedPoint(BigDecimal("1"),FixFormat(true,16,0))
    val x5939 = x1475 & FixedPoint(BigDecimal("63"),FixFormat(true,32,0))
    val x1478 = x1473_rd_x470 << FixedPoint(BigDecimal("1"),FixFormat(true,16,0))
    val x1479_sub = x1475 - x5939
    val x1480_sum = x1475 + x1478
    val x5940 = x1480_sum & FixedPoint(BigDecimal("63"),FixFormat(true,32,0))
    val x1482 = x5940 === FixedPoint(BigDecimal("0"),FixFormat(true,32,0))
    val x1483_sub = FixedPoint(BigDecimal("64"),FixFormat(true,32,0)) - x5940
    val x1484 = if (x1482) FixedPoint(BigDecimal("0"),FixFormat(true,32,0)) else x1483_sub
    val x1485 = x5939 >> FixedPoint(BigDecimal("1"),FixFormat(true,16,0))
    val x1486 = x1484 >> FixedPoint(BigDecimal("1"),FixFormat(true,16,0))
    val x1487_sum = x1485 + x1473_rd_x470
    val x1488_sum = x1473_rd_x470 + x1485
    val x1489_sum = x1488_sum + x1486
    val x1490_sum = x1478 + x5939
    val x1491_sum = x1490_sum + x1484
    val x1492 = x1479_sub.toFixedPoint(FixFormat(true,64,0))
    val x1493 = FixedPoint.fromInt(0)
    val x1494_sum = x1492 + x1493
    val x1495_tuple: Struct2 = new Struct2(x1494_sum, x1491_sum, Bool(true,true))
    val x1496 = true
    val x1497 = {
      if (x1496) x1470.enqueue(x1495_tuple)
    }
    val x1498_tuple: Struct3 = new Struct3(x1489_sum, x1485, x1487_sum)
    val x1499_enq_x1471 = {
      if (Bool(true,true)) x1471_fifo.enqueue(x1498_tuple)
    }
  } 
}
/** END UnitPipe x1500_inr_UnitPipe **/
