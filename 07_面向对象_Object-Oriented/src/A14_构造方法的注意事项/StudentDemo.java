package A14_构造方法的注意事项;

/*
    测试类
 */
public class StudentDemo {
    public static void main(String[] args) {
        //创建对象
        Student s1 = new Student();
        s1.show();

        //public Student(String name)
        Student s2 = new Student("林青霞");
        s2.show();

        //public Student(int age)
        Student s3 = new Student(25);
        s3.show();

        //public Student(String name,int age)
        Student s4 = new Student("张国荣",30);
        s4.show();

    }
}