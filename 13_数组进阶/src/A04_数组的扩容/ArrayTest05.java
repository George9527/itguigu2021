package A04_数组的扩容;

import java.lang.reflect.Array;

/**
 * 源码：public static native void arraycopy(Object src,  int  srcPos, Object dest, int destPos,int length);
 * 参数：
 *
 *     src：要复制的数组(源数组)
 *
 *     srcPos：复制源数组的起始位置
 *
 *     dest：目标数组
 *
 *     destPos：目标数组的下标位置
 *
 *     length：要复制的长度
 *
 *  
 *
 * 例如：
 *
 * String[] arr = {"A","B","C","D","E","F"};
 *
 * 从下标为3的位置开始复制，复制的长度为2(复制D、E)，从下标为2的位置开始替换为D、E
 *
 * 复制后的数组为:
 *
 * String[] arr = {"A","B","C","A","B","C"};
 */

public class ArrayTest05 {
    public static void main(String[] args) {

        // 创建一个静态数组
        String[] arr = {"A","B","C","D","E","F"};

        // 替换数组中的元素，此时该数组中的长度是不变的
        // 从下标为0的位置开始复制，复制的长度为3(复制A、B、C)，从下标为3的位置开始替换为A、B、C
        System.arraycopy(arr,0,arr,3,3);

        // 输出该数组
        for (String s : arr) {
            System.out.print(s + " ");
        }

    }
}
