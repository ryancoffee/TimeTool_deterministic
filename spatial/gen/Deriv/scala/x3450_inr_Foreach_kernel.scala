import emul._
import emul.implicits._

/** BEGIN UnrolledForeach x3450_inr_Foreach **/
object x3450_inr_Foreach_kernel {
  def run(
    b518: Bool,
    x1575_ctrchain: Array[Counterlike]
  ): Unit = if (b518){
    x1575_ctrchain(0).foreach{case (is,vs) => 
      val b3307 = is(0)
      val b3308 = vs(0)
      object Block13Chunker0 { // 74 nodes, 74 weight
        def gen(): Map[String, Any] = {
          val x3309_tuple: Struct1 = new Struct1(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)), FixedPoint(BigDecimal("-999"),FixFormat(true,32,0)))
          x3310_best_rising_0.initMem(x3309_tuple)
          x3311_best_rising_1.initMem(x3309_tuple)
          x3312_best_falling_0.initMem(x3309_tuple)
          x3313_best_falling_1.initMem(x3309_tuple)
          val x3315_deq_x534 = {
            val a0 = if (Bool(true,true) & b3308 & b518 && x534_input_fifo_0.nonEmpty) x534_input_fifo_0.dequeue() else FixedPoint.invalid(FixFormat(true,16,0))
            Array[FixedPoint](a0)
          }
          val x3316_elem_0 = x3315_deq_x534.apply(0)
          val x3317 = if (b3308 & b518) x3314_sr_0.shiftIn("Deriv.scala:97:14", Seq(FixedPoint(BigDecimal("0"),FixFormat(true,32,0))), 0, x3316_elem_0)
          val x3318 = x3314_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)))), Seq(b3308 & b518))
          val x3319_elem_0 = x3318.apply(0)
          val x3320 = x3319_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x3322 = x3314_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("1"),FixFormat(true,32,0)))), Seq(b3308 & b518))
          val x3323_elem_0 = x3322.apply(0)
          val x3324 = x3323_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x3325_x4 = FixedPoint(BigDecimal("0.000335693359375"),FixFormat(true,16,16)) * x3324
          val x3326 = x3314_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("2"),FixFormat(true,32,0)))), Seq(b3308 & b518))
          val x3327_elem_0 = x3326.apply(0)
          val x3328 = x3327_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x3330 = x3314_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("3"),FixFormat(true,32,0)))), Seq(b3308 & b518))
          val x3331_elem_0 = x3330.apply(0)
          val x3332 = x3331_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x3333_x4 = FixedPoint(BigDecimal("0.0084991455078125"),FixFormat(true,16,16)) * x3332
          val x3334 = x3314_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("4"),FixFormat(true,32,0)))), Seq(b3308 & b518))
          val x3335_elem_0 = x3334.apply(0)
          val x3336 = x3335_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x3338 = x3314_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("5"),FixFormat(true,32,0)))), Seq(b3308 & b518))
          val x3339_elem_0 = x3338.apply(0)
          val x3340 = x3339_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x3341_x4 = FixedPoint(BigDecimal("0.069122314453125"),FixFormat(true,16,16)) * x3340
          val x3342 = x3314_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("6"),FixFormat(true,32,0)))), Seq(b3308 & b518))
          val x3343_elem_0 = x3342.apply(0)
          val x3344 = x3343_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x3346 = x3314_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("7"),FixFormat(true,32,0)))), Seq(b3308 & b518))
          val x3347_elem_0 = x3346.apply(0)
          val x3348 = x3347_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x3349_x4 = FixedPoint(BigDecimal("0.1548919677734375"),FixFormat(true,16,16)) * x3348
          val x3350 = x3314_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("8"),FixFormat(true,32,0)))), Seq(b3308 & b518))
          val x3351_elem_0 = x3350.apply(0)
          val x3352 = x3351_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x3354 = x3314_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("10"),FixFormat(true,32,0)))), Seq(b3308 & b518))
          val x3355_elem_0 = x3354.apply(0)
          val x3356 = x3355_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x3358 = x3314_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("11"),FixFormat(true,32,0)))), Seq(b3308 & b518))
          val x3359_elem_0 = x3358.apply(0)
          val x3360 = x3359_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x3361_x4 = FixedPoint(BigDecimal("-0.1548919677734375"),FixFormat(true,16,16)) * x3360
          val x3362 = x3314_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("12"),FixFormat(true,32,0)))), Seq(b3308 & b518))
          val x3363_elem_0 = x3362.apply(0)
          val x3364 = x3363_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x3366 = x3314_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("13"),FixFormat(true,32,0)))), Seq(b3308 & b518))
          val x3367_elem_0 = x3366.apply(0)
          val x3368 = x3367_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x3369_x4 = FixedPoint(BigDecimal("-0.069122314453125"),FixFormat(true,16,16)) * x3368
          val x3370 = x3314_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("14"),FixFormat(true,32,0)))), Seq(b3308 & b518))
          val x3371_elem_0 = x3370.apply(0)
          val x3372 = x3371_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x3374 = x3314_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("15"),FixFormat(true,32,0)))), Seq(b3308 & b518))
          val x3375_elem_0 = x3374.apply(0)
          val x3376 = x3375_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x3377_x4 = FixedPoint(BigDecimal("-0.0084991455078125"),FixFormat(true,16,16)) * x3376
          val x3378 = x3314_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("16"),FixFormat(true,32,0)))), Seq(b3308 & b518))
          val x3379_elem_0 = x3378.apply(0)
          val x3380 = x3379_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x3382 = x3314_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("17"),FixFormat(true,32,0)))), Seq(b3308 & b518))
          val x3383_elem_0 = x3382.apply(0)
          val x3384 = x3383_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x3385_x4 = FixedPoint(BigDecimal("-0.000335693359375"),FixFormat(true,16,16)) * x3384
          val x3386 = x3314_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("18"),FixFormat(true,32,0)))), Seq(b3308 & b518))
          val x3387_elem_0 = x3386.apply(0)
          val x3388 = x3387_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x6061 = (FixedPoint(BigDecimal("0.0000457763671875"),FixFormat(true,16,16)) * x3320) + x3325_x4
          val x6062 = (FixedPoint(BigDecimal("0.001953125"),FixFormat(true,16,16)) * x3328) + x3333_x4
          val x6063 = (FixedPoint(BigDecimal("0.028045654296875"),FixFormat(true,16,16)) * x3336) + x3341_x4
          Map[String,Any]("x3344" -> x3344, "x3349_x4" -> x3349_x4, "x3352" -> x3352, "x3356" -> x3356, "x3361_x4" -> x3361_x4, "x3364" -> x3364, "x3369_x4" -> x3369_x4, "x3372" -> x3372, "x3377_x4" -> x3377_x4, "x3380" -> x3380, "x3385_x4" -> x3385_x4, "x3388" -> x3388, "x6061" -> x6061, "x6062" -> x6062, "x6063" -> x6063)
        }
      }
      val block13chunk0: Map[String, Any] = Block13Chunker0.gen()
      object Block13Chunker1 { // 39 nodes, 39 weight
        def gen(): Map[String, Any] = {
          val x6064 = (FixedPoint(BigDecimal("0.124359130859375"),FixFormat(true,16,16)) * block13chunk0("x3344").asInstanceOf[FixedPoint]) + block13chunk0("x3349_x4").asInstanceOf[FixedPoint]
          val x6065 = (FixedPoint(BigDecimal("-0.1126861572265625"),FixFormat(true,16,16)) * block13chunk0("x3356").asInstanceOf[FixedPoint]) + block13chunk0("x3361_x4").asInstanceOf[FixedPoint]
          val x6066 = (FixedPoint(BigDecimal("-0.124359130859375"),FixFormat(true,16,16)) * block13chunk0("x3364").asInstanceOf[FixedPoint]) + block13chunk0("x3369_x4").asInstanceOf[FixedPoint]
          val x6067 = (FixedPoint(BigDecimal("-0.028045654296875"),FixFormat(true,16,16)) * block13chunk0("x3372").asInstanceOf[FixedPoint]) + block13chunk0("x3377_x4").asInstanceOf[FixedPoint]
          val x6068 = (FixedPoint(BigDecimal("-0.001953125"),FixFormat(true,16,16)) * block13chunk0("x3380").asInstanceOf[FixedPoint]) + block13chunk0("x3385_x4").asInstanceOf[FixedPoint]
          val x3398_x3 = block13chunk0("x6061").asInstanceOf[FixedPoint] + block13chunk0("x6062").asInstanceOf[FixedPoint]
          val x3399_x4 = block13chunk0("x6063").asInstanceOf[FixedPoint] + x6064
          val x6069 = (FixedPoint(BigDecimal("0.1126861572265625"),FixFormat(true,16,16)) * block13chunk0("x3352").asInstanceOf[FixedPoint]) + x6065
          val x3401_x4 = x6066 + x6067
          val x6070 = (FixedPoint(BigDecimal("-0.0000457763671875"),FixFormat(true,16,16)) * block13chunk0("x3388").asInstanceOf[FixedPoint]) + x6068
          val x3403_x3 = x3398_x3 + x3399_x4
          val x3404_x4 = x6069 + x3401_x4
          val x3405_x3 = x3403_x3 + x3404_x4
          val x3406_t = x3405_x3 + x6070
          val x3407 = b3307 === FixedPoint(BigDecimal("20"),FixFormat(true,32,0))
          val x3408 = FixedPoint(BigDecimal("20"),FixFormat(true,32,0)) < b3307
          val x3409 = x3406_t.toFixedPoint(FixFormat(true,32,0))
          val x3410_rd_x3310 = x3310_best_rising_0.value
          val x3411_apply = x3410_rd_x3310.v
          val x3412 = x3411_apply < x3409
          val x3413 = x3408 && x3412
          val x3414 = x3407 || x3413
          val x3417_tuple: Struct1 = new Struct1(b3307, x3409)
          val x3418_wr_x3310 = if (x3414) x3310_best_rising_0.set(x3417_tuple)
          val x3419_wr_x3311 = if (x3414) x3311_best_rising_1.set(x3417_tuple)
          val x3423_rd_x3312 = x3312_best_falling_0.value
          val x3424_apply = x3423_rd_x3312.v
          val x3425 = x3409 < x3424_apply
          val x3426 = x3408 && x3425
          val x3427 = x3407 || x3426
          val x3431_wr_x3313 = if (x3427) x3313_best_falling_1.set(x3417_tuple)
          val x3432_wr_x3312 = if (x3427) x3312_best_falling_0.set(x3417_tuple)
          val x3436_rd_x470 = x470_COLS.value
          val x3437_sub = x3436_rd_x470 - FixedPoint(BigDecimal("1"),FixFormat(true,32,0))
          val x3438 = b3307 === x3437_sub
          val x3440_rd_x3311 = x3311_best_rising_1.value
          val x3441_enq_x550 = {
            if (Bool(true,true) & x3438) x550_rising_0.enqueue(x3440_rd_x3311)
          }
          val x3445_rd_x3313 = x3313_best_falling_1.value
          val x3446_enq_x566 = {
            if (Bool(true,true) & x3438) x566_falling_0.enqueue(x3445_rd_x3313)
          }
          Map[String,Any]()
        }
      }
      val block13chunk1: Map[String, Any] = Block13Chunker1.gen()
    }
  } else null.asInstanceOf[Unit]
}
/** END UnrolledForeach x3450_inr_Foreach **/
