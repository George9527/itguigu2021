package A06_运动员与教练;
/*
   任务：
        1.创建抽象教练类，继承人类
   构造方法：
        1.无参
        2.带参
   成员方法：
        1.教();
 */
public abstract class Coach extends Person{

    //无参构造方法
    public Coach() {
    }

    //带参构造方法
    public Coach(String name, int age) {
        super(name, age);
    }

    //教();
    public abstract void teach();
}
