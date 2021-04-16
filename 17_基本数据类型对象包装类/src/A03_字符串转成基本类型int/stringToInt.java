package A03_字符串转成基本类型int;

/*
    5.2 String对象转成基本数据类型int
- static int parseInt(String str) 参数字符串转成基本类型,字符串数字格式.
- int intValue() Integer对象构造方法中的字符串,转成基本类型
 */
public class stringToInt {
    public static void main(String[] args) {
        /**
         * 字符串转成基本类型int
         * 静态方法parseInt()
         * 非静态方法 intValue()
         */

        int i = Integer.parseInt("100");
        System.out.println(i);
        System.out.println(i + 1);

        Integer integer = new Integer("2");
        int j = integer.intValue();
        System.out.println(j);

        //int --- String
        int num1 = 100;
        //方法一
        String s1 = "" + num1;
        System.out.println(s1);
        System.out.println("原理是利用字符串的拼接");

        //方法二
        //public static String valueOf (int i)
        String s2 = String.valueOf(num1);
        System.out.println(s2);
        System.out.println("通过String的方法来实现");

        System.out.println("----------");

        //String --- int
        String s3 = "100";
        //方法一
        //String --- Inteager --- int
        Integer i1 = Integer.valueOf(s3);
        System.out.println(i1);
        //public int intValue()
        int x = i1.intValue();
        System.out.println(x);
    }
}
