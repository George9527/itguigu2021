package A04_StringBuilder与String相互转换;

/*
    StringBuilder 转换为 String
        public String toString()：通过 toString() 就可以实现把 StringBuilder 转换为 String

    String 转换为 StringBuilder
        public StringBuilder(String s)：通过构造方法就可以实现把 String 转换为 StringBuilder
        StringBuilder(String str) 构造一个初始化为指定字符串内容的字符串构建器。
 */

public class StringBuilderDemo02 {
    public static void main(String[] args) {
        //StringBuilder 转换为 String

        // 创建一个StringBuilder对象
        StringBuilder sb = new StringBuilder();
        sb.append("hello"); // 通过 append 给对象进行赋值

        // String s = sb; ---这个为错误方法 sb是一个类， s 是一个Sting类型的字符串

        //public String toString()：通过 toString()
        // 就可以实现把 StringBuilder 转换为 String
        String s = sb.toString();
        System.out.println("StringBuilder To String:" + s);

        // String 转换为 StringBuilder
        String s2 = "Test Demo";

        StringBuilder sb2 = new StringBuilder(s2);
        System.out.println("String To StringBuilder:" + s2);

    }
}
