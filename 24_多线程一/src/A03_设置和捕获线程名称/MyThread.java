package A03_设置和捕获线程名称;

public class MyThread extends Thread {

    public MyThread() {
    }

    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("线程名字:: " + super.getName() + " : " + i);
        }
    }
}
