package D06_数组初始化之静态初始化;

public class ArrayDemo {
    public static void main(String[] args) {

        // 方法一

        //定义数组
        int[] arr = {1,2,3};

        //输出数组名(地址值)
        System.out.println(arr);

        //输出数组中元素
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

        // 方法二

        int[] arr2 = new int[] {1,2,3};		//正确
//        将其拆开的写法：
        int[] arr3;
        arr3 = new int[] {1,2,3};		//正确

//        int[] arr2;
//        arr2 = new int[3]{1,2,3};		//错误
    }
}
