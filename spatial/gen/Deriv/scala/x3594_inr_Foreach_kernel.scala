import emul._
import emul.implicits._

/** BEGIN UnrolledForeach x3594_inr_Foreach **/
object x3594_inr_Foreach_kernel {
  def run(
    x1576_ctrchain: Array[Counterlike],
    b519: Bool
  ): Unit = if (b519){
    x1576_ctrchain(0).foreach{case (is,vs) => 
      val b3451 = is(0)
      val b3452 = vs(0)
      object Block14Chunker0 { // 74 nodes, 74 weight
        def gen(): Map[String, Any] = {
          val x3453_tuple: Struct1 = new Struct1(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)), FixedPoint(BigDecimal("-999"),FixFormat(true,32,0)))
          x3454_best_rising_0.initMem(x3453_tuple)
          x3455_best_rising_1.initMem(x3453_tuple)
          x3456_best_falling_0.initMem(x3453_tuple)
          x3457_best_falling_1.initMem(x3453_tuple)
          val x3459_deq_x535 = {
            val a0 = if (Bool(true,true) & b3452 & b519 && x535_input_fifo_0.nonEmpty) x535_input_fifo_0.dequeue() else FixedPoint.invalid(FixFormat(true,16,0))
            Array[FixedPoint](a0)
          }
          val x3460_elem_0 = x3459_deq_x535.apply(0)
          val x3461 = if (b3452 & b519) x3458_sr_0.shiftIn("Deriv.scala:97:14", Seq(FixedPoint(BigDecimal("0"),FixFormat(true,32,0))), 0, x3460_elem_0)
          val x3462 = x3458_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)))), Seq(b3452 & b519))
          val x3463_elem_0 = x3462.apply(0)
          val x3464 = x3463_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x3466 = x3458_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("1"),FixFormat(true,32,0)))), Seq(b3452 & b519))
          val x3467_elem_0 = x3466.apply(0)
          val x3468 = x3467_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x3469_x4 = FixedPoint(BigDecimal("0.000335693359375"),FixFormat(true,16,16)) * x3468
          val x3470 = x3458_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("2"),FixFormat(true,32,0)))), Seq(b3452 & b519))
          val x3471_elem_0 = x3470.apply(0)
          val x3472 = x3471_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x3474 = x3458_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("3"),FixFormat(true,32,0)))), Seq(b3452 & b519))
          val x3475_elem_0 = x3474.apply(0)
          val x3476 = x3475_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x3477_x4 = FixedPoint(BigDecimal("0.0084991455078125"),FixFormat(true,16,16)) * x3476
          val x3478 = x3458_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("4"),FixFormat(true,32,0)))), Seq(b3452 & b519))
          val x3479_elem_0 = x3478.apply(0)
          val x3480 = x3479_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x3482 = x3458_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("5"),FixFormat(true,32,0)))), Seq(b3452 & b519))
          val x3483_elem_0 = x3482.apply(0)
          val x3484 = x3483_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x3485_x4 = FixedPoint(BigDecimal("0.069122314453125"),FixFormat(true,16,16)) * x3484
          val x3486 = x3458_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("6"),FixFormat(true,32,0)))), Seq(b3452 & b519))
          val x3487_elem_0 = x3486.apply(0)
          val x3488 = x3487_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x3490 = x3458_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("7"),FixFormat(true,32,0)))), Seq(b3452 & b519))
          val x3491_elem_0 = x3490.apply(0)
          val x3492 = x3491_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x3493_x4 = FixedPoint(BigDecimal("0.1548919677734375"),FixFormat(true,16,16)) * x3492
          val x3494 = x3458_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("8"),FixFormat(true,32,0)))), Seq(b3452 & b519))
          val x3495_elem_0 = x3494.apply(0)
          val x3496 = x3495_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x3498 = x3458_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("10"),FixFormat(true,32,0)))), Seq(b3452 & b519))
          val x3499_elem_0 = x3498.apply(0)
          val x3500 = x3499_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x3502 = x3458_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("11"),FixFormat(true,32,0)))), Seq(b3452 & b519))
          val x3503_elem_0 = x3502.apply(0)
          val x3504 = x3503_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x3505_x4 = FixedPoint(BigDecimal("-0.1548919677734375"),FixFormat(true,16,16)) * x3504
          val x3506 = x3458_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("12"),FixFormat(true,32,0)))), Seq(b3452 & b519))
          val x3507_elem_0 = x3506.apply(0)
          val x3508 = x3507_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x3510 = x3458_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("13"),FixFormat(true,32,0)))), Seq(b3452 & b519))
          val x3511_elem_0 = x3510.apply(0)
          val x3512 = x3511_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x3513_x4 = FixedPoint(BigDecimal("-0.069122314453125"),FixFormat(true,16,16)) * x3512
          val x3514 = x3458_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("14"),FixFormat(true,32,0)))), Seq(b3452 & b519))
          val x3515_elem_0 = x3514.apply(0)
          val x3516 = x3515_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x3518 = x3458_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("15"),FixFormat(true,32,0)))), Seq(b3452 & b519))
          val x3519_elem_0 = x3518.apply(0)
          val x3520 = x3519_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x3521_x4 = FixedPoint(BigDecimal("-0.0084991455078125"),FixFormat(true,16,16)) * x3520
          val x3522 = x3458_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("16"),FixFormat(true,32,0)))), Seq(b3452 & b519))
          val x3523_elem_0 = x3522.apply(0)
          val x3524 = x3523_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x3526 = x3458_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("17"),FixFormat(true,32,0)))), Seq(b3452 & b519))
          val x3527_elem_0 = x3526.apply(0)
          val x3528 = x3527_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x3529_x4 = FixedPoint(BigDecimal("-0.000335693359375"),FixFormat(true,16,16)) * x3528
          val x3530 = x3458_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("18"),FixFormat(true,32,0)))), Seq(b3452 & b519))
          val x3531_elem_0 = x3530.apply(0)
          val x3532 = x3531_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x6071 = (FixedPoint(BigDecimal("0.0000457763671875"),FixFormat(true,16,16)) * x3464) + x3469_x4
          val x6072 = (FixedPoint(BigDecimal("0.001953125"),FixFormat(true,16,16)) * x3472) + x3477_x4
          val x6073 = (FixedPoint(BigDecimal("0.028045654296875"),FixFormat(true,16,16)) * x3480) + x3485_x4
          Map[String,Any]("x3488" -> x3488, "x3493_x4" -> x3493_x4, "x3496" -> x3496, "x3500" -> x3500, "x3505_x4" -> x3505_x4, "x3508" -> x3508, "x3513_x4" -> x3513_x4, "x3516" -> x3516, "x3521_x4" -> x3521_x4, "x3524" -> x3524, "x3529_x4" -> x3529_x4, "x3532" -> x3532, "x6071" -> x6071, "x6072" -> x6072, "x6073" -> x6073)
        }
      }
      val block14chunk0: Map[String, Any] = Block14Chunker0.gen()
      object Block14Chunker1 { // 39 nodes, 39 weight
        def gen(): Map[String, Any] = {
          val x6074 = (FixedPoint(BigDecimal("0.124359130859375"),FixFormat(true,16,16)) * block14chunk0("x3488").asInstanceOf[FixedPoint]) + block14chunk0("x3493_x4").asInstanceOf[FixedPoint]
          val x6075 = (FixedPoint(BigDecimal("-0.1126861572265625"),FixFormat(true,16,16)) * block14chunk0("x3500").asInstanceOf[FixedPoint]) + block14chunk0("x3505_x4").asInstanceOf[FixedPoint]
          val x6076 = (FixedPoint(BigDecimal("-0.124359130859375"),FixFormat(true,16,16)) * block14chunk0("x3508").asInstanceOf[FixedPoint]) + block14chunk0("x3513_x4").asInstanceOf[FixedPoint]
          val x6077 = (FixedPoint(BigDecimal("-0.028045654296875"),FixFormat(true,16,16)) * block14chunk0("x3516").asInstanceOf[FixedPoint]) + block14chunk0("x3521_x4").asInstanceOf[FixedPoint]
          val x6078 = (FixedPoint(BigDecimal("-0.001953125"),FixFormat(true,16,16)) * block14chunk0("x3524").asInstanceOf[FixedPoint]) + block14chunk0("x3529_x4").asInstanceOf[FixedPoint]
          val x3542_x3 = block14chunk0("x6071").asInstanceOf[FixedPoint] + block14chunk0("x6072").asInstanceOf[FixedPoint]
          val x3543_x4 = block14chunk0("x6073").asInstanceOf[FixedPoint] + x6074
          val x6079 = (FixedPoint(BigDecimal("0.1126861572265625"),FixFormat(true,16,16)) * block14chunk0("x3496").asInstanceOf[FixedPoint]) + x6075
          val x3545_x4 = x6076 + x6077
          val x6080 = (FixedPoint(BigDecimal("-0.0000457763671875"),FixFormat(true,16,16)) * block14chunk0("x3532").asInstanceOf[FixedPoint]) + x6078
          val x3547_x3 = x3542_x3 + x3543_x4
          val x3548_x4 = x6079 + x3545_x4
          val x3549_x3 = x3547_x3 + x3548_x4
          val x3550_t = x3549_x3 + x6080
          val x3551 = b3451 === FixedPoint(BigDecimal("20"),FixFormat(true,32,0))
          val x3552 = FixedPoint(BigDecimal("20"),FixFormat(true,32,0)) < b3451
          val x3553 = x3550_t.toFixedPoint(FixFormat(true,32,0))
          val x3554_rd_x3454 = x3454_best_rising_0.value
          val x3555_apply = x3554_rd_x3454.v
          val x3556 = x3555_apply < x3553
          val x3557 = x3552 && x3556
          val x3558 = x3551 || x3557
          val x3561_tuple: Struct1 = new Struct1(b3451, x3553)
          val x3562_wr_x3455 = if (x3558) x3455_best_rising_1.set(x3561_tuple)
          val x3563_wr_x3454 = if (x3558) x3454_best_rising_0.set(x3561_tuple)
          val x3567_rd_x3456 = x3456_best_falling_0.value
          val x3568_apply = x3567_rd_x3456.v
          val x3569 = x3553 < x3568_apply
          val x3570 = x3552 && x3569
          val x3571 = x3551 || x3570
          val x3575_wr_x3456 = if (x3571) x3456_best_falling_0.set(x3561_tuple)
          val x3576_wr_x3457 = if (x3571) x3457_best_falling_1.set(x3561_tuple)
          val x3580_rd_x470 = x470_COLS.value
          val x3581_sub = x3580_rd_x470 - FixedPoint(BigDecimal("1"),FixFormat(true,32,0))
          val x3582 = b3451 === x3581_sub
          val x3584_rd_x3455 = x3455_best_rising_1.value
          val x3585_enq_x551 = {
            if (Bool(true,true) & x3582) x551_rising_0.enqueue(x3584_rd_x3455)
          }
          val x3589_rd_x3457 = x3457_best_falling_1.value
          val x3590_enq_x567 = {
            if (Bool(true,true) & x3582) x567_falling_0.enqueue(x3589_rd_x3457)
          }
          Map[String,Any]()
        }
      }
      val block14chunk1: Map[String, Any] = Block14Chunker1.gen()
    }
  } else null.asInstanceOf[Unit]
}
/** END UnrolledForeach x3594_inr_Foreach **/
