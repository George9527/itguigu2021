package A03_多态的优缺点;

/*
    测试类
 */
public class AnimalDemo {
    public static void main(String[] args) {
        //创建动物操作类的对象，调用方法
        AnimalOperator ao = new AnimalOperator();
        //创建猫类对象
        Cat c = new Cat();
        //方法调用
        ao.useAnimal(c);

        //创建狗类对象
        Dog d = new Dog();
        ao.useAnimal(d);
        d.lookDoor();

        //创建猪类对象
        Pig p = new Pig();
        ao.useAnimal(p);
    }
}