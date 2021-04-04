package D10_数组最值;
/*
    获取最值
        获取数组中的最大值
        最小值同学们自己完成
 */
public class ArrayTest02 {
    public static void main(String[] args) {
        //定义数组
        int[] arr = {12,45,98,73,10} ;

        //定义一个变量，用于保存最大值
        //取数组中的第一个数据作为变量的初始值
        int max = arr[0];

        //与数组中剩余的数据逐个对比，每次对比将最大值保存到变量中
        for (int x = 1; x < arr.length; x++) {
            if(arr[x] > max) {
                max = arr[x];
            }
        }

        //循环结束后打印变量的值
        System.out.println("max:" + max);

        //取数组中的第一个数据作为变量的初始值
        int mix = arr[0];
        //与数组中剩余的数据逐个对比，每次对比将最小值保存到变量中
        for (int y = 1; y < arr.length; y++) {
            if(arr[y] < mix) {
                mix =arr[y];
            }
        }
        //循环结束后打印变量的值
        System.out.println("mix:" + mix);
    }
}
