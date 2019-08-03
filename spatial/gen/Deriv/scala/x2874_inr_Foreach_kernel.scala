import emul._
import emul.implicits._

/** BEGIN UnrolledForeach x2874_inr_Foreach **/
object x2874_inr_Foreach_kernel {
  def run(
    b514: Bool,
    x1571_ctrchain: Array[Counterlike]
  ): Unit = if (b514){
    x1571_ctrchain(0).foreach{case (is,vs) => 
      val b2731 = is(0)
      val b2732 = vs(0)
      object Block9Chunker0 { // 74 nodes, 74 weight
        def gen(): Map[String, Any] = {
          val x2733_tuple: Struct1 = new Struct1(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)), FixedPoint(BigDecimal("-999"),FixFormat(true,32,0)))
          x2734_best_rising_0.initMem(x2733_tuple)
          x2735_best_rising_1.initMem(x2733_tuple)
          x2736_best_falling_0.initMem(x2733_tuple)
          x2737_best_falling_1.initMem(x2733_tuple)
          val x2739_deq_x530 = {
            val a0 = if (Bool(true,true) & b2732 & b514 && x530_input_fifo_0.nonEmpty) x530_input_fifo_0.dequeue() else FixedPoint.invalid(FixFormat(true,16,0))
            Array[FixedPoint](a0)
          }
          val x2740_elem_0 = x2739_deq_x530.apply(0)
          val x2741 = if (b2732 & b514) x2738_sr_0.shiftIn("Deriv.scala:97:14", Seq(FixedPoint(BigDecimal("0"),FixFormat(true,32,0))), 0, x2740_elem_0)
          val x2742 = x2738_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)))), Seq(b2732 & b514))
          val x2743_elem_0 = x2742.apply(0)
          val x2744 = x2743_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x2746 = x2738_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("1"),FixFormat(true,32,0)))), Seq(b2732 & b514))
          val x2747_elem_0 = x2746.apply(0)
          val x2748 = x2747_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x2749_x4 = FixedPoint(BigDecimal("0.000335693359375"),FixFormat(true,16,16)) * x2748
          val x2750 = x2738_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("2"),FixFormat(true,32,0)))), Seq(b2732 & b514))
          val x2751_elem_0 = x2750.apply(0)
          val x2752 = x2751_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x2754 = x2738_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("3"),FixFormat(true,32,0)))), Seq(b2732 & b514))
          val x2755_elem_0 = x2754.apply(0)
          val x2756 = x2755_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x2757_x4 = FixedPoint(BigDecimal("0.0084991455078125"),FixFormat(true,16,16)) * x2756
          val x2758 = x2738_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("4"),FixFormat(true,32,0)))), Seq(b2732 & b514))
          val x2759_elem_0 = x2758.apply(0)
          val x2760 = x2759_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x2762 = x2738_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("5"),FixFormat(true,32,0)))), Seq(b2732 & b514))
          val x2763_elem_0 = x2762.apply(0)
          val x2764 = x2763_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x2765_x4 = FixedPoint(BigDecimal("0.069122314453125"),FixFormat(true,16,16)) * x2764
          val x2766 = x2738_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("6"),FixFormat(true,32,0)))), Seq(b2732 & b514))
          val x2767_elem_0 = x2766.apply(0)
          val x2768 = x2767_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x2770 = x2738_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("7"),FixFormat(true,32,0)))), Seq(b2732 & b514))
          val x2771_elem_0 = x2770.apply(0)
          val x2772 = x2771_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x2773_x4 = FixedPoint(BigDecimal("0.1548919677734375"),FixFormat(true,16,16)) * x2772
          val x2774 = x2738_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("8"),FixFormat(true,32,0)))), Seq(b2732 & b514))
          val x2775_elem_0 = x2774.apply(0)
          val x2776 = x2775_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x2778 = x2738_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("10"),FixFormat(true,32,0)))), Seq(b2732 & b514))
          val x2779_elem_0 = x2778.apply(0)
          val x2780 = x2779_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x2782 = x2738_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("11"),FixFormat(true,32,0)))), Seq(b2732 & b514))
          val x2783_elem_0 = x2782.apply(0)
          val x2784 = x2783_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x2785_x4 = FixedPoint(BigDecimal("-0.1548919677734375"),FixFormat(true,16,16)) * x2784
          val x2786 = x2738_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("12"),FixFormat(true,32,0)))), Seq(b2732 & b514))
          val x2787_elem_0 = x2786.apply(0)
          val x2788 = x2787_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x2790 = x2738_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("13"),FixFormat(true,32,0)))), Seq(b2732 & b514))
          val x2791_elem_0 = x2790.apply(0)
          val x2792 = x2791_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x2793_x4 = FixedPoint(BigDecimal("-0.069122314453125"),FixFormat(true,16,16)) * x2792
          val x2794 = x2738_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("14"),FixFormat(true,32,0)))), Seq(b2732 & b514))
          val x2795_elem_0 = x2794.apply(0)
          val x2796 = x2795_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x2798 = x2738_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("15"),FixFormat(true,32,0)))), Seq(b2732 & b514))
          val x2799_elem_0 = x2798.apply(0)
          val x2800 = x2799_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x2801_x4 = FixedPoint(BigDecimal("-0.0084991455078125"),FixFormat(true,16,16)) * x2800
          val x2802 = x2738_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("16"),FixFormat(true,32,0)))), Seq(b2732 & b514))
          val x2803_elem_0 = x2802.apply(0)
          val x2804 = x2803_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x2806 = x2738_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("17"),FixFormat(true,32,0)))), Seq(b2732 & b514))
          val x2807_elem_0 = x2806.apply(0)
          val x2808 = x2807_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x2809_x4 = FixedPoint(BigDecimal("-0.000335693359375"),FixFormat(true,16,16)) * x2808
          val x2810 = x2738_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("18"),FixFormat(true,32,0)))), Seq(b2732 & b514))
          val x2811_elem_0 = x2810.apply(0)
          val x2812 = x2811_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x6021 = (FixedPoint(BigDecimal("0.0000457763671875"),FixFormat(true,16,16)) * x2744) + x2749_x4
          val x6022 = (FixedPoint(BigDecimal("0.001953125"),FixFormat(true,16,16)) * x2752) + x2757_x4
          val x6023 = (FixedPoint(BigDecimal("0.028045654296875"),FixFormat(true,16,16)) * x2760) + x2765_x4
          Map[String,Any]("x2768" -> x2768, "x2773_x4" -> x2773_x4, "x2776" -> x2776, "x2780" -> x2780, "x2785_x4" -> x2785_x4, "x2788" -> x2788, "x2793_x4" -> x2793_x4, "x2796" -> x2796, "x2801_x4" -> x2801_x4, "x2804" -> x2804, "x2809_x4" -> x2809_x4, "x2812" -> x2812, "x6021" -> x6021, "x6022" -> x6022, "x6023" -> x6023)
        }
      }
      val block9chunk0: Map[String, Any] = Block9Chunker0.gen()
      object Block9Chunker1 { // 39 nodes, 39 weight
        def gen(): Map[String, Any] = {
          val x6024 = (FixedPoint(BigDecimal("0.124359130859375"),FixFormat(true,16,16)) * block9chunk0("x2768").asInstanceOf[FixedPoint]) + block9chunk0("x2773_x4").asInstanceOf[FixedPoint]
          val x6025 = (FixedPoint(BigDecimal("-0.1126861572265625"),FixFormat(true,16,16)) * block9chunk0("x2780").asInstanceOf[FixedPoint]) + block9chunk0("x2785_x4").asInstanceOf[FixedPoint]
          val x6026 = (FixedPoint(BigDecimal("-0.124359130859375"),FixFormat(true,16,16)) * block9chunk0("x2788").asInstanceOf[FixedPoint]) + block9chunk0("x2793_x4").asInstanceOf[FixedPoint]
          val x6027 = (FixedPoint(BigDecimal("-0.028045654296875"),FixFormat(true,16,16)) * block9chunk0("x2796").asInstanceOf[FixedPoint]) + block9chunk0("x2801_x4").asInstanceOf[FixedPoint]
          val x6028 = (FixedPoint(BigDecimal("-0.001953125"),FixFormat(true,16,16)) * block9chunk0("x2804").asInstanceOf[FixedPoint]) + block9chunk0("x2809_x4").asInstanceOf[FixedPoint]
          val x2822_x3 = block9chunk0("x6021").asInstanceOf[FixedPoint] + block9chunk0("x6022").asInstanceOf[FixedPoint]
          val x2823_x4 = block9chunk0("x6023").asInstanceOf[FixedPoint] + x6024
          val x6029 = (FixedPoint(BigDecimal("0.1126861572265625"),FixFormat(true,16,16)) * block9chunk0("x2776").asInstanceOf[FixedPoint]) + x6025
          val x2825_x4 = x6026 + x6027
          val x6030 = (FixedPoint(BigDecimal("-0.0000457763671875"),FixFormat(true,16,16)) * block9chunk0("x2812").asInstanceOf[FixedPoint]) + x6028
          val x2827_x3 = x2822_x3 + x2823_x4
          val x2828_x4 = x6029 + x2825_x4
          val x2829_x3 = x2827_x3 + x2828_x4
          val x2830_t = x2829_x3 + x6030
          val x2831 = b2731 === FixedPoint(BigDecimal("20"),FixFormat(true,32,0))
          val x2832 = FixedPoint(BigDecimal("20"),FixFormat(true,32,0)) < b2731
          val x2833 = x2830_t.toFixedPoint(FixFormat(true,32,0))
          val x2834_rd_x2734 = x2734_best_rising_0.value
          val x2835_apply = x2834_rd_x2734.v
          val x2836 = x2835_apply < x2833
          val x2837 = x2832 && x2836
          val x2838 = x2831 || x2837
          val x2841_tuple: Struct1 = new Struct1(b2731, x2833)
          val x2842_wr_x2735 = if (x2838) x2735_best_rising_1.set(x2841_tuple)
          val x2843_wr_x2734 = if (x2838) x2734_best_rising_0.set(x2841_tuple)
          val x2847_rd_x2736 = x2736_best_falling_0.value
          val x2848_apply = x2847_rd_x2736.v
          val x2849 = x2833 < x2848_apply
          val x2850 = x2832 && x2849
          val x2851 = x2831 || x2850
          val x2855_wr_x2737 = if (x2851) x2737_best_falling_1.set(x2841_tuple)
          val x2856_wr_x2736 = if (x2851) x2736_best_falling_0.set(x2841_tuple)
          val x2860_rd_x470 = x470_COLS.value
          val x2861_sub = x2860_rd_x470 - FixedPoint(BigDecimal("1"),FixFormat(true,32,0))
          val x2862 = b2731 === x2861_sub
          val x2864_rd_x2735 = x2735_best_rising_1.value
          val x2865_enq_x546 = {
            if (Bool(true,true) & x2862) x546_rising_0.enqueue(x2864_rd_x2735)
          }
          val x2869_rd_x2737 = x2737_best_falling_1.value
          val x2870_enq_x562 = {
            if (Bool(true,true) & x2862) x562_falling_0.enqueue(x2869_rd_x2737)
          }
          Map[String,Any]()
        }
      }
      val block9chunk1: Map[String, Any] = Block9Chunker1.gen()
    }
  } else null.asInstanceOf[Unit]
}
/** END UnrolledForeach x2874_inr_Foreach **/
