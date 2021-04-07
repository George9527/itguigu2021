package A06_抽象类的特点;

/*
    测试类
 */
public class AnimalDemo {
    public static void main(String[] args) {

        //抽象类如何创建对象
        Animal a = new Cat();
        a.eat();
        a.sleep();

    }
}
