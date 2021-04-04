package A02_Array工具类的使用;

import java.util.Arrays;
import java.util.Scanner;

/*
    需求：
        循环录入5位学员成绩，进行升序排列后输出结果
    思路：
        使用Array类的sort()方法：对数组进行升序排序
 */
public class ArrayToolsTest01 {
    public static void main(String[] args) {

        // 新建一个 int类型的数组，长度为5
        int[] studentScore = new int[5];

        // 循环录入5位学员成绩
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < studentScore.length; i++) {
            System.out.print("请输入第" + (i + 1) + "位学员成绩：");
            studentScore[i] = sc.nextInt();
        }

        // 进行升序排列后输出结果
        Arrays.sort(studentScore);
        System.out.print("学员成绩按升序排列：");
        for (int i = 0; i < studentScore.length; i++) {
            System.out.print(studentScore[i] + " ");
        }
    }
}
