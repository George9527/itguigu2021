package A02_equals使用;

public class ObjectTest {

    public static void main(String[] args) {
        //创建2个对象
        Person p1 = new Person("张三",5);
        Person p2 = new Person("李四",5);
        //p1和p2对象进行比较
        boolean b = p1.equals(p1);
        System.out.println(b);
    }

}
