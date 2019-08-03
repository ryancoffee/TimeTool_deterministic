import emul._
import emul.implicits._

/** BEGIN UnrolledForeach x2298_inr_Foreach **/
object x2298_inr_Foreach_kernel {
  def run(
    x1567_ctrchain: Array[Counterlike],
    b510: Bool
  ): Unit = if (b510){
    x1567_ctrchain(0).foreach{case (is,vs) => 
      val b2155 = is(0)
      val b2156 = vs(0)
      object Block5Chunker0 { // 74 nodes, 74 weight
        def gen(): Map[String, Any] = {
          val x2157_tuple: Struct1 = new Struct1(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)), FixedPoint(BigDecimal("-999"),FixFormat(true,32,0)))
          x2158_best_rising_0.initMem(x2157_tuple)
          x2159_best_rising_1.initMem(x2157_tuple)
          x2160_best_falling_0.initMem(x2157_tuple)
          x2161_best_falling_1.initMem(x2157_tuple)
          val x2163_deq_x526 = {
            val a0 = if (Bool(true,true) & b2156 & b510 && x526_input_fifo_0.nonEmpty) x526_input_fifo_0.dequeue() else FixedPoint.invalid(FixFormat(true,16,0))
            Array[FixedPoint](a0)
          }
          val x2164_elem_0 = x2163_deq_x526.apply(0)
          val x2165 = if (b2156 & b510) x2162_sr_0.shiftIn("Deriv.scala:97:14", Seq(FixedPoint(BigDecimal("0"),FixFormat(true,32,0))), 0, x2164_elem_0)
          val x2166 = x2162_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)))), Seq(b2156 & b510))
          val x2167_elem_0 = x2166.apply(0)
          val x2168 = x2167_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x2170 = x2162_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("1"),FixFormat(true,32,0)))), Seq(b2156 & b510))
          val x2171_elem_0 = x2170.apply(0)
          val x2172 = x2171_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x2173_x4 = FixedPoint(BigDecimal("0.000335693359375"),FixFormat(true,16,16)) * x2172
          val x2174 = x2162_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("2"),FixFormat(true,32,0)))), Seq(b2156 & b510))
          val x2175_elem_0 = x2174.apply(0)
          val x2176 = x2175_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x2178 = x2162_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("3"),FixFormat(true,32,0)))), Seq(b2156 & b510))
          val x2179_elem_0 = x2178.apply(0)
          val x2180 = x2179_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x2181_x4 = FixedPoint(BigDecimal("0.0084991455078125"),FixFormat(true,16,16)) * x2180
          val x2182 = x2162_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("4"),FixFormat(true,32,0)))), Seq(b2156 & b510))
          val x2183_elem_0 = x2182.apply(0)
          val x2184 = x2183_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x2186 = x2162_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("5"),FixFormat(true,32,0)))), Seq(b2156 & b510))
          val x2187_elem_0 = x2186.apply(0)
          val x2188 = x2187_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x2189_x4 = FixedPoint(BigDecimal("0.069122314453125"),FixFormat(true,16,16)) * x2188
          val x2190 = x2162_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("6"),FixFormat(true,32,0)))), Seq(b2156 & b510))
          val x2191_elem_0 = x2190.apply(0)
          val x2192 = x2191_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x2194 = x2162_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("7"),FixFormat(true,32,0)))), Seq(b2156 & b510))
          val x2195_elem_0 = x2194.apply(0)
          val x2196 = x2195_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x2197_x4 = FixedPoint(BigDecimal("0.1548919677734375"),FixFormat(true,16,16)) * x2196
          val x2198 = x2162_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("8"),FixFormat(true,32,0)))), Seq(b2156 & b510))
          val x2199_elem_0 = x2198.apply(0)
          val x2200 = x2199_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x2202 = x2162_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("10"),FixFormat(true,32,0)))), Seq(b2156 & b510))
          val x2203_elem_0 = x2202.apply(0)
          val x2204 = x2203_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x2206 = x2162_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("11"),FixFormat(true,32,0)))), Seq(b2156 & b510))
          val x2207_elem_0 = x2206.apply(0)
          val x2208 = x2207_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x2209_x4 = FixedPoint(BigDecimal("-0.1548919677734375"),FixFormat(true,16,16)) * x2208
          val x2210 = x2162_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("12"),FixFormat(true,32,0)))), Seq(b2156 & b510))
          val x2211_elem_0 = x2210.apply(0)
          val x2212 = x2211_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x2214 = x2162_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("13"),FixFormat(true,32,0)))), Seq(b2156 & b510))
          val x2215_elem_0 = x2214.apply(0)
          val x2216 = x2215_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x2217_x4 = FixedPoint(BigDecimal("-0.069122314453125"),FixFormat(true,16,16)) * x2216
          val x2218 = x2162_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("14"),FixFormat(true,32,0)))), Seq(b2156 & b510))
          val x2219_elem_0 = x2218.apply(0)
          val x2220 = x2219_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x2222 = x2162_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("15"),FixFormat(true,32,0)))), Seq(b2156 & b510))
          val x2223_elem_0 = x2222.apply(0)
          val x2224 = x2223_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x2225_x4 = FixedPoint(BigDecimal("-0.0084991455078125"),FixFormat(true,16,16)) * x2224
          val x2226 = x2162_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("16"),FixFormat(true,32,0)))), Seq(b2156 & b510))
          val x2227_elem_0 = x2226.apply(0)
          val x2228 = x2227_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x2230 = x2162_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("17"),FixFormat(true,32,0)))), Seq(b2156 & b510))
          val x2231_elem_0 = x2230.apply(0)
          val x2232 = x2231_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x2233_x4 = FixedPoint(BigDecimal("-0.000335693359375"),FixFormat(true,16,16)) * x2232
          val x2234 = x2162_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("18"),FixFormat(true,32,0)))), Seq(b2156 & b510))
          val x2235_elem_0 = x2234.apply(0)
          val x2236 = x2235_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x5981 = (FixedPoint(BigDecimal("0.0000457763671875"),FixFormat(true,16,16)) * x2168) + x2173_x4
          val x5982 = (FixedPoint(BigDecimal("0.001953125"),FixFormat(true,16,16)) * x2176) + x2181_x4
          val x5983 = (FixedPoint(BigDecimal("0.028045654296875"),FixFormat(true,16,16)) * x2184) + x2189_x4
          Map[String,Any]("x2192" -> x2192, "x2197_x4" -> x2197_x4, "x2200" -> x2200, "x2204" -> x2204, "x2209_x4" -> x2209_x4, "x2212" -> x2212, "x2217_x4" -> x2217_x4, "x2220" -> x2220, "x2225_x4" -> x2225_x4, "x2228" -> x2228, "x2233_x4" -> x2233_x4, "x2236" -> x2236, "x5981" -> x5981, "x5982" -> x5982, "x5983" -> x5983)
        }
      }
      val block5chunk0: Map[String, Any] = Block5Chunker0.gen()
      object Block5Chunker1 { // 39 nodes, 39 weight
        def gen(): Map[String, Any] = {
          val x5984 = (FixedPoint(BigDecimal("0.124359130859375"),FixFormat(true,16,16)) * block5chunk0("x2192").asInstanceOf[FixedPoint]) + block5chunk0("x2197_x4").asInstanceOf[FixedPoint]
          val x5985 = (FixedPoint(BigDecimal("-0.1126861572265625"),FixFormat(true,16,16)) * block5chunk0("x2204").asInstanceOf[FixedPoint]) + block5chunk0("x2209_x4").asInstanceOf[FixedPoint]
          val x5986 = (FixedPoint(BigDecimal("-0.124359130859375"),FixFormat(true,16,16)) * block5chunk0("x2212").asInstanceOf[FixedPoint]) + block5chunk0("x2217_x4").asInstanceOf[FixedPoint]
          val x5987 = (FixedPoint(BigDecimal("-0.028045654296875"),FixFormat(true,16,16)) * block5chunk0("x2220").asInstanceOf[FixedPoint]) + block5chunk0("x2225_x4").asInstanceOf[FixedPoint]
          val x5988 = (FixedPoint(BigDecimal("-0.001953125"),FixFormat(true,16,16)) * block5chunk0("x2228").asInstanceOf[FixedPoint]) + block5chunk0("x2233_x4").asInstanceOf[FixedPoint]
          val x2246_x3 = block5chunk0("x5981").asInstanceOf[FixedPoint] + block5chunk0("x5982").asInstanceOf[FixedPoint]
          val x2247_x4 = block5chunk0("x5983").asInstanceOf[FixedPoint] + x5984
          val x5989 = (FixedPoint(BigDecimal("0.1126861572265625"),FixFormat(true,16,16)) * block5chunk0("x2200").asInstanceOf[FixedPoint]) + x5985
          val x2249_x4 = x5986 + x5987
          val x5990 = (FixedPoint(BigDecimal("-0.0000457763671875"),FixFormat(true,16,16)) * block5chunk0("x2236").asInstanceOf[FixedPoint]) + x5988
          val x2251_x3 = x2246_x3 + x2247_x4
          val x2252_x4 = x5989 + x2249_x4
          val x2253_x3 = x2251_x3 + x2252_x4
          val x2254_t = x2253_x3 + x5990
          val x2255 = b2155 === FixedPoint(BigDecimal("20"),FixFormat(true,32,0))
          val x2256 = FixedPoint(BigDecimal("20"),FixFormat(true,32,0)) < b2155
          val x2257 = x2254_t.toFixedPoint(FixFormat(true,32,0))
          val x2258_rd_x2158 = x2158_best_rising_0.value
          val x2259_apply = x2258_rd_x2158.v
          val x2260 = x2259_apply < x2257
          val x2261 = x2256 && x2260
          val x2262 = x2255 || x2261
          val x2265_tuple: Struct1 = new Struct1(b2155, x2257)
          val x2266_wr_x2158 = if (x2262) x2158_best_rising_0.set(x2265_tuple)
          val x2267_wr_x2159 = if (x2262) x2159_best_rising_1.set(x2265_tuple)
          val x2271_rd_x2160 = x2160_best_falling_0.value
          val x2272_apply = x2271_rd_x2160.v
          val x2273 = x2257 < x2272_apply
          val x2274 = x2256 && x2273
          val x2275 = x2255 || x2274
          val x2279_wr_x2161 = if (x2275) x2161_best_falling_1.set(x2265_tuple)
          val x2280_wr_x2160 = if (x2275) x2160_best_falling_0.set(x2265_tuple)
          val x2284_rd_x470 = x470_COLS.value
          val x2285_sub = x2284_rd_x470 - FixedPoint(BigDecimal("1"),FixFormat(true,32,0))
          val x2286 = b2155 === x2285_sub
          val x2288_rd_x2159 = x2159_best_rising_1.value
          val x2289_enq_x542 = {
            if (Bool(true,true) & x2286) x542_rising_0.enqueue(x2288_rd_x2159)
          }
          val x2293_rd_x2161 = x2161_best_falling_1.value
          val x2294_enq_x558 = {
            if (Bool(true,true) & x2286) x558_falling_0.enqueue(x2293_rd_x2161)
          }
          Map[String,Any]()
        }
      }
      val block5chunk1: Map[String, Any] = Block5Chunker1.gen()
    }
  } else null.asInstanceOf[Unit]
}
/** END UnrolledForeach x2298_inr_Foreach **/
