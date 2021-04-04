package A01_if_else语句;

import java.util.Scanner;

/*
    编写程序：由键盘输入三个整数分别存入变量num1、 num2、 num3，
对它们进行排序(使用 if-else if-else),并且从小到大输出。
 */
public class ifTest03_大小排序 {
    public static void main(String[] args) {

        //创建三个空变量
        int mix = 0;
        int zhong = 0;
        int max = 0;

        //使用 scanner 方法
        Scanner sc = new Scanner(System.in);

        // 存入变量中
        System.out.print("输入第一个整数：");
        int num1 = sc.nextInt();
        System.out.print("输入第二个整数：");
        int num2 = sc.nextInt();
        System.out.print("输入第三个整数：");
        int num3 = sc.nextInt();

        //使用 if-else 对它们进行排序
        if (num1 < num2 & num1 < num3) {
            mix = num1;
        } else if (num1 > num2 & num1 > num3) {
            max = num1;
        } else if (num1 > num2 || num1 > num3) {
            zhong = num1;
        }

        if (num2 < num1 & num2 < num3) {
            mix = num2;
        } if (num2 > num1 & num2 > num3) {
            max = num2;
        } else if (num2 > num1 || num2 > num3) {
            zhong = num2;
        }

        if (num3 < num1 & num3 < num2) {
            mix = num3;
        } else if (num3 > num1 & num3 > num2) {
            max = num3;
        } else if (num3 > num2 || num3 > num1) {
            zhong = num3;
        }

        //从小到大输出
        System.out.println(mix + ":" + zhong + ":" + max);
    }
}
