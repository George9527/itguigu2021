package A14_同步方法;

public class SellTicket implements Runnable{

    private static int tickets = 100;
    private int x = 0;

    @Override
    public void run() {
        while (true) {
            sellTicket();
        }
    }

    //    同步方法
//    private synchronized void sellTicket() {
//        if (tickets > 0) {
//            try {
//                Thread.sleep(100);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            System.out.println(Thread.currentThread().getName() + "正在出售第" + tickets + "张票");
//            tickets--;
//        }
//    }

    /*
    静态同步方法：
    同步静态方法：就是把synchronized关键字加到静态方法上
    格式：
        修饰符 static synchronized 返回值类型 方法名(方法参数) {
        方法体；
    }
     */

    //  设置静态同步方法
    private static synchronized void sellTicket() {
        if (tickets > 0) {

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(Thread.currentThread().getName() + "正在出售第" + tickets + "张票");
            tickets--;
        }
    }
}
