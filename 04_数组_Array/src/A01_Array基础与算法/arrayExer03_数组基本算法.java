package A01_Array基础与算法;

import java.util.Random;

/*
    2. 求数值型数组中元素的最大值、最小值、平均数、总和等
    定义一个int类型的一维数组，包含10个元素，分别赋一些随机整数，
    然后求出所有元素的最大值，最小值，和值，平均值，并输出至控制台
    所有的元素都是随机的两位数 [10,99]
 */
public class arrayExer03_数组基本算法 {
    public static void main(String[] args) {

        //定义一个int类型的一维数组，包含10个元素
        int[] arr = new int[10];

        //获取10-99之间的随机数 [10,100) --- 不包含100
        Random r = new Random();
        int numberRandom = 0;
        //int numberRandom = r.nextInt(100);

        //赋值 --- 随机不相同的两位数
        for (int i = 0; i < arr.length; i++) {
            arr[i] = numberRandom = r.nextInt(90) + 10;
        }

        //循环遍历后输出
        System.out.print("随机生成10个元素：[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) { // 判断是否为数组的开头
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + ",");
            }
        }
        System.out.print("]");
        System.out.println(" ");

        //求数组中的最大值
        int maxNumber = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxNumber) {
                maxNumber = arr[i];
            }
        }
        System.out.println("最大值：" + maxNumber);

        //求数组中的最小值
        int mixNumber = arr[0]; // 默认数组第一个元素为最小值
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < mixNumber) {
                mixNumber = arr[i];
            }
        }
        System.out.println("最小值：" + mixNumber);

        //求数组所有元素的和
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("所有元素累加和：" + sum);

        //求数组所有元素的平均和 --- double类型
        double sumNumber = 0.0D;
        double mean = 0.0D;
        for (int i = 0; i < arr.length; i++) {
            sumNumber += arr[i];
        }
        mean = sumNumber / (arr.length);
        System.out.println("所有元素平均值：" + mean);
    }
}
