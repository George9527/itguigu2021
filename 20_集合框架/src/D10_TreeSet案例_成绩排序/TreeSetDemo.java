package D10_TreeSet案例_成绩排序;

import java.util.Comparator;
import java.util.TreeSet;

/*
    需求：
        用TreeSet集合存储多个学生信息(姓名，语文成绩，数学成绩)，并遍历该集合
        要求：按照总分从高到低出现

    思路：
        1:定义学生类
        2:创建TreeSet集合对象，通过比较器排序进行排序
        3:创建学生对象
        4:把学生对象添加到集合
        5:遍历集合
 */
public class TreeSetDemo {
    public static void main(String[] args) {

        //创建TreeSet集合对象，通过比较器排序进行排序
        TreeSet<Student> ts = new TreeSet<Student>(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                //要求：按照总分从高到低出现
                //int num = (s2.getChinese() + s2.getMath()) - (s1.getChinese() + s1.getMath());
                // 主要条件
                int num = s2.getSum() - s1.getSum();
                //解决总分相同时，不能添加姓名的情况
                int num2 = num == 0 ? s1.getChinese() - s2.getChinese() : num;
                //解决当总分与单科成绩相同，姓名不同的情况
                int num3= num2 ==0 ? s1.getName().compareTo(s2.getName()) : num2;
                return num3;
            }
        });

        //创建学生对象
        Student s1 = new Student("小明", 90, 80);
        Student s2 = new Student("小红", 91, 81);
        Student s3 = new Student("小李", 92, 82);
        Student s4 = new Student("小刘", 93, 83);
        Student s5 = new Student("小赵", 70, 80);
        // 添加总分相同但姓名不同的对象 --- 使用单科成绩判断 --- 不够全面
        Student s6 = new Student("小王", 69, 81);
        // 添加总分相同单科成绩也相同但姓名不同的对象 --- 使用单科成绩判断 --- 不够全面
        Student s7 = new Student("小陈", 69, 81);

        //添加学生对象进集合
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);

        ts.add(s6);

        ts.add(s7);

        //遍历集合
        for (Student s : ts) {
            System.out.println(
                    s.getName() + ": " +
                            "Chinese:" + s.getChinese() + " " + "\t" +
                            "Math:" + s.getMath() + "\t" +
                            "总分：" + s.getSum()
            );
        }
    }
}
