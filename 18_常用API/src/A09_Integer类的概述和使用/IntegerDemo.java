package A09_Integer类的概述和使用;
/*
    构造方法：
        public Integer(int value)：根据 int 值创建 Integer 对象(过时)
        public Integer(String s)：根据 String 值创建 Integer 对象(过时)

    静态方法获取对象：
        public static Integer valueOf (int i)：返回表示指定的 int 值的 Integer 实例
        public static Integer valueOf (String s)：返回一个保存指定值的 Integer 对象 String
 */
public class IntegerDemo {
    public static void main(String[] args) {
        //public Integer(int value)：根据 int 值创建 Integer 对象(过时)
        Integer i1 = new Integer(100);
        System.out.println(i1);

        //public Integer(String s)：根据 String 值创建 Integer 对象(过时)
        Integer i2 = new Integer("110");
        System.out.println(i2);
        //小结： 必须是纯数字的字符串，否则会报错
        System.out.println("--------");

        //public static Integer valueOf (int i)：返回表示指定的 int 值的 Integer 实例
        Integer i3 = Integer.valueOf(120);
        System.out.println(i3);

        //public static Integer valueOf (String s)：返回一个保存指定值的 Integer 对象 String
        Integer i4 = Integer.valueOf("130");
        System.out.println(i4);

        // 小结： 必须是纯数字的字符串，否则会报错
//        Integer i5 = Integer.valueOf("abc");
//        System.out.println(i5);
    }
}
