package day10;
/*
定义一个抽象类Person，
    有name,age,sex三个属性，
    创建构造函数，给这三个属性赋值，
    有两个抽象方法work和hello；
 */
public abstract class Person {

    private String name;
    private int age;
    private int sex;

    public Person() {
    }

    public Person(String name, int age, int sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    // 创建描述信息的具体方法
    public void showInfo() {
        System.out.println(getName() + " : " + getAge() + " : " + getSex());
    }

    // 有两个抽象方法work和hello；

    public abstract void work();

    public abstract void hello();
}
