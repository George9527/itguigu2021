package A03_猫和狗接口版;

public class AnimalDemo {
    public static void main(String[] args) {
        //创建对象，调用方法
        Jumpping j = new Cat();
        j.jump();
        System.out.println("---------");

        Animal a = new Cat();
        a.setName("加菲");
        a.setAge(3);
        System.out.println(a.getName() + ":" + a.getAge());
        a.eat();

        //会报错 Animal 中没有jump 这个方法
        //a.jump();

        Cat C = new Cat();
        C.setAge(10);
        C.setName("Tom");
        C.jump();
        C.eat();
        System.out.println(C.getName() + ":" + C.getAge());

        Animal b = new Cat();
        b = new Cat("Tom",4);
        System.out.println(b.getName() + ":" + b.getAge());
        b.eat();

        System.out.println("=========");

        //狗跳高的方法
        Jumpping j2 = new Dog();
        j2.jump();

        Dog dog = new Dog();
        dog.setName("狗子");
        dog.setAge(6);
        dog.eat();
        System.out.println(dog.getName() + ":" + dog.getAge());
    }
}
