package A06_抽象类的特点1;

/*
    测试类
 */
public class AnimalDemo {
    public static void main(String[] args) {

        // 如何创建对象
        Animal a = new Cat();
        // eat方法不可能执行父类，必须运行子类中重写的方法
        // 因为父类为抽象类，父类的中的抽象方法没有方法体
        a.eat();
        a.sleep();

        // Dog 是一个抽象类 抽象类不能建对象
//        Animal d = new Dog();
//        Dog dog = new Dog();

    }
}
