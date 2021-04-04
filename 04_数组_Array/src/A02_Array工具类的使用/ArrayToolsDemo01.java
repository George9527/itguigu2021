package A02_Array工具类的使用;

import java.util.Arrays;

/*
java.util.Arrays:操作数组的工具，里面定义了很多操作数组的方法

    1 boolean equals(int[] a,int[] b)  ==== 判断两个数组是否相等。
    2 String toString(int[] a)         ==== 输出数组信息。
    3 void fill(int[] a,int val)       ==== 将指定值填充到数组之中。
    4 void sort(int[] a)               ==== 对数组进行排序。
    5 int binarySearch(int[] a,int key)==== 对排序后的数组进行二分法检索指定的值
 */
public class ArrayToolsDemo01 {
    public static void main(String[] args) {

        //自定义数组
        int[] arr1 = new int[] {1,2,3,4};
        int[] arr2 = new int[] {1,3,2,4};
        int[] arr3 = new int[] {4,7,2,6};

        //1.boolean equals(int[] a,int[] b)  ==== 判断两个数组是否相等。
        boolean isEquals = Arrays.equals(arr1,arr2);
        System.out.println(isEquals);

        //2. String toString(int[] a)         ==== 输出数组信息。
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        //3. void fill(int[] a,int val)       ==== 将指定值填充到数组之中。
        Arrays.fill(arr2,10);  // 填充 将原数组中每个元素都进行替换
        System.out.println(Arrays.toString(arr2));

        //4. void sort(int[] a)               ==== 对数组进行排序。
        Arrays.sort(arr3);
        System.out.println(Arrays.toString(arr3));

        //5. int binarySearch(int[] a,int key)==== 对排序后的数组进行二分法检索指定的值
        int find = 4;
        int result = Arrays.binarySearch(arr3,find);
        System.out.println(result);
    }
}
