package A01_异常的概述;
/*
    异常
 */
public class ExceptiDemo {
    public static void main(String[] args) {
        //调用方法
        method();
    }

    public static void method() {
        int[] arr = {1,2,3};
        System.out.println(arr[1]);

        //抛出异常 --- ArrayIndexOutOfBoundsException
        System.out.println(arr[3]);
    }
}
