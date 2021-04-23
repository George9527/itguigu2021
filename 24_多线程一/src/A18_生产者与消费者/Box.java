package A18_生产者与消费者;

// 1:奶箱类(Box)：定义一个成员变量，表示第x瓶奶，提供存储牛奶和获取牛奶的操作

public class Box {
    //定义一个成员变量，表示第x瓶奶
    private int milk;

    //定义一个成员变量，表示奶箱状态(false = 无)
    private boolean isState = false;

    //提供存储牛奶和获取牛奶的操作方法
    public synchronized void putMilk(int milk) {
        //如果有牛奶，等待消费
        if (isState) {
            try {
                wait(); // -- 让当前线程处于“等待(阻塞)状态”
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        //如果没有牛奶，就生产牛奶
        this.milk = milk;
        System.out.println("送奶工将第" + this.milk + "瓶奶放入奶箱");

        //生产完毕之后，修改奶箱状态
        isState = true;

        //唤醒其他等待的线程
        notifyAll(); // -- 唤醒在此对象监视器上等待的所有线程。
    }

    // 如果没有牛奶，等待生产,提供生产牛奶的方法
    public synchronized  void getMilk() {
        //如果没有牛奶，等待生产
        if (!isState) {
            try {
                wait(); // -- 让当前线程处于“等待(阻塞)状态”
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        // 奶箱如果有牛奶，用户就消费牛奶
        System.out.println("用户拿到第" + this.milk + "瓶奶");

        //用户消费完毕之后，就修改奶箱状态
        isState = false;

        //唤醒其他等待的线程
        notifyAll();
    }

}
