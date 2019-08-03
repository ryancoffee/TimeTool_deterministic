import emul._
import emul.implicits._

/** BEGIN ParallelPipe x3883 **/
object x3883_kernel {
  def run(
    b518: Bool,
    x1569_ctrchain: Array[Counterlike],
    b511: Bool,
    x1576_ctrchain: Array[Counterlike],
    x1577_ctrchain: Array[Counterlike],
    x1572_ctrchain: Array[Counterlike],
    x1568_ctrchain: Array[Counterlike],
    b514: Bool,
    b507: Bool,
    x1564_ctrchain: Array[Counterlike],
    b512: Bool,
    x1570_ctrchain: Array[Counterlike],
    x1573_ctrchain: Array[Counterlike],
    b519: Bool,
    x1567_ctrchain: Array[Counterlike],
    b515: Bool,
    b508: Bool,
    x1563_ctrchain: Array[Counterlike],
    b513: Bool,
    x1574_ctrchain: Array[Counterlike],
    b509: Bool,
    x1571_ctrchain: Array[Counterlike],
    b520: Bool,
    b521: Bool,
    b516: Bool,
    x1566_ctrchain: Array[Counterlike],
    x1575_ctrchain: Array[Counterlike],
    b517: Bool,
    b510: Bool,
    x1578_ctrchain: Array[Counterlike],
    b506: Bool,
    x1565_ctrchain: Array[Counterlike]
  ): Unit = {
    val x1722_inr_Foreach = x1722_inr_Foreach_kernel.run(x1563_ctrchain, b506)
    val x1866_inr_Foreach = x1866_inr_Foreach_kernel.run(b507, x1564_ctrchain)
    val x2010_inr_Foreach = x2010_inr_Foreach_kernel.run(b508, x1565_ctrchain)
    val x2154_inr_Foreach = x2154_inr_Foreach_kernel.run(b509, x1566_ctrchain)
    val x2298_inr_Foreach = x2298_inr_Foreach_kernel.run(x1567_ctrchain, b510)
    val x2442_inr_Foreach = x2442_inr_Foreach_kernel.run(b511, x1568_ctrchain)
    val x2586_inr_Foreach = x2586_inr_Foreach_kernel.run(x1569_ctrchain, b512)
    val x2730_inr_Foreach = x2730_inr_Foreach_kernel.run(x1570_ctrchain, b513)
    val x2874_inr_Foreach = x2874_inr_Foreach_kernel.run(b514, x1571_ctrchain)
    val x3018_inr_Foreach = x3018_inr_Foreach_kernel.run(x1572_ctrchain, b515)
    val x3162_inr_Foreach = x3162_inr_Foreach_kernel.run(x1573_ctrchain, b516)
    val x3306_inr_Foreach = x3306_inr_Foreach_kernel.run(x1574_ctrchain, b517)
    val x3450_inr_Foreach = x3450_inr_Foreach_kernel.run(b518, x1575_ctrchain)
    val x3594_inr_Foreach = x3594_inr_Foreach_kernel.run(x1576_ctrchain, b519)
    val x3738_inr_Foreach = x3738_inr_Foreach_kernel.run(x1577_ctrchain, b520)
    val x3882_inr_Foreach = x3882_inr_Foreach_kernel.run(b521, x1578_ctrchain)
  } 
}
/** END ParallelPipe x3883 **/
