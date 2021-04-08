package A06_运动员与教练;

/*
    任务：
        1.定义具体篮球教练类
        2.继承教练类
    构造方法：
        1.无参
        2.带参
    成员方法：
        1.重写eat()
        2.重写tech()
        3.重写说英语speak()
 */

public class PingPangCoach extends Coach implements SpeakEnglish{

    //无参构造方法
    public PingPangCoach() {
    }

    //带参构造方法
    public PingPangCoach(String name, int age) {
        super(name, age);
    }

    //重写eat()
    @Override
    public void eat() {
        System.out.println("乒乓球教练特供餐");
    }

    //重写tech()
    @Override
    public void teach() {
        System.out.println("乒乓球教练：教乒乓球");
    }

    //重写说英语speak()
    @Override
    public void speak() {
        System.out.println("乒乓球教练：学英语");
    }
}
