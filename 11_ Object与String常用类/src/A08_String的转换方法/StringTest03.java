package A08_String的转换方法;

import java.io.UnsupportedEncodingException;

/**
 * > String类的转换方法
 *
 * - String toLowerCase() 字符串中的所有内容转成小写
 * - String toUpperCase() 字符串中的所有内容转成大写
 * - char[] toCharArray() 字符串转成字符数组
 * - byte[]  getBytes() 字符串转成字节数组 (查询编码表),平台默认字符集
 * - byte[]  getBytes(String charsetName) 字符串转成字节数组 (查询编码表),指定编码表
 * - static String valueOf(任意类型参数) 参数转成字符串对象
 */
public class StringTest03 {
    public static void main(String[] args) throws UnsupportedEncodingException {

        //- String toLowerCase() 字符串中的所有内容转成小写
        String s1 = "AJKHGJK";
        System.out.println("字符串中的所有内容转成小写-s1 = " + s1.toLowerCase());

        // - String toUpperCase() 字符串中的所有内容转成大写
        String s2 = "lijl";
        System.out.println("字符串中的所有内容转成大写-s2 = " + s2.toUpperCase());

        //char[] toCharArray() 字符串转成字符数组
        String s3 = "alkfjlafj";
        char[] c = s3.toCharArray(); // 字符串转成字符数组
        System.out.println("字符数组-s3 = " + c);  // 输出字符数组内存地址
        for (char c1 : c) {
            System.out.print(c1);
        }

        //byte[]  getBytes() 字符串转成字节数组 (查询编码表),平台默认字符集
        String s = "呵呵你好";
        byte[] bytes = s.getBytes("gbk");
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }

        // static String valueOf(任意类型参数) 参数转成字符串对象
        int i = 1;
        String strI = String.valueOf(i);
        System.out.println(strI+1);

    }
}
