package A11_自加自减运算;
/*
    获取一个四位数的个位，十位，百位，千位
 */
public class OperatorTest01 {
    public static void main (String [] args) {
        //1.定义一个四位数，例如1234
        int num = 3247;

        //2.通过运算操作求出个位，十位，百位，千位
        int ge = num % 1000 % 100 % 10;
        int shi = num % 1000 % 100 / 10;
        int bai = num % 1000 / 100;
        int qian = num / 1000;

        System.out.println(num + "这个四位数个位上的数字是：" + ge);
        System.out.println(num + "这个四位数十位上的数字是：" + shi);
        System.out.println(num + "这个四位数百位上的数字是：" + bai);
        System.out.println(num + "这个四位数千位上的数字是：" + qian);
    }
}
