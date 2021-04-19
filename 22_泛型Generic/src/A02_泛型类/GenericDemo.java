package A02_泛型类;

/*
    测试类
 */
public class GenericDemo {

    public static void main(String[] args) {
        //创建学生类对象
        Student s = new Student();
        s.setName("张国荣");
        System.out.println(s.getName());

        //创建老师类对象
        Teacher t = new Teacher();
        t.setAge(30);
        System.out.println(t.getAge());

        System.out.println("---使用泛型类方法---");

        //创建对象
        Generic<String> g1 = new Generic<String>();
        g1.setT("郭富城");

        Generic<Integer> g2 = new Generic<Integer>();
        g2.setT(40);

        Generic<Boolean> g3 = new Generic<Boolean>();
        g3.setT(true);

        //输出对象
        System.out.println(g1.getT() + ":" + g2.getT());
        System.out.println(g3.getT());
    }
}
