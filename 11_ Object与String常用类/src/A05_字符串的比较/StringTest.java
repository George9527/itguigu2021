package A05_字符串的比较;

public class StringTest {

    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = new String("abc");
        System.out.println(s1 == s2); //false

        System.out.println("==========");
        /**
         *  s3 = hello 内存中出现String对象,里面是char数组
         *  s3保存的是String对象
         *
         *  s4 = "hello" 和s3中的字符串在内存中的数组表现是一样的
         *  共用
         *  s3的内存地址,赋值给s4
         */
        String s3 = "hello";
        String s4 = "hello";
        System.out.println(s3 == s4); //true

        System.out.println("========");

        String s5 = "how";
        String s6 = "you";

        String s7 = "howyou";
        /**
         *   s7 == (s5+s6)   s5和s6是变量
         *   变量在编译的时候,javac不确定变量的计算结果是什么
         *   运行的时候,JVM会为 s5+s6的结果,新开内存空间
         */
        System.out.println(s7 == (s5+s6)); //false

        System.out.println("============");

        /**
         *  "how"+"you" 是常量,值在编译期间就已经确定
         *  运行,不会建立新的内存空间
         */
        System.out.println(s7 == ("how"+"you"));// true

        String s8 = "a"+"b"+"c";

    }

    public static void print(){
        //字符串的不变
        //abc内存是不会改变
        String s = "abc";
        System.out.println(s);
        //变量s,指向了新的字符串对象
        s = "bbc";
        System.out.println(s);
    }

}
