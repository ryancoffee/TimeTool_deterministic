import emul._
import emul.implicits._

/** BEGIN UnrolledForeach x1866_inr_Foreach **/
object x1866_inr_Foreach_kernel {
  def run(
    b507: Bool,
    x1564_ctrchain: Array[Counterlike]
  ): Unit = if (b507){
    x1564_ctrchain(0).foreach{case (is,vs) => 
      val b1723 = is(0)
      val b1724 = vs(0)
      object Block2Chunker0 { // 74 nodes, 74 weight
        def gen(): Map[String, Any] = {
          val x1725_tuple: Struct1 = new Struct1(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)), FixedPoint(BigDecimal("-999"),FixFormat(true,32,0)))
          x1726_best_rising_0.initMem(x1725_tuple)
          x1727_best_rising_1.initMem(x1725_tuple)
          x1728_best_falling_0.initMem(x1725_tuple)
          x1729_best_falling_1.initMem(x1725_tuple)
          val x1731_deq_x523 = {
            val a0 = if (Bool(true,true) & b1724 & b507 && x523_input_fifo_0.nonEmpty) x523_input_fifo_0.dequeue() else FixedPoint.invalid(FixFormat(true,16,0))
            Array[FixedPoint](a0)
          }
          val x1732_elem_0 = x1731_deq_x523.apply(0)
          val x1733 = if (b1724 & b507) x1730_sr_0.shiftIn("Deriv.scala:97:14", Seq(FixedPoint(BigDecimal("0"),FixFormat(true,32,0))), 0, x1732_elem_0)
          val x1734 = x1730_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)))), Seq(b1724 & b507))
          val x1735_elem_0 = x1734.apply(0)
          val x1736 = x1735_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x1738 = x1730_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("1"),FixFormat(true,32,0)))), Seq(b1724 & b507))
          val x1739_elem_0 = x1738.apply(0)
          val x1740 = x1739_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x1741_x4 = FixedPoint(BigDecimal("0.000335693359375"),FixFormat(true,16,16)) * x1740
          val x1742 = x1730_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("2"),FixFormat(true,32,0)))), Seq(b1724 & b507))
          val x1743_elem_0 = x1742.apply(0)
          val x1744 = x1743_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x1746 = x1730_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("3"),FixFormat(true,32,0)))), Seq(b1724 & b507))
          val x1747_elem_0 = x1746.apply(0)
          val x1748 = x1747_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x1749_x4 = FixedPoint(BigDecimal("0.0084991455078125"),FixFormat(true,16,16)) * x1748
          val x1750 = x1730_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("4"),FixFormat(true,32,0)))), Seq(b1724 & b507))
          val x1751_elem_0 = x1750.apply(0)
          val x1752 = x1751_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x1754 = x1730_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("5"),FixFormat(true,32,0)))), Seq(b1724 & b507))
          val x1755_elem_0 = x1754.apply(0)
          val x1756 = x1755_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x1757_x4 = FixedPoint(BigDecimal("0.069122314453125"),FixFormat(true,16,16)) * x1756
          val x1758 = x1730_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("6"),FixFormat(true,32,0)))), Seq(b1724 & b507))
          val x1759_elem_0 = x1758.apply(0)
          val x1760 = x1759_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x1762 = x1730_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("7"),FixFormat(true,32,0)))), Seq(b1724 & b507))
          val x1763_elem_0 = x1762.apply(0)
          val x1764 = x1763_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x1765_x4 = FixedPoint(BigDecimal("0.1548919677734375"),FixFormat(true,16,16)) * x1764
          val x1766 = x1730_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("8"),FixFormat(true,32,0)))), Seq(b1724 & b507))
          val x1767_elem_0 = x1766.apply(0)
          val x1768 = x1767_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x1770 = x1730_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("10"),FixFormat(true,32,0)))), Seq(b1724 & b507))
          val x1771_elem_0 = x1770.apply(0)
          val x1772 = x1771_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x1774 = x1730_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("11"),FixFormat(true,32,0)))), Seq(b1724 & b507))
          val x1775_elem_0 = x1774.apply(0)
          val x1776 = x1775_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x1777_x4 = FixedPoint(BigDecimal("-0.1548919677734375"),FixFormat(true,16,16)) * x1776
          val x1778 = x1730_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("12"),FixFormat(true,32,0)))), Seq(b1724 & b507))
          val x1779_elem_0 = x1778.apply(0)
          val x1780 = x1779_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x1782 = x1730_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("13"),FixFormat(true,32,0)))), Seq(b1724 & b507))
          val x1783_elem_0 = x1782.apply(0)
          val x1784 = x1783_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x1785_x4 = FixedPoint(BigDecimal("-0.069122314453125"),FixFormat(true,16,16)) * x1784
          val x1786 = x1730_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("14"),FixFormat(true,32,0)))), Seq(b1724 & b507))
          val x1787_elem_0 = x1786.apply(0)
          val x1788 = x1787_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x1790 = x1730_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("15"),FixFormat(true,32,0)))), Seq(b1724 & b507))
          val x1791_elem_0 = x1790.apply(0)
          val x1792 = x1791_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x1793_x4 = FixedPoint(BigDecimal("-0.0084991455078125"),FixFormat(true,16,16)) * x1792
          val x1794 = x1730_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("16"),FixFormat(true,32,0)))), Seq(b1724 & b507))
          val x1795_elem_0 = x1794.apply(0)
          val x1796 = x1795_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x1798 = x1730_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("17"),FixFormat(true,32,0)))), Seq(b1724 & b507))
          val x1799_elem_0 = x1798.apply(0)
          val x1800 = x1799_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x1801_x4 = FixedPoint(BigDecimal("-0.000335693359375"),FixFormat(true,16,16)) * x1800
          val x1802 = x1730_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("18"),FixFormat(true,32,0)))), Seq(b1724 & b507))
          val x1803_elem_0 = x1802.apply(0)
          val x1804 = x1803_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x5951 = (FixedPoint(BigDecimal("0.0000457763671875"),FixFormat(true,16,16)) * x1736) + x1741_x4
          val x5952 = (FixedPoint(BigDecimal("0.001953125"),FixFormat(true,16,16)) * x1744) + x1749_x4
          val x5953 = (FixedPoint(BigDecimal("0.028045654296875"),FixFormat(true,16,16)) * x1752) + x1757_x4
          Map[String,Any]("x1760" -> x1760, "x1765_x4" -> x1765_x4, "x1768" -> x1768, "x1772" -> x1772, "x1777_x4" -> x1777_x4, "x1780" -> x1780, "x1785_x4" -> x1785_x4, "x1788" -> x1788, "x1793_x4" -> x1793_x4, "x1796" -> x1796, "x1801_x4" -> x1801_x4, "x1804" -> x1804, "x5951" -> x5951, "x5952" -> x5952, "x5953" -> x5953)
        }
      }
      val block2chunk0: Map[String, Any] = Block2Chunker0.gen()
      object Block2Chunker1 { // 39 nodes, 39 weight
        def gen(): Map[String, Any] = {
          val x5954 = (FixedPoint(BigDecimal("0.124359130859375"),FixFormat(true,16,16)) * block2chunk0("x1760").asInstanceOf[FixedPoint]) + block2chunk0("x1765_x4").asInstanceOf[FixedPoint]
          val x5955 = (FixedPoint(BigDecimal("-0.1126861572265625"),FixFormat(true,16,16)) * block2chunk0("x1772").asInstanceOf[FixedPoint]) + block2chunk0("x1777_x4").asInstanceOf[FixedPoint]
          val x5956 = (FixedPoint(BigDecimal("-0.124359130859375"),FixFormat(true,16,16)) * block2chunk0("x1780").asInstanceOf[FixedPoint]) + block2chunk0("x1785_x4").asInstanceOf[FixedPoint]
          val x5957 = (FixedPoint(BigDecimal("-0.028045654296875"),FixFormat(true,16,16)) * block2chunk0("x1788").asInstanceOf[FixedPoint]) + block2chunk0("x1793_x4").asInstanceOf[FixedPoint]
          val x5958 = (FixedPoint(BigDecimal("-0.001953125"),FixFormat(true,16,16)) * block2chunk0("x1796").asInstanceOf[FixedPoint]) + block2chunk0("x1801_x4").asInstanceOf[FixedPoint]
          val x1814_x3 = block2chunk0("x5951").asInstanceOf[FixedPoint] + block2chunk0("x5952").asInstanceOf[FixedPoint]
          val x1815_x4 = block2chunk0("x5953").asInstanceOf[FixedPoint] + x5954
          val x5959 = (FixedPoint(BigDecimal("0.1126861572265625"),FixFormat(true,16,16)) * block2chunk0("x1768").asInstanceOf[FixedPoint]) + x5955
          val x1817_x4 = x5956 + x5957
          val x5960 = (FixedPoint(BigDecimal("-0.0000457763671875"),FixFormat(true,16,16)) * block2chunk0("x1804").asInstanceOf[FixedPoint]) + x5958
          val x1819_x3 = x1814_x3 + x1815_x4
          val x1820_x4 = x5959 + x1817_x4
          val x1821_x3 = x1819_x3 + x1820_x4
          val x1822_t = x1821_x3 + x5960
          val x1823 = b1723 === FixedPoint(BigDecimal("20"),FixFormat(true,32,0))
          val x1824 = FixedPoint(BigDecimal("20"),FixFormat(true,32,0)) < b1723
          val x1825 = x1822_t.toFixedPoint(FixFormat(true,32,0))
          val x1826_rd_x1726 = x1726_best_rising_0.value
          val x1827_apply = x1826_rd_x1726.v
          val x1828 = x1827_apply < x1825
          val x1829 = x1824 && x1828
          val x1830 = x1823 || x1829
          val x1833_tuple: Struct1 = new Struct1(b1723, x1825)
          val x1834_wr_x1727 = if (x1830) x1727_best_rising_1.set(x1833_tuple)
          val x1835_wr_x1726 = if (x1830) x1726_best_rising_0.set(x1833_tuple)
          val x1839_rd_x1728 = x1728_best_falling_0.value
          val x1840_apply = x1839_rd_x1728.v
          val x1841 = x1825 < x1840_apply
          val x1842 = x1824 && x1841
          val x1843 = x1823 || x1842
          val x1847_wr_x1728 = if (x1843) x1728_best_falling_0.set(x1833_tuple)
          val x1848_wr_x1729 = if (x1843) x1729_best_falling_1.set(x1833_tuple)
          val x1852_rd_x470 = x470_COLS.value
          val x1853_sub = x1852_rd_x470 - FixedPoint(BigDecimal("1"),FixFormat(true,32,0))
          val x1854 = b1723 === x1853_sub
          val x1856_rd_x1727 = x1727_best_rising_1.value
          val x1857_enq_x539 = {
            if (Bool(true,true) & x1854) x539_rising_0.enqueue(x1856_rd_x1727)
          }
          val x1861_rd_x1729 = x1729_best_falling_1.value
          val x1862_enq_x555 = {
            if (Bool(true,true) & x1854) x555_falling_0.enqueue(x1861_rd_x1729)
          }
          Map[String,Any]()
        }
      }
      val block2chunk1: Map[String, Any] = Block2Chunker1.gen()
    }
  } else null.asInstanceOf[Unit]
}
/** END UnrolledForeach x1866_inr_Foreach **/
