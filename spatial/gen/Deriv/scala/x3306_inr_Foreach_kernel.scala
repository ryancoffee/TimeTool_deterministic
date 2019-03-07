import emul._
import emul.implicits._

/** BEGIN UnrolledForeach x3306_inr_Foreach **/
object x3306_inr_Foreach_kernel {
  def run(
    x1574_ctrchain: Array[Counterlike],
    b517: Bool
  ): Unit = if (b517){
    x1574_ctrchain(0).foreach{case (is,vs) => 
      val b3163 = is(0)
      val b3164 = vs(0)
      object Block12Chunker0 { // 74 nodes, 74 weight
        def gen(): Map[String, Any] = {
          val x3165_tuple: Struct1 = new Struct1(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)), FixedPoint(BigDecimal("-999"),FixFormat(true,32,0)))
          x3166_best_rising_0.initMem(x3165_tuple)
          x3167_best_rising_1.initMem(x3165_tuple)
          x3168_best_falling_0.initMem(x3165_tuple)
          x3169_best_falling_1.initMem(x3165_tuple)
          val x3171_deq_x533 = {
            val a0 = if (Bool(true,true) & b3164 & b517 && x533_input_fifo_0.nonEmpty) x533_input_fifo_0.dequeue() else FixedPoint.invalid(FixFormat(true,16,0))
            Array[FixedPoint](a0)
          }
          val x3172_elem_0 = x3171_deq_x533.apply(0)
          val x3173 = if (b3164 & b517) x3170_sr_0.shiftIn("Deriv.scala:97:14", Seq(FixedPoint(BigDecimal("0"),FixFormat(true,32,0))), 0, x3172_elem_0)
          val x3174 = x3170_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)))), Seq(b3164 & b517))
          val x3175_elem_0 = x3174.apply(0)
          val x3176 = x3175_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x3178 = x3170_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("1"),FixFormat(true,32,0)))), Seq(b3164 & b517))
          val x3179_elem_0 = x3178.apply(0)
          val x3180 = x3179_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x3181_x4 = FixedPoint(BigDecimal("0.000335693359375"),FixFormat(true,16,16)) * x3180
          val x3182 = x3170_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("2"),FixFormat(true,32,0)))), Seq(b3164 & b517))
          val x3183_elem_0 = x3182.apply(0)
          val x3184 = x3183_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x3186 = x3170_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("3"),FixFormat(true,32,0)))), Seq(b3164 & b517))
          val x3187_elem_0 = x3186.apply(0)
          val x3188 = x3187_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x3189_x4 = FixedPoint(BigDecimal("0.0084991455078125"),FixFormat(true,16,16)) * x3188
          val x3190 = x3170_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("4"),FixFormat(true,32,0)))), Seq(b3164 & b517))
          val x3191_elem_0 = x3190.apply(0)
          val x3192 = x3191_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x3194 = x3170_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("5"),FixFormat(true,32,0)))), Seq(b3164 & b517))
          val x3195_elem_0 = x3194.apply(0)
          val x3196 = x3195_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x3197_x4 = FixedPoint(BigDecimal("0.069122314453125"),FixFormat(true,16,16)) * x3196
          val x3198 = x3170_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("6"),FixFormat(true,32,0)))), Seq(b3164 & b517))
          val x3199_elem_0 = x3198.apply(0)
          val x3200 = x3199_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x3202 = x3170_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("7"),FixFormat(true,32,0)))), Seq(b3164 & b517))
          val x3203_elem_0 = x3202.apply(0)
          val x3204 = x3203_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x3205_x4 = FixedPoint(BigDecimal("0.1548919677734375"),FixFormat(true,16,16)) * x3204
          val x3206 = x3170_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("8"),FixFormat(true,32,0)))), Seq(b3164 & b517))
          val x3207_elem_0 = x3206.apply(0)
          val x3208 = x3207_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x3210 = x3170_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("10"),FixFormat(true,32,0)))), Seq(b3164 & b517))
          val x3211_elem_0 = x3210.apply(0)
          val x3212 = x3211_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x3214 = x3170_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("11"),FixFormat(true,32,0)))), Seq(b3164 & b517))
          val x3215_elem_0 = x3214.apply(0)
          val x3216 = x3215_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x3217_x4 = FixedPoint(BigDecimal("-0.1548919677734375"),FixFormat(true,16,16)) * x3216
          val x3218 = x3170_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("12"),FixFormat(true,32,0)))), Seq(b3164 & b517))
          val x3219_elem_0 = x3218.apply(0)
          val x3220 = x3219_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x3222 = x3170_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("13"),FixFormat(true,32,0)))), Seq(b3164 & b517))
          val x3223_elem_0 = x3222.apply(0)
          val x3224 = x3223_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x3225_x4 = FixedPoint(BigDecimal("-0.069122314453125"),FixFormat(true,16,16)) * x3224
          val x3226 = x3170_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("14"),FixFormat(true,32,0)))), Seq(b3164 & b517))
          val x3227_elem_0 = x3226.apply(0)
          val x3228 = x3227_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x3230 = x3170_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("15"),FixFormat(true,32,0)))), Seq(b3164 & b517))
          val x3231_elem_0 = x3230.apply(0)
          val x3232 = x3231_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x3233_x4 = FixedPoint(BigDecimal("-0.0084991455078125"),FixFormat(true,16,16)) * x3232
          val x3234 = x3170_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("16"),FixFormat(true,32,0)))), Seq(b3164 & b517))
          val x3235_elem_0 = x3234.apply(0)
          val x3236 = x3235_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x3238 = x3170_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("17"),FixFormat(true,32,0)))), Seq(b3164 & b517))
          val x3239_elem_0 = x3238.apply(0)
          val x3240 = x3239_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x3241_x4 = FixedPoint(BigDecimal("-0.000335693359375"),FixFormat(true,16,16)) * x3240
          val x3242 = x3170_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("18"),FixFormat(true,32,0)))), Seq(b3164 & b517))
          val x3243_elem_0 = x3242.apply(0)
          val x3244 = x3243_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x6051 = (FixedPoint(BigDecimal("0.0000457763671875"),FixFormat(true,16,16)) * x3176) + x3181_x4
          val x6052 = (FixedPoint(BigDecimal("0.001953125"),FixFormat(true,16,16)) * x3184) + x3189_x4
          val x6053 = (FixedPoint(BigDecimal("0.028045654296875"),FixFormat(true,16,16)) * x3192) + x3197_x4
          Map[String,Any]("x3200" -> x3200, "x3205_x4" -> x3205_x4, "x3208" -> x3208, "x3212" -> x3212, "x3217_x4" -> x3217_x4, "x3220" -> x3220, "x3225_x4" -> x3225_x4, "x3228" -> x3228, "x3233_x4" -> x3233_x4, "x3236" -> x3236, "x3241_x4" -> x3241_x4, "x3244" -> x3244, "x6051" -> x6051, "x6052" -> x6052, "x6053" -> x6053)
        }
      }
      val block12chunk0: Map[String, Any] = Block12Chunker0.gen()
      object Block12Chunker1 { // 39 nodes, 39 weight
        def gen(): Map[String, Any] = {
          val x6054 = (FixedPoint(BigDecimal("0.124359130859375"),FixFormat(true,16,16)) * block12chunk0("x3200").asInstanceOf[FixedPoint]) + block12chunk0("x3205_x4").asInstanceOf[FixedPoint]
          val x6055 = (FixedPoint(BigDecimal("-0.1126861572265625"),FixFormat(true,16,16)) * block12chunk0("x3212").asInstanceOf[FixedPoint]) + block12chunk0("x3217_x4").asInstanceOf[FixedPoint]
          val x6056 = (FixedPoint(BigDecimal("-0.124359130859375"),FixFormat(true,16,16)) * block12chunk0("x3220").asInstanceOf[FixedPoint]) + block12chunk0("x3225_x4").asInstanceOf[FixedPoint]
          val x6057 = (FixedPoint(BigDecimal("-0.028045654296875"),FixFormat(true,16,16)) * block12chunk0("x3228").asInstanceOf[FixedPoint]) + block12chunk0("x3233_x4").asInstanceOf[FixedPoint]
          val x6058 = (FixedPoint(BigDecimal("-0.001953125"),FixFormat(true,16,16)) * block12chunk0("x3236").asInstanceOf[FixedPoint]) + block12chunk0("x3241_x4").asInstanceOf[FixedPoint]
          val x3254_x3 = block12chunk0("x6051").asInstanceOf[FixedPoint] + block12chunk0("x6052").asInstanceOf[FixedPoint]
          val x3255_x4 = block12chunk0("x6053").asInstanceOf[FixedPoint] + x6054
          val x6059 = (FixedPoint(BigDecimal("0.1126861572265625"),FixFormat(true,16,16)) * block12chunk0("x3208").asInstanceOf[FixedPoint]) + x6055
          val x3257_x4 = x6056 + x6057
          val x6060 = (FixedPoint(BigDecimal("-0.0000457763671875"),FixFormat(true,16,16)) * block12chunk0("x3244").asInstanceOf[FixedPoint]) + x6058
          val x3259_x3 = x3254_x3 + x3255_x4
          val x3260_x4 = x6059 + x3257_x4
          val x3261_x3 = x3259_x3 + x3260_x4
          val x3262_t = x3261_x3 + x6060
          val x3263 = b3163 === FixedPoint(BigDecimal("20"),FixFormat(true,32,0))
          val x3264 = FixedPoint(BigDecimal("20"),FixFormat(true,32,0)) < b3163
          val x3265 = x3262_t.toFixedPoint(FixFormat(true,32,0))
          val x3266_rd_x3166 = x3166_best_rising_0.value
          val x3267_apply = x3266_rd_x3166.v
          val x3268 = x3267_apply < x3265
          val x3269 = x3264 && x3268
          val x3270 = x3263 || x3269
          val x3273_tuple: Struct1 = new Struct1(b3163, x3265)
          val x3274_wr_x3166 = if (x3270) x3166_best_rising_0.set(x3273_tuple)
          val x3275_wr_x3167 = if (x3270) x3167_best_rising_1.set(x3273_tuple)
          val x3279_rd_x3168 = x3168_best_falling_0.value
          val x3280_apply = x3279_rd_x3168.v
          val x3281 = x3265 < x3280_apply
          val x3282 = x3264 && x3281
          val x3283 = x3263 || x3282
          val x3287_wr_x3169 = if (x3283) x3169_best_falling_1.set(x3273_tuple)
          val x3288_wr_x3168 = if (x3283) x3168_best_falling_0.set(x3273_tuple)
          val x3292_rd_x470 = x470_COLS.value
          val x3293_sub = x3292_rd_x470 - FixedPoint(BigDecimal("1"),FixFormat(true,32,0))
          val x3294 = b3163 === x3293_sub
          val x3296_rd_x3167 = x3167_best_rising_1.value
          val x3297_enq_x549 = {
            if (Bool(true,true) & x3294) x549_rising_0.enqueue(x3296_rd_x3167)
          }
          val x3301_rd_x3169 = x3169_best_falling_1.value
          val x3302_enq_x565 = {
            if (Bool(true,true) & x3294) x565_falling_0.enqueue(x3301_rd_x3169)
          }
          Map[String,Any]()
        }
      }
      val block12chunk1: Map[String, Any] = Block12Chunker1.gen()
    }
  } else null.asInstanceOf[Unit]
}
/** END UnrolledForeach x3306_inr_Foreach **/
