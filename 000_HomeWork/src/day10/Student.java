package day10;
/*
    定义子类Student
 */
public class Student extends Person{

    // 重写打印描述信息方法
    @Override
    public void work() {
        System.out.println("认真学习");
    }

    @Override
    public void hello() {
        System.out.println("老师好");
    }


    // 学生的work实现是：认真学习，hello实现是“老师好”。
    public Student(String name, int age, int sex) {
        super(name, age, sex);
    }

    public Student() {
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("姓名：" + getName() + " 年龄：" + getAge() + " 性别：" + getSex());
    }
}
