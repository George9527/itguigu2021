package A01_if_else语句;
/*
    编写程序，声明2个double型变量并赋值。

    判断第一个数大于10.0，且第2个数小于20.0，打印两数之和。
    否则，打印两数的乘积
 */
public class ifTest05_乘积 {
    public static void main(String[] args) {

        //声明2个double型变量并赋值
        double num1 = 10.1D;
        double num2 = 20.2D;

        //判断第一个数大于10.0，且第2个数小于20.0，打印两数之和。否则，打印两数的乘积
        if (num1 > 10.0 && num2 < 20.0) {
            double sum = num1 + num2;
            System.out.println("两数之和: " + sum);
        } else {
            double num3 = num1 * num2;
            System.out.println("两数的乘积: " + num3);
        }
    }
}
