import emul._
import emul.implicits._

/** BEGIN UnrolledForeach x3162_inr_Foreach **/
object x3162_inr_Foreach_kernel {
  def run(
    x1573_ctrchain: Array[Counterlike],
    b516: Bool
  ): Unit = if (b516){
    x1573_ctrchain(0).foreach{case (is,vs) => 
      val b3019 = is(0)
      val b3020 = vs(0)
      object Block11Chunker0 { // 74 nodes, 74 weight
        def gen(): Map[String, Any] = {
          val x3021_tuple: Struct1 = new Struct1(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)), FixedPoint(BigDecimal("-999"),FixFormat(true,32,0)))
          x3022_best_rising_0.initMem(x3021_tuple)
          x3023_best_rising_1.initMem(x3021_tuple)
          x3024_best_falling_0.initMem(x3021_tuple)
          x3025_best_falling_1.initMem(x3021_tuple)
          val x3027_deq_x532 = {
            val a0 = if (Bool(true,true) & b3020 & b516 && x532_input_fifo_0.nonEmpty) x532_input_fifo_0.dequeue() else FixedPoint.invalid(FixFormat(true,16,0))
            Array[FixedPoint](a0)
          }
          val x3028_elem_0 = x3027_deq_x532.apply(0)
          val x3029 = if (b3020 & b516) x3026_sr_0.shiftIn("Deriv.scala:97:14", Seq(FixedPoint(BigDecimal("0"),FixFormat(true,32,0))), 0, x3028_elem_0)
          val x3030 = x3026_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)))), Seq(b3020 & b516))
          val x3031_elem_0 = x3030.apply(0)
          val x3032 = x3031_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x3034 = x3026_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("1"),FixFormat(true,32,0)))), Seq(b3020 & b516))
          val x3035_elem_0 = x3034.apply(0)
          val x3036 = x3035_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x3037_x4 = FixedPoint(BigDecimal("0.000335693359375"),FixFormat(true,16,16)) * x3036
          val x3038 = x3026_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("2"),FixFormat(true,32,0)))), Seq(b3020 & b516))
          val x3039_elem_0 = x3038.apply(0)
          val x3040 = x3039_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x3042 = x3026_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("3"),FixFormat(true,32,0)))), Seq(b3020 & b516))
          val x3043_elem_0 = x3042.apply(0)
          val x3044 = x3043_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x3045_x4 = FixedPoint(BigDecimal("0.0084991455078125"),FixFormat(true,16,16)) * x3044
          val x3046 = x3026_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("4"),FixFormat(true,32,0)))), Seq(b3020 & b516))
          val x3047_elem_0 = x3046.apply(0)
          val x3048 = x3047_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x3050 = x3026_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("5"),FixFormat(true,32,0)))), Seq(b3020 & b516))
          val x3051_elem_0 = x3050.apply(0)
          val x3052 = x3051_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x3053_x4 = FixedPoint(BigDecimal("0.069122314453125"),FixFormat(true,16,16)) * x3052
          val x3054 = x3026_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("6"),FixFormat(true,32,0)))), Seq(b3020 & b516))
          val x3055_elem_0 = x3054.apply(0)
          val x3056 = x3055_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x3058 = x3026_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("7"),FixFormat(true,32,0)))), Seq(b3020 & b516))
          val x3059_elem_0 = x3058.apply(0)
          val x3060 = x3059_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x3061_x4 = FixedPoint(BigDecimal("0.1548919677734375"),FixFormat(true,16,16)) * x3060
          val x3062 = x3026_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("8"),FixFormat(true,32,0)))), Seq(b3020 & b516))
          val x3063_elem_0 = x3062.apply(0)
          val x3064 = x3063_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x3066 = x3026_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("10"),FixFormat(true,32,0)))), Seq(b3020 & b516))
          val x3067_elem_0 = x3066.apply(0)
          val x3068 = x3067_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x3070 = x3026_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("11"),FixFormat(true,32,0)))), Seq(b3020 & b516))
          val x3071_elem_0 = x3070.apply(0)
          val x3072 = x3071_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x3073_x4 = FixedPoint(BigDecimal("-0.1548919677734375"),FixFormat(true,16,16)) * x3072
          val x3074 = x3026_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("12"),FixFormat(true,32,0)))), Seq(b3020 & b516))
          val x3075_elem_0 = x3074.apply(0)
          val x3076 = x3075_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x3078 = x3026_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("13"),FixFormat(true,32,0)))), Seq(b3020 & b516))
          val x3079_elem_0 = x3078.apply(0)
          val x3080 = x3079_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x3081_x4 = FixedPoint(BigDecimal("-0.069122314453125"),FixFormat(true,16,16)) * x3080
          val x3082 = x3026_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("14"),FixFormat(true,32,0)))), Seq(b3020 & b516))
          val x3083_elem_0 = x3082.apply(0)
          val x3084 = x3083_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x3086 = x3026_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("15"),FixFormat(true,32,0)))), Seq(b3020 & b516))
          val x3087_elem_0 = x3086.apply(0)
          val x3088 = x3087_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x3089_x4 = FixedPoint(BigDecimal("-0.0084991455078125"),FixFormat(true,16,16)) * x3088
          val x3090 = x3026_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("16"),FixFormat(true,32,0)))), Seq(b3020 & b516))
          val x3091_elem_0 = x3090.apply(0)
          val x3092 = x3091_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x3094 = x3026_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("17"),FixFormat(true,32,0)))), Seq(b3020 & b516))
          val x3095_elem_0 = x3094.apply(0)
          val x3096 = x3095_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x3097_x4 = FixedPoint(BigDecimal("-0.000335693359375"),FixFormat(true,16,16)) * x3096
          val x3098 = x3026_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("18"),FixFormat(true,32,0)))), Seq(b3020 & b516))
          val x3099_elem_0 = x3098.apply(0)
          val x3100 = x3099_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x6041 = (FixedPoint(BigDecimal("0.0000457763671875"),FixFormat(true,16,16)) * x3032) + x3037_x4
          val x6042 = (FixedPoint(BigDecimal("0.001953125"),FixFormat(true,16,16)) * x3040) + x3045_x4
          val x6043 = (FixedPoint(BigDecimal("0.028045654296875"),FixFormat(true,16,16)) * x3048) + x3053_x4
          Map[String,Any]("x3056" -> x3056, "x3061_x4" -> x3061_x4, "x3064" -> x3064, "x3068" -> x3068, "x3073_x4" -> x3073_x4, "x3076" -> x3076, "x3081_x4" -> x3081_x4, "x3084" -> x3084, "x3089_x4" -> x3089_x4, "x3092" -> x3092, "x3097_x4" -> x3097_x4, "x3100" -> x3100, "x6041" -> x6041, "x6042" -> x6042, "x6043" -> x6043)
        }
      }
      val block11chunk0: Map[String, Any] = Block11Chunker0.gen()
      object Block11Chunker1 { // 39 nodes, 39 weight
        def gen(): Map[String, Any] = {
          val x6044 = (FixedPoint(BigDecimal("0.124359130859375"),FixFormat(true,16,16)) * block11chunk0("x3056").asInstanceOf[FixedPoint]) + block11chunk0("x3061_x4").asInstanceOf[FixedPoint]
          val x6045 = (FixedPoint(BigDecimal("-0.1126861572265625"),FixFormat(true,16,16)) * block11chunk0("x3068").asInstanceOf[FixedPoint]) + block11chunk0("x3073_x4").asInstanceOf[FixedPoint]
          val x6046 = (FixedPoint(BigDecimal("-0.124359130859375"),FixFormat(true,16,16)) * block11chunk0("x3076").asInstanceOf[FixedPoint]) + block11chunk0("x3081_x4").asInstanceOf[FixedPoint]
          val x6047 = (FixedPoint(BigDecimal("-0.028045654296875"),FixFormat(true,16,16)) * block11chunk0("x3084").asInstanceOf[FixedPoint]) + block11chunk0("x3089_x4").asInstanceOf[FixedPoint]
          val x6048 = (FixedPoint(BigDecimal("-0.001953125"),FixFormat(true,16,16)) * block11chunk0("x3092").asInstanceOf[FixedPoint]) + block11chunk0("x3097_x4").asInstanceOf[FixedPoint]
          val x3110_x3 = block11chunk0("x6041").asInstanceOf[FixedPoint] + block11chunk0("x6042").asInstanceOf[FixedPoint]
          val x3111_x4 = block11chunk0("x6043").asInstanceOf[FixedPoint] + x6044
          val x6049 = (FixedPoint(BigDecimal("0.1126861572265625"),FixFormat(true,16,16)) * block11chunk0("x3064").asInstanceOf[FixedPoint]) + x6045
          val x3113_x4 = x6046 + x6047
          val x6050 = (FixedPoint(BigDecimal("-0.0000457763671875"),FixFormat(true,16,16)) * block11chunk0("x3100").asInstanceOf[FixedPoint]) + x6048
          val x3115_x3 = x3110_x3 + x3111_x4
          val x3116_x4 = x6049 + x3113_x4
          val x3117_x3 = x3115_x3 + x3116_x4
          val x3118_t = x3117_x3 + x6050
          val x3119 = b3019 === FixedPoint(BigDecimal("20"),FixFormat(true,32,0))
          val x3120 = FixedPoint(BigDecimal("20"),FixFormat(true,32,0)) < b3019
          val x3121 = x3118_t.toFixedPoint(FixFormat(true,32,0))
          val x3122_rd_x3022 = x3022_best_rising_0.value
          val x3123_apply = x3122_rd_x3022.v
          val x3124 = x3123_apply < x3121
          val x3125 = x3120 && x3124
          val x3126 = x3119 || x3125
          val x3129_tuple: Struct1 = new Struct1(b3019, x3121)
          val x3130_wr_x3022 = if (x3126) x3022_best_rising_0.set(x3129_tuple)
          val x3131_wr_x3023 = if (x3126) x3023_best_rising_1.set(x3129_tuple)
          val x3135_rd_x3024 = x3024_best_falling_0.value
          val x3136_apply = x3135_rd_x3024.v
          val x3137 = x3121 < x3136_apply
          val x3138 = x3120 && x3137
          val x3139 = x3119 || x3138
          val x3143_wr_x3025 = if (x3139) x3025_best_falling_1.set(x3129_tuple)
          val x3144_wr_x3024 = if (x3139) x3024_best_falling_0.set(x3129_tuple)
          val x3148_rd_x470 = x470_COLS.value
          val x3149_sub = x3148_rd_x470 - FixedPoint(BigDecimal("1"),FixFormat(true,32,0))
          val x3150 = b3019 === x3149_sub
          val x3152_rd_x3023 = x3023_best_rising_1.value
          val x3153_enq_x548 = {
            if (Bool(true,true) & x3150) x548_rising_0.enqueue(x3152_rd_x3023)
          }
          val x3157_rd_x3025 = x3025_best_falling_1.value
          val x3158_enq_x564 = {
            if (Bool(true,true) & x3150) x564_falling_0.enqueue(x3157_rd_x3025)
          }
          Map[String,Any]()
        }
      }
      val block11chunk1: Map[String, Any] = Block11Chunker1.gen()
    }
  } else null.asInstanceOf[Unit]
}
/** END UnrolledForeach x3162_inr_Foreach **/
