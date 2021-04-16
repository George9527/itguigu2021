package A02_异常时JVM的默认处理方案;
/*
    JVM的默认处理方案
 */

public class ExceptionDemo02 {
    public static void main(String[] args) {
        System.out.println("开始");
        method();
        System.out.println("结束");
    }

    //创建方法
    public static void method() {
        int[] arr = {1,2,3};
        System.out.println(arr[6]);
    }
}
