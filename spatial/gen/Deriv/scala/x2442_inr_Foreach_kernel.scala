import emul._
import emul.implicits._

/** BEGIN UnrolledForeach x2442_inr_Foreach **/
object x2442_inr_Foreach_kernel {
  def run(
    b511: Bool,
    x1568_ctrchain: Array[Counterlike]
  ): Unit = if (b511){
    x1568_ctrchain(0).foreach{case (is,vs) => 
      val b2299 = is(0)
      val b2300 = vs(0)
      object Block6Chunker0 { // 74 nodes, 74 weight
        def gen(): Map[String, Any] = {
          val x2301_tuple: Struct1 = new Struct1(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)), FixedPoint(BigDecimal("-999"),FixFormat(true,32,0)))
          x2302_best_rising_0.initMem(x2301_tuple)
          x2303_best_rising_1.initMem(x2301_tuple)
          x2304_best_falling_0.initMem(x2301_tuple)
          x2305_best_falling_1.initMem(x2301_tuple)
          val x2307_deq_x527 = {
            val a0 = if (Bool(true,true) & b2300 & b511 && x527_input_fifo_0.nonEmpty) x527_input_fifo_0.dequeue() else FixedPoint.invalid(FixFormat(true,16,0))
            Array[FixedPoint](a0)
          }
          val x2308_elem_0 = x2307_deq_x527.apply(0)
          val x2309 = if (b2300 & b511) x2306_sr_0.shiftIn("Deriv.scala:97:14", Seq(FixedPoint(BigDecimal("0"),FixFormat(true,32,0))), 0, x2308_elem_0)
          val x2310 = x2306_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)))), Seq(b2300 & b511))
          val x2311_elem_0 = x2310.apply(0)
          val x2312 = x2311_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x2314 = x2306_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("1"),FixFormat(true,32,0)))), Seq(b2300 & b511))
          val x2315_elem_0 = x2314.apply(0)
          val x2316 = x2315_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x2317_x4 = FixedPoint(BigDecimal("0.000335693359375"),FixFormat(true,16,16)) * x2316
          val x2318 = x2306_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("2"),FixFormat(true,32,0)))), Seq(b2300 & b511))
          val x2319_elem_0 = x2318.apply(0)
          val x2320 = x2319_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x2322 = x2306_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("3"),FixFormat(true,32,0)))), Seq(b2300 & b511))
          val x2323_elem_0 = x2322.apply(0)
          val x2324 = x2323_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x2325_x4 = FixedPoint(BigDecimal("0.0084991455078125"),FixFormat(true,16,16)) * x2324
          val x2326 = x2306_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("4"),FixFormat(true,32,0)))), Seq(b2300 & b511))
          val x2327_elem_0 = x2326.apply(0)
          val x2328 = x2327_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x2330 = x2306_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("5"),FixFormat(true,32,0)))), Seq(b2300 & b511))
          val x2331_elem_0 = x2330.apply(0)
          val x2332 = x2331_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x2333_x4 = FixedPoint(BigDecimal("0.069122314453125"),FixFormat(true,16,16)) * x2332
          val x2334 = x2306_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("6"),FixFormat(true,32,0)))), Seq(b2300 & b511))
          val x2335_elem_0 = x2334.apply(0)
          val x2336 = x2335_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x2338 = x2306_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("7"),FixFormat(true,32,0)))), Seq(b2300 & b511))
          val x2339_elem_0 = x2338.apply(0)
          val x2340 = x2339_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x2341_x4 = FixedPoint(BigDecimal("0.1548919677734375"),FixFormat(true,16,16)) * x2340
          val x2342 = x2306_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("8"),FixFormat(true,32,0)))), Seq(b2300 & b511))
          val x2343_elem_0 = x2342.apply(0)
          val x2344 = x2343_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x2346 = x2306_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("10"),FixFormat(true,32,0)))), Seq(b2300 & b511))
          val x2347_elem_0 = x2346.apply(0)
          val x2348 = x2347_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x2350 = x2306_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("11"),FixFormat(true,32,0)))), Seq(b2300 & b511))
          val x2351_elem_0 = x2350.apply(0)
          val x2352 = x2351_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x2353_x4 = FixedPoint(BigDecimal("-0.1548919677734375"),FixFormat(true,16,16)) * x2352
          val x2354 = x2306_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("12"),FixFormat(true,32,0)))), Seq(b2300 & b511))
          val x2355_elem_0 = x2354.apply(0)
          val x2356 = x2355_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x2358 = x2306_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("13"),FixFormat(true,32,0)))), Seq(b2300 & b511))
          val x2359_elem_0 = x2358.apply(0)
          val x2360 = x2359_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x2361_x4 = FixedPoint(BigDecimal("-0.069122314453125"),FixFormat(true,16,16)) * x2360
          val x2362 = x2306_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("14"),FixFormat(true,32,0)))), Seq(b2300 & b511))
          val x2363_elem_0 = x2362.apply(0)
          val x2364 = x2363_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x2366 = x2306_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("15"),FixFormat(true,32,0)))), Seq(b2300 & b511))
          val x2367_elem_0 = x2366.apply(0)
          val x2368 = x2367_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x2369_x4 = FixedPoint(BigDecimal("-0.0084991455078125"),FixFormat(true,16,16)) * x2368
          val x2370 = x2306_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("16"),FixFormat(true,32,0)))), Seq(b2300 & b511))
          val x2371_elem_0 = x2370.apply(0)
          val x2372 = x2371_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x2374 = x2306_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("17"),FixFormat(true,32,0)))), Seq(b2300 & b511))
          val x2375_elem_0 = x2374.apply(0)
          val x2376 = x2375_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x2377_x4 = FixedPoint(BigDecimal("-0.000335693359375"),FixFormat(true,16,16)) * x2376
          val x2378 = x2306_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("18"),FixFormat(true,32,0)))), Seq(b2300 & b511))
          val x2379_elem_0 = x2378.apply(0)
          val x2380 = x2379_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x5991 = (FixedPoint(BigDecimal("0.0000457763671875"),FixFormat(true,16,16)) * x2312) + x2317_x4
          val x5992 = (FixedPoint(BigDecimal("0.001953125"),FixFormat(true,16,16)) * x2320) + x2325_x4
          val x5993 = (FixedPoint(BigDecimal("0.028045654296875"),FixFormat(true,16,16)) * x2328) + x2333_x4
          Map[String,Any]("x2336" -> x2336, "x2341_x4" -> x2341_x4, "x2344" -> x2344, "x2348" -> x2348, "x2353_x4" -> x2353_x4, "x2356" -> x2356, "x2361_x4" -> x2361_x4, "x2364" -> x2364, "x2369_x4" -> x2369_x4, "x2372" -> x2372, "x2377_x4" -> x2377_x4, "x2380" -> x2380, "x5991" -> x5991, "x5992" -> x5992, "x5993" -> x5993)
        }
      }
      val block6chunk0: Map[String, Any] = Block6Chunker0.gen()
      object Block6Chunker1 { // 39 nodes, 39 weight
        def gen(): Map[String, Any] = {
          val x5994 = (FixedPoint(BigDecimal("0.124359130859375"),FixFormat(true,16,16)) * block6chunk0("x2336").asInstanceOf[FixedPoint]) + block6chunk0("x2341_x4").asInstanceOf[FixedPoint]
          val x5995 = (FixedPoint(BigDecimal("-0.1126861572265625"),FixFormat(true,16,16)) * block6chunk0("x2348").asInstanceOf[FixedPoint]) + block6chunk0("x2353_x4").asInstanceOf[FixedPoint]
          val x5996 = (FixedPoint(BigDecimal("-0.124359130859375"),FixFormat(true,16,16)) * block6chunk0("x2356").asInstanceOf[FixedPoint]) + block6chunk0("x2361_x4").asInstanceOf[FixedPoint]
          val x5997 = (FixedPoint(BigDecimal("-0.028045654296875"),FixFormat(true,16,16)) * block6chunk0("x2364").asInstanceOf[FixedPoint]) + block6chunk0("x2369_x4").asInstanceOf[FixedPoint]
          val x5998 = (FixedPoint(BigDecimal("-0.001953125"),FixFormat(true,16,16)) * block6chunk0("x2372").asInstanceOf[FixedPoint]) + block6chunk0("x2377_x4").asInstanceOf[FixedPoint]
          val x2390_x3 = block6chunk0("x5991").asInstanceOf[FixedPoint] + block6chunk0("x5992").asInstanceOf[FixedPoint]
          val x2391_x4 = block6chunk0("x5993").asInstanceOf[FixedPoint] + x5994
          val x5999 = (FixedPoint(BigDecimal("0.1126861572265625"),FixFormat(true,16,16)) * block6chunk0("x2344").asInstanceOf[FixedPoint]) + x5995
          val x2393_x4 = x5996 + x5997
          val x6000 = (FixedPoint(BigDecimal("-0.0000457763671875"),FixFormat(true,16,16)) * block6chunk0("x2380").asInstanceOf[FixedPoint]) + x5998
          val x2395_x3 = x2390_x3 + x2391_x4
          val x2396_x4 = x5999 + x2393_x4
          val x2397_x3 = x2395_x3 + x2396_x4
          val x2398_t = x2397_x3 + x6000
          val x2399 = b2299 === FixedPoint(BigDecimal("20"),FixFormat(true,32,0))
          val x2400 = FixedPoint(BigDecimal("20"),FixFormat(true,32,0)) < b2299
          val x2401 = x2398_t.toFixedPoint(FixFormat(true,32,0))
          val x2402_rd_x2302 = x2302_best_rising_0.value
          val x2403_apply = x2402_rd_x2302.v
          val x2404 = x2403_apply < x2401
          val x2405 = x2400 && x2404
          val x2406 = x2399 || x2405
          val x2409_tuple: Struct1 = new Struct1(b2299, x2401)
          val x2410_wr_x2302 = if (x2406) x2302_best_rising_0.set(x2409_tuple)
          val x2411_wr_x2303 = if (x2406) x2303_best_rising_1.set(x2409_tuple)
          val x2415_rd_x2304 = x2304_best_falling_0.value
          val x2416_apply = x2415_rd_x2304.v
          val x2417 = x2401 < x2416_apply
          val x2418 = x2400 && x2417
          val x2419 = x2399 || x2418
          val x2423_wr_x2305 = if (x2419) x2305_best_falling_1.set(x2409_tuple)
          val x2424_wr_x2304 = if (x2419) x2304_best_falling_0.set(x2409_tuple)
          val x2428_rd_x470 = x470_COLS.value
          val x2429_sub = x2428_rd_x470 - FixedPoint(BigDecimal("1"),FixFormat(true,32,0))
          val x2430 = b2299 === x2429_sub
          val x2432_rd_x2303 = x2303_best_rising_1.value
          val x2433_enq_x543 = {
            if (Bool(true,true) & x2430) x543_rising_0.enqueue(x2432_rd_x2303)
          }
          val x2437_rd_x2305 = x2305_best_falling_1.value
          val x2438_enq_x559 = {
            if (Bool(true,true) & x2430) x559_falling_0.enqueue(x2437_rd_x2305)
          }
          Map[String,Any]()
        }
      }
      val block6chunk1: Map[String, Any] = Block6Chunker1.gen()
    }
  } else null.asInstanceOf[Unit]
}
/** END UnrolledForeach x2442_inr_Foreach **/
