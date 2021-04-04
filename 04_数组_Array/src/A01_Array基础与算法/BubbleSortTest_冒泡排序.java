package A01_Array基础与算法;

/*
    数组常见算法：
        冒泡排序
 */
public class BubbleSortTest_冒泡排序 {
    public static void main(String[] args) {

        //自定义一个无序数组
        int[] arr = new int[]{32,14,63,24,32,54,92,74,28,43};

        //遍历数组
        System.out.print("排序前的");
        getArr(arr);
        System.out.println(" ");

        //冒泡排序
        for (int i = 0; i < arr.length; i++) {
            for (int j =0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        //遍历数组
        System.out.print("排序后的");
        getArr(arr);
        System.out.println(" ");
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
