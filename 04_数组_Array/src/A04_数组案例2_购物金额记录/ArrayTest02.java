package A04_数组案例2_购物金额记录;

import java.util.Scanner;

/*
    需求：
        以表格的形式输出5笔购物金额及总金额
    思路：
        ①：创建一个长度为5的double类型的数组，存储购物金额
        ②：循环输入5笔购物金额，并累加总金额
        ③：利用循环输出5笔购物金额，最后输出总金额
 */
public class ArrayTest02 {
    public static void main(String[] args) {

        // 自定义变量
        double sumMoney = 0;

        // ①：创建一个长度为5的double类型的数组，存储购物金额
        double[] money = new double[5];

        // 使用 Scanner方法 录入 金额数据
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入本月的消费记录");

        // ②：利用 for循环 完成5次的金额输入
        for (int i = 0; i < 5; i++) {
            System.out.print("请输入第" + (i + 1) + "笔购物金额：");
            money[i] = sc.nextDouble();
        }

        // 表头
        System.out.println("序号\t\t金额(元)");

        // ③：利用循环输出5笔购物金额，最后输出总金额
        for (int i = 0; i < 5; i++) {
            System.out.println((i + 1) + "\t\t" + money[i]);
            sumMoney += money[i];
        }
        System.out.println("总金额：\t\t" + sumMoney);
    }
}

// 总结：循环句修改为 for(int i=0;i<money.length;i++) 更加好
