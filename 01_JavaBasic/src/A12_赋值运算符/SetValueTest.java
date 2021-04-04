package A12_赋值运算符;
/*
    交换两个变量的值
 */
public class SetValueTest {
    public static void main(String[] args) {
        int m = 1;
        int n = 2;

        // 交换两个变量的值
        int swep = m;
        m = n;
        n = swep;

        // 输出交换结果
        System.out.println("M:" + m);
        System.out.println("N:" + n);
    }
}
