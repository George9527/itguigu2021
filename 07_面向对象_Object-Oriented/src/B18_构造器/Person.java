package B18_构造器;

/*
    类的结构之三：构造器(或构造方法、constructor)的使用
    constructor：建设、建造。construction：CCB constructor：建设者

    一、构造器的使用：
        1.创建对象
        2.初始化对象的属性

    二、说明：
        1.如果没有显式的定义类的构造器的话，则系统默认提供一个空参的构造器
        2.定义构造器的格式，权限修饰符 类名(形参列表) {}
        3.一个类中定义的多个构造器，彼此构成重载
        4.一旦我们显式的定义 了类的构造器后，系统就不再提供默认的空参构造器
        5.一个类中，至少会有一个构造器
 */

public class Person {

    //属性
    String name;
    int age;

    //构造器
    public Person() {
        System.out.println("构造器");
    }

    public Person(String n) {
        name = n;
    }

    public void eat() {
        System.out.println("人吃饭");
    }

    public void study() {
        System.out.println("人学习");
    }

    public Person(String n,int a) {
        name = n;
        age = a;
    }

}
