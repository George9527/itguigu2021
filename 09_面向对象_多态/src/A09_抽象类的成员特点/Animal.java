package A09_抽象类的成员特点;
/*
    抽象类
 */

public abstract class Animal {

    private int age = 20;
    private String home = "河北";

    // final 修饰符 将该变量注释为常量
    private final String city = "北京";

    // 给抽象类新建具体方法
    public void show() {
        //给 age 重新赋值
//        age = 40;
        System.out.println(age);

        // city = "上海"; --- 会报错
        System.out.println(city);

        //给 home 重新赋值
        home = "湖南";
        System.out.println(home);

        System.out.println("Age:" + age);
    }

    //新建抽象方法
    public abstract void eat();

    //无参构造方法
    public Animal() {}

    //带参构造方法
    public Animal(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
