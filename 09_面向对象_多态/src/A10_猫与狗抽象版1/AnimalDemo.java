package A10_猫与狗抽象版1;
/*
    测试类
 */
public class AnimalDemo {
    public static void main(String[] args) {
        //猫类测试代码

        // 使用无参构造方法
        Animal c = new Cat();
        c.setAge(3);
        c.setName("汤姆");
        System.out.println(c.getName() + ":" + c.getAge());
        c.eat();

        // 使用带参构造方法
        c = new Cat(4,"杰克");
        System.out.println(c.getName() + ":" + c.getAge());
        c.eat();

        //狗类
        Animal dog = new Dog();
        dog.setAge(5);
        dog.setName("Jack");
        System.out.println(dog.getName() + ":" + dog.getAge());
        dog.eat();

    }
}
