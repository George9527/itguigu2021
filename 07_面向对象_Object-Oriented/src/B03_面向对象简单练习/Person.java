package B03_面向对象简单练习;
/*
    1.创建一个Person类， 其定义如下：
    要求：
        (1)创建Person类的对象，设置该对象的name、age和sex属性，
            调用study方法，输出字符串“studying”，
            调用showAge()方法显示age值，
            调用addAge()方法给对象的age属性值增加2岁。
        (2).创建第二个对象，执行上述操作，体会同一个类的不同对象之间的关系。

    2.利用面向对象的编程方法，设计类Circle计算圆的面积。 --- CircleTest.java
    Person
        name:String
        age:int
        sex:int
        +study():void
        +showAge():void
        +addAge(int i):int
 */
public class Person {
    //(1)创建Person类的对象
    String name;
    int age;
    /**
     * sex:1 表示男性
     * sex:2 表示女性
     */
    int sex;

//    //构造无参、带参方法
//
//    public Person() {
//    }
//
//    public Person(String name, int age, int sex) {
//        this.name = name;
//        this.age = age;
//        this.sex = sex;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public int getSex() {
//        return sex;
//    }
//
//    public void setSex(int sex) {
//        this.sex = sex;
//    }

    //调用study方法，输出字符串“studying”，
    public void study() {
        System.out.println("studying");
    }

    //调用showAge()方法显示age值，
    public void showAge() {
        System.out.println("Age:" + age);
    }

    //调用addAge()方法给对象的age属性值增加2岁
    public int addAge(int add) {
        age += add;
        return age;
    }
}
