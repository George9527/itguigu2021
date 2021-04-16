package A01_Integer类的构造方法;
/*
    Integer 类中的构造方法有以下两个：
Integer(int value)：构造一个新分配的 Integer 对象，它表示指定的 int 值。
Integer(String s)：构造一个新分配的 Integer 对象，它表示 String 参数所指示的 int 值。
 */
public class IntegerDemo01 {
    public static void main(String[] args) {
        Integer i1 = new Integer(100);
        Integer i2 = new Integer("120");
        System.out.println(i1);
        System.out.println(i2);

        Integer i3 = Integer.valueOf(200);
        Integer i4 = Integer.valueOf("220");
        System.out.println(i3);
        System.out.println(i4);
    }
}
