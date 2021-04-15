package A06_选择排序优化;

/**
 * 选择排序的优化
 * 最值获取:
 *      利用元素
 *      用索引
 *  遍历整个数组，找出元素的最小值并排在数组的前面
 */
public class selectSort {
    public static void main(String[] args) {

        int[] arr = {6, 9, 3, 1, 4};

        System.out.print("排序前：");

        for (int i : arr) {
            System.out.print(i + " ");
        }

        //获取数组的最值
        for (int i = 1; i < arr.length; i++) {
            //定义变量,保存数组的第一个元素
            int min = arr[i - 1]; //[1-1  = 0]
            //定义记录最小值索引
            int minIndex = i - 1;
            for (int j = i; j < arr.length; j++) {
                if (min > arr[j]) {
                    //记录的索引
                    minIndex = j;
                    //记录最小值
                    min = arr[j];
                }
            }
            //位置交换
            if (minIndex != (i - 1)) { // 判断这个元素是否为元素本身
                int temp = arr[i - 1];
                arr[i - 1] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }

        System.out.println(" ");
        System.out.print("排序后：");

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
