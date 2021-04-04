package A08_二维数组的遍历;
/*
      最简单的二维数组定义方式
     int[][] arr = {{},{},{},{},{},{},}

   二维数组的遍历
      二维数组中，存储4个一维数组，每个一维数组的长度不同

      遍历：for循环，遍历二维数组
            遍历过程中，for遍历一维数组

 */
public class ArrayTest01 {
    public static void main(String[] args) {

        // 创建一个二维数组对象 --- 存储4个一维数组，每个一维数组的长度不同
        int[][] arr = {{1,2,3},{4,5,6},{1,2},{0}};
        //对数组内的元素进行访问
        System.out.println(arr[2][1]);
        System.out.println(" ");

        // 遍历二维数组
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println(" ");
        }
    }
}

