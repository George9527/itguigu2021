package A01_if_else语句;

import java.util.Scanner;

/*
        岳小鹏参加Java考试，他和父亲岳不群达成承诺：
    如果：
    成绩为100分时，奖励一辆BMW；
    成绩为(80， 99]时，奖励一台iphone xs max；
    当成绩为[60,80]时，奖励一个 iPad；
    其它时，什么奖励也没有。
    请从键盘输入岳小鹏的期末成绩，并加以判断
 */
public class ifTest02_练习题考试奖励 {
    public static void main(String[] args) {

        //从键盘输入岳小鹏的期末成绩
        //使用 Scanner 实现键盘录入成绩
        Scanner sc = new Scanner(System.in);
        System.out.println("输入范围！[0-100] 正整数");
        System.out.print("输入岳小鹏的期末成绩：");
        int socre = sc.nextInt();

        //判断岳小鹏的期末成绩
        if (socre >= 60 && socre <= 80) {
            System.out.println("期末成绩:" + socre + " 奖励一个 iPad");
        } else if (socre > 80 && socre <= 99) {
            System.out.println("期末成绩:" + socre + " 奖励一台iphone xs max");
        } else if (socre == 100) {
            System.out.println("期末成绩:" + socre + " 奖励一辆BMW");
        } else if (socre >= 0 && socre <= 59) {
            System.out.println("才考了" + socre + " 滚😠！！！");
        } else {
            System.out.println("输入范围有误！[0-100]");
        }
    }
}
