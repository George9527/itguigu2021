package A10_猫与狗抽象版;
/*
    任务：
        新建一个猫类，继承动物类
    包含：
        1.构造方法：无参，带参
        2.成员方法：重建 eat(); 方法
 */
public class Cat extends Animal{
    //成员方法：重建 eat(); 方法

    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }

    //构造方法：无参，带参

    public Cat() {
    }

    public Cat(int age, String name) {
        super(age, name);
    }
}
