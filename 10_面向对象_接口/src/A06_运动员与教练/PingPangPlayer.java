package A06_运动员与教练;

/*
    任务：
        1.定义具体乒乓球运动员类
        2.继承运动员类
        3.实现说英语接口
    构造方法：
        1.无参
        2.带参
    成员方法：
        1.重写eat()
        2.重写study()
        3.重写说英语speak()
 */

public class PingPangPlayer extends Player implements SpeakEnglish{

    //无参构造方法
    public PingPangPlayer() {
    }

    //带参构造方法
    public PingPangPlayer(String name, int age) {
        super(name, age);
    }

    //重写eat()
    @Override
    public void eat() {
        System.out.println("乒乓球运动员特供餐");
    }

    //重写study()
    @Override
    public void study() {
        System.out.println("乒乓球运动员：学习打乒乓球");
    }

    //重写说英语speak()
    @Override
    public void speak() {
        System.out.println("乒乓球运动员：学英语");
    }
}
