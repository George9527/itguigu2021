package A11_自加自减运算;
/*
    自增自减练习
        判断如下代码的运行结果
 */
public class OperatorTest02 {
    public static void main(String[] args) {

        int i = 1;
        int j = i++;
        int k = i++ * ++j + ++i * j++;

        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("k = " + k);

        System.out.println("==========");

        int i2 = 1;
        int j2 = i2++;
        int k2 = i2++ * ++j2 + --i2 * j2--;

        System.out.println("i = " + i2);
        System.out.println("j = " + j2);
        System.out.println("k = " + k2);

        System.out.println("==========");

        int i3 = 1;
        int j3 = ++i3 + i3++ * ++i3 + i3++;

        System.out.println("i3 = " + i3);
        System.out.println("j3 = " + j3);

        System.out.println("==========");

        int i4 = 0;
        int result = ++i4 / --i4;
        System.out.println("result=" + result);
    }
}
