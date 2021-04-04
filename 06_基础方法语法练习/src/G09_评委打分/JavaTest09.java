package G09_评委打分;

/*
    需求：
        在编程竞赛中，有6个评委为参赛的选手打分，分数为0-100的整数分。
        选手的最后得分为：去掉一个最高分和一个最低分后 的4个评委平均值 (不考虑小数部分)。

    思路：
        1:定义一个数组，用动态初始化完成数组元素的初始化，长度为6
        2:键盘录入评委分数
        3:由于是6个评委打分，所以，接收评委分数的操作，用循环改进
        4:定义方法实现获取数组中的最高分(数组最大值)，调用方法
        5:定义方法实现获取数组中的最低分(数组最小值) ，调用方法
        6:定义方法实现获取数组中的所有元素的和(数组元素求和) ，调用方法
        7:按照计算规则进行计算得到平均分
        8:输出平均分

    方法：
        返回值类型：
        参数：

 */

import java.util.Scanner;

public class JavaTest09 {
    public static void main(String[] args) {

        //新建数组元素---方法
        int[] arr = getArray();

        //调用遍历数组---方法
        printArray(arr);

        //调用数组最大值---方法
        int max = getMax(arr);

        //调用数组最小值---方法
        int min = getMin(arr);

        //调用数组元素和---方法
        int sum = getSum(arr);

        //按照计算规则进行计算得到平均分
        int avg = (sum - max - min) / (arr.length - 2);

        //输出平均分
        System.out.println("选手的最终得分是：" + avg);

    }


    public static int[] getArray() {
        //定义一个数组，用动态初始化完成数组元素的初始化，长度为6
        int[] arr = new int[6];

        //键盘录入评委分数
        Scanner sc = new Scanner(System.in);

        //由于是6个评委打分，所以，接收评委分数的操作，用循环改进
        for (int x=0; x<arr.length; x++) {
            System.out.print("请输入第" + (x + 1) + "个评委的打分:");
            arr[x] = sc.nextInt();
        }
        return arr;
    }

    public static void printArray(int[] arr) {
        //遍历数组
        System.out.print("[");
        for(int x=0; x<arr.length; x++) {
            if (x == arr.length-1) {
                System.out.print(arr[x]);
            } else {
                System.out.print(arr[x] + ",");
            }
        }
        System.out.print("]");
        System.out.println();
        System.out.println("遍历数组方法---End");
    }

    public static int getMax(int[] arr) {
        //定义方法实现获取数组中的最高分(数组最大值)，调用方法
        int max =arr[0];
        for (int x=1; x<arr.length; x++) {
            if (arr[x] > max) {
                max = arr[x];
            }
        }
        System.out.println("最大值：" + max);
        return max;
    }

    public static int getMin(int[] arr) {
        //定义方法实现获取数组中的最高分(数组最小值)，调用方法
        int min =arr[0];
        for (int x=1; x<arr.length; x++) {
            if (arr[x] < min) {
                min = arr[x];
            }
        }
        System.out.println("最小值：" + min);
        return min;
    }

    public static int getSum(int[] arr) {
        //定义方法实现获取数组中的所有元素的和(数组元素求和) ，调用方法
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        System.out.println("评委总得分：" + sum);
        return sum;
    }
}
