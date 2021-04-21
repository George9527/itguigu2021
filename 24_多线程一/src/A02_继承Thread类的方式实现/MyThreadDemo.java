package A02_继承Thread类的方式实现;
/*
    方式1：继承Thread类
        1:定义一个类MyThread继承Thread类
        2:在MyThread类中重写run()方法
        3:创建MyThread类的对象
        4:启动线程
 */
public class MyThreadDemo {
    public static void main(String[] args) {

        // 3:创建MyThread类的对象
        MyThread my1 = new MyThread();
        MyThread my2 = new MyThread();

        // 通过直接调用子类的方法 --- 非通过线程启动
//        my1.run();
//        my2.run();

        //void start​()
        // 导致此线程开始执行; Java虚拟机调用此线程的run方法
        my1.start();
//        my2.start();
    }
}
