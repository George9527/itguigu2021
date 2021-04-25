package A09_递归;

/*
递归求阶乘:
    例需求：
        用递归求5的阶乘，并把结果在控制台输出
    规则：
        n*(n-1)
 */

import java.util.Scanner;

public class DiGuiDemo2 {

    public static void main(String[] args) {
        // 从键盘录入一个数
        Scanner scanner = new Scanner(System.in);
        System.out.print("输入遍历N值：");
        int i = scanner.nextInt();
        // 调用方法
        int res = jc(i);
        // 输出结果
        System.out.println("结果：" + res);
    }

    //定义一个方法，用于递归求阶乘，参数为一个int类型的变量
    public static int jc(int n) {
        //在方法内部判断该变量的值是否是1
        if (n == 1) {
            // 返回 1
            return 1;
        } else {
            return n * jc(n - 1);
        }
    }
}
