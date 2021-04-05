package B03_面向对象简单练习;
/*
    Person类 的测试类
    要求：
        (1)创建Person类的对象，设置该对象的name、age和sex属性，
            调用study方法，输出字符串“studying”，
            调用showAge()方法显示age值，
            调用addAge()方法给对象的age属性值增加2岁。
        (2).创建第二个对象，执行上述操作，体会同一个类的不同对象之间的关系。
 */
public class PersonDemo {
    public static void main(String[] args) {

        //新建一个Person 对象
        Person p1 = new Person();

        //设置该对象的name、age和sex属性
        p1.name = "小明";
        p1.age = 18;
        p1.sex = 1;

        //调用study方法，输出字符串“studying”，
        p1.study();

        //调用showAge()方法显示age值，
        p1.showAge();

        //调用addAge()方法给对象的age属性值增加2岁。
        p1.addAge(2);
        System.out.println(p1.age);

        System.out.println("==========");

        //创建第二个对象，执行上述操作
        Person p2 = new Person();

        p2.name = "小红";
        p2.age = 15;
        p2.sex = 2;

        p2.study();
        p2.showAge();

        int newAge = p2.addAge(3);
        System.out.println(p2.name + "的新年龄为：" + newAge);

    }
}
