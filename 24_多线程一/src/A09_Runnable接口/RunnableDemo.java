package A09_Runnable接口;
/*
    ## 3. Java实现线程程序

### 3.1 java.lang.Runnable接口

- 实现线程程序的步骤 :
  - 定义类实现接口
  - 重写接口的抽象方法run()
  - 创建Thread类对象
    - Thread类构造方法中,传递Runnable接口的实现类对象
  - 调用Thread对象方法start()启动线程

 */
public class RunnableDemo {
    public static void main(String[] args) {
        //创建接口实现类对象
        Runnable r = new SubRunnable();
        //创建Thread对象,构造方法传递接口实现类
        Thread t0 = new Thread(r);
        t0.start();

//        for(int x = 0 ; x < 50 ;x++){
//            System.out.println(Thread.currentThread().getName()+"x.."+x);
//        }
    }
}
