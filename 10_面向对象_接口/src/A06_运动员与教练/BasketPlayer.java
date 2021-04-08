package A06_运动员与教练;

/*
    任务：
        1.定义具体篮球运动员类
        2.继承运动员类
    构造方法：
        1.无参
        2.带参
    成员方法：
        1.重写eat()
        2.重写study()
 */

public class BasketPlayer extends Player{

    //无参构造方法
    public BasketPlayer() {
    }

    //带参构造方法
    public BasketPlayer(String name, int age) {
        super(name, age);
    }

    //重写eat()
    @Override
    public void eat() {
        System.out.println("篮球运动员特供餐");
    }

    //重写study()
    @Override
    public void study() {
        System.out.println("篮球运动员：学习打篮球");
    }
}
