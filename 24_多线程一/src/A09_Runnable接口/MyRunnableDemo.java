package A09_Runnable接口;

/*
Thread构造方法:
    方法名：
        Thread(Runnable target)    分配一个新的Thread对象
        Thread(Runnable target, String name)   分配一个新的Thread对象

实现步骤:
    - 定义一个类MyRunnable实现Runnable接口
    - 在MyRunnable类中重写run()方法
    - 创建MyRunnable类的对象
    - 创建Thread类的对象，把MyRunnable对象作为构造方法的参数
    - 启动线程
 */

public class MyRunnableDemo {
    public static void main(String[] args) {

        // 创建MyRunnable类的对象
        MyRunnable myRunnable = new MyRunnable();

        // 创建Thread类的对象，把MyRunnable对象作为构造方法的参数

        // 方法一： Thread(Runnable target)
        Thread t1 = new Thread(myRunnable); // Thread-0:10
        Thread t2 = new Thread(myRunnable); // Thread-1:23

        // 方法二： Thread(Runnable target, String name)
//        Thread t1 = new Thread(myRunnable,"高铁"); // 高铁:98
//        Thread t2 = new Thread(myRunnable,"飞机"); // 飞机:99

        // 启动线程
        t1.start();
        t2.start();
    }
}
