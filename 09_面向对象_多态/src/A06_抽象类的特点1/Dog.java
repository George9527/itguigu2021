package A06_抽象类的特点1;
/*
    抽象类中的子类
    继承自抽象类
        小结：
        要么重写抽象类中的所有抽象方法 ---Cat()
        要么这个子类是一个抽象类 ---Dog()
 */
public abstract class Dog extends Animal{

    @Override
    public void eat() {
        System.out.println("狗吃肉");
    }
}
