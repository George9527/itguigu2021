package A03_01_多态中的转型谷;

/*
    向上转型
        从子到父
        父类引用指向子类对象

    向下转型
        从父到子
        父类引用转为子类对象

    注意：
        强转格式，用法看 B02
 */
public class AnimalDemo {
    public static void main(String[] args) {

        //多态
        Animal a = new Cat(); //向上转型---把父(Animal)转向子(Cat)
        //编译看左边，运行看右边 ---(Animal)中有 eat 方法，编译完成后运行右边 (Cat) 的方法
        a.eat();

        //这个运行报错，playGame() 方法是 Cat类中的私有方法
        //该方法不存在与 (Animal) 类中，故无法编译
        //a.playGame();

        //如何调用 Cat类的私有方法？
        //创建 Cat类的新对象
        Cat c = new Cat();
        c.eat();
        c.playGame();

        //向下转型
        //解决 父类不能访问子类 私有方法 的弊端
        Cat c1 = (Cat) a;
        c1.eat();
        c1.playGame();

    }
}