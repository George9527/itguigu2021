package A03_多态的优缺点;

/*
    动物操作类
 */
public class AnimalOperator {

    /*
    public void useAnimal(Cat c) {
        c.eat();
    }

    //创建新方法使其指向 Dog 类中的 eat() 方法
    public void  useAnimal(Dog d) {
        d.eat();
    }
    */

    //每次增加动物都要添加方法，不方便
    //修改为
    public void  useAnimal(Animal a) {

        Animal a1 = new Cat();
        a1.eat();

        Animal a2 = new Dog();
        a2.eat();

        //编译看左边 ，运行看右边


    }
}
