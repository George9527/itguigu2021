package B08_方法的重载;
/*
    编写程序，
    1.定义三个重载方法并调用。方法名为mOL。
        三个方法分别接收一个int参数、两个int参数、一个字符串参数。
        分别执行平方运算并输出结果，相乘并输出结果，输出字符串信息。
        在主类的main ()方法中分别用参数区别调用三个方法。
    2.定义三个重载方法max()，
        第一个方法求两个int值中的最大值，
        第二个方法求两个double值中的最大值，
        第三个方法求三个double值中的最大值，并分别调用三个方法。
 */
public class OverLoadTest01 {
    public static void main(String[] args) {
        // 分别用参数区别调用三个方法。
        OverLoadTest01 m = new OverLoadTest01();

        m.mOl(2);
        m.mOl(4,5);
        m.mOl("Test");

        System.out.println("#################");

        // 分别用参数区别调用三个方法。
        OverLoadTest01 m1 = new OverLoadTest01();
        m1.max(5,10);
        m1.max(5.5,8.3);
        m1.max(1.4,3.5,2.1);

    }

    public void mOl(int i) { // 接收一个int参数
        // 平方运算并输出结果
        System.out.println(i * i);
    }

    public void mOl(int i,int j) { // 接收两个int参数
        // 相乘并输出结果
        System.out.println(i * j);
    }

    public void mOl(String S) { // 接收一个字符串参数
        // 输出字符串信息
        System.out.println(S);
    }

    //第一个方法求两个int值中的最大值，
    public void max(int i, int j) {
        int max = (i > j)? i : j;
        System.out.println(max);
    }

    //第二个方法求两个double值中的最大值，
    public void max(double i, double j) {
        double max = (i > j) ? i : j;
        System.out.println(max);
    }

    //求三个double值中的最大值,
    public void max(double i, double j, double k) {
        double temp = (i > j) ? i : j;
        double max = (temp > k) ? temp : k;
        System.out.println(max);
    }
}
