package A13_final修饰符;

/*
    测试类
 */

public class FinalDemo {

    public static void main(String[] args) {
        //final修饰基本类型变量
        final int age = 20;
//        age = 100;  // final修饰后变量变为常量 不能再次赋值
        // 基本数据类型的 数据值 不能被改变
        System.out.println(age);


        //final修饰引用类型变量
        final Student s = new Student();
        s.age = 100;
        System.out.println(s.age);

        Student s2 = new Student();
        s2.age = 200;
//        s = s2; // final修饰后 引用类型的内存地址不能改变
//        System.out.println(s);
    }

}

