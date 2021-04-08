package A03_多态的优缺点;

public class Dog extends Animal{

    //重写 eat 方法
    @Override
    public void eat() {
        System.out.println("狗吃肉");
    }

    public void lookDoor() {
        System.out.println("狗看门");
    }
}
