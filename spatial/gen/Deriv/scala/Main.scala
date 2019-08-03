import emul._
import emul.implicits._

object Main {
  def main(args: Array[String]): Unit = {
    OOB.open()
    val x459 = args
    if (args.contains("--help") || args.contains("-h")) { Main.printHelp() }
    val x460 = {
      val file = new java.io.File("/home/coffee/projects/TimeTool_deterministic_data/processed/xppc00117_r136_refsub_ipm4_del3.out")
      if (false) { // Will write to file
        val writer = new java.io.PrintWriter(file)
        writer.print("")
      }
      file
    }
    val x461 = {
      val scanner = new java.util.Scanner(x460)
      val tokens = new scala.collection.mutable.ArrayBuffer[String]() 
      scanner.useDelimiter("\\s*" + " " + "\\s*|\\s*\n\\s*")
      while (scanner.hasNext) {
        tokens += scanner.next.trim
      }
      scanner.close()
      tokens.toArray
    }
    val x462 = {
      val scanner = new java.util.Scanner(x460)
      val tokens = new scala.collection.mutable.ArrayBuffer[String]() 
      scanner.useDelimiter("\\s*" + "\n" + "\\s*|\\s*\n\\s*")
      while (scanner.hasNext) {
        tokens += scanner.next.trim
      }
      scanner.close()
      tokens.toArray
    }
    val x466 = Array.tabulate(x461.length){bbb => 
      val b5 = FixedPoint.fromInt(bbb)
      val x464 = x461.apply(b5)
      val x465 = FixedPoint(x464, FixFormat(true,16,0))
      x465
    }
    val x467 = FixedPoint.fromInt(x462.length)
    val x468 = FixedPoint.fromInt(x461.length)
    val x469_div = x468 / x467
    x470_COLS.initMem(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)))
    x471_ROWS.initMem(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)))
    x472_ROWS_TODO.initMem(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)))
    val x473_set_x470 = x470_COLS.set(x469_div)
    val x474_set_x471 = x471_ROWS.set(x467)
    // Commandline argument #FixedPoint(BigDecimal("0"),FixFormat(true,32,0)) (<unnamed>)
    val x475 = try{ x459.apply(FixedPoint(BigDecimal("0"),FixFormat(true,32,0))) }
    catch {case _:Throwable =>
      println("Missing argument " + FixedPoint(BigDecimal("0"),FixFormat(true,32,0)) + " ('[unnamed (line 77)]')")
      Main.printHelp()
      sys.exit(-1)
    }
    val x476 = FixedPoint(x475, FixFormat(true,32,0))
    val x477_set_x472 = x472_ROWS_TODO.set(x476)
    val x478_rd_x471 = x471_ROWS.value
    val x479_rd_x470 = x470_COLS.value
    x480_input_dram.initMem(x478_rd_x471*x479_rd_x470 + 32,FixedPoint(BigDecimal("0"),FixFormat(true,16,0)))
    val x481 = {
      for (i <- 0 until x466.length) {
        try {
          try {
            x480_input_dram(i) = x466(i)
          }
          catch {case err: java.lang.ArrayIndexOutOfBoundsException => 
            System.out.println("[warn] Deriv.scala:79:11 Memory x466: Out of bounds read at address " + err.getMessage)
            FixedPoint.invalid(FixFormat(true,16,0))
          }
        }
        catch {case err: java.lang.ArrayIndexOutOfBoundsException => 
          System.out.println("[warn] Deriv.scala:79:11 Memory input_dram: Out of bounds write at address " + err.getMessage)
        }
      }
    }
    val x482_rd_x472 = x472_ROWS_TODO.value
    val x483_tuple: Struct1 = new Struct1(FixedPoint(BigDecimal("0"),FixFormat(true,32,0)), FixedPoint(BigDecimal("0"),FixFormat(true,32,0)))
    x484_output_rising_dram.initMem(x482_rd_x472 + 8,x483_tuple)
    val x485_rd_x472 = x472_ROWS_TODO.value
    x486_output_falling_dram.initMem(x485_rd_x472 + 8,x483_tuple)
    val x190_outr_RootController = x190_outr_RootController_kernel.run()
    val x5790 = new Array[Struct1](x482_rd_x472)
    val x5791 = {
      for (i <- 0 until x5790.length) {
        try {
          try {
            x5790(i) = x484_output_rising_dram(i)
          }
          catch {case err: java.lang.ArrayIndexOutOfBoundsException => 
            System.out.println("[warn] Deriv.scala:117:36 Memory output_rising_dram: Out of bounds read at address " + err.getMessage)
            Struct1(FixedPoint.invalid(FixFormat(true,32,0)), FixedPoint.invalid(FixFormat(true,32,0)))
          }
        }
        catch {case err: java.lang.ArrayIndexOutOfBoundsException => 
          System.out.println("[warn] Deriv.scala:117:36 Memory result_rising_dram: Out of bounds write at address " + err.getMessage)
        }
      }
    }
    val x5792 = "Rising:" + "\n"
    val x5793 = if (TRUE) System.out.print(x5792)
    val x5794 = FixedPoint.fromInt(x5790.length)
    val x5799 = for (b196 <- FixedPoint(BigDecimal("0"),FixFormat(true,32,0)) until x5794 by FixedPoint(BigDecimal("1"),FixFormat(true,32,0))) {
      val x5795 = x5790.apply(b196)
      val x5796 = x5795.toString
      val x5797 = x5796 + " "
      val x5798 = if (TRUE) System.out.print(x5797)
    }
    val x5800 = if (TRUE) System.out.print("\n")
    val x5801 = new Array[Struct1](x485_rd_x472)
    val x5802 = {
      for (i <- 0 until x5801.length) {
        try {
          try {
            x5801(i) = x486_output_falling_dram(i)
          }
          catch {case err: java.lang.ArrayIndexOutOfBoundsException => 
            System.out.println("[warn] Deriv.scala:119:37 Memory output_falling_dram: Out of bounds read at address " + err.getMessage)
            Struct1(FixedPoint.invalid(FixFormat(true,32,0)), FixedPoint.invalid(FixFormat(true,32,0)))
          }
        }
        catch {case err: java.lang.ArrayIndexOutOfBoundsException => 
          System.out.println("[warn] Deriv.scala:119:37 Memory result_falling_dram: Out of bounds write at address " + err.getMessage)
        }
      }
    }
    val x5803 = "Falling:" + "\n"
    val x5804 = if (TRUE) System.out.print(x5803)
    val x5805 = FixedPoint.fromInt(x5801.length)
    val x5810 = for (b208 <- FixedPoint(BigDecimal("0"),FixFormat(true,32,0)) until x5805 by FixedPoint(BigDecimal("1"),FixFormat(true,32,0))) {
      val x5806 = x5801.apply(b208)
      val x5807 = x5806.toString
      val x5808 = x5807 + " "
      val x5809 = if (TRUE) System.out.print(x5808)
    }
    val x5811 = if (TRUE) System.out.print("\n")
    OOB.close()
  }
  def printHelp(): Unit = {
    System.out.print("Help for app: Deriv\n")
    System.out.print("  -- Args:    <0: [unnamed (line 77)]>\n");
    System.exit(0);
  }
}
