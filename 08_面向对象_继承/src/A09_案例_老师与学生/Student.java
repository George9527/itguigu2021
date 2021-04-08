package A09_案例_老师与学生;

public class Student extends Person{

    public Student() {
    }

    public Student(String name, int age) {
        super(name, age);
    }

    public void study() {
        System.out.println("好好学习");
    }

}
