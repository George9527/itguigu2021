package A15_Lock死锁;

/**
 * 实现死锁程序
 */

public class ThreadDeadLock implements Runnable{

    private boolean flag;
    public  ThreadDeadLock(boolean flag) {
        this.flag = flag;
    }

    @Override
    public void run() {
        while (true) {
            //同步代码块的嵌套
            if (flag) {
                //先进入A锁同步
                synchronized (LockA.lockA) {
                    System.out.println("线程获取A锁");
                    //在进入另一个同步B锁
                    synchronized (LockB.lockB) {
                        System.out.println("线程获取B锁");
                    }
                }
            } else {
                //先进入B锁同步
                synchronized (LockB.lockB) {
                    System.out.println("线程进入B锁");
                    //再进入另一个同步锁A锁
                    synchronized (LockA.lockA) {
                        System.out.println("线程进入B锁");
                    }
                }
            }
        }
    }
}
