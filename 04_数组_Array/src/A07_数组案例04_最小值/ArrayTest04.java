package A07_数组案例04_最小值;

import java.util.Scanner;

/*
    需求：
        求四家的最低价格
    思路：
        ①：键盘录入价格信息
        ②：对价格进行正序排序
        ③：利用索引值求解
        ④：利用三元运算
        ⑤：两层for循环求解
 */
public class ArrayTest04 {
    public static void main(String[] args) {

        // 新建一个int数组 长度为4位
        int[] price = new int[4];

        // 键盘录入价格信息
        System.out.println("请输入4家店的价格");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i <= price.length - 1; i++) {
            System.out.print("第" + (i + 1) + "家店的价格：");
            price[i] = scanner.nextInt();
        }

//        // 对价格数组进行正序排列
//        Arrays.sort(price);
//
//        // 利用索引值求解
//        System.out.println("最低价格：" + price[0]);

        // 利用三元运算
//        int mix = 0;
//        for (int i = 0; i < price.length - 1; i++) {
//            mix = price[i] < price[i + 1] ? price[i] : price[i + 1];
//        }
//        System.out.println("最低价格：" + mix);

        // 两层for循环求解

        //取数组中的第一个数据作为变量的初始值
        int mix = price[0];
        //与数组中剩余的数据逐个对比，每次对比将最小值保存到变量中
        for (int i = 1; i < price.length; i++) {
            if(price[i] < mix) {
                mix =price[i];
            }
        }
        //循环结束后打印变量的值
        System.out.println("最低价格：" + mix);
    }
}
