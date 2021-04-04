package A03_switch_case语句;

import java.util.Scanner;

/*
  编写程序：
    从键盘上读入一个学生成绩，存放在变量score中，根据score的
    值输出其对应的成绩等级：
    score>=90 等级: A
    70<=score<90 等级: B
    60<=score<70 等级: C
    score<60 等级: D
    方式一：使用if-else
    方式二：使用switch-case: score / 10: 0 - 10
 */
public class swithchCaseTest06_学生成绩等级 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("输入学生成绩：");
        int score = sc.nextInt();

        int scoreTemp = score / 10;

        switch (scoreTemp) {
            case 10:
            case 9:
                System.out.println("A");
                break;
            case 8:
            case 7:
                System.out.println("B");
                break;
            case 6:
                System.out.println("C");
                break;
            case 5:
            case 4:
            case 3:
            case 2:
            case 1:
            case 0:
                System.out.println("D");
                break;
            default:
                System.out.println("输入范围错误");
        }
    }
}
