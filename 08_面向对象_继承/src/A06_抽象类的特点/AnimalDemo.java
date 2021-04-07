package A06_抽象类的特点;

/*
    测试类
 */
public class AnimalDemo {
    public static void main(String[] args) {

        // 如何创建对象
        Animal a = new Cat();
        a.eat();
        a.sleep();

        // Dog 是一个抽象类 抽象类不能建对象
//        Animal d = new Dog();
//        Dog dog = new Dog();

    }
}
