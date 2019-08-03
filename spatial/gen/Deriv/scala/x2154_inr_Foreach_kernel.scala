import emul._
import emul.implicits._

/** BEGIN UnrolledForeach x2154_inr_Foreach **/
object x2154_inr_Foreach_kernel {
  def run(
    b509: Bool,
    x1566_ctrchain: Array[Counterlike]
  ): Unit = if (b509){
    x1566_ctrchain(0).foreach{case (is,vs) => 
      val b2011 = is(0)
      val b2012 = vs(0)
      object Block4Chunker0 { // 74 nodes, 74 weight
        def gen(): Map[String, Any] = {
          val x2013_tuple: Struct1 = new Struct1(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)), FixedPoint(BigDecimal("-999"),FixFormat(true,32,0)))
          x2014_best_rising_0.initMem(x2013_tuple)
          x2015_best_rising_1.initMem(x2013_tuple)
          x2016_best_falling_0.initMem(x2013_tuple)
          x2017_best_falling_1.initMem(x2013_tuple)
          val x2019_deq_x525 = {
            val a0 = if (Bool(true,true) & b2012 & b509 && x525_input_fifo_0.nonEmpty) x525_input_fifo_0.dequeue() else FixedPoint.invalid(FixFormat(true,16,0))
            Array[FixedPoint](a0)
          }
          val x2020_elem_0 = x2019_deq_x525.apply(0)
          val x2021 = if (b2012 & b509) x2018_sr_0.shiftIn("Deriv.scala:97:14", Seq(FixedPoint(BigDecimal("0"),FixFormat(true,32,0))), 0, x2020_elem_0)
          val x2022 = x2018_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)))), Seq(b2012 & b509))
          val x2023_elem_0 = x2022.apply(0)
          val x2024 = x2023_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x2026 = x2018_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("1"),FixFormat(true,32,0)))), Seq(b2012 & b509))
          val x2027_elem_0 = x2026.apply(0)
          val x2028 = x2027_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x2029_x4 = FixedPoint(BigDecimal("0.000335693359375"),FixFormat(true,16,16)) * x2028
          val x2030 = x2018_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("2"),FixFormat(true,32,0)))), Seq(b2012 & b509))
          val x2031_elem_0 = x2030.apply(0)
          val x2032 = x2031_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x2034 = x2018_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("3"),FixFormat(true,32,0)))), Seq(b2012 & b509))
          val x2035_elem_0 = x2034.apply(0)
          val x2036 = x2035_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x2037_x4 = FixedPoint(BigDecimal("0.0084991455078125"),FixFormat(true,16,16)) * x2036
          val x2038 = x2018_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("4"),FixFormat(true,32,0)))), Seq(b2012 & b509))
          val x2039_elem_0 = x2038.apply(0)
          val x2040 = x2039_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x2042 = x2018_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("5"),FixFormat(true,32,0)))), Seq(b2012 & b509))
          val x2043_elem_0 = x2042.apply(0)
          val x2044 = x2043_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x2045_x4 = FixedPoint(BigDecimal("0.069122314453125"),FixFormat(true,16,16)) * x2044
          val x2046 = x2018_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("6"),FixFormat(true,32,0)))), Seq(b2012 & b509))
          val x2047_elem_0 = x2046.apply(0)
          val x2048 = x2047_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x2050 = x2018_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("7"),FixFormat(true,32,0)))), Seq(b2012 & b509))
          val x2051_elem_0 = x2050.apply(0)
          val x2052 = x2051_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x2053_x4 = FixedPoint(BigDecimal("0.1548919677734375"),FixFormat(true,16,16)) * x2052
          val x2054 = x2018_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("8"),FixFormat(true,32,0)))), Seq(b2012 & b509))
          val x2055_elem_0 = x2054.apply(0)
          val x2056 = x2055_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x2058 = x2018_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("10"),FixFormat(true,32,0)))), Seq(b2012 & b509))
          val x2059_elem_0 = x2058.apply(0)
          val x2060 = x2059_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x2062 = x2018_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("11"),FixFormat(true,32,0)))), Seq(b2012 & b509))
          val x2063_elem_0 = x2062.apply(0)
          val x2064 = x2063_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x2065_x4 = FixedPoint(BigDecimal("-0.1548919677734375"),FixFormat(true,16,16)) * x2064
          val x2066 = x2018_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("12"),FixFormat(true,32,0)))), Seq(b2012 & b509))
          val x2067_elem_0 = x2066.apply(0)
          val x2068 = x2067_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x2070 = x2018_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("13"),FixFormat(true,32,0)))), Seq(b2012 & b509))
          val x2071_elem_0 = x2070.apply(0)
          val x2072 = x2071_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x2073_x4 = FixedPoint(BigDecimal("-0.069122314453125"),FixFormat(true,16,16)) * x2072
          val x2074 = x2018_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("14"),FixFormat(true,32,0)))), Seq(b2012 & b509))
          val x2075_elem_0 = x2074.apply(0)
          val x2076 = x2075_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x2078 = x2018_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("15"),FixFormat(true,32,0)))), Seq(b2012 & b509))
          val x2079_elem_0 = x2078.apply(0)
          val x2080 = x2079_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x2081_x4 = FixedPoint(BigDecimal("-0.0084991455078125"),FixFormat(true,16,16)) * x2080
          val x2082 = x2018_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("16"),FixFormat(true,32,0)))), Seq(b2012 & b509))
          val x2083_elem_0 = x2082.apply(0)
          val x2084 = x2083_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x2086 = x2018_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("17"),FixFormat(true,32,0)))), Seq(b2012 & b509))
          val x2087_elem_0 = x2086.apply(0)
          val x2088 = x2087_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x2089_x4 = FixedPoint(BigDecimal("-0.000335693359375"),FixFormat(true,16,16)) * x2088
          val x2090 = x2018_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("18"),FixFormat(true,32,0)))), Seq(b2012 & b509))
          val x2091_elem_0 = x2090.apply(0)
          val x2092 = x2091_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x5971 = (FixedPoint(BigDecimal("0.0000457763671875"),FixFormat(true,16,16)) * x2024) + x2029_x4
          val x5972 = (FixedPoint(BigDecimal("0.001953125"),FixFormat(true,16,16)) * x2032) + x2037_x4
          val x5973 = (FixedPoint(BigDecimal("0.028045654296875"),FixFormat(true,16,16)) * x2040) + x2045_x4
          Map[String,Any]("x2048" -> x2048, "x2053_x4" -> x2053_x4, "x2056" -> x2056, "x2060" -> x2060, "x2065_x4" -> x2065_x4, "x2068" -> x2068, "x2073_x4" -> x2073_x4, "x2076" -> x2076, "x2081_x4" -> x2081_x4, "x2084" -> x2084, "x2089_x4" -> x2089_x4, "x2092" -> x2092, "x5971" -> x5971, "x5972" -> x5972, "x5973" -> x5973)
        }
      }
      val block4chunk0: Map[String, Any] = Block4Chunker0.gen()
      object Block4Chunker1 { // 39 nodes, 39 weight
        def gen(): Map[String, Any] = {
          val x5974 = (FixedPoint(BigDecimal("0.124359130859375"),FixFormat(true,16,16)) * block4chunk0("x2048").asInstanceOf[FixedPoint]) + block4chunk0("x2053_x4").asInstanceOf[FixedPoint]
          val x5975 = (FixedPoint(BigDecimal("-0.1126861572265625"),FixFormat(true,16,16)) * block4chunk0("x2060").asInstanceOf[FixedPoint]) + block4chunk0("x2065_x4").asInstanceOf[FixedPoint]
          val x5976 = (FixedPoint(BigDecimal("-0.124359130859375"),FixFormat(true,16,16)) * block4chunk0("x2068").asInstanceOf[FixedPoint]) + block4chunk0("x2073_x4").asInstanceOf[FixedPoint]
          val x5977 = (FixedPoint(BigDecimal("-0.028045654296875"),FixFormat(true,16,16)) * block4chunk0("x2076").asInstanceOf[FixedPoint]) + block4chunk0("x2081_x4").asInstanceOf[FixedPoint]
          val x5978 = (FixedPoint(BigDecimal("-0.001953125"),FixFormat(true,16,16)) * block4chunk0("x2084").asInstanceOf[FixedPoint]) + block4chunk0("x2089_x4").asInstanceOf[FixedPoint]
          val x2102_x3 = block4chunk0("x5971").asInstanceOf[FixedPoint] + block4chunk0("x5972").asInstanceOf[FixedPoint]
          val x2103_x4 = block4chunk0("x5973").asInstanceOf[FixedPoint] + x5974
          val x5979 = (FixedPoint(BigDecimal("0.1126861572265625"),FixFormat(true,16,16)) * block4chunk0("x2056").asInstanceOf[FixedPoint]) + x5975
          val x2105_x4 = x5976 + x5977
          val x5980 = (FixedPoint(BigDecimal("-0.0000457763671875"),FixFormat(true,16,16)) * block4chunk0("x2092").asInstanceOf[FixedPoint]) + x5978
          val x2107_x3 = x2102_x3 + x2103_x4
          val x2108_x4 = x5979 + x2105_x4
          val x2109_x3 = x2107_x3 + x2108_x4
          val x2110_t = x2109_x3 + x5980
          val x2111 = b2011 === FixedPoint(BigDecimal("20"),FixFormat(true,32,0))
          val x2112 = FixedPoint(BigDecimal("20"),FixFormat(true,32,0)) < b2011
          val x2113 = x2110_t.toFixedPoint(FixFormat(true,32,0))
          val x2114_rd_x2014 = x2014_best_rising_0.value
          val x2115_apply = x2114_rd_x2014.v
          val x2116 = x2115_apply < x2113
          val x2117 = x2112 && x2116
          val x2118 = x2111 || x2117
          val x2121_tuple: Struct1 = new Struct1(b2011, x2113)
          val x2122_wr_x2015 = if (x2118) x2015_best_rising_1.set(x2121_tuple)
          val x2123_wr_x2014 = if (x2118) x2014_best_rising_0.set(x2121_tuple)
          val x2127_rd_x2016 = x2016_best_falling_0.value
          val x2128_apply = x2127_rd_x2016.v
          val x2129 = x2113 < x2128_apply
          val x2130 = x2112 && x2129
          val x2131 = x2111 || x2130
          val x2135_wr_x2017 = if (x2131) x2017_best_falling_1.set(x2121_tuple)
          val x2136_wr_x2016 = if (x2131) x2016_best_falling_0.set(x2121_tuple)
          val x2140_rd_x470 = x470_COLS.value
          val x2141_sub = x2140_rd_x470 - FixedPoint(BigDecimal("1"),FixFormat(true,32,0))
          val x2142 = b2011 === x2141_sub
          val x2144_rd_x2015 = x2015_best_rising_1.value
          val x2145_enq_x541 = {
            if (Bool(true,true) & x2142) x541_rising_0.enqueue(x2144_rd_x2015)
          }
          val x2149_rd_x2017 = x2017_best_falling_1.value
          val x2150_enq_x557 = {
            if (Bool(true,true) & x2142) x557_falling_0.enqueue(x2149_rd_x2017)
          }
          Map[String,Any]()
        }
      }
      val block4chunk1: Map[String, Any] = Block4Chunker1.gen()
    }
  } else null.asInstanceOf[Unit]
}
/** END UnrolledForeach x2154_inr_Foreach **/
