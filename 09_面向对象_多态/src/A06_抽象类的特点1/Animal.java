package A06_抽象类的特点1;
/*
    抽象类
 */
public abstract  class Animal {

    // 抽象方法
    public abstract void eat();

    // 父类中的所有抽象方法，子类都需要改写
    // 不管 子类是否 使用到这个方法
    public abstract void test();

    // 抽象类中可以有具体方法
    public static void sleep() {
        System.out.println("动物---睡觉");
    }
}
