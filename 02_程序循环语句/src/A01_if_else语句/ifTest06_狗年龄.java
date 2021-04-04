package A01_if_else语句;

import java.util.Scanner;

/*
    我家的狗5岁了， 5岁的狗相当于人类多大呢？其实，狗的前两年每
一年相当于人类的10.5岁，之后每增加一年就增加四岁。那么5岁的狗
相当于人类多少年龄呢？应该是： 10.5 + 10.5 + 4 + 4 + 4 = 33岁。
编写一个程序，获取用户输入的狗的年龄，通过程序显示其相当于人
类的年龄。如果用户输入负数，请显示一个提示信息。
 */
public class ifTest06_狗年龄 {
    public static void main(String[] args) {

        // 使用 Scanner 方法 键盘录入狗的年龄
        Scanner sc = new Scanner(System.in);

        System.out.print("请输狗的年龄：");
        double dogAge = sc.nextDouble();

        //获取用户输入的狗的年龄，通过程序显示其相当于人类的年龄
        //先判断狗的年龄是否在 2年 内
        if (dogAge <= 2 && dogAge > 0) {
            double humanAge = dogAge * 10.5;
            System.out.println("狗的年龄为：" + dogAge +  "岁" + " " + "相当于人类的：" + humanAge + "岁");
        } else if (dogAge > 2 && dogAge > 0) {
            // 计算前两年
            double twoYears = 2 * 10.5;
            // 计算狗狗的年龄
            double humanAge = (dogAge - 2) * 4 + twoYears;
            System.out.println("狗的年龄为：" + dogAge +  "岁" + " " + "相当于人类的：" + humanAge + "岁");
        } else {
            System.out.println("输入范围不正确");
        }
    }
}
