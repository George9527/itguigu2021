package A01_Array基础与算法;

/*
  使用简单数组
(1)创建一个名为ArrayTest的类，在main()方法中声明array1和array2两个变量，
他们是int[]类型的数组。
(2)使用大括号{}，把array1初始化为8个素数： 2,3,5,7,11,13,17,19。
(3)显示array1的内容。
(4)赋值array2变量等于array1，修改array2中的偶索引元素，使其等于索引值
(如array[0]=0,array[2]=2)。打印出array1。
思考： array1和array2是什么关系？
    array1和array2的内存地址一样的，堆空间只有一个数组，修改2等于修改1
拓展： 修改题目，实现array2对array1数组的复制
 */
public class arrayExer04 {
    public static void main(String[] args) {
        //创建两个int[]类型的数组 --- array1和array2
        int[] array1,array2;

        //使用大括号{}，把array1初始化为8个素数： 2,3,5,7,11,13,17,19。
        array1 = new int[] {2,3,5,7,11,13,17,19};
        //遍历显示array1的内容
        System.out.print("array1的内容：[");
        for (int i = 0; i < array1.length; i++) {
            if (i == array1.length - 1) {
                System.out.print(array1[i]);
            } else {
                System.out.print(array1[i] + ",");
            }
        }
        System.out.print("]");

        //赋值array2变量等于array1
        // 准确来说不能称作数组的赋值
        array2 = array1;

        //修改array2中的偶索引元素，
        //使其等于索引值(如array[0]=0,array[2]=2)。打印出array1。
        for (int i = 0; i < array2.length; i++) {
            if (i % 2 == 0) {
                array2[i] = i;
            }
        }

        //打印出array1
        System.out.println(" ");
        System.out.print("修改后array1的内容：[");
        for (int i = 0; i < array1.length; i++) {
            if (i == array1.length - 1) {
                System.out.print(array1[i]);
            } else {
                System.out.print(array1[i] + ",");
            }
        }
        System.out.print("]");
    }
}
