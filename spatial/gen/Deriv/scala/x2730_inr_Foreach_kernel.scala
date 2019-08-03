import emul._
import emul.implicits._

/** BEGIN UnrolledForeach x2730_inr_Foreach **/
object x2730_inr_Foreach_kernel {
  def run(
    x1570_ctrchain: Array[Counterlike],
    b513: Bool
  ): Unit = if (b513){
    x1570_ctrchain(0).foreach{case (is,vs) => 
      val b2587 = is(0)
      val b2588 = vs(0)
      object Block8Chunker0 { // 74 nodes, 74 weight
        def gen(): Map[String, Any] = {
          val x2589_tuple: Struct1 = new Struct1(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)), FixedPoint(BigDecimal("-999"),FixFormat(true,32,0)))
          x2590_best_rising_0.initMem(x2589_tuple)
          x2591_best_rising_1.initMem(x2589_tuple)
          x2592_best_falling_0.initMem(x2589_tuple)
          x2593_best_falling_1.initMem(x2589_tuple)
          val x2595_deq_x529 = {
            val a0 = if (Bool(true,true) & b2588 & b513 && x529_input_fifo_0.nonEmpty) x529_input_fifo_0.dequeue() else FixedPoint.invalid(FixFormat(true,16,0))
            Array[FixedPoint](a0)
          }
          val x2596_elem_0 = x2595_deq_x529.apply(0)
          val x2597 = if (b2588 & b513) x2594_sr_0.shiftIn("Deriv.scala:97:14", Seq(FixedPoint(BigDecimal("0"),FixFormat(true,32,0))), 0, x2596_elem_0)
          val x2598 = x2594_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)))), Seq(b2588 & b513))
          val x2599_elem_0 = x2598.apply(0)
          val x2600 = x2599_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x2602 = x2594_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("1"),FixFormat(true,32,0)))), Seq(b2588 & b513))
          val x2603_elem_0 = x2602.apply(0)
          val x2604 = x2603_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x2605_x4 = FixedPoint(BigDecimal("0.000335693359375"),FixFormat(true,16,16)) * x2604
          val x2606 = x2594_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("2"),FixFormat(true,32,0)))), Seq(b2588 & b513))
          val x2607_elem_0 = x2606.apply(0)
          val x2608 = x2607_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x2610 = x2594_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("3"),FixFormat(true,32,0)))), Seq(b2588 & b513))
          val x2611_elem_0 = x2610.apply(0)
          val x2612 = x2611_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x2613_x4 = FixedPoint(BigDecimal("0.0084991455078125"),FixFormat(true,16,16)) * x2612
          val x2614 = x2594_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("4"),FixFormat(true,32,0)))), Seq(b2588 & b513))
          val x2615_elem_0 = x2614.apply(0)
          val x2616 = x2615_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x2618 = x2594_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("5"),FixFormat(true,32,0)))), Seq(b2588 & b513))
          val x2619_elem_0 = x2618.apply(0)
          val x2620 = x2619_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x2621_x4 = FixedPoint(BigDecimal("0.069122314453125"),FixFormat(true,16,16)) * x2620
          val x2622 = x2594_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("6"),FixFormat(true,32,0)))), Seq(b2588 & b513))
          val x2623_elem_0 = x2622.apply(0)
          val x2624 = x2623_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x2626 = x2594_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("7"),FixFormat(true,32,0)))), Seq(b2588 & b513))
          val x2627_elem_0 = x2626.apply(0)
          val x2628 = x2627_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x2629_x4 = FixedPoint(BigDecimal("0.1548919677734375"),FixFormat(true,16,16)) * x2628
          val x2630 = x2594_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("8"),FixFormat(true,32,0)))), Seq(b2588 & b513))
          val x2631_elem_0 = x2630.apply(0)
          val x2632 = x2631_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x2634 = x2594_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("10"),FixFormat(true,32,0)))), Seq(b2588 & b513))
          val x2635_elem_0 = x2634.apply(0)
          val x2636 = x2635_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x2638 = x2594_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("11"),FixFormat(true,32,0)))), Seq(b2588 & b513))
          val x2639_elem_0 = x2638.apply(0)
          val x2640 = x2639_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x2641_x4 = FixedPoint(BigDecimal("-0.1548919677734375"),FixFormat(true,16,16)) * x2640
          val x2642 = x2594_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("12"),FixFormat(true,32,0)))), Seq(b2588 & b513))
          val x2643_elem_0 = x2642.apply(0)
          val x2644 = x2643_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x2646 = x2594_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("13"),FixFormat(true,32,0)))), Seq(b2588 & b513))
          val x2647_elem_0 = x2646.apply(0)
          val x2648 = x2647_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x2649_x4 = FixedPoint(BigDecimal("-0.069122314453125"),FixFormat(true,16,16)) * x2648
          val x2650 = x2594_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("14"),FixFormat(true,32,0)))), Seq(b2588 & b513))
          val x2651_elem_0 = x2650.apply(0)
          val x2652 = x2651_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x2654 = x2594_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("15"),FixFormat(true,32,0)))), Seq(b2588 & b513))
          val x2655_elem_0 = x2654.apply(0)
          val x2656 = x2655_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x2657_x4 = FixedPoint(BigDecimal("-0.0084991455078125"),FixFormat(true,16,16)) * x2656
          val x2658 = x2594_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("16"),FixFormat(true,32,0)))), Seq(b2588 & b513))
          val x2659_elem_0 = x2658.apply(0)
          val x2660 = x2659_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x2662 = x2594_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("17"),FixFormat(true,32,0)))), Seq(b2588 & b513))
          val x2663_elem_0 = x2662.apply(0)
          val x2664 = x2663_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x2665_x4 = FixedPoint(BigDecimal("-0.000335693359375"),FixFormat(true,16,16)) * x2664
          val x2666 = x2594_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("18"),FixFormat(true,32,0)))), Seq(b2588 & b513))
          val x2667_elem_0 = x2666.apply(0)
          val x2668 = x2667_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x6011 = (FixedPoint(BigDecimal("0.0000457763671875"),FixFormat(true,16,16)) * x2600) + x2605_x4
          val x6012 = (FixedPoint(BigDecimal("0.001953125"),FixFormat(true,16,16)) * x2608) + x2613_x4
          val x6013 = (FixedPoint(BigDecimal("0.028045654296875"),FixFormat(true,16,16)) * x2616) + x2621_x4
          Map[String,Any]("x2624" -> x2624, "x2629_x4" -> x2629_x4, "x2632" -> x2632, "x2636" -> x2636, "x2641_x4" -> x2641_x4, "x2644" -> x2644, "x2649_x4" -> x2649_x4, "x2652" -> x2652, "x2657_x4" -> x2657_x4, "x2660" -> x2660, "x2665_x4" -> x2665_x4, "x2668" -> x2668, "x6011" -> x6011, "x6012" -> x6012, "x6013" -> x6013)
        }
      }
      val block8chunk0: Map[String, Any] = Block8Chunker0.gen()
      object Block8Chunker1 { // 39 nodes, 39 weight
        def gen(): Map[String, Any] = {
          val x6014 = (FixedPoint(BigDecimal("0.124359130859375"),FixFormat(true,16,16)) * block8chunk0("x2624").asInstanceOf[FixedPoint]) + block8chunk0("x2629_x4").asInstanceOf[FixedPoint]
          val x6015 = (FixedPoint(BigDecimal("-0.1126861572265625"),FixFormat(true,16,16)) * block8chunk0("x2636").asInstanceOf[FixedPoint]) + block8chunk0("x2641_x4").asInstanceOf[FixedPoint]
          val x6016 = (FixedPoint(BigDecimal("-0.124359130859375"),FixFormat(true,16,16)) * block8chunk0("x2644").asInstanceOf[FixedPoint]) + block8chunk0("x2649_x4").asInstanceOf[FixedPoint]
          val x6017 = (FixedPoint(BigDecimal("-0.028045654296875"),FixFormat(true,16,16)) * block8chunk0("x2652").asInstanceOf[FixedPoint]) + block8chunk0("x2657_x4").asInstanceOf[FixedPoint]
          val x6018 = (FixedPoint(BigDecimal("-0.001953125"),FixFormat(true,16,16)) * block8chunk0("x2660").asInstanceOf[FixedPoint]) + block8chunk0("x2665_x4").asInstanceOf[FixedPoint]
          val x2678_x3 = block8chunk0("x6011").asInstanceOf[FixedPoint] + block8chunk0("x6012").asInstanceOf[FixedPoint]
          val x2679_x4 = block8chunk0("x6013").asInstanceOf[FixedPoint] + x6014
          val x6019 = (FixedPoint(BigDecimal("0.1126861572265625"),FixFormat(true,16,16)) * block8chunk0("x2632").asInstanceOf[FixedPoint]) + x6015
          val x2681_x4 = x6016 + x6017
          val x6020 = (FixedPoint(BigDecimal("-0.0000457763671875"),FixFormat(true,16,16)) * block8chunk0("x2668").asInstanceOf[FixedPoint]) + x6018
          val x2683_x3 = x2678_x3 + x2679_x4
          val x2684_x4 = x6019 + x2681_x4
          val x2685_x3 = x2683_x3 + x2684_x4
          val x2686_t = x2685_x3 + x6020
          val x2687 = b2587 === FixedPoint(BigDecimal("20"),FixFormat(true,32,0))
          val x2688 = FixedPoint(BigDecimal("20"),FixFormat(true,32,0)) < b2587
          val x2689 = x2686_t.toFixedPoint(FixFormat(true,32,0))
          val x2690_rd_x2590 = x2590_best_rising_0.value
          val x2691_apply = x2690_rd_x2590.v
          val x2692 = x2691_apply < x2689
          val x2693 = x2688 && x2692
          val x2694 = x2687 || x2693
          val x2697_tuple: Struct1 = new Struct1(b2587, x2689)
          val x2698_wr_x2591 = if (x2694) x2591_best_rising_1.set(x2697_tuple)
          val x2699_wr_x2590 = if (x2694) x2590_best_rising_0.set(x2697_tuple)
          val x2703_rd_x2592 = x2592_best_falling_0.value
          val x2704_apply = x2703_rd_x2592.v
          val x2705 = x2689 < x2704_apply
          val x2706 = x2688 && x2705
          val x2707 = x2687 || x2706
          val x2711_wr_x2592 = if (x2707) x2592_best_falling_0.set(x2697_tuple)
          val x2712_wr_x2593 = if (x2707) x2593_best_falling_1.set(x2697_tuple)
          val x2716_rd_x470 = x470_COLS.value
          val x2717_sub = x2716_rd_x470 - FixedPoint(BigDecimal("1"),FixFormat(true,32,0))
          val x2718 = b2587 === x2717_sub
          val x2720_rd_x2591 = x2591_best_rising_1.value
          val x2721_enq_x545 = {
            if (Bool(true,true) & x2718) x545_rising_0.enqueue(x2720_rd_x2591)
          }
          val x2725_rd_x2593 = x2593_best_falling_1.value
          val x2726_enq_x561 = {
            if (Bool(true,true) & x2718) x561_falling_0.enqueue(x2725_rd_x2593)
          }
          Map[String,Any]()
        }
      }
      val block8chunk1: Map[String, Any] = Block8Chunker1.gen()
    }
  } else null.asInstanceOf[Unit]
}
/** END UnrolledForeach x2730_inr_Foreach **/
