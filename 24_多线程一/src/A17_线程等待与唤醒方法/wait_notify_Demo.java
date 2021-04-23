package A17_线程等待与唤醒方法;

/*
    wait()和notify()示例的测试类
 */

public class wait_notify_Demo {
    public static void main(String[] args) {
        // 创建一个线程对象
        wait_notify thread = new wait_notify("thread");

        // 创建同步代码块来判断线程锁的状态
        synchronized (thread) {
            // 启动主线程
            System.out.println(Thread.currentThread().getName() + " 线程一 启动");
            thread.start();
            // 此时线程处于被锁状态，不能调用线程对象中的线程二

            // 主线程启动后，通过nottif 唤醒 线程一
            System.out.println(Thread.currentThread().getName() + " 线程一 暂停");
            try {
                thread.wait();
                // wait()的作用是让当前线程进入等待状态，同时，wait()也会让当前线程释放它所持有的锁。
                System.out.println(Thread.currentThread().getName() + " 线程一 继续");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


/*
结果说明：
如下图，说明了“主线程”和“线程t1”的流程。

(01) 注意，图中"主线程" 代表“主线程main”。"线程t1" 代表WaitTest中启动的“线程t1”。 而“锁” 代表“t1这个对象的同步锁”。
(02) “主线程”通过 new ThreadA("t1") 新建“线程t1”。随后通过synchronized(t1)获取“t1对象的同步锁”。然后调用t1.start()启动“线程t1”。
(03) “主线程”执行t1.wait() 释放“t1对象的锁”并且进入“等待(阻塞)状态”。等待t1对象上的线程通过notify() 或 notifyAll()将其唤醒。
(04) “线程t1”运行之后，通过synchronized(this)获取“当前对象的锁”；接着调用notify()唤醒“当前对象上的等待线程”，也就是唤醒“主线程”。
(05) “线程t1”运行完毕之后，释放“当前对象的锁”。紧接着，“主线程”获取“t1对象的锁”，然后接着运行。
 */