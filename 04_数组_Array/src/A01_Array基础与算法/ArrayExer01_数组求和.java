package A01_Array基础与算法;

public class ArrayExer01_数组求和 {
    /*
        将列表中的元素输入进数组中
        将列表中的所有元素求和后输出
     */
    public static void main(String[] args) {

        // 使用静态初始化 输入元素
        int[][] arr = new int[][]{{3,5,8},{12,9},{7,0,6,4}};

        //循环 求和
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
        }
        System.out.println("总和：" + sum);
    }
}
