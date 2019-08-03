import emul._
import emul.implicits._

/** BEGIN UnrolledForeach x3018_inr_Foreach **/
object x3018_inr_Foreach_kernel {
  def run(
    x1572_ctrchain: Array[Counterlike],
    b515: Bool
  ): Unit = if (b515){
    x1572_ctrchain(0).foreach{case (is,vs) => 
      val b2875 = is(0)
      val b2876 = vs(0)
      object Block10Chunker0 { // 74 nodes, 74 weight
        def gen(): Map[String, Any] = {
          val x2877_tuple: Struct1 = new Struct1(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)), FixedPoint(BigDecimal("-999"),FixFormat(true,32,0)))
          x2878_best_rising_0.initMem(x2877_tuple)
          x2879_best_rising_1.initMem(x2877_tuple)
          x2880_best_falling_0.initMem(x2877_tuple)
          x2881_best_falling_1.initMem(x2877_tuple)
          val x2883_deq_x531 = {
            val a0 = if (Bool(true,true) & b2876 & b515 && x531_input_fifo_0.nonEmpty) x531_input_fifo_0.dequeue() else FixedPoint.invalid(FixFormat(true,16,0))
            Array[FixedPoint](a0)
          }
          val x2884_elem_0 = x2883_deq_x531.apply(0)
          val x2885 = if (b2876 & b515) x2882_sr_0.shiftIn("Deriv.scala:97:14", Seq(FixedPoint(BigDecimal("0"),FixFormat(true,32,0))), 0, x2884_elem_0)
          val x2886 = x2882_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)))), Seq(b2876 & b515))
          val x2887_elem_0 = x2886.apply(0)
          val x2888 = x2887_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x2890 = x2882_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("1"),FixFormat(true,32,0)))), Seq(b2876 & b515))
          val x2891_elem_0 = x2890.apply(0)
          val x2892 = x2891_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x2893_x4 = FixedPoint(BigDecimal("0.000335693359375"),FixFormat(true,16,16)) * x2892
          val x2894 = x2882_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("2"),FixFormat(true,32,0)))), Seq(b2876 & b515))
          val x2895_elem_0 = x2894.apply(0)
          val x2896 = x2895_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x2898 = x2882_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("3"),FixFormat(true,32,0)))), Seq(b2876 & b515))
          val x2899_elem_0 = x2898.apply(0)
          val x2900 = x2899_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x2901_x4 = FixedPoint(BigDecimal("0.0084991455078125"),FixFormat(true,16,16)) * x2900
          val x2902 = x2882_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("4"),FixFormat(true,32,0)))), Seq(b2876 & b515))
          val x2903_elem_0 = x2902.apply(0)
          val x2904 = x2903_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x2906 = x2882_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("5"),FixFormat(true,32,0)))), Seq(b2876 & b515))
          val x2907_elem_0 = x2906.apply(0)
          val x2908 = x2907_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x2909_x4 = FixedPoint(BigDecimal("0.069122314453125"),FixFormat(true,16,16)) * x2908
          val x2910 = x2882_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("6"),FixFormat(true,32,0)))), Seq(b2876 & b515))
          val x2911_elem_0 = x2910.apply(0)
          val x2912 = x2911_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x2914 = x2882_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("7"),FixFormat(true,32,0)))), Seq(b2876 & b515))
          val x2915_elem_0 = x2914.apply(0)
          val x2916 = x2915_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x2917_x4 = FixedPoint(BigDecimal("0.1548919677734375"),FixFormat(true,16,16)) * x2916
          val x2918 = x2882_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("8"),FixFormat(true,32,0)))), Seq(b2876 & b515))
          val x2919_elem_0 = x2918.apply(0)
          val x2920 = x2919_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x2922 = x2882_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("10"),FixFormat(true,32,0)))), Seq(b2876 & b515))
          val x2923_elem_0 = x2922.apply(0)
          val x2924 = x2923_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x2926 = x2882_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("11"),FixFormat(true,32,0)))), Seq(b2876 & b515))
          val x2927_elem_0 = x2926.apply(0)
          val x2928 = x2927_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x2929_x4 = FixedPoint(BigDecimal("-0.1548919677734375"),FixFormat(true,16,16)) * x2928
          val x2930 = x2882_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("12"),FixFormat(true,32,0)))), Seq(b2876 & b515))
          val x2931_elem_0 = x2930.apply(0)
          val x2932 = x2931_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x2934 = x2882_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("13"),FixFormat(true,32,0)))), Seq(b2876 & b515))
          val x2935_elem_0 = x2934.apply(0)
          val x2936 = x2935_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x2937_x4 = FixedPoint(BigDecimal("-0.069122314453125"),FixFormat(true,16,16)) * x2936
          val x2938 = x2882_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("14"),FixFormat(true,32,0)))), Seq(b2876 & b515))
          val x2939_elem_0 = x2938.apply(0)
          val x2940 = x2939_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x2942 = x2882_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("15"),FixFormat(true,32,0)))), Seq(b2876 & b515))
          val x2943_elem_0 = x2942.apply(0)
          val x2944 = x2943_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x2945_x4 = FixedPoint(BigDecimal("-0.0084991455078125"),FixFormat(true,16,16)) * x2944
          val x2946 = x2882_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("16"),FixFormat(true,32,0)))), Seq(b2876 & b515))
          val x2947_elem_0 = x2946.apply(0)
          val x2948 = x2947_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x2950 = x2882_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("17"),FixFormat(true,32,0)))), Seq(b2876 & b515))
          val x2951_elem_0 = x2950.apply(0)
          val x2952 = x2951_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x2953_x4 = FixedPoint(BigDecimal("-0.000335693359375"),FixFormat(true,16,16)) * x2952
          val x2954 = x2882_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("18"),FixFormat(true,32,0)))), Seq(b2876 & b515))
          val x2955_elem_0 = x2954.apply(0)
          val x2956 = x2955_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x6031 = (FixedPoint(BigDecimal("0.0000457763671875"),FixFormat(true,16,16)) * x2888) + x2893_x4
          val x6032 = (FixedPoint(BigDecimal("0.001953125"),FixFormat(true,16,16)) * x2896) + x2901_x4
          val x6033 = (FixedPoint(BigDecimal("0.028045654296875"),FixFormat(true,16,16)) * x2904) + x2909_x4
          Map[String,Any]("x2912" -> x2912, "x2917_x4" -> x2917_x4, "x2920" -> x2920, "x2924" -> x2924, "x2929_x4" -> x2929_x4, "x2932" -> x2932, "x2937_x4" -> x2937_x4, "x2940" -> x2940, "x2945_x4" -> x2945_x4, "x2948" -> x2948, "x2953_x4" -> x2953_x4, "x2956" -> x2956, "x6031" -> x6031, "x6032" -> x6032, "x6033" -> x6033)
        }
      }
      val block10chunk0: Map[String, Any] = Block10Chunker0.gen()
      object Block10Chunker1 { // 39 nodes, 39 weight
        def gen(): Map[String, Any] = {
          val x6034 = (FixedPoint(BigDecimal("0.124359130859375"),FixFormat(true,16,16)) * block10chunk0("x2912").asInstanceOf[FixedPoint]) + block10chunk0("x2917_x4").asInstanceOf[FixedPoint]
          val x6035 = (FixedPoint(BigDecimal("-0.1126861572265625"),FixFormat(true,16,16)) * block10chunk0("x2924").asInstanceOf[FixedPoint]) + block10chunk0("x2929_x4").asInstanceOf[FixedPoint]
          val x6036 = (FixedPoint(BigDecimal("-0.124359130859375"),FixFormat(true,16,16)) * block10chunk0("x2932").asInstanceOf[FixedPoint]) + block10chunk0("x2937_x4").asInstanceOf[FixedPoint]
          val x6037 = (FixedPoint(BigDecimal("-0.028045654296875"),FixFormat(true,16,16)) * block10chunk0("x2940").asInstanceOf[FixedPoint]) + block10chunk0("x2945_x4").asInstanceOf[FixedPoint]
          val x6038 = (FixedPoint(BigDecimal("-0.001953125"),FixFormat(true,16,16)) * block10chunk0("x2948").asInstanceOf[FixedPoint]) + block10chunk0("x2953_x4").asInstanceOf[FixedPoint]
          val x2966_x3 = block10chunk0("x6031").asInstanceOf[FixedPoint] + block10chunk0("x6032").asInstanceOf[FixedPoint]
          val x2967_x4 = block10chunk0("x6033").asInstanceOf[FixedPoint] + x6034
          val x6039 = (FixedPoint(BigDecimal("0.1126861572265625"),FixFormat(true,16,16)) * block10chunk0("x2920").asInstanceOf[FixedPoint]) + x6035
          val x2969_x4 = x6036 + x6037
          val x6040 = (FixedPoint(BigDecimal("-0.0000457763671875"),FixFormat(true,16,16)) * block10chunk0("x2956").asInstanceOf[FixedPoint]) + x6038
          val x2971_x3 = x2966_x3 + x2967_x4
          val x2972_x4 = x6039 + x2969_x4
          val x2973_x3 = x2971_x3 + x2972_x4
          val x2974_t = x2973_x3 + x6040
          val x2975 = b2875 === FixedPoint(BigDecimal("20"),FixFormat(true,32,0))
          val x2976 = FixedPoint(BigDecimal("20"),FixFormat(true,32,0)) < b2875
          val x2977 = x2974_t.toFixedPoint(FixFormat(true,32,0))
          val x2978_rd_x2878 = x2878_best_rising_0.value
          val x2979_apply = x2978_rd_x2878.v
          val x2980 = x2979_apply < x2977
          val x2981 = x2976 && x2980
          val x2982 = x2975 || x2981
          val x2985_tuple: Struct1 = new Struct1(b2875, x2977)
          val x2986_wr_x2879 = if (x2982) x2879_best_rising_1.set(x2985_tuple)
          val x2987_wr_x2878 = if (x2982) x2878_best_rising_0.set(x2985_tuple)
          val x2991_rd_x2880 = x2880_best_falling_0.value
          val x2992_apply = x2991_rd_x2880.v
          val x2993 = x2977 < x2992_apply
          val x2994 = x2976 && x2993
          val x2995 = x2975 || x2994
          val x2999_wr_x2881 = if (x2995) x2881_best_falling_1.set(x2985_tuple)
          val x3000_wr_x2880 = if (x2995) x2880_best_falling_0.set(x2985_tuple)
          val x3004_rd_x470 = x470_COLS.value
          val x3005_sub = x3004_rd_x470 - FixedPoint(BigDecimal("1"),FixFormat(true,32,0))
          val x3006 = b2875 === x3005_sub
          val x3008_rd_x2879 = x2879_best_rising_1.value
          val x3009_enq_x547 = {
            if (Bool(true,true) & x3006) x547_rising_0.enqueue(x3008_rd_x2879)
          }
          val x3013_rd_x2881 = x2881_best_falling_1.value
          val x3014_enq_x563 = {
            if (Bool(true,true) & x3006) x563_falling_0.enqueue(x3013_rd_x2881)
          }
          Map[String,Any]()
        }
      }
      val block10chunk1: Map[String, Any] = Block10Chunker1.gen()
    }
  } else null.asInstanceOf[Unit]
}
/** END UnrolledForeach x3018_inr_Foreach **/
