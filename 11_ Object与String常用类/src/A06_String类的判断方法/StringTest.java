package A06_String类的判断方法;

/**
 * String类的判断方法
 */

public class StringTest {
    public static void main(String[] args) {
        stringMethod();
    }


    public static void  stringMethod(){
        //boolean equals(Object obj) 字符串之间的比较,两个字符串相同,返回true
        //String类继承Object,重写父类方法,比较的是字符串的实际内容
        String s1 = new String("abc");
        String s2 = new String("abc");
        boolean b = s1.equals(s2);
        System.out.println(b);

        System.out.println("====================");
        //boolean equalsIgnoreCase(String str ) 字符串之间的比较,两个字符串相同,返回true,忽略大小写
        b = "abcdef".equalsIgnoreCase("ABCDEF");
        System.out.println(b);
        System.out.println("=============");
        //boolean startWith(String str)判断字符串是否以另一个字符串开头,是开头就返回true
        b = "HelloWorld.Java".startsWith("Hello");

        System.out.println(b);
        b = "HelloWorld.Java".endsWith(".Java");
        System.out.println("=============");
        System.out.println(b);

        //boolean contains(String str) 判断字符串中是否包含另一个字符串,完全包含返回true
        b = "how are you".contains("are   "); // 这里是 are + 三个空格，所以为false
        System.out.println("=============");
        System.out.println(b);

        //boolean isEmpty()判断字符串的长度是不是0,如果是0返回true
        b = "".isEmpty();
        System.out.println("=============");
        System.out.println(b);
    }
}

