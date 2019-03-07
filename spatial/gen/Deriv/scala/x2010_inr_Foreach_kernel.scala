import emul._
import emul.implicits._

/** BEGIN UnrolledForeach x2010_inr_Foreach **/
object x2010_inr_Foreach_kernel {
  def run(
    b508: Bool,
    x1565_ctrchain: Array[Counterlike]
  ): Unit = if (b508){
    x1565_ctrchain(0).foreach{case (is,vs) => 
      val b1867 = is(0)
      val b1868 = vs(0)
      object Block3Chunker0 { // 74 nodes, 74 weight
        def gen(): Map[String, Any] = {
          val x1869_tuple: Struct1 = new Struct1(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)), FixedPoint(BigDecimal("-999"),FixFormat(true,32,0)))
          x1870_best_rising_0.initMem(x1869_tuple)
          x1871_best_rising_1.initMem(x1869_tuple)
          x1872_best_falling_0.initMem(x1869_tuple)
          x1873_best_falling_1.initMem(x1869_tuple)
          val x1875_deq_x524 = {
            val a0 = if (Bool(true,true) & b1868 & b508 && x524_input_fifo_0.nonEmpty) x524_input_fifo_0.dequeue() else FixedPoint.invalid(FixFormat(true,16,0))
            Array[FixedPoint](a0)
          }
          val x1876_elem_0 = x1875_deq_x524.apply(0)
          val x1877 = if (b1868 & b508) x1874_sr_0.shiftIn("Deriv.scala:97:14", Seq(FixedPoint(BigDecimal("0"),FixFormat(true,32,0))), 0, x1876_elem_0)
          val x1878 = x1874_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)))), Seq(b1868 & b508))
          val x1879_elem_0 = x1878.apply(0)
          val x1880 = x1879_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x1882 = x1874_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("1"),FixFormat(true,32,0)))), Seq(b1868 & b508))
          val x1883_elem_0 = x1882.apply(0)
          val x1884 = x1883_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x1885_x4 = FixedPoint(BigDecimal("0.000335693359375"),FixFormat(true,16,16)) * x1884
          val x1886 = x1874_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("2"),FixFormat(true,32,0)))), Seq(b1868 & b508))
          val x1887_elem_0 = x1886.apply(0)
          val x1888 = x1887_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x1890 = x1874_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("3"),FixFormat(true,32,0)))), Seq(b1868 & b508))
          val x1891_elem_0 = x1890.apply(0)
          val x1892 = x1891_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x1893_x4 = FixedPoint(BigDecimal("0.0084991455078125"),FixFormat(true,16,16)) * x1892
          val x1894 = x1874_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("4"),FixFormat(true,32,0)))), Seq(b1868 & b508))
          val x1895_elem_0 = x1894.apply(0)
          val x1896 = x1895_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x1898 = x1874_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("5"),FixFormat(true,32,0)))), Seq(b1868 & b508))
          val x1899_elem_0 = x1898.apply(0)
          val x1900 = x1899_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x1901_x4 = FixedPoint(BigDecimal("0.069122314453125"),FixFormat(true,16,16)) * x1900
          val x1902 = x1874_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("6"),FixFormat(true,32,0)))), Seq(b1868 & b508))
          val x1903_elem_0 = x1902.apply(0)
          val x1904 = x1903_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x1906 = x1874_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("7"),FixFormat(true,32,0)))), Seq(b1868 & b508))
          val x1907_elem_0 = x1906.apply(0)
          val x1908 = x1907_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x1909_x4 = FixedPoint(BigDecimal("0.1548919677734375"),FixFormat(true,16,16)) * x1908
          val x1910 = x1874_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("8"),FixFormat(true,32,0)))), Seq(b1868 & b508))
          val x1911_elem_0 = x1910.apply(0)
          val x1912 = x1911_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x1914 = x1874_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("10"),FixFormat(true,32,0)))), Seq(b1868 & b508))
          val x1915_elem_0 = x1914.apply(0)
          val x1916 = x1915_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x1918 = x1874_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("11"),FixFormat(true,32,0)))), Seq(b1868 & b508))
          val x1919_elem_0 = x1918.apply(0)
          val x1920 = x1919_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x1921_x4 = FixedPoint(BigDecimal("-0.1548919677734375"),FixFormat(true,16,16)) * x1920
          val x1922 = x1874_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("12"),FixFormat(true,32,0)))), Seq(b1868 & b508))
          val x1923_elem_0 = x1922.apply(0)
          val x1924 = x1923_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x1926 = x1874_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("13"),FixFormat(true,32,0)))), Seq(b1868 & b508))
          val x1927_elem_0 = x1926.apply(0)
          val x1928 = x1927_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x1929_x4 = FixedPoint(BigDecimal("-0.069122314453125"),FixFormat(true,16,16)) * x1928
          val x1930 = x1874_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("14"),FixFormat(true,32,0)))), Seq(b1868 & b508))
          val x1931_elem_0 = x1930.apply(0)
          val x1932 = x1931_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x1934 = x1874_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("15"),FixFormat(true,32,0)))), Seq(b1868 & b508))
          val x1935_elem_0 = x1934.apply(0)
          val x1936 = x1935_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x1937_x4 = FixedPoint(BigDecimal("-0.0084991455078125"),FixFormat(true,16,16)) * x1936
          val x1938 = x1874_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("16"),FixFormat(true,32,0)))), Seq(b1868 & b508))
          val x1939_elem_0 = x1938.apply(0)
          val x1940 = x1939_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x1942 = x1874_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("17"),FixFormat(true,32,0)))), Seq(b1868 & b508))
          val x1943_elem_0 = x1942.apply(0)
          val x1944 = x1943_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x1945_x4 = FixedPoint(BigDecimal("-0.000335693359375"),FixFormat(true,16,16)) * x1944
          val x1946 = x1874_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("18"),FixFormat(true,32,0)))), Seq(b1868 & b508))
          val x1947_elem_0 = x1946.apply(0)
          val x1948 = x1947_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x5961 = (FixedPoint(BigDecimal("0.0000457763671875"),FixFormat(true,16,16)) * x1880) + x1885_x4
          val x5962 = (FixedPoint(BigDecimal("0.001953125"),FixFormat(true,16,16)) * x1888) + x1893_x4
          val x5963 = (FixedPoint(BigDecimal("0.028045654296875"),FixFormat(true,16,16)) * x1896) + x1901_x4
          Map[String,Any]("x1904" -> x1904, "x1909_x4" -> x1909_x4, "x1912" -> x1912, "x1916" -> x1916, "x1921_x4" -> x1921_x4, "x1924" -> x1924, "x1929_x4" -> x1929_x4, "x1932" -> x1932, "x1937_x4" -> x1937_x4, "x1940" -> x1940, "x1945_x4" -> x1945_x4, "x1948" -> x1948, "x5961" -> x5961, "x5962" -> x5962, "x5963" -> x5963)
        }
      }
      val block3chunk0: Map[String, Any] = Block3Chunker0.gen()
      object Block3Chunker1 { // 39 nodes, 39 weight
        def gen(): Map[String, Any] = {
          val x5964 = (FixedPoint(BigDecimal("0.124359130859375"),FixFormat(true,16,16)) * block3chunk0("x1904").asInstanceOf[FixedPoint]) + block3chunk0("x1909_x4").asInstanceOf[FixedPoint]
          val x5965 = (FixedPoint(BigDecimal("-0.1126861572265625"),FixFormat(true,16,16)) * block3chunk0("x1916").asInstanceOf[FixedPoint]) + block3chunk0("x1921_x4").asInstanceOf[FixedPoint]
          val x5966 = (FixedPoint(BigDecimal("-0.124359130859375"),FixFormat(true,16,16)) * block3chunk0("x1924").asInstanceOf[FixedPoint]) + block3chunk0("x1929_x4").asInstanceOf[FixedPoint]
          val x5967 = (FixedPoint(BigDecimal("-0.028045654296875"),FixFormat(true,16,16)) * block3chunk0("x1932").asInstanceOf[FixedPoint]) + block3chunk0("x1937_x4").asInstanceOf[FixedPoint]
          val x5968 = (FixedPoint(BigDecimal("-0.001953125"),FixFormat(true,16,16)) * block3chunk0("x1940").asInstanceOf[FixedPoint]) + block3chunk0("x1945_x4").asInstanceOf[FixedPoint]
          val x1958_x3 = block3chunk0("x5961").asInstanceOf[FixedPoint] + block3chunk0("x5962").asInstanceOf[FixedPoint]
          val x1959_x4 = block3chunk0("x5963").asInstanceOf[FixedPoint] + x5964
          val x5969 = (FixedPoint(BigDecimal("0.1126861572265625"),FixFormat(true,16,16)) * block3chunk0("x1912").asInstanceOf[FixedPoint]) + x5965
          val x1961_x4 = x5966 + x5967
          val x5970 = (FixedPoint(BigDecimal("-0.0000457763671875"),FixFormat(true,16,16)) * block3chunk0("x1948").asInstanceOf[FixedPoint]) + x5968
          val x1963_x3 = x1958_x3 + x1959_x4
          val x1964_x4 = x5969 + x1961_x4
          val x1965_x3 = x1963_x3 + x1964_x4
          val x1966_t = x1965_x3 + x5970
          val x1967 = b1867 === FixedPoint(BigDecimal("20"),FixFormat(true,32,0))
          val x1968 = FixedPoint(BigDecimal("20"),FixFormat(true,32,0)) < b1867
          val x1969 = x1966_t.toFixedPoint(FixFormat(true,32,0))
          val x1970_rd_x1870 = x1870_best_rising_0.value
          val x1971_apply = x1970_rd_x1870.v
          val x1972 = x1971_apply < x1969
          val x1973 = x1968 && x1972
          val x1974 = x1967 || x1973
          val x1977_tuple: Struct1 = new Struct1(b1867, x1969)
          val x1978_wr_x1871 = if (x1974) x1871_best_rising_1.set(x1977_tuple)
          val x1979_wr_x1870 = if (x1974) x1870_best_rising_0.set(x1977_tuple)
          val x1983_rd_x1872 = x1872_best_falling_0.value
          val x1984_apply = x1983_rd_x1872.v
          val x1985 = x1969 < x1984_apply
          val x1986 = x1968 && x1985
          val x1987 = x1967 || x1986
          val x1991_wr_x1873 = if (x1987) x1873_best_falling_1.set(x1977_tuple)
          val x1992_wr_x1872 = if (x1987) x1872_best_falling_0.set(x1977_tuple)
          val x1996_rd_x470 = x470_COLS.value
          val x1997_sub = x1996_rd_x470 - FixedPoint(BigDecimal("1"),FixFormat(true,32,0))
          val x1998 = b1867 === x1997_sub
          val x2000_rd_x1871 = x1871_best_rising_1.value
          val x2001_enq_x540 = {
            if (Bool(true,true) & x1998) x540_rising_0.enqueue(x2000_rd_x1871)
          }
          val x2005_rd_x1873 = x1873_best_falling_1.value
          val x2006_enq_x556 = {
            if (Bool(true,true) & x1998) x556_falling_0.enqueue(x2005_rd_x1873)
          }
          Map[String,Any]()
        }
      }
      val block3chunk1: Map[String, Any] = Block3Chunker1.gen()
    }
  } else null.asInstanceOf[Unit]
}
/** END UnrolledForeach x2010_inr_Foreach **/
