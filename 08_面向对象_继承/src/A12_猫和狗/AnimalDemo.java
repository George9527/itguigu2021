package A12_猫和狗;

public class AnimalDemo {
    public static void main(String[] args) {
        //创建猫类对象
        Cat c1 = new Cat();
        c1.setName("汤姆");
        c1.setAge(10);
        System.out.println(c1.getName() + ", " + c1.getAge());
        c1.catchMouse();

        Cat c2 = new Cat("加菲猫",5);
        System.out.println(c2.getName() + ", " + c2.getAge());
        c2.catchMouse();

        //创建狗类对象
        Dog d1 = new Dog();
        d1.setName("哈士奇");
        d1.setAge(10);
        System.out.println(d1.getName() + ", " + d1.getAge());
        d1.lookDoor();

        Dog d2 = new Dog("哮天犬",100);
        System.out.println(d2.getName() + ", " + d2.getAge());
        d2.lookDoor();
    }
}
