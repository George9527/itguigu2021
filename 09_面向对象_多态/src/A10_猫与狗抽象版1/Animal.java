package A10_猫与狗抽象版1;
/*
    任务：
        新建一个动物类的抽象类
    包含：
        1.成员变量：姓名，年龄
        2.构造方法：无参，带参
        3.成员方法：get/set eat();
 */
public abstract  class Animal {

    // 成员变量
    private int age;
    private String name;

    //无参构造方法
    public Animal() {
    }

    //带参构造方法
    public Animal(int age, String name) {
        this.age = age;
        this.name = name;
    }

    //成员方法：get/set
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //抽象方法
    public abstract void eat();
}
