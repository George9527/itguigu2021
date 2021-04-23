package A18_生产者与消费者;

// 2:生产者类(Producer)：实现Runnable接口，重写run()方法，调用存储牛奶的操作

public class Producer implements Runnable{

    private Box box;

    public Producer(Box box) {
        this.box = box;
    }


    // 重写run()方法，调用存储牛奶的操作
    @Override
    public void run() {
        for(int i=1; i<=30; i++) {
            // 调用存储牛奶的操作
            box.putMilk(i);
        }
    }
}
