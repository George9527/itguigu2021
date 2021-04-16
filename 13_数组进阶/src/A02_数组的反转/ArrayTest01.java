package A02_数组的反转;

import java.util.Arrays;

/*
    数组的反转 不等于 数组倒序遍历
        数组倒序遍历 --- 数组本身没有改变
        数组的反转 --- 需要改变数组原有的排序

    思路：
        数组中元素位置的交换,数组的换位,借助一个变量
        利用索引值进行 交换位置

    核心问题 :
        数组中最远端的元素交换位置上

 */
public class ArrayTest01 {

    public static void main(String[] args) {

        //  新建一个数组
        int[] arr = {1,2,3,4,8,9,7,5,6};

        // 数组排序
        Arrays.sort(arr);

        System.out.print("排序后： ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println(" ");

        // 实现  数组的反转 --- 不一定需要给数组进行排序
        // 最远的元素，交换位置(使用第三方变量)
        for (int min = 0 , max = arr.length - 1; min < max; min++ , max--) {
            int temp = arr[min]; // 记录数组的最小索引上的元素
            arr[min] = arr[max]; // 数组最大索引上的元素，赋值到最小元素的位置上
            arr[max] = temp;
        }

        // 输出排序后的数组
        System.out.print("反转后： ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println(" ");

    }
}
