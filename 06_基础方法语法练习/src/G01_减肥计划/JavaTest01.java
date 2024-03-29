package G01_减肥计划;

/*
    需求：输入星期数，显示今天的减肥活动
            周一：跑步
            周二：游泳
            周三：慢走
            周四：动感单车
            周五：拳击
            周六：爬山
            周日：好好吃一顿

    思路：
        1:键盘录入一个星期数，用一个变量接收
        2:对星期数进行判断，这里用 if 语句实现
        3:在对应的语句控制中输出对应的减肥活动
 */

import java.util.Scanner;

public class JavaTest01 {
    public static void main(String[] args) {
        //键盘录入一个星期数，用一个变量接收
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("今天是星期几？：");
//        int week = sc.nextInt();

        //对星期数进行判断，这里用 if 语句实现
        while (true) {
            Scanner sc = new Scanner(System.in);

            System.out.println("今天是星期几？：");
            System.out.println("PS:0--退出系统");
            int week = sc.nextInt();

            if (week < 0 || week >7) {
                System.out.println("输入范围不对！请重新输入：");
                System.out.println("请输入0~7的正整数！！！");
            } else if(week == 1) {
                System.out.println("周一：跑步");
            } else if(week == 2) {
                System.out.println("周二：游泳");
            } else if(week == 3) {
                System.out.println("周三：慢走");
            } else if(week == 4) {
                System.out.println("周四：动感单车");
            } else if(week == 5) {
                System.out.println("周五：拳击");
            } else if(week == 6) {
                System.out.println("周六：爬山");
            } else if(week == 7) {
                System.out.println("周日：好好吃一顿");
            } else {
                System.out.println("退出");
                break;
            }
        }

    }
}
