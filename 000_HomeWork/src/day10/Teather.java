package day10;
/*
    定义子类Teacher
 */
public class Teather extends Person{

    // 重写打印描述信息方法
    @Override
    public void work() {
        System.out.println("教书育人");
    }

    @Override
    public void hello() {
        System.out.println("同学好");
    }

    // 教师的work实现是：教书育人，hello实现是：“同学好”；
    public Teather(String name, int age, int sex) {
        super(name, age, sex);
    }

    public Teather() {

    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("姓名：" + getName() + " 年龄：" + getAge() + " 性别：" + getSex());
    }
}
