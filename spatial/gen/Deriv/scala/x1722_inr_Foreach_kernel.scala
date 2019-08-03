import emul._
import emul.implicits._

/** BEGIN UnrolledForeach x1722_inr_Foreach **/
object x1722_inr_Foreach_kernel {
  def run(
    x1563_ctrchain: Array[Counterlike],
    b506: Bool
  ): Unit = if (b506){
    x1563_ctrchain(0).foreach{case (is,vs) => 
      val b1579 = is(0)
      val b1580 = vs(0)
      object Block1Chunker0 { // 74 nodes, 74 weight
        def gen(): Map[String, Any] = {
          val x1581_tuple: Struct1 = new Struct1(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)), FixedPoint(BigDecimal("-999"),FixFormat(true,32,0)))
          x1582_best_rising_0.initMem(x1581_tuple)
          x1583_best_rising_1.initMem(x1581_tuple)
          x1584_best_falling_0.initMem(x1581_tuple)
          x1585_best_falling_1.initMem(x1581_tuple)
          val x1587_deq_x522 = {
            val a0 = if (Bool(true,true) & b1580 & b506 && x522_input_fifo_0.nonEmpty) x522_input_fifo_0.dequeue() else FixedPoint.invalid(FixFormat(true,16,0))
            Array[FixedPoint](a0)
          }
          val x1588_elem_0 = x1587_deq_x522.apply(0)
          val x1589 = if (b1580 & b506) x1586_sr_0.shiftIn("Deriv.scala:97:14", Seq(FixedPoint(BigDecimal("0"),FixFormat(true,32,0))), 0, x1588_elem_0)
          val x1590 = x1586_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)))), Seq(b1580 & b506))
          val x1591_elem_0 = x1590.apply(0)
          val x1592 = x1591_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x1594 = x1586_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("1"),FixFormat(true,32,0)))), Seq(b1580 & b506))
          val x1595_elem_0 = x1594.apply(0)
          val x1596 = x1595_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x1597_x4 = FixedPoint(BigDecimal("0.000335693359375"),FixFormat(true,16,16)) * x1596
          val x1598 = x1586_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("2"),FixFormat(true,32,0)))), Seq(b1580 & b506))
          val x1599_elem_0 = x1598.apply(0)
          val x1600 = x1599_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x1602 = x1586_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("3"),FixFormat(true,32,0)))), Seq(b1580 & b506))
          val x1603_elem_0 = x1602.apply(0)
          val x1604 = x1603_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x1605_x4 = FixedPoint(BigDecimal("0.0084991455078125"),FixFormat(true,16,16)) * x1604
          val x1606 = x1586_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("4"),FixFormat(true,32,0)))), Seq(b1580 & b506))
          val x1607_elem_0 = x1606.apply(0)
          val x1608 = x1607_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x1610 = x1586_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("5"),FixFormat(true,32,0)))), Seq(b1580 & b506))
          val x1611_elem_0 = x1610.apply(0)
          val x1612 = x1611_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x1613_x4 = FixedPoint(BigDecimal("0.069122314453125"),FixFormat(true,16,16)) * x1612
          val x1614 = x1586_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("6"),FixFormat(true,32,0)))), Seq(b1580 & b506))
          val x1615_elem_0 = x1614.apply(0)
          val x1616 = x1615_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x1618 = x1586_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("7"),FixFormat(true,32,0)))), Seq(b1580 & b506))
          val x1619_elem_0 = x1618.apply(0)
          val x1620 = x1619_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x1621_x4 = FixedPoint(BigDecimal("0.1548919677734375"),FixFormat(true,16,16)) * x1620
          val x1622 = x1586_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("8"),FixFormat(true,32,0)))), Seq(b1580 & b506))
          val x1623_elem_0 = x1622.apply(0)
          val x1624 = x1623_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x1626 = x1586_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("10"),FixFormat(true,32,0)))), Seq(b1580 & b506))
          val x1627_elem_0 = x1626.apply(0)
          val x1628 = x1627_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x1630 = x1586_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("11"),FixFormat(true,32,0)))), Seq(b1580 & b506))
          val x1631_elem_0 = x1630.apply(0)
          val x1632 = x1631_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x1633_x4 = FixedPoint(BigDecimal("-0.1548919677734375"),FixFormat(true,16,16)) * x1632
          val x1634 = x1586_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("12"),FixFormat(true,32,0)))), Seq(b1580 & b506))
          val x1635_elem_0 = x1634.apply(0)
          val x1636 = x1635_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x1638 = x1586_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("13"),FixFormat(true,32,0)))), Seq(b1580 & b506))
          val x1639_elem_0 = x1638.apply(0)
          val x1640 = x1639_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x1641_x4 = FixedPoint(BigDecimal("-0.069122314453125"),FixFormat(true,16,16)) * x1640
          val x1642 = x1586_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("14"),FixFormat(true,32,0)))), Seq(b1580 & b506))
          val x1643_elem_0 = x1642.apply(0)
          val x1644 = x1643_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x1646 = x1586_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("15"),FixFormat(true,32,0)))), Seq(b1580 & b506))
          val x1647_elem_0 = x1646.apply(0)
          val x1648 = x1647_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x1649_x4 = FixedPoint(BigDecimal("-0.0084991455078125"),FixFormat(true,16,16)) * x1648
          val x1650 = x1586_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("16"),FixFormat(true,32,0)))), Seq(b1580 & b506))
          val x1651_elem_0 = x1650.apply(0)
          val x1652 = x1651_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x1654 = x1586_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("17"),FixFormat(true,32,0)))), Seq(b1580 & b506))
          val x1655_elem_0 = x1654.apply(0)
          val x1656 = x1655_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x1657_x4 = FixedPoint(BigDecimal("-0.000335693359375"),FixFormat(true,16,16)) * x1656
          val x1658 = x1586_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("18"),FixFormat(true,32,0)))), Seq(b1580 & b506))
          val x1659_elem_0 = x1658.apply(0)
          val x1660 = x1659_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x5941 = (FixedPoint(BigDecimal("0.0000457763671875"),FixFormat(true,16,16)) * x1592) + x1597_x4
          val x5942 = (FixedPoint(BigDecimal("0.001953125"),FixFormat(true,16,16)) * x1600) + x1605_x4
          val x5943 = (FixedPoint(BigDecimal("0.028045654296875"),FixFormat(true,16,16)) * x1608) + x1613_x4
          Map[String,Any]("x1616" -> x1616, "x1621_x4" -> x1621_x4, "x1624" -> x1624, "x1628" -> x1628, "x1633_x4" -> x1633_x4, "x1636" -> x1636, "x1641_x4" -> x1641_x4, "x1644" -> x1644, "x1649_x4" -> x1649_x4, "x1652" -> x1652, "x1657_x4" -> x1657_x4, "x1660" -> x1660, "x5941" -> x5941, "x5942" -> x5942, "x5943" -> x5943)
        }
      }
      val block1chunk0: Map[String, Any] = Block1Chunker0.gen()
      object Block1Chunker1 { // 39 nodes, 39 weight
        def gen(): Map[String, Any] = {
          val x5944 = (FixedPoint(BigDecimal("0.124359130859375"),FixFormat(true,16,16)) * block1chunk0("x1616").asInstanceOf[FixedPoint]) + block1chunk0("x1621_x4").asInstanceOf[FixedPoint]
          val x5945 = (FixedPoint(BigDecimal("-0.1126861572265625"),FixFormat(true,16,16)) * block1chunk0("x1628").asInstanceOf[FixedPoint]) + block1chunk0("x1633_x4").asInstanceOf[FixedPoint]
          val x5946 = (FixedPoint(BigDecimal("-0.124359130859375"),FixFormat(true,16,16)) * block1chunk0("x1636").asInstanceOf[FixedPoint]) + block1chunk0("x1641_x4").asInstanceOf[FixedPoint]
          val x5947 = (FixedPoint(BigDecimal("-0.028045654296875"),FixFormat(true,16,16)) * block1chunk0("x1644").asInstanceOf[FixedPoint]) + block1chunk0("x1649_x4").asInstanceOf[FixedPoint]
          val x5948 = (FixedPoint(BigDecimal("-0.001953125"),FixFormat(true,16,16)) * block1chunk0("x1652").asInstanceOf[FixedPoint]) + block1chunk0("x1657_x4").asInstanceOf[FixedPoint]
          val x1670_x3 = block1chunk0("x5941").asInstanceOf[FixedPoint] + block1chunk0("x5942").asInstanceOf[FixedPoint]
          val x1671_x4 = block1chunk0("x5943").asInstanceOf[FixedPoint] + x5944
          val x5949 = (FixedPoint(BigDecimal("0.1126861572265625"),FixFormat(true,16,16)) * block1chunk0("x1624").asInstanceOf[FixedPoint]) + x5945
          val x1673_x4 = x5946 + x5947
          val x5950 = (FixedPoint(BigDecimal("-0.0000457763671875"),FixFormat(true,16,16)) * block1chunk0("x1660").asInstanceOf[FixedPoint]) + x5948
          val x1675_x3 = x1670_x3 + x1671_x4
          val x1676_x4 = x5949 + x1673_x4
          val x1677_x3 = x1675_x3 + x1676_x4
          val x1678_t = x1677_x3 + x5950
          val x1679 = b1579 === FixedPoint(BigDecimal("20"),FixFormat(true,32,0))
          val x1680 = FixedPoint(BigDecimal("20"),FixFormat(true,32,0)) < b1579
          val x1681 = x1678_t.toFixedPoint(FixFormat(true,32,0))
          val x1682_rd_x1582 = x1582_best_rising_0.value
          val x1683_apply = x1682_rd_x1582.v
          val x1684 = x1683_apply < x1681
          val x1685 = x1680 && x1684
          val x1686 = x1679 || x1685
          val x1689_tuple: Struct1 = new Struct1(b1579, x1681)
          val x1690_wr_x1583 = if (x1686) x1583_best_rising_1.set(x1689_tuple)
          val x1691_wr_x1582 = if (x1686) x1582_best_rising_0.set(x1689_tuple)
          val x1695_rd_x1584 = x1584_best_falling_0.value
          val x1696_apply = x1695_rd_x1584.v
          val x1697 = x1681 < x1696_apply
          val x1698 = x1680 && x1697
          val x1699 = x1679 || x1698
          val x1703_wr_x1584 = if (x1699) x1584_best_falling_0.set(x1689_tuple)
          val x1704_wr_x1585 = if (x1699) x1585_best_falling_1.set(x1689_tuple)
          val x1708_rd_x470 = x470_COLS.value
          val x1709_sub = x1708_rd_x470 - FixedPoint(BigDecimal("1"),FixFormat(true,32,0))
          val x1710 = b1579 === x1709_sub
          val x1712_rd_x1583 = x1583_best_rising_1.value
          val x1713_enq_x538 = {
            if (Bool(true,true) & x1710) x538_rising_0.enqueue(x1712_rd_x1583)
          }
          val x1717_rd_x1585 = x1585_best_falling_1.value
          val x1718_enq_x554 = {
            if (Bool(true,true) & x1710) x554_falling_0.enqueue(x1717_rd_x1585)
          }
          Map[String,Any]()
        }
      }
      val block1chunk1: Map[String, Any] = Block1Chunker1.gen()
    }
  } else null.asInstanceOf[Unit]
}
/** END UnrolledForeach x1722_inr_Foreach **/
