package A15_Lock死锁;

/*
    死锁简介：
        虽然我们可以理解同步代码块和同步方法的锁对象问题，
        但是我们并没有直接看到在哪里加上了锁，在哪里释放了锁，
        为了更清晰的表达如何加锁和释放锁，JDK5以后提供了一个新的锁对象Lock

   死锁程序 :
        多个线程同时争夺同一个锁资源,出现程序的假死现象.

    面试点 :
        考察开发人员是否充分理解同步代码的执行原理

   完成死锁的案例 :
        同步代码块的嵌套

    Lock是接口不能直接实例化，这里采用它的实现类ReentrantLock来实例化

    ReentrantLock构造方法：
        void lock()   ----   获得锁
        void unlock()   ----  释放锁
 */

public class ReentrantLockDemo {

    public static void main(String[] args) {

        ThreadDeadLock threadDeadLock = new ThreadDeadLock(true);
        ThreadDeadLock threadDeadLock2 = new ThreadDeadLock(false);

//        new Thread(threadDeadLock).start();
//        new Thread(threadDeadLock2).start();

        // 线程的构造方法
        Thread t1 = new Thread(threadDeadLock, "线程一：");
        Thread t2 = new Thread(threadDeadLock2, "线程二");

        // 启动线程
        t1.start();
        t2.start();
    }

}
