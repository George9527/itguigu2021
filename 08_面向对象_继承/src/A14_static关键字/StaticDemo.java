package A14_static关键字;

/*
    测试类
 */

public class StaticDemo {
    public static void main(String[] args) {

        Student.university = "大学1";
        // university 被static修饰， Student类下的对象都被共享数据

        Student s1 = new Student();
        s1.name = "林青霞";
        s1.age = 30;
//        s1.university = "大学2";
        s1.show();

        Student s2 = new Student();
        s2.name = "风清扬";
        s2.age = 33;
//        s2.university = "大学3";
        s2.show();
    }
}