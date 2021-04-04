package A03_类与对象_案例学生;

public class StudentDemo02 {
    public static void main(String[] args) {
        //创建第一个对象
        Student l = new Student();
        //输出对象内存地址
        //System.out.println(l);

        //使用对象
        //输出对象未赋值前内容
        //System.out.println(l.name + "," + l.age);

        l.name = "林青霞";
        l.age = 30;

        System.out.println(l.name + "," + l.age);

        //使用成员方法
        l.study();
        l.doHomework();

        //创建第二个对象
        Student z = new Student();
        //输出对象内存地址
        //System.out.println(z);

        //使用对象
        //输出对象未赋值前内容
        //System.out.println(z.name + "," + z.age);

        z.name = "张曼玉";
        z.age = 35;

        System.out.println(z.name + "," + z.age);

        //使用成员方法
        z.study();
        z.doHomework();
    }
}
