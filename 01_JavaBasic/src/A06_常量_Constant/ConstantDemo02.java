package A06_常量_Constant;
/*
    2.6.6 练习：定义所有基本数据类型的变量和字符串变量并输出
 */
public class ConstantDemo02 {
    public static void main(String[] args) {

        // 定义字节型变量
        byte b = 127;
        System.out.println(b);

        // 定义短整型变量
        short shortNum = 30000;
        System.out.println(shortNum);

        // 定义整型变量
        int i = 10086;
        System.out.println(i);

        // 定义长整型变量
        long l = 1213134245L;
        System.out.println(l);

        // 定义单精度浮点型变量
        float f = 1.434234523F;
        System.out.println(f);

        // 定义双精度浮点型变量
        double d = 134.546786764543423D;
        System.out.println(d);

        // 定义布尔型变量
        boolean b1 = false;
        System.out.println(b1);

        // 定义字符型变量
        char c = 'a';
        System.out.println(c);

        // 定义字符串变量
        String s1 = "定义字符串变量";
        System.out.println(s1);
    }
}
