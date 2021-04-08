package A02_多态中的成员访问特点;

/*
    测试类
 */
public class AnimalDemo {
    public static void main(String[] args) {

        //有父类引用指向子类对象
        Animal a = new Cat();
        // 这个 a 会优先访问父类中的变量属性与方法

        System.out.println(a.age);
        //System.out.println(a.weight);

        a.eat();
        //a.playgame();

    }
}