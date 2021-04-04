package A06_多个对象指向相同内存图;
/*
    多个对象指向相同内存
 */
public class StudentDemo03 {
    public static void main(String[] args) {
        //创建第一个对象并使用
        Student s1 = new Student();

        s1.name = "林青霞";
        s1.age = 30;
        System.out.println(s1.name + "," + s1.age);

        //创建第二个对象并使用
        Student s2 = s1;
        s2.name = "张曼玉";
        s2.age = 35;
        System.out.println(s1.name + "," + s1.age);
        System.out.println(s2.name + "," + s2.age);

    }
}
