import emul._
import emul.implicits._

/** BEGIN UnrolledForeach x3738_inr_Foreach **/
object x3738_inr_Foreach_kernel {
  def run(
    x1577_ctrchain: Array[Counterlike],
    b520: Bool
  ): Unit = if (b520){
    x1577_ctrchain(0).foreach{case (is,vs) => 
      val b3595 = is(0)
      val b3596 = vs(0)
      object Block15Chunker0 { // 74 nodes, 74 weight
        def gen(): Map[String, Any] = {
          val x3597_tuple: Struct1 = new Struct1(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)), FixedPoint(BigDecimal("-999"),FixFormat(true,32,0)))
          x3598_best_rising_0.initMem(x3597_tuple)
          x3599_best_rising_1.initMem(x3597_tuple)
          x3600_best_falling_0.initMem(x3597_tuple)
          x3601_best_falling_1.initMem(x3597_tuple)
          val x3603_deq_x536 = {
            val a0 = if (Bool(true,true) & b3596 & b520 && x536_input_fifo_0.nonEmpty) x536_input_fifo_0.dequeue() else FixedPoint.invalid(FixFormat(true,16,0))
            Array[FixedPoint](a0)
          }
          val x3604_elem_0 = x3603_deq_x536.apply(0)
          val x3605 = if (b3596 & b520) x3602_sr_0.shiftIn("Deriv.scala:97:14", Seq(FixedPoint(BigDecimal("0"),FixFormat(true,32,0))), 0, x3604_elem_0)
          val x3606 = x3602_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)))), Seq(b3596 & b520))
          val x3607_elem_0 = x3606.apply(0)
          val x3608 = x3607_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x3610 = x3602_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("1"),FixFormat(true,32,0)))), Seq(b3596 & b520))
          val x3611_elem_0 = x3610.apply(0)
          val x3612 = x3611_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x3613_x4 = FixedPoint(BigDecimal("0.000335693359375"),FixFormat(true,16,16)) * x3612
          val x3614 = x3602_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("2"),FixFormat(true,32,0)))), Seq(b3596 & b520))
          val x3615_elem_0 = x3614.apply(0)
          val x3616 = x3615_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x3618 = x3602_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("3"),FixFormat(true,32,0)))), Seq(b3596 & b520))
          val x3619_elem_0 = x3618.apply(0)
          val x3620 = x3619_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x3621_x4 = FixedPoint(BigDecimal("0.0084991455078125"),FixFormat(true,16,16)) * x3620
          val x3622 = x3602_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("4"),FixFormat(true,32,0)))), Seq(b3596 & b520))
          val x3623_elem_0 = x3622.apply(0)
          val x3624 = x3623_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x3626 = x3602_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("5"),FixFormat(true,32,0)))), Seq(b3596 & b520))
          val x3627_elem_0 = x3626.apply(0)
          val x3628 = x3627_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x3629_x4 = FixedPoint(BigDecimal("0.069122314453125"),FixFormat(true,16,16)) * x3628
          val x3630 = x3602_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("6"),FixFormat(true,32,0)))), Seq(b3596 & b520))
          val x3631_elem_0 = x3630.apply(0)
          val x3632 = x3631_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x3634 = x3602_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("7"),FixFormat(true,32,0)))), Seq(b3596 & b520))
          val x3635_elem_0 = x3634.apply(0)
          val x3636 = x3635_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x3637_x4 = FixedPoint(BigDecimal("0.1548919677734375"),FixFormat(true,16,16)) * x3636
          val x3638 = x3602_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("8"),FixFormat(true,32,0)))), Seq(b3596 & b520))
          val x3639_elem_0 = x3638.apply(0)
          val x3640 = x3639_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x3642 = x3602_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("10"),FixFormat(true,32,0)))), Seq(b3596 & b520))
          val x3643_elem_0 = x3642.apply(0)
          val x3644 = x3643_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x3646 = x3602_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("11"),FixFormat(true,32,0)))), Seq(b3596 & b520))
          val x3647_elem_0 = x3646.apply(0)
          val x3648 = x3647_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x3649_x4 = FixedPoint(BigDecimal("-0.1548919677734375"),FixFormat(true,16,16)) * x3648
          val x3650 = x3602_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("12"),FixFormat(true,32,0)))), Seq(b3596 & b520))
          val x3651_elem_0 = x3650.apply(0)
          val x3652 = x3651_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x3654 = x3602_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("13"),FixFormat(true,32,0)))), Seq(b3596 & b520))
          val x3655_elem_0 = x3654.apply(0)
          val x3656 = x3655_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x3657_x4 = FixedPoint(BigDecimal("-0.069122314453125"),FixFormat(true,16,16)) * x3656
          val x3658 = x3602_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("14"),FixFormat(true,32,0)))), Seq(b3596 & b520))
          val x3659_elem_0 = x3658.apply(0)
          val x3660 = x3659_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x3662 = x3602_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("15"),FixFormat(true,32,0)))), Seq(b3596 & b520))
          val x3663_elem_0 = x3662.apply(0)
          val x3664 = x3663_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x3665_x4 = FixedPoint(BigDecimal("-0.0084991455078125"),FixFormat(true,16,16)) * x3664
          val x3666 = x3602_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("16"),FixFormat(true,32,0)))), Seq(b3596 & b520))
          val x3667_elem_0 = x3666.apply(0)
          val x3668 = x3667_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x3670 = x3602_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("17"),FixFormat(true,32,0)))), Seq(b3596 & b520))
          val x3671_elem_0 = x3670.apply(0)
          val x3672 = x3671_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x3673_x4 = FixedPoint(BigDecimal("-0.000335693359375"),FixFormat(true,16,16)) * x3672
          val x3674 = x3602_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("18"),FixFormat(true,32,0)))), Seq(b3596 & b520))
          val x3675_elem_0 = x3674.apply(0)
          val x3676 = x3675_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x6081 = (FixedPoint(BigDecimal("0.0000457763671875"),FixFormat(true,16,16)) * x3608) + x3613_x4
          val x6082 = (FixedPoint(BigDecimal("0.001953125"),FixFormat(true,16,16)) * x3616) + x3621_x4
          val x6083 = (FixedPoint(BigDecimal("0.028045654296875"),FixFormat(true,16,16)) * x3624) + x3629_x4
          Map[String,Any]("x3632" -> x3632, "x3637_x4" -> x3637_x4, "x3640" -> x3640, "x3644" -> x3644, "x3649_x4" -> x3649_x4, "x3652" -> x3652, "x3657_x4" -> x3657_x4, "x3660" -> x3660, "x3665_x4" -> x3665_x4, "x3668" -> x3668, "x3673_x4" -> x3673_x4, "x3676" -> x3676, "x6081" -> x6081, "x6082" -> x6082, "x6083" -> x6083)
        }
      }
      val block15chunk0: Map[String, Any] = Block15Chunker0.gen()
      object Block15Chunker1 { // 39 nodes, 39 weight
        def gen(): Map[String, Any] = {
          val x6084 = (FixedPoint(BigDecimal("0.124359130859375"),FixFormat(true,16,16)) * block15chunk0("x3632").asInstanceOf[FixedPoint]) + block15chunk0("x3637_x4").asInstanceOf[FixedPoint]
          val x6085 = (FixedPoint(BigDecimal("-0.1126861572265625"),FixFormat(true,16,16)) * block15chunk0("x3644").asInstanceOf[FixedPoint]) + block15chunk0("x3649_x4").asInstanceOf[FixedPoint]
          val x6086 = (FixedPoint(BigDecimal("-0.124359130859375"),FixFormat(true,16,16)) * block15chunk0("x3652").asInstanceOf[FixedPoint]) + block15chunk0("x3657_x4").asInstanceOf[FixedPoint]
          val x6087 = (FixedPoint(BigDecimal("-0.028045654296875"),FixFormat(true,16,16)) * block15chunk0("x3660").asInstanceOf[FixedPoint]) + block15chunk0("x3665_x4").asInstanceOf[FixedPoint]
          val x6088 = (FixedPoint(BigDecimal("-0.001953125"),FixFormat(true,16,16)) * block15chunk0("x3668").asInstanceOf[FixedPoint]) + block15chunk0("x3673_x4").asInstanceOf[FixedPoint]
          val x3686_x3 = block15chunk0("x6081").asInstanceOf[FixedPoint] + block15chunk0("x6082").asInstanceOf[FixedPoint]
          val x3687_x4 = block15chunk0("x6083").asInstanceOf[FixedPoint] + x6084
          val x6089 = (FixedPoint(BigDecimal("0.1126861572265625"),FixFormat(true,16,16)) * block15chunk0("x3640").asInstanceOf[FixedPoint]) + x6085
          val x3689_x4 = x6086 + x6087
          val x6090 = (FixedPoint(BigDecimal("-0.0000457763671875"),FixFormat(true,16,16)) * block15chunk0("x3676").asInstanceOf[FixedPoint]) + x6088
          val x3691_x3 = x3686_x3 + x3687_x4
          val x3692_x4 = x6089 + x3689_x4
          val x3693_x3 = x3691_x3 + x3692_x4
          val x3694_t = x3693_x3 + x6090
          val x3695 = b3595 === FixedPoint(BigDecimal("20"),FixFormat(true,32,0))
          val x3696 = FixedPoint(BigDecimal("20"),FixFormat(true,32,0)) < b3595
          val x3697 = x3694_t.toFixedPoint(FixFormat(true,32,0))
          val x3698_rd_x3598 = x3598_best_rising_0.value
          val x3699_apply = x3698_rd_x3598.v
          val x3700 = x3699_apply < x3697
          val x3701 = x3696 && x3700
          val x3702 = x3695 || x3701
          val x3705_tuple: Struct1 = new Struct1(b3595, x3697)
          val x3706_wr_x3599 = if (x3702) x3599_best_rising_1.set(x3705_tuple)
          val x3707_wr_x3598 = if (x3702) x3598_best_rising_0.set(x3705_tuple)
          val x3711_rd_x3600 = x3600_best_falling_0.value
          val x3712_apply = x3711_rd_x3600.v
          val x3713 = x3697 < x3712_apply
          val x3714 = x3696 && x3713
          val x3715 = x3695 || x3714
          val x3719_wr_x3600 = if (x3715) x3600_best_falling_0.set(x3705_tuple)
          val x3720_wr_x3601 = if (x3715) x3601_best_falling_1.set(x3705_tuple)
          val x3724_rd_x470 = x470_COLS.value
          val x3725_sub = x3724_rd_x470 - FixedPoint(BigDecimal("1"),FixFormat(true,32,0))
          val x3726 = b3595 === x3725_sub
          val x3728_rd_x3599 = x3599_best_rising_1.value
          val x3729_enq_x552 = {
            if (Bool(true,true) & x3726) x552_rising_0.enqueue(x3728_rd_x3599)
          }
          val x3733_rd_x3601 = x3601_best_falling_1.value
          val x3734_enq_x568 = {
            if (Bool(true,true) & x3726) x568_falling_0.enqueue(x3733_rd_x3601)
          }
          Map[String,Any]()
        }
      }
      val block15chunk1: Map[String, Any] = Block15Chunker1.gen()
    }
  } else null.asInstanceOf[Unit]
}
/** END UnrolledForeach x3738_inr_Foreach **/
