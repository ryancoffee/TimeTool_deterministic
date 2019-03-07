import emul._
import emul.implicits._

/** BEGIN UnrolledForeach x5789_outr_Foreach **/
object x5789_outr_Foreach_kernel {
  def run(
    x489_ctrchain: Array[Counterlike]
  ): Unit = {
    x489_ctrchain(0).foreach{case (is,vs) => 
      val b490 = is(0)
      val b491 = is(1)
      val b492 = is(2)
      val b493 = is(3)
      val b494 = is(4)
      val b495 = is(5)
      val b496 = is(6)
      val b497 = is(7)
      val b498 = is(8)
      val b499 = is(9)
      val b500 = is(10)
      val b501 = is(11)
      val b502 = is(12)
      val b503 = is(13)
      val b504 = is(14)
      val b505 = is(15)
      val b506 = vs(0)
      val b507 = vs(1)
      val b508 = vs(2)
      val b509 = vs(3)
      val b510 = vs(4)
      val b511 = vs(5)
      val b512 = vs(6)
      val b513 = vs(7)
      val b514 = vs(8)
      val b515 = vs(9)
      val b516 = vs(10)
      val b517 = vs(11)
      val b518 = vs(12)
      val b519 = vs(13)
      val b520 = vs(14)
      val b521 = vs(15)
      val x1530 = x1530_kernel.run(b518, b511, b500, b504, b492, b514, b507, b512, b493, b519, b499, b515, b503, b508, b513, b498, b509, b494, b520, b521, b505, b490, b516, b502, b497, b495, b517, b510, b506, b501, b491, b496)
      val x5829_rd_x470 = x470_COLS.value
      val x1547_ctr = Counter(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)), x5829_rd_x470, FixedPoint(BigDecimal("1"),FixFormat(true,32,0)), FixedPoint(BigDecimal("1"),FixFormat(true,32,0)))
      val x5830_rd_x470 = x470_COLS.value
      val x1548_ctr = Counter(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)), x5830_rd_x470, FixedPoint(BigDecimal("1"),FixFormat(true,32,0)), FixedPoint(BigDecimal("1"),FixFormat(true,32,0)))
      val x5831_rd_x470 = x470_COLS.value
      val x1549_ctr = Counter(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)), x5831_rd_x470, FixedPoint(BigDecimal("1"),FixFormat(true,32,0)), FixedPoint(BigDecimal("1"),FixFormat(true,32,0)))
      val x5832_rd_x470 = x470_COLS.value
      val x1550_ctr = Counter(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)), x5832_rd_x470, FixedPoint(BigDecimal("1"),FixFormat(true,32,0)), FixedPoint(BigDecimal("1"),FixFormat(true,32,0)))
      val x5833_rd_x470 = x470_COLS.value
      val x1551_ctr = Counter(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)), x5833_rd_x470, FixedPoint(BigDecimal("1"),FixFormat(true,32,0)), FixedPoint(BigDecimal("1"),FixFormat(true,32,0)))
      val x5834_rd_x470 = x470_COLS.value
      val x1552_ctr = Counter(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)), x5834_rd_x470, FixedPoint(BigDecimal("1"),FixFormat(true,32,0)), FixedPoint(BigDecimal("1"),FixFormat(true,32,0)))
      val x5835_rd_x470 = x470_COLS.value
      val x1553_ctr = Counter(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)), x5835_rd_x470, FixedPoint(BigDecimal("1"),FixFormat(true,32,0)), FixedPoint(BigDecimal("1"),FixFormat(true,32,0)))
      val x5836_rd_x470 = x470_COLS.value
      val x1554_ctr = Counter(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)), x5836_rd_x470, FixedPoint(BigDecimal("1"),FixFormat(true,32,0)), FixedPoint(BigDecimal("1"),FixFormat(true,32,0)))
      val x5837_rd_x470 = x470_COLS.value
      val x1555_ctr = Counter(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)), x5837_rd_x470, FixedPoint(BigDecimal("1"),FixFormat(true,32,0)), FixedPoint(BigDecimal("1"),FixFormat(true,32,0)))
      val x5838_rd_x470 = x470_COLS.value
      val x1556_ctr = Counter(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)), x5838_rd_x470, FixedPoint(BigDecimal("1"),FixFormat(true,32,0)), FixedPoint(BigDecimal("1"),FixFormat(true,32,0)))
      val x5839_rd_x470 = x470_COLS.value
      val x1557_ctr = Counter(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)), x5839_rd_x470, FixedPoint(BigDecimal("1"),FixFormat(true,32,0)), FixedPoint(BigDecimal("1"),FixFormat(true,32,0)))
      val x5840_rd_x470 = x470_COLS.value
      val x1558_ctr = Counter(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)), x5840_rd_x470, FixedPoint(BigDecimal("1"),FixFormat(true,32,0)), FixedPoint(BigDecimal("1"),FixFormat(true,32,0)))
      val x5841_rd_x470 = x470_COLS.value
      val x1559_ctr = Counter(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)), x5841_rd_x470, FixedPoint(BigDecimal("1"),FixFormat(true,32,0)), FixedPoint(BigDecimal("1"),FixFormat(true,32,0)))
      val x5842_rd_x470 = x470_COLS.value
      val x1560_ctr = Counter(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)), x5842_rd_x470, FixedPoint(BigDecimal("1"),FixFormat(true,32,0)), FixedPoint(BigDecimal("1"),FixFormat(true,32,0)))
      val x5843_rd_x470 = x470_COLS.value
      val x1561_ctr = Counter(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)), x5843_rd_x470, FixedPoint(BigDecimal("1"),FixFormat(true,32,0)), FixedPoint(BigDecimal("1"),FixFormat(true,32,0)))
      val x5844_rd_x470 = x470_COLS.value
      val x1562_ctr = Counter(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)), x5844_rd_x470, FixedPoint(BigDecimal("1"),FixFormat(true,32,0)), FixedPoint(BigDecimal("1"),FixFormat(true,32,0)))
      val x1563_ctrchain = Array[Counterlike](x1547_ctr)
      val x1564_ctrchain = Array[Counterlike](x1548_ctr)
      val x1565_ctrchain = Array[Counterlike](x1549_ctr)
      val x1566_ctrchain = Array[Counterlike](x1550_ctr)
      val x1567_ctrchain = Array[Counterlike](x1551_ctr)
      val x1568_ctrchain = Array[Counterlike](x1552_ctr)
      val x1569_ctrchain = Array[Counterlike](x1553_ctr)
      val x1570_ctrchain = Array[Counterlike](x1554_ctr)
      val x1571_ctrchain = Array[Counterlike](x1555_ctr)
      val x1572_ctrchain = Array[Counterlike](x1556_ctr)
      val x1573_ctrchain = Array[Counterlike](x1557_ctr)
      val x1574_ctrchain = Array[Counterlike](x1558_ctr)
      val x1575_ctrchain = Array[Counterlike](x1559_ctr)
      val x1576_ctrchain = Array[Counterlike](x1560_ctr)
      val x1577_ctrchain = Array[Counterlike](x1561_ctr)
      val x1578_ctrchain = Array[Counterlike](x1562_ctr)
      val x3883 = x3883_kernel.run(b518, x1569_ctrchain, b511, x1576_ctrchain, x1577_ctrchain, x1572_ctrchain, x1568_ctrchain, b514, b507, x1564_ctrchain, b512, x1570_ctrchain, x1573_ctrchain, b519, x1567_ctrchain, b515, b508, x1563_ctrchain, b513, x1574_ctrchain, b509, x1571_ctrchain, b520, b521, b516, x1566_ctrchain, x1575_ctrchain, b517, b510, x1578_ctrchain, b506, x1565_ctrchain)
      val x5788 = x5788_kernel.run(b518, b511, b500, b504, b492, b514, b507, b512, b493, b519, b499, b515, b503, b508, b513, b498, b509, b494, b520, b521, b505, b490, b516, b502, b497, b495, b517, b510, b506, b501, b491, b496)
    }
  } 
}
/** END UnrolledForeach x5789_outr_Foreach **/
