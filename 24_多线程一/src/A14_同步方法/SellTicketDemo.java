package A14_同步方法;

/*
同步方法解决数据安全问题：

  同步方法的格式：
      修饰符 synchronized 返回值类型 方法名(方法参数) {
        方法体；
    }

  同步方法：
   当一个方法中,所有代码都是线程操作的共享内容,
   可以在方法的定义上添加同步的关键字 synchronized ,
   同步的方法,或者称为同步的函数.

  就是把synchronized关键字加到方法上
  格式：
       修饰符 synchronized 返回值类型 方法名(方法参数) {
	方法体；
}

  同步方法的锁对象是什么呢?
    this对象

   同步静态方法的锁对象是什么呢?
    锁对象是本类.class属性. 这个属性表示这个类的class文件的对象.
    格式：
        类名.class

  静态同步方法：
    同步静态方法：就是把synchronized关键字加到静态方法上
    格式：
        修饰符 static synchronized 返回值类型 方法名(方法参数) {
        方法体；
    }

    同步静态方法与同步普通方法有什么区别？
        同步静态方法的锁是加在类上，
        同步非静态方法的锁是加在那个对象上

 */

public class SellTicketDemo {

    public static void main(String[] args) {
        SellTicket st = new SellTicket();

        Thread t1 = new Thread(st, "窗口1");
        Thread t2 = new Thread(st, "窗口2");
        Thread t3 = new Thread(st, "窗口3");

        t2.start();
        t1.start();
        t3.start();
    }

}
