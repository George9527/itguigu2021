package A13_关系运算符_Operator;
/*
    关系运算符
        结论：比较运算符的结果都是 Boolean类型
 */
public class OperatorDemo {
    public static void main(String[] args) {
        //定义变量
        int i = 10;
        int j = 20;
        int k = 10;

        //  == 相等于
        System.out.println(i == j);
        System.out.println(i == k);
        System.out.println("----------");

        //  != 不等于
        System.out.println(i != j);
        System.out.println(i != k);
        System.out.println("----------");

        //  > 大于
        System.out.println(i > j);
        System.out.println(i > k);
        System.out.println("----------");

        //  >= 大于或等于
        System.out.println(i >= j);
        System.out.println(i >= k);
        System.out.println("----------");

        //如果 “==” 写成 “=” 就会变成赋值
    }
}
