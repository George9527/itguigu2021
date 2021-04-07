package day10;
/*
定义一个抽象类Person，有name,age,sex三个属性，
    创建构造函数，给这三个属性赋值，
    重写打印描述信息方法，打印三个属性值；
    这个类中有两个抽象方法work和hello；
    定义两个子类Teacher，Student；
    教师的work实现是：教书育人，hello实现是：“同学好”；
    学生的work实现是：认真学习，hello实现是“老师好”。
 */
public class Test {

    public static void main(String[] args) {

        // 创建老师对象
        Person teacher = new Teather();
        // 使用无参构造器赋值
        teacher.setAge(30);
        teacher.setName("张老师");
        teacher.setSex(1);
        // 输出Teacher类的方法
        teacher.work();
        teacher.hello();
        // 打印三个属性值
        System.out.println(teacher.getName() + " : " + teacher.getAge());
        // 调用重写的打印描述信息方法，打印三个属性值
        teacher.showInfo();

        System.out.println("================");

        // 创建学生对象 --- 使用带参构造器赋值
        Person student = new Student("小明",15,1);
        // 输出Student类的方法
        student.work();
        student.hello();
        // 打印三个属性值
        System.out.println(student.getName() + " : " + student.getAge());
        // 调用重写的打印描述信息方法，打印三个属性值
        student.showInfo();

    }
}
