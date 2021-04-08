package A09_案例_老师与学生;

/*
    测试类
 */

public class Demo {
    public static void main(String[] args) {

        //创建老师类对象进行测试
        Teacher teacher = new Teacher();
        teacher.setName("张国荣");
        teacher.setAge(30);
        System.out.println(teacher.getName() + " : " + teacher.getAge());
        teacher.teach();

        // 使用带参构造方法创建学生对象
        Student student = new Student("刘德华",16);
        System.out.println(student.getName() + " : " + student.getAge());
        student.study();

    }
}
