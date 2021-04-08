package A03_猫和狗接口版;

public class Dog extends Animal implements Jumpping{

    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }



    @Override
    public void eat() {
        System.out.println("Dog eat chicken");
    }

    @Override
    public void jump() {
        System.out.println("Dog can jumpping");
    }
}
