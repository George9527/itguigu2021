package A02_继承Thread类的方式实现;

/*

1:定义一个类MyThread继承Thread类

    //- 定义类继承Thread
    //- 子类重写方法run
 */

//- 定义类继承Thread
public class MyThread extends Thread {

    //- 子类重写方法run
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("线程 Nium： " + i);
        }
    }
}
