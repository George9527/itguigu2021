package A10_老师与学生升级;

public class Student extends Human{

    //创建无参构造方法
    public Student() {}

    //创建带参数方法
    public Student(String name, int age) {
        super(name,age);
    }

    public void study() {
        System.out.println("好好学习天天向上");
    }
}
