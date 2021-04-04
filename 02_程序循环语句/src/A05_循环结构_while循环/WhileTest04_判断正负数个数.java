package A05_循环结构_while循环;

import java.util.Scanner;

/*
    从键盘读入个数不确定的整数，并判断读入的正数和负数的个数，输入为0时结束程序。
 */

public class WhileTest04_判断正负数个数 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

// 请用户输入整数
        System.out.print("请用户输入整数：");
        int userInput = scanner.nextInt();

// 声明变量用于保存正数的个数
        int positiveCount = 0;

// 声明变量用于保存负数的个数
        int negativeCount = 0;

        while(userInput != 0){

            // 判断当前用户输入的是正数还是负数
            if (userInput > 0) {
                positiveCount++;
            }
            if (userInput < 0) {
                negativeCount++;
            }

            // 让用户输入新的数据：
            System.out.print("请用户输入整数：");
            userInput = scanner.nextInt();
        }

        System.out.println("正数的个数："+positiveCount);
        System.out.println("负数的个数："+negativeCount);
        System.out.print("程序结束");

    }
}
