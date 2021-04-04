package A10_算术运算符;

import java.util.Scanner;

/*
    练习2
随意给出一个整数， 打印显示它的个位数， 十位数， 百位数的值。
格式如下：
数字xxx的情况如下：
个位数：
十位数：
百位数：
例如：
数字153的情况如下：
个位数： 3
十位数： 5
百位数： 1
 */
public class OperatorTest01 {
    public static void main(String[] args) {

        //自定义个位数， 十位数， 百位数的初始值
        int gw_num = 0;
        int sw_num = 0;
        int bw_num = 0;

        //键盘录入三位数的正整数，用 Scanner 实现
        Scanner sc = new Scanner(System.in);
        //键盘录入三位数的正整数
        System.out.print("输入一个三位数的正整数：");
        int number = sc.nextInt();

        //随意给出一个整数， 打印显示它的个位数， 十位数， 百位数的值。
        //判断用户输入的是否为三位数的正整数
        if (100 <= number & number <= 999) {
            //System.out.println("输入正确");
            //打印显示它的个位数， 十位数， 百位数的值

            //个位数 除100取余数 余数再除10取余数 输出该余数
            gw_num = number % 100 % 10;
            System.out.println("个位数：" + gw_num);

            //十位数 除100取余数 余数再除10取商 输出该商
            sw_num = number % 100 /10;
            System.out.println("十位数：" + sw_num);

            //百位数 除100取商 输出该商
            bw_num = number / 100;
            System.out.println("百位数：" + bw_num);

        } else {
            System.out.println("输入错误：只能是一个三位数的正整数");
        }
    }
}
