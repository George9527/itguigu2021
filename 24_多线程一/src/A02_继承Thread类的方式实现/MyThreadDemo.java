package A02_继承Thread类的方式实现;
/*
    方式1：继承Thread类
        1:定义一个类MyThread继承Thread类
        2:在MyThread类中重写run()方法
        3:创建MyThread类的对象
        4:启动线程

   实现接口的好处
      接口实现好处是设计上的分离效果 : 线程要执行的任务和线程对象本身是分离的.
      继承Thread重写方法run() : Thread是线程对象,run()是线程要执行的任务
      实现Runnable接口 : 方法run在实现类,和线程无关,创建Thread类传递接口的实现类对象,线程的任务和Thread没有联系, 解开耦合性
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
