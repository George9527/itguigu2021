package A01_Array基础与算法;

import java.util.Scanner;

/*
    2. 从键盘读入学生成绩，找出最高分，并输出学生成绩等级。
    成绩>=最高分-10 等级为’A’
    成绩>=最高分-20 等级为’B’
    成绩>=最高分-30 等级为’C’
    其余 等级为’D’
    提示：先读入学生人数，根据人数创建int数组，存放学生成绩。
 */
public class ArrayTest04_案例学生成绩 {
    public static void main(String[] args) {

        // 使用 scanner 方法 ，从键盘录入参数
        Scanner sc = new Scanner(System.in);

        //设置学生人数
        System.out.print("请输入学生人数：");
        int studentNum = sc.nextInt();

        // 键盘录入 学生成绩 用循环改进
        int[] arrayScore = new int[studentNum];

        for (int i = 0; i < arrayScore.length; i++) {
            System.out.print("请输入第" + (i + 1) + "个学生的成绩：");
            //添加进学生数组中
            arrayScore[i] = sc.nextInt();
        }

        // 输出学生成绩列表
        for (int x : arrayScore) {
            System.out.println(x);
        }

        // 用 for 循环判断最大值
        int maxScore = arrayScore[0];
        for (int x = 1; x < arrayScore.length; x++) {
            if (arrayScore[x] > maxScore) {
                maxScore = arrayScore[x];
            }
        }
        System.out.println("最高分为：" + maxScore);

        // 进行学生成绩分级 -- for循环嵌套if判断
//        for (int y = 0; y < arrayScore.length; y++) {
//            if (arrayScore[y] >= (maxScore - 10)) {
//                System.out.println("第" + (y + 1) + "个学生成绩为："
//                        + arrayScore[y] + " 等级为A");
//            } else if (arrayScore[y] >= (maxScore - 20)) {
//                System.out.println("第" + (y + 1) + "个学生成绩为："
//                        + arrayScore[y] + " 等级为B");
//            } else if (arrayScore[y] >= (maxScore - 30)) {
//                System.out.println("第" + (y + 1) + "个学生成绩为："
//                        + arrayScore[y] + " 等级为C");
//            } else {
//                System.out.println("第" + (y + 1) + "个学生成绩为："
//                        + arrayScore[y] + " 等级为D");
//            }

        // 进行学生成绩分级 -- 题目用这种方法
            char level ;
            for (int y = 0; y < arrayScore.length; y++) {
                if (arrayScore[y] >= (maxScore - 10)) {
                    level = 'A';
                } else if (arrayScore[y] >= (maxScore - 20)) {
                    level = 'B';
                } else if (arrayScore[y] >= (maxScore - 30)) {
                    level = 'C';
                } else {
                    level = 'D';
                }

                System.out.println("第" + (y + 1) + "个学生成绩为："
                        + arrayScore[y] + " 等级为:" + level);

            }
    }
}
