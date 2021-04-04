package A06_循环结构_doWhile循环;

import java.util.Scanner;

public class DoWhileTest02 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入一个整数：");
        int userInput = scanner.nextInt();

        int positiveCount = 0;
        int negativeCount = 0;

        do {

            if (userInput > 0){

                positiveCount++;

            }

            if (userInput < 0){

                negativeCount++;

            }

            System.out.println("正数的个数："+positiveCount);
            System.out.println("负数的个数："+negativeCount);

            System.out.print("请输入一个整数：");
            userInput = scanner.nextInt();

        }while(userInput != 0);

    }
}
