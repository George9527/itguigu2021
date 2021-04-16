package B06_List集合存储学生对象案例;

/*
    需求：
        创建一个存储学生对象的集合，存储3个学生对象，使用程序实现在控制台遍历该集合

    思路：
        1:定义学生类
        2:创建List集合对象
        3:创建学生对象
        4:把学生添加到集合
        5:遍历集合(迭代器方式，for循环方式)
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        //创建List集合对象
        List<Student> list = new ArrayList<>();

        //创建List集合对象
        Student s1 = new Student("刘德华",20);
        Student s2 = new Student("郭富城",25);
        Student s3 = new Student("张国荣",30);
        Student s4 = new Student("黎明",35);

        //把学生添加到集合
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);

        //迭代器方式
        Iterator<Student> it = list.iterator();
        while (it.hasNext()) {
            Student s = it.next();
            System.out.println(s.getName() + "," + s.getAge());
        }

        System.out.println("---------");

        //for循环方式
        for (int i=0; i<list.size(); i++) {
            Student s = list.get(i);
            System.out.println(s.getName() + "," + s.getAge());
        }
    }
}
