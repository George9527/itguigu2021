package A09_抽象类的成员特点1;

public class AnimalDemo {
    public static void main(String[] args) {
        Animal a = new Cat();

        // 调用父类中的属性
        a.setAge(25);
        a.eat();
        a.show();

    }
}
