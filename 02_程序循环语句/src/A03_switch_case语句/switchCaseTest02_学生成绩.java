package A03_switch_case语句;

import java.util.Scanner;

/*
    2.对学生成绩大于60分的，输出“合格”。低于60分的，输出“不合格” 。
 */
public class switchCaseTest02_学生成绩 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("输入分数：");
        int num = sc.nextInt();

        int num_temp = num / 10;

        switch (num_temp) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("不及格");
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                System.out.println("合格");
                break;
            default:
                System.out.println("范围错误");
        }

        int num_temp2 = num / 60;

        switch (num_temp2) {
            case 0:
                System.out.println("不合格");
                break;
            case 1:
                System.out.println("合格");
                break;
            default:
                System.out.println("范围错误");
        }
    }
}
