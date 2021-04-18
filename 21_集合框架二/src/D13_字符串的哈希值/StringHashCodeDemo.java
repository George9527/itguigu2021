package D13_字符串的哈希值;

//字符串String对象的哈希值

/*
    3.5 哈希值的相关问题
  问题 : 两个对象A,B    两个对象哈希值相同,equals方法一定返回true吗?
  两个对象A,B   两个对象equals方法返回true,两个对象的哈希值一定相同吗
> 结论 : 两个对象的哈希值相同,不要求equals一定返回true. 两个对象的equals返回true,像个对象的哈希值必须一致

Sun 公司官方规定 : 上面的结论
 */
public class StringHashCodeDemo {
    public static void main(String[] args) {

        String s1 = "abc";
        String s2 = "abc";
        System.out.println(s1 == s2); //T
        //String类继承Object,可以使用方法hashCode
        System.out.println(s1.hashCode() == s2.hashCode()); //T
        /**
         * String类继承Object类
         * String类重写父类的方法 hashCode() 自己定义了哈希值
         */
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println("=============");

        /**
         *  字符串内容不一样,有没有可能计算出相同的哈希值
         *    String s1 ="abc";
         *    String s2 ="abc";
         */
        String s3 = "通话";
        String s4 = "重地";
        //1179395
        //1179395
        System.out.println(s3.hashCode());
        System.out.println(s4.hashCode());

        System.out.println(s3.equals(s4));
    }
}
