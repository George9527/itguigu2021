package A09_Runnable接口;

/*
实现步骤

- 定义一个类MyRunnable实现Runnable接口
- 在MyRunnable类中重写run()方法
- 创建MyRunnable类的对象
- 创建Thread类的对象，把MyRunnable对象作为构造方法的参数
- 启动线程
 */

public class MyRunnable implements Runnable{
    //在MyRunnable类中重写run()方法

    @Override
    public void run() {
        // 输出线程名称与遍历100次
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + ":" + i);
        }
    }
}
