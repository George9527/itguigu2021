package A10_int和String的相互转换;
/*
    int和String的相互转换
 */
public class IntegerDemo {
    public static void main(String[] args) {

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
        System.out.println("通过String 的 方法来实现");

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
