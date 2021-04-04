package A08_数据类型转换_Conversion;
/*
    强制类型转换:自动类型提升运算的逆运算
        1.需要使用强转符：()
        2.注意点：强制类型转换，可能导致精度缺失

 */
public class ConversionTest02 {
    public static void main(String[] args) {
        // 自动类型转换
        double d = 13.3;
        System.out.println(d);

        //定义byte类型的变量
        byte b = 10;
        short s = b;
        int i = b;
        System.out.println(i);

        // 这是不可以的，类型不兼容
        // char c = b;

        //强转
        int i1 = (int) d; // --- 截断操作
        System.out.println(d);

        // 强制类型转换 --- 注意
        int k = (int)88.88;
        System.out.println(k);
        // 强制转换可能造成数据缺失 --- 损失精度

        double d1 = 12.9;
        //精度损失举例1
        int i2 = (int)d1;//截断操作
        System.out.println(i2);

        //没有精度损失
        long l1 = 123;
        short s2 = (short)l1;

        //精度损失举例2
        int i3 = 128;
        byte b3 = (byte)i3;
        System.out.println(b3);//-128

    }
}
