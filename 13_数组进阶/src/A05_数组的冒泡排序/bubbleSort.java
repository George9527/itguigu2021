package A05_数组的冒泡排序;

/*
    核心思想 : 元素之间比较换位.
    冒泡排序的比较方式 : **相邻元素比较**
 */
public class bubbleSort {
    public static void main(String[] args) {
        // 定义一个数组
        int[] arr = {6, 9, 3, 1, 4};

        System.out.print("排序前：");

        for (int i : arr) {
            System.out.print(i + " ");
        }

        // 外循环,次数固定的
        for (int i = 0; i < arr.length; i++) {
            // 内循环,每次都要进行递减操作
            for (int j = 0; j < arr.length - i - 1; j++) {
                // 比较换位，找出最大值放在数组最后
                if (arr[j] > arr[j + 1]) {
                    int maxTemp = arr[j];
                    // 交换位置
                    arr[j] = arr[j + 1];
                    arr[j + 1] = maxTemp;
                }
            }
        }

        System.out.println(" ");
        System.out.print("排序后：");

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
