package A06_抽象类的特点1;
/*
    抽象类中的子类
    继承自抽象类
    小结：
        要么重写抽象类中的所有抽象方法 ---Cat()
        要么这个子类是一个抽象类 ---Dog()
 */
public class Cat extends Animal{

    //继承抽象类
    //重写抽象类中的方法，才能调用

    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }

    @Override
    public void test() {
        System.out.println("Test");
    }
}
