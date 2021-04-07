package B01_基本数据类型的转换;

/*
    注意：
        类型转换只能在 父类以及继承的子类直接转换
        子类余子类之间不能相互转换
 */
public class Test {

    public static void main(String[] args) {
        // 创建对象 多态型
        // 父类 = new 任意子类对象() 拓展
        Animal a1 = new Cat();
        a1.eat();

        // 调用 Cat类的特有方法
//        a1.catchMouse();
        // 小结：多态程序中，不能调用子类的特有成员
        // 只能调用子类父类的共有成员

        // 父类对象 需要 访问子类对象的 方法 属性 需要向下转型
        // 目的：是已经将提升为提升为父类的 Cat类型，再转回Cat类型
        Cat c = (Cat) a1;
        // 转换后才可以访问 Cat类的特有方法
        c.catchMouse();
    }
}
