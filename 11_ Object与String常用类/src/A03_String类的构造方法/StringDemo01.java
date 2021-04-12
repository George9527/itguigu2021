package A03_String类的构造方法;
/*
    String构造方法：
        public String()：创建一个空白字符串对象，不含有任何内容
        public String(char[] chs)：根据字符数组的内容，来创建字符串对象
        public String(byte[] bys)：根据字节数组的内容，来创建字符串对象
        String s = “abc”;	直接赋值的方式创建字符串对象，内容就是abc

        推荐使用直接赋值的方式得到字符串对象
 */
public class StringDemo01 {
    public static void main(String[] args) {
        //String构造方法

        //public String()：创建一个空白字符串对象，不含有任何内容
        String S1 = new String();
        System.out.println("S1:" + S1);

        //public String(char[] chs)：根据字符数组的内容，来创建字符串对象
        char[] chs = {'A','B','C'};
        String S2 = new String(chs);
        System.out.println("S2:" + S2);

        //public String(byte[] bys)：根据字节数组的内容，来创建字符串对象
        byte[] bytes = {97,98,99};
        String S3 = new String(bytes);
        System.out.println("S3:" + S3);

        //String s = “abc”;	直接赋值的方式创建字符串对象，内容就是abc
        String S4 = "abc";
        System.out.println("S4:" + S4);

        // 创建方式
        // 直接 = 创建
        String s = "abc";
        // 使用构造方法创建
        String str = new String("aa");

        System.out.println("s = " + s);
        System.out.println("str = " + str);

        // 小结：
        // 直接创建 代码少 推介使用
        // new String() 是使用构造方法创建，代码大

    }
}
