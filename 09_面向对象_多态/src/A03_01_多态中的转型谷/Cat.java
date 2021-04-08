package A03_01_多态中的转型谷;

public class Cat extends Animal {


    // 重写父类中的eat方法
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }

    // 定义一给子类的特有方法
    // 父类使用该方法必须通过向下转型
    public void playGame() {
        System.out.println("猫捉迷藏");
    }

}