package C06_存储学生对象信息并遍历;

/*
    需求：
        1：创建一个存储学生对象的集合，
        2：存储3个学生对象，使用程序实现在控制台遍历该集合
        3：学生的姓名和年龄来自于键盘录入

    思路：
        1:定义学生类，为了键盘录入数据方便，把学生类中的成员变量都定义为String类型
        2:创建集合对象
        3:键盘录入学生对象所需要的数据
        4:创建学生对象，把键盘录入的数据赋值给学生对象的成员变量
        5:往集合中添加学生对象
        6:遍历集合，采用通用遍历格式实现
 */

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTest {

    public static void main(String[] args) {

        //创建集合对象
        ArrayList<Student> array = new ArrayList<Student>();

        //键盘录入添加学生的数量
        Scanner sc = new Scanner(System.in);

        System.out.print("请输入添加学生的数量：");
        int addNumber = sc.nextInt();

        //调用方法
        //int addNumber = 3;
        for (int x = 0; x <= addNumber; x++) {
            if (x == addNumber) {
                System.out.println("已成功添加" + +addNumber + "名学生信息");
                break;
            } else {
                addStudent(array);
            }
        }


        //遍历集合，采用通用遍历格式实现
        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            System.out.println(s.getName() + ":" + s.getAge());
        }
    }

    //构建添加学生信息的方法
    /*
        两个明确：
            返回值类型：void
            参数：ArrayList<Student> array
     */
    public static void addStudent(ArrayList<Student> array) {
        //键盘录入学生对象所需要的数据
        Scanner sc = new Scanner(System.in);

        System.out.print("请输入学生姓名：");
        String name = sc.nextLine();

        System.out.print("请输入学生年龄：");
        String age = sc.nextLine();

        //创建学生对象，把键盘录入的数据赋值给学生对象的成员变量
        Student s = new Student();
        s.setName(name);
        s.setAge(age);

        //往集合中添加学生对象
        array.add(s);
    }
}
