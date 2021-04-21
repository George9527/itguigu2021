package A03_设置和捕获线程名称;

/*
    Thread类中获取和设置线程名称的方法
        void setName(String name)：将此线程的名称更改为等于参数 name
        String getName()：返回此线程的名称，返回值是String类型

        两个小问题
        - 为什么要重写run()方法？
            因为run()是用来封装被线程执行的代码

        - run()方法和start()方法的区别？
            run()：封装线程执行的代码，直接调用，相当于普通方法的调用
            start()：启动线程；然后由JVM调用此线程的run()方法
 */

public class MyThreadDemo {
    public static void main(String[] args) {
        MyThread my1 = new MyThread();
        MyThread my2 = new MyThread();

        //void setName(String name)：将此线程的名称更改为等于参数 name
        my1.setName("高铁");
        my2.setName("飞机");

//        my1.run();

        my1.start();
        my2.start();

        //static Thread currentThread​() 返回对当前正在执行的线程对象的引用
        System.out.println(Thread.currentThread().getName());
    }
}
