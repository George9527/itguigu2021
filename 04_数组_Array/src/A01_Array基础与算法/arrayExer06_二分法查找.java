package A01_Array基础与算法;

import java.util.Arrays;
import java.util.Scanner;

/*
    数组的二分法查找
        前提：所查找的数组必须有序的
 */
public class arrayExer06_二分法查找 {
    public static void main(String[] args) {

        //定义一个数组
//        int[] arr = new int[]{-98,-34,2,34,54,66,79,105,210,333};
        int[] arr = new int[]{8,11,4,2,5,16,9,15,21,13};

        //遍历数组
        System.out.print("排序前的");
        getArr(arr);
        System.out.println(" ");

        //前提：所查找的数组必须有序的 --- 利用 Arrays.sort(int[] arr);
        Arrays.sort(arr);
        System.out.print("排序后的");
        getArr(arr);
        System.out.println(" ");

        //使用二分法查找

        //键入需要查找的元素
        Scanner scanner = new Scanner(System.in);
        System.out.print("输入需要查找的元素：");
        int find = scanner.nextInt();

        int head = 0; // 初始的首索引
        int end = arr.length - 1; // 初始的末索引
        boolean isFlag = true;

        while (head <= end) {
            int middle = (head + end) / 2;
            if (find == arr[middle]) {
                System.out.println("找到指定元素，索引值：" + middle);
                isFlag = false;
                break;
            } else if (arr[middle] > find) {
                end = middle - 1;
            } else { // arr[middle] < find
                head = middle + 1;
            }
        }
        if (isFlag == true) {
            System.out.println("没有查找到指定元素：" + find);
        }
    }

    //自定义遍历数组方法
    public static void getArr(int[] arr) {
        System.out.print("数组内容：[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + ",");
            }
        }
        System.out.print("]");
    }
}
