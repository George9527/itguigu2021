package A09_Runnable接口;

//- 定义类实现接口
// - 重写接口的抽象方法run()

public class SubRunnable implements Runnable{
    @Override
    public void run() {
        for (int x = 0; x < 50; x++) {

            /**
             * Thread类静态方法 : Thread currentThread()
             *    静态调用,作用是放回当前的线程对象
             */
            System.out.println(Thread.currentThread().getName() + "x: " + x);

        }
    }
}
