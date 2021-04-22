package A06_线程控制_sleep;

/*
    方法名 :
        static void sleep(long millis)
    说明：
        使当前正在执行的线程停留（暂停执行）指定的毫秒数
 */
public class ThreadSleep extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName() + ":" + i);
            try {

                // 当前正在执行的线程停留（暂停执行）指定的毫秒数
                Thread.sleep(1000);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
