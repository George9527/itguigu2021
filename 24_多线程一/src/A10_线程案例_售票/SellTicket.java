package A10_线程案例_售票;

/*
    案例需求:
        某电影院目前正在上映国产大片，共有100张票，而它有3个窗口卖票，请设计一个程序模拟该电影院卖票

    实现步骤:
       1.定义一个类SellTicket实现Runnable接口，里面定义一个成员变量：private int tickets = 100;

       2.在SellTicket类中重写run()方法实现卖票，代码步骤如下
          - 判断票数大于0，就卖票，并告知是哪个窗口卖的
          - 卖了票之后，总票数要减1
          - 票没有了，也可能有人来问，所以这里用死循环让卖票的动作一直执行
 */
public class SellTicket implements Runnable {

    // 定义一个成员变量
    private int tickets = 100;

    // 重写run()方法现卖票
    @Override
    public void run() {
        // 死循环让卖票的动作一直执行
        while (true) {
            // 判断票数大于0，就卖票
            if (tickets > 0) {
                System.out.println(
                        // 告知是哪个窗口卖的
                        Thread.currentThread().getName() +
                                "正在出售第" + tickets + "张票"
                );
                // 卖了票之后，总票数要减1
                tickets--;
            }
        }
    }
}
