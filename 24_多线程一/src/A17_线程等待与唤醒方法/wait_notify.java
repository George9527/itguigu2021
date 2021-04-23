package A17_线程等待与唤醒方法;

/*
    wait()和notify()示例
 */

public class wait_notify extends Thread{

    public wait_notify(String name) {
        super(name);
    }

    @Override
    public void run() {
        synchronized (this) {
            System.out.println(Thread.currentThread().getName() + " 线程二 启动");
            // 唤醒当前线程
            notify();
        }
    }
}
