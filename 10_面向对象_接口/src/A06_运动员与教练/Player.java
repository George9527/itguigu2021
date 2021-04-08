package A06_运动员与教练;
/*
    任务：
        1.创建抽象运动员类,继承人类
    构造方法：
        1：无参
        2：带参
    成员方法：
        1.学习 study();
 */
public abstract class Player extends Person{
    //无参构造方法
    public Player() {
    }

    //带参构造方法
    public Player(String name, int age) {
        super(name, age);
    }

    //学习方法
    public abstract void study();
}
