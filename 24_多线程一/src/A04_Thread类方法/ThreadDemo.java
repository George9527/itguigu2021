package A04_Thread类方法;

/*
    Thread类的方法 join()

- 解释,执行join()方法的线程,他不结束,其它线程运行不了
 */
public class ThreadDemo {
    public static void main(String[] args) {
        ThreadName threadName = new ThreadName();
        threadName.setName("旺财");

        ThreadName threadName1 = new ThreadName();
        threadName1.setName("小强");

        threadName.start();

//        threadName.join();
        //执行join()方法的线程,他不结束,其它线程运行不了

        threadName1.start();
    }

}
