package A18_生产者与消费者;

// 3:消费者类(Customer)：实现Runnable接口，重写run()方法，调用获取牛奶的操作

public class Customer implements Runnable{

    private Box box;

    public Customer(Box box) {
        this.box = box;
    }

    // 消费者不断获取牛奶，
    @Override
    public void run() {
        while (true) {
            box.getMilk();
        }
    }
}
