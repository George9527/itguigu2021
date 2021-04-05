package B07_数组基本算法;

/*
    自定义数组的工具类
 */
public class ArrayUtil {


    //求数组的最大值
    public int getMax(int[] arr) {
        int maxNumber = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxNumber) {
                maxNumber = arr[i];
            }
        }
        return maxNumber;
    }

    //求数组的最小值
    public int getMix(int[] arr) {
        int mixNumber = arr[0]; // 默认数组第一个元素为最小值
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < mixNumber) {
                mixNumber = arr[i];
            }
        }
        return mixNumber;
    }

    //求数组的总和
    public int getSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    //求数组的平均值
    public double getAvg(int[] arr) {
        double sumNumber = 0.0D;
        double avg = 0.0D;
        for (int i = 0; i < arr.length; i++) {
            sumNumber += arr[i];
        }
        avg = sumNumber / (arr.length);
        return avg;
    }

    //反转数组
    public void reverse(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
    }

    //复制数组
    public int[] copy(int[] arr) {
        int[] arr1 = new int[arr.length];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = arr[i];
        }
        return arr1;
    }

    //数组排序
    public void sort(int[] arr) {
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
    }

    //遍历数组
    public void print(int[] arr) {
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

    //查寻数组
    public int getIndex(int[] arr,int dest) {
        //线性查找
        for (int i = 0; i < arr.length; i++) {
            if (dest == arr[i]) {
                return i;
            }
        }
        return -1; // -1(<0) 表示没有找到
    }
}
