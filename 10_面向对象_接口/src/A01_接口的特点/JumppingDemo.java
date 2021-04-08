package A01_接口的特点;

/*
    测试类
 */

public class JumppingDemo {
    public static void main(String[] args) {

        //接口也是抽象的内容，不能被直接实例化
        //Jumpping j = new Jumpping;

        //使用多态的方法实现实例化
        Jumpping j = new Cat();
        j.jump();

        Jumpping J1 = new Dog();
        J1.jump();
    }

}
