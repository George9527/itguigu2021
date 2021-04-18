package D08_自然排序Comparable的使用;

import java.util.TreeSet;

/*
    存储学生对象并遍历，创建集合使用无参构造方法
    要求：按照年龄从小到大排序，年龄相同时，按照姓名的字母顺序排序
 */
public class TreeSetDemo01 {
    public static void main(String[] args) {
        //创建集合对象
        TreeSet<Student> ts_Student = new TreeSet<Student>();

        //创建学生对象
        Student s1 = new Student("张国荣", 30);
        Student s2 = new Student("刘德华", 35);
        Student s3 = new Student("郭富城", 20);
        Student s4 = new Student("黎明", 25);

        //测试类 --- 年龄相同时，按照姓名的字母顺序排序
        Student s5 = new Student("周杰伦", 25);
        Student s6 = new Student("黑人", 25);

        //测试类 --- 年龄相同，姓名相同 --测试 Set集合 的唯一性
        Student s7 = new Student("黑人", 25);

        //添加学生对象进集合
        ts_Student.add(s1);
        ts_Student.add(s2);
        ts_Student.add(s3);
        ts_Student.add(s4);

        ts_Student.add(s5);
        ts_Student.add(s6);

        ts_Student.add(s7);

        //遍历集合

        //报错 --- Student cannot be cast to class java.lang.Comparable

        for (Student s : ts_Student) {
            System.out.println(s.getName() + ":" + s.getAge());
        }

    }
}
