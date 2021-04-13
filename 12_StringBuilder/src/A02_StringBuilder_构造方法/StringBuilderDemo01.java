package A02_StringBuilder_构造方法;
/*
    StringBuilder构造方法：
        public StringBuilder()：创建一个空白可变字符串对象，不含有任何内容
        public StringBuilder(String str)：根据字符串的内容，来创建可变字符串对象
 */
public class StringBuilderDemo01 {
    public static void main(String[] args) {

        //public StringBuilder()：创建一个空白可变字符串对象，不含有任何内容
        StringBuilder sb = new StringBuilder();
        System.out.println("sb的内容:" + sb);
        System.out.println("sb.length()的长度：" + sb.length());

        //public StringBuilder(String str)：根据字符串的内容，来创建可变字符串对象
        StringBuilder sb2 = new StringBuilder("Hello");
        System.out.println("sb2:" + sb2);
        System.out.println("sb2.length():" + sb2.length());

        // 利用插入的方法添加
//        sb = "Test"; // 错误 sb 为 StringBuilder是一个对象非字符串格式

        if (sb.length() >= 0) {
            sb.insert(0, "在指定的位置10，插入指定的字符串");// 在指定的位置10，插入指定的字符串
        }
        System.out.println("sb的内容:" + sb);

        // 方法二
        sb.append("添加字符串");
        System.out.println("方法二sb： = " + sb);
    }
}
