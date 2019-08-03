import emul._
import emul.implicits._

/** BEGIN UnrolledForeach x2586_inr_Foreach **/
object x2586_inr_Foreach_kernel {
  def run(
    x1569_ctrchain: Array[Counterlike],
    b512: Bool
  ): Unit = if (b512){
    x1569_ctrchain(0).foreach{case (is,vs) => 
      val b2443 = is(0)
      val b2444 = vs(0)
      object Block7Chunker0 { // 74 nodes, 74 weight
        def gen(): Map[String, Any] = {
          val x2445_tuple: Struct1 = new Struct1(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)), FixedPoint(BigDecimal("-999"),FixFormat(true,32,0)))
          x2446_best_rising_0.initMem(x2445_tuple)
          x2447_best_rising_1.initMem(x2445_tuple)
          x2448_best_falling_0.initMem(x2445_tuple)
          x2449_best_falling_1.initMem(x2445_tuple)
          val x2451_deq_x528 = {
            val a0 = if (Bool(true,true) & b2444 & b512 && x528_input_fifo_0.nonEmpty) x528_input_fifo_0.dequeue() else FixedPoint.invalid(FixFormat(true,16,0))
            Array[FixedPoint](a0)
          }
          val x2452_elem_0 = x2451_deq_x528.apply(0)
          val x2453 = if (b2444 & b512) x2450_sr_0.shiftIn("Deriv.scala:97:14", Seq(FixedPoint(BigDecimal("0"),FixFormat(true,32,0))), 0, x2452_elem_0)
          val x2454 = x2450_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)))), Seq(b2444 & b512))
          val x2455_elem_0 = x2454.apply(0)
          val x2456 = x2455_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x2458 = x2450_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("1"),FixFormat(true,32,0)))), Seq(b2444 & b512))
          val x2459_elem_0 = x2458.apply(0)
          val x2460 = x2459_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x2461_x4 = FixedPoint(BigDecimal("0.000335693359375"),FixFormat(true,16,16)) * x2460
          val x2462 = x2450_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("2"),FixFormat(true,32,0)))), Seq(b2444 & b512))
          val x2463_elem_0 = x2462.apply(0)
          val x2464 = x2463_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x2466 = x2450_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("3"),FixFormat(true,32,0)))), Seq(b2444 & b512))
          val x2467_elem_0 = x2466.apply(0)
          val x2468 = x2467_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x2469_x4 = FixedPoint(BigDecimal("0.0084991455078125"),FixFormat(true,16,16)) * x2468
          val x2470 = x2450_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("4"),FixFormat(true,32,0)))), Seq(b2444 & b512))
          val x2471_elem_0 = x2470.apply(0)
          val x2472 = x2471_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x2474 = x2450_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("5"),FixFormat(true,32,0)))), Seq(b2444 & b512))
          val x2475_elem_0 = x2474.apply(0)
          val x2476 = x2475_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x2477_x4 = FixedPoint(BigDecimal("0.069122314453125"),FixFormat(true,16,16)) * x2476
          val x2478 = x2450_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("6"),FixFormat(true,32,0)))), Seq(b2444 & b512))
          val x2479_elem_0 = x2478.apply(0)
          val x2480 = x2479_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x2482 = x2450_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("7"),FixFormat(true,32,0)))), Seq(b2444 & b512))
          val x2483_elem_0 = x2482.apply(0)
          val x2484 = x2483_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x2485_x4 = FixedPoint(BigDecimal("0.1548919677734375"),FixFormat(true,16,16)) * x2484
          val x2486 = x2450_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("8"),FixFormat(true,32,0)))), Seq(b2444 & b512))
          val x2487_elem_0 = x2486.apply(0)
          val x2488 = x2487_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x2490 = x2450_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("10"),FixFormat(true,32,0)))), Seq(b2444 & b512))
          val x2491_elem_0 = x2490.apply(0)
          val x2492 = x2491_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x2494 = x2450_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("11"),FixFormat(true,32,0)))), Seq(b2444 & b512))
          val x2495_elem_0 = x2494.apply(0)
          val x2496 = x2495_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x2497_x4 = FixedPoint(BigDecimal("-0.1548919677734375"),FixFormat(true,16,16)) * x2496
          val x2498 = x2450_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("12"),FixFormat(true,32,0)))), Seq(b2444 & b512))
          val x2499_elem_0 = x2498.apply(0)
          val x2500 = x2499_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x2502 = x2450_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("13"),FixFormat(true,32,0)))), Seq(b2444 & b512))
          val x2503_elem_0 = x2502.apply(0)
          val x2504 = x2503_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x2505_x4 = FixedPoint(BigDecimal("-0.069122314453125"),FixFormat(true,16,16)) * x2504
          val x2506 = x2450_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("14"),FixFormat(true,32,0)))), Seq(b2444 & b512))
          val x2507_elem_0 = x2506.apply(0)
          val x2508 = x2507_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x2510 = x2450_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("15"),FixFormat(true,32,0)))), Seq(b2444 & b512))
          val x2511_elem_0 = x2510.apply(0)
          val x2512 = x2511_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x2513_x4 = FixedPoint(BigDecimal("-0.0084991455078125"),FixFormat(true,16,16)) * x2512
          val x2514 = x2450_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("16"),FixFormat(true,32,0)))), Seq(b2444 & b512))
          val x2515_elem_0 = x2514.apply(0)
          val x2516 = x2515_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x2518 = x2450_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("17"),FixFormat(true,32,0)))), Seq(b2444 & b512))
          val x2519_elem_0 = x2518.apply(0)
          val x2520 = x2519_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x2521_x4 = FixedPoint(BigDecimal("-0.000335693359375"),FixFormat(true,16,16)) * x2520
          val x2522 = x2450_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("18"),FixFormat(true,32,0)))), Seq(b2444 & b512))
          val x2523_elem_0 = x2522.apply(0)
          val x2524 = x2523_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x6001 = (FixedPoint(BigDecimal("0.0000457763671875"),FixFormat(true,16,16)) * x2456) + x2461_x4
          val x6002 = (FixedPoint(BigDecimal("0.001953125"),FixFormat(true,16,16)) * x2464) + x2469_x4
          val x6003 = (FixedPoint(BigDecimal("0.028045654296875"),FixFormat(true,16,16)) * x2472) + x2477_x4
          Map[String,Any]("x2480" -> x2480, "x2485_x4" -> x2485_x4, "x2488" -> x2488, "x2492" -> x2492, "x2497_x4" -> x2497_x4, "x2500" -> x2500, "x2505_x4" -> x2505_x4, "x2508" -> x2508, "x2513_x4" -> x2513_x4, "x2516" -> x2516, "x2521_x4" -> x2521_x4, "x2524" -> x2524, "x6001" -> x6001, "x6002" -> x6002, "x6003" -> x6003)
        }
      }
      val block7chunk0: Map[String, Any] = Block7Chunker0.gen()
      object Block7Chunker1 { // 39 nodes, 39 weight
        def gen(): Map[String, Any] = {
          val x6004 = (FixedPoint(BigDecimal("0.124359130859375"),FixFormat(true,16,16)) * block7chunk0("x2480").asInstanceOf[FixedPoint]) + block7chunk0("x2485_x4").asInstanceOf[FixedPoint]
          val x6005 = (FixedPoint(BigDecimal("-0.1126861572265625"),FixFormat(true,16,16)) * block7chunk0("x2492").asInstanceOf[FixedPoint]) + block7chunk0("x2497_x4").asInstanceOf[FixedPoint]
          val x6006 = (FixedPoint(BigDecimal("-0.124359130859375"),FixFormat(true,16,16)) * block7chunk0("x2500").asInstanceOf[FixedPoint]) + block7chunk0("x2505_x4").asInstanceOf[FixedPoint]
          val x6007 = (FixedPoint(BigDecimal("-0.028045654296875"),FixFormat(true,16,16)) * block7chunk0("x2508").asInstanceOf[FixedPoint]) + block7chunk0("x2513_x4").asInstanceOf[FixedPoint]
          val x6008 = (FixedPoint(BigDecimal("-0.001953125"),FixFormat(true,16,16)) * block7chunk0("x2516").asInstanceOf[FixedPoint]) + block7chunk0("x2521_x4").asInstanceOf[FixedPoint]
          val x2534_x3 = block7chunk0("x6001").asInstanceOf[FixedPoint] + block7chunk0("x6002").asInstanceOf[FixedPoint]
          val x2535_x4 = block7chunk0("x6003").asInstanceOf[FixedPoint] + x6004
          val x6009 = (FixedPoint(BigDecimal("0.1126861572265625"),FixFormat(true,16,16)) * block7chunk0("x2488").asInstanceOf[FixedPoint]) + x6005
          val x2537_x4 = x6006 + x6007
          val x6010 = (FixedPoint(BigDecimal("-0.0000457763671875"),FixFormat(true,16,16)) * block7chunk0("x2524").asInstanceOf[FixedPoint]) + x6008
          val x2539_x3 = x2534_x3 + x2535_x4
          val x2540_x4 = x6009 + x2537_x4
          val x2541_x3 = x2539_x3 + x2540_x4
          val x2542_t = x2541_x3 + x6010
          val x2543 = b2443 === FixedPoint(BigDecimal("20"),FixFormat(true,32,0))
          val x2544 = FixedPoint(BigDecimal("20"),FixFormat(true,32,0)) < b2443
          val x2545 = x2542_t.toFixedPoint(FixFormat(true,32,0))
          val x2546_rd_x2446 = x2446_best_rising_0.value
          val x2547_apply = x2546_rd_x2446.v
          val x2548 = x2547_apply < x2545
          val x2549 = x2544 && x2548
          val x2550 = x2543 || x2549
          val x2553_tuple: Struct1 = new Struct1(b2443, x2545)
          val x2554_wr_x2447 = if (x2550) x2447_best_rising_1.set(x2553_tuple)
          val x2555_wr_x2446 = if (x2550) x2446_best_rising_0.set(x2553_tuple)
          val x2559_rd_x2448 = x2448_best_falling_0.value
          val x2560_apply = x2559_rd_x2448.v
          val x2561 = x2545 < x2560_apply
          val x2562 = x2544 && x2561
          val x2563 = x2543 || x2562
          val x2567_wr_x2448 = if (x2563) x2448_best_falling_0.set(x2553_tuple)
          val x2568_wr_x2449 = if (x2563) x2449_best_falling_1.set(x2553_tuple)
          val x2572_rd_x470 = x470_COLS.value
          val x2573_sub = x2572_rd_x470 - FixedPoint(BigDecimal("1"),FixFormat(true,32,0))
          val x2574 = b2443 === x2573_sub
          val x2576_rd_x2447 = x2447_best_rising_1.value
          val x2577_enq_x544 = {
            if (Bool(true,true) & x2574) x544_rising_0.enqueue(x2576_rd_x2447)
          }
          val x2581_rd_x2449 = x2449_best_falling_1.value
          val x2582_enq_x560 = {
            if (Bool(true,true) & x2574) x560_falling_0.enqueue(x2581_rd_x2449)
          }
          Map[String,Any]()
        }
      }
      val block7chunk1: Map[String, Any] = Block7Chunker1.gen()
    }
  } else null.asInstanceOf[Unit]
}
/** END UnrolledForeach x2586_inr_Foreach **/
