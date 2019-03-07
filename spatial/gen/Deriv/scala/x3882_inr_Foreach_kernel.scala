import emul._
import emul.implicits._

/** BEGIN UnrolledForeach x3882_inr_Foreach **/
object x3882_inr_Foreach_kernel {
  def run(
    b521: Bool,
    x1578_ctrchain: Array[Counterlike]
  ): Unit = if (b521){
    x1578_ctrchain(0).foreach{case (is,vs) => 
      val b3739 = is(0)
      val b3740 = vs(0)
      object Block16Chunker0 { // 74 nodes, 74 weight
        def gen(): Map[String, Any] = {
          val x3741_tuple: Struct1 = new Struct1(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)), FixedPoint(BigDecimal("-999"),FixFormat(true,32,0)))
          x3742_best_rising_0.initMem(x3741_tuple)
          x3743_best_rising_1.initMem(x3741_tuple)
          x3744_best_falling_0.initMem(x3741_tuple)
          x3745_best_falling_1.initMem(x3741_tuple)
          val x3747_deq_x537 = {
            val a0 = if (Bool(true,true) & b3740 & b521 && x537_input_fifo_0.nonEmpty) x537_input_fifo_0.dequeue() else FixedPoint.invalid(FixFormat(true,16,0))
            Array[FixedPoint](a0)
          }
          val x3748_elem_0 = x3747_deq_x537.apply(0)
          val x3749 = if (b3740 & b521) x3746_sr_0.shiftIn("Deriv.scala:97:14", Seq(FixedPoint(BigDecimal("0"),FixFormat(true,32,0))), 0, x3748_elem_0)
          val x3750 = x3746_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)))), Seq(b3740 & b521))
          val x3751_elem_0 = x3750.apply(0)
          val x3752 = x3751_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x3754 = x3746_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("1"),FixFormat(true,32,0)))), Seq(b3740 & b521))
          val x3755_elem_0 = x3754.apply(0)
          val x3756 = x3755_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x3757_x4 = FixedPoint(BigDecimal("0.000335693359375"),FixFormat(true,16,16)) * x3756
          val x3758 = x3746_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("2"),FixFormat(true,32,0)))), Seq(b3740 & b521))
          val x3759_elem_0 = x3758.apply(0)
          val x3760 = x3759_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x3762 = x3746_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("3"),FixFormat(true,32,0)))), Seq(b3740 & b521))
          val x3763_elem_0 = x3762.apply(0)
          val x3764 = x3763_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x3765_x4 = FixedPoint(BigDecimal("0.0084991455078125"),FixFormat(true,16,16)) * x3764
          val x3766 = x3746_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("4"),FixFormat(true,32,0)))), Seq(b3740 & b521))
          val x3767_elem_0 = x3766.apply(0)
          val x3768 = x3767_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x3770 = x3746_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("5"),FixFormat(true,32,0)))), Seq(b3740 & b521))
          val x3771_elem_0 = x3770.apply(0)
          val x3772 = x3771_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x3773_x4 = FixedPoint(BigDecimal("0.069122314453125"),FixFormat(true,16,16)) * x3772
          val x3774 = x3746_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("6"),FixFormat(true,32,0)))), Seq(b3740 & b521))
          val x3775_elem_0 = x3774.apply(0)
          val x3776 = x3775_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x3778 = x3746_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("7"),FixFormat(true,32,0)))), Seq(b3740 & b521))
          val x3779_elem_0 = x3778.apply(0)
          val x3780 = x3779_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x3781_x4 = FixedPoint(BigDecimal("0.1548919677734375"),FixFormat(true,16,16)) * x3780
          val x3782 = x3746_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("8"),FixFormat(true,32,0)))), Seq(b3740 & b521))
          val x3783_elem_0 = x3782.apply(0)
          val x3784 = x3783_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x3786 = x3746_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("10"),FixFormat(true,32,0)))), Seq(b3740 & b521))
          val x3787_elem_0 = x3786.apply(0)
          val x3788 = x3787_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x3790 = x3746_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("11"),FixFormat(true,32,0)))), Seq(b3740 & b521))
          val x3791_elem_0 = x3790.apply(0)
          val x3792 = x3791_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x3793_x4 = FixedPoint(BigDecimal("-0.1548919677734375"),FixFormat(true,16,16)) * x3792
          val x3794 = x3746_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("12"),FixFormat(true,32,0)))), Seq(b3740 & b521))
          val x3795_elem_0 = x3794.apply(0)
          val x3796 = x3795_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x3798 = x3746_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("13"),FixFormat(true,32,0)))), Seq(b3740 & b521))
          val x3799_elem_0 = x3798.apply(0)
          val x3800 = x3799_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x3801_x4 = FixedPoint(BigDecimal("-0.069122314453125"),FixFormat(true,16,16)) * x3800
          val x3802 = x3746_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("14"),FixFormat(true,32,0)))), Seq(b3740 & b521))
          val x3803_elem_0 = x3802.apply(0)
          val x3804 = x3803_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x3806 = x3746_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("15"),FixFormat(true,32,0)))), Seq(b3740 & b521))
          val x3807_elem_0 = x3806.apply(0)
          val x3808 = x3807_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x3809_x4 = FixedPoint(BigDecimal("-0.0084991455078125"),FixFormat(true,16,16)) * x3808
          val x3810 = x3746_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("16"),FixFormat(true,32,0)))), Seq(b3740 & b521))
          val x3811_elem_0 = x3810.apply(0)
          val x3812 = x3811_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x3814 = x3746_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("17"),FixFormat(true,32,0)))), Seq(b3740 & b521))
          val x3815_elem_0 = x3814.apply(0)
          val x3816 = x3815_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x3817_x4 = FixedPoint(BigDecimal("-0.000335693359375"),FixFormat(true,16,16)) * x3816
          val x3818 = x3746_sr_0.apply("Deriv.scala:98:78", Seq(Seq(FixedPoint(BigDecimal("18"),FixFormat(true,32,0)))), Seq(b3740 & b521))
          val x3819_elem_0 = x3818.apply(0)
          val x3820 = x3819_elem_0.toFixedPoint(FixFormat(true,16,16))
          val x6091 = (FixedPoint(BigDecimal("0.0000457763671875"),FixFormat(true,16,16)) * x3752) + x3757_x4
          val x6092 = (FixedPoint(BigDecimal("0.001953125"),FixFormat(true,16,16)) * x3760) + x3765_x4
          val x6093 = (FixedPoint(BigDecimal("0.028045654296875"),FixFormat(true,16,16)) * x3768) + x3773_x4
          Map[String,Any]("x3776" -> x3776, "x3781_x4" -> x3781_x4, "x3784" -> x3784, "x3788" -> x3788, "x3793_x4" -> x3793_x4, "x3796" -> x3796, "x3801_x4" -> x3801_x4, "x3804" -> x3804, "x3809_x4" -> x3809_x4, "x3812" -> x3812, "x3817_x4" -> x3817_x4, "x3820" -> x3820, "x6091" -> x6091, "x6092" -> x6092, "x6093" -> x6093)
        }
      }
      val block16chunk0: Map[String, Any] = Block16Chunker0.gen()
      object Block16Chunker1 { // 39 nodes, 39 weight
        def gen(): Map[String, Any] = {
          val x6094 = (FixedPoint(BigDecimal("0.124359130859375"),FixFormat(true,16,16)) * block16chunk0("x3776").asInstanceOf[FixedPoint]) + block16chunk0("x3781_x4").asInstanceOf[FixedPoint]
          val x6095 = (FixedPoint(BigDecimal("-0.1126861572265625"),FixFormat(true,16,16)) * block16chunk0("x3788").asInstanceOf[FixedPoint]) + block16chunk0("x3793_x4").asInstanceOf[FixedPoint]
          val x6096 = (FixedPoint(BigDecimal("-0.124359130859375"),FixFormat(true,16,16)) * block16chunk0("x3796").asInstanceOf[FixedPoint]) + block16chunk0("x3801_x4").asInstanceOf[FixedPoint]
          val x6097 = (FixedPoint(BigDecimal("-0.028045654296875"),FixFormat(true,16,16)) * block16chunk0("x3804").asInstanceOf[FixedPoint]) + block16chunk0("x3809_x4").asInstanceOf[FixedPoint]
          val x6098 = (FixedPoint(BigDecimal("-0.001953125"),FixFormat(true,16,16)) * block16chunk0("x3812").asInstanceOf[FixedPoint]) + block16chunk0("x3817_x4").asInstanceOf[FixedPoint]
          val x3830_x3 = block16chunk0("x6091").asInstanceOf[FixedPoint] + block16chunk0("x6092").asInstanceOf[FixedPoint]
          val x3831_x4 = block16chunk0("x6093").asInstanceOf[FixedPoint] + x6094
          val x6099 = (FixedPoint(BigDecimal("0.1126861572265625"),FixFormat(true,16,16)) * block16chunk0("x3784").asInstanceOf[FixedPoint]) + x6095
          val x3833_x4 = x6096 + x6097
          val x6100 = (FixedPoint(BigDecimal("-0.0000457763671875"),FixFormat(true,16,16)) * block16chunk0("x3820").asInstanceOf[FixedPoint]) + x6098
          val x3835_x3 = x3830_x3 + x3831_x4
          val x3836_x4 = x6099 + x3833_x4
          val x3837_x3 = x3835_x3 + x3836_x4
          val x3838_t = x3837_x3 + x6100
          val x3839 = b3739 === FixedPoint(BigDecimal("20"),FixFormat(true,32,0))
          val x3840 = FixedPoint(BigDecimal("20"),FixFormat(true,32,0)) < b3739
          val x3841 = x3838_t.toFixedPoint(FixFormat(true,32,0))
          val x3842_rd_x3742 = x3742_best_rising_0.value
          val x3843_apply = x3842_rd_x3742.v
          val x3844 = x3843_apply < x3841
          val x3845 = x3840 && x3844
          val x3846 = x3839 || x3845
          val x3849_tuple: Struct1 = new Struct1(b3739, x3841)
          val x3850_wr_x3743 = if (x3846) x3743_best_rising_1.set(x3849_tuple)
          val x3851_wr_x3742 = if (x3846) x3742_best_rising_0.set(x3849_tuple)
          val x3855_rd_x3744 = x3744_best_falling_0.value
          val x3856_apply = x3855_rd_x3744.v
          val x3857 = x3841 < x3856_apply
          val x3858 = x3840 && x3857
          val x3859 = x3839 || x3858
          val x3863_wr_x3744 = if (x3859) x3744_best_falling_0.set(x3849_tuple)
          val x3864_wr_x3745 = if (x3859) x3745_best_falling_1.set(x3849_tuple)
          val x3868_rd_x470 = x470_COLS.value
          val x3869_sub = x3868_rd_x470 - FixedPoint(BigDecimal("1"),FixFormat(true,32,0))
          val x3870 = b3739 === x3869_sub
          val x3872_rd_x3743 = x3743_best_rising_1.value
          val x3873_enq_x553 = {
            if (Bool(true,true) & x3870) x553_rising_0.enqueue(x3872_rd_x3743)
          }
          val x3877_rd_x3745 = x3745_best_falling_1.value
          val x3878_enq_x569 = {
            if (Bool(true,true) & x3870) x569_falling_0.enqueue(x3877_rd_x3745)
          }
          Map[String,Any]()
        }
      }
      val block16chunk1: Map[String, Any] = Block16Chunker1.gen()
    }
  } else null.asInstanceOf[Unit]
}
/** END UnrolledForeach x3882_inr_Foreach **/
