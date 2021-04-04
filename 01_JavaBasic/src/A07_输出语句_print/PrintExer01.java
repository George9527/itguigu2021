package A07_输出语句_print;
/*
    Print 输出语句的练习
 */
public class PrintExer01 {

    public static void main(String[] args){

        // 带有换行效果的输出
        System.out.println("hello java换行");

        // 不带有换行效果的输出
        System.out.print("hello java不换行");

        // 调用println()函数时不传参数，代表仅执行换行操作
        // System.out.println();
        System.out.print("hello java不换行");

        // 调用print()函数时不传参数，将导致编译错误
        // System.out.print();

        int age = 10;

        // "age"是一个字面量，也可以说是一个字符串常量
        System.out.println("age");

        // age是一个变量，在打印语句中会输出这个变量的值
        System.out.println(age);

        // 输出很多内容时，可以使用+做字符串连接
        System.out.println("age="+age);
    }
}
