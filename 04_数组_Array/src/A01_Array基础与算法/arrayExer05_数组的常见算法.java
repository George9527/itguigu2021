package A01_Array基础与算法;

import java.util.Scanner;

/*
    3.4 数组中涉及的常见算法
        3.数组的复制、反转、查找(线性查找、二分法查找)
            二分法查找 --- arrayExer06.java
 */
public class arrayExer05_数组的常见算法 {
    public static void main(String[] args) {

        String[] arr = new String[]{"JJ","DD","MM","BB","GG","AA"};

        //数组的复制(区别于数组的变量的赋值：arr1 = arr)
        String[] arr1 = new String[arr.length];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = arr[i];
        }

        //调用遍历数组方法
        System.out.print("原始");
        array(arr);

        System.out.println(" ");
        System.out.println("==========");

        //数组的反转
        String[] arr2 = new String[arr.length];
        for (int i = 0; i < arr.length / 2; i++) {
            String temp = arr[i];
            arr2[i] = arr[arr.length - i - 1];
            arr2[arr.length - i - 1] = temp;
        }

        //调用遍历数组方法
        System.out.print("反转");
        array(arr2);

        System.out.println(" ");
        System.out.println("==========");

        //数组的查找

        //使用 Scanner 录入需要查找的
        Scanner sc = new Scanner(System.in);
        System.out.print("输入需要查找的元素：");
        String find = sc.next();

        //使用遍历循环，
        boolean isFind = false;
        for (int i = 0; i < arr.length; i++) {
            if (find.equals(arr[i])) {
                isFind = true;
                System.out.println("索引值：" + i + " 元素：" + arr[i]);
                break;
            }

        }
        // 没有查找到元素后提示
        if (isFind == false){
            System.out.println("没有找到" + find + "这个元素");
        }
    }

    //自定义遍历数组方法
    public static void array(String[] arr) {
        System.out.print("数组的内容：[");
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
