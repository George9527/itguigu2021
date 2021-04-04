package A08_数据类型转换_Conversion;
/*
    数据类型转换的练习
        练习题：判断如下代码是否编译通过，如果能，结果是多少？
 */
public class ConversionTest04 {
    public static void main(String[] args) {

        short s1 = 120;
        short s2 = 8;
        // short s3 = s1 + s2; --- 超出128的取值范围

        short s3 = 120;
        short s4 = 8;
        byte s5 = (byte)(s3 + s4);  // -128  -128~127范围内
        System.out.println(s5);

        char c1 = '0'; // ASCII 48
        char c2 = '1'; // ASCII 49
        // char c3 = c1 + c2; 用int 来接收
        int res = c1 + c2; // 97

        char c3 = '0'; // ASCII 48
        char c4 = '1'; // ASCII 49
        System.out.println(c3 + c4);  // 97

        //因为右边120默认是int类型，int的值赋值给long类型是可以的，会自动类型转换，
        // 但是要求这个int值不能超过int的存储范围，如果超过int的存储范围必须加L.
        int i = 4;
        long j = 120;

        //因为右边1.2默认是double类型，double的值是不能直接赋值给float的，
        // 要么加F要么使用强制类型转换。
        double d = 34;

        // float f = 1.2;

        // System.out.println(i + j + d + f);//最后是double

        int i9 = 1;
        int j9 = 2;
        double d9 = i9/j9;  // 0.5 转换为 double类型 会精度损失
        System.out.println(d9);

    }
}
