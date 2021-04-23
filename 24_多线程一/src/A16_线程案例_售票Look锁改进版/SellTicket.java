package A16_线程案例_售票Look锁改进版;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SellTicket implements Runnable{

    private int tickets = 100;

    // 创建一个死锁对象
    private Lock lock = new ReentrantLock();

    // 重写run方法
    @Override
    public void run() {
        // 死循环
        while (true) {
            // 捕获异常
            try {
                // 进程进入后锁死线程
                lock.lock();
                // 判断是否有票
                if (tickets > 0) {
                    // 捕获异常
                    try {
                        // 线程延迟
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    // 输出信息
                    System.out.println(Thread.currentThread().getName() + "正在出售第" + tickets + "张票");
                    // 票数减一
                    tickets--;
                }
            } finally {
                // 线程解锁
                lock.unlock();
            }
        }
    }
}
