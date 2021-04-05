package B13_形参的传递机制;
/*
    方法的形参的传递机制：值传递

    一：形参与实参
        1.形参：方法定义时，声明的小括号内的参数
        2.实参：方法调用时，实际传递给形参的值

    二：值传递机制
        1.如果参数时基本数据类型，此时实参赋给实参的是 真实存储的数据值
        2.如果参数时引用数据类型，此时实参赋给实参的是 存储数据的地址值
 */
public class ValueTransferDemo01 {
    public static void main(String[] args) {

        //自定义两个变量
        int m = 10;
        int n = 20;
        System.out.println("m = " + m + " | n = " + n);

        //交换两个变量的值的操作
//        int temp = m;
//        m = n;
//        n = temp;
//        System.out.println("m = " + m + " | n = " + n);

        //调用方法完成 交换两个变量的值的操作
        ValueTransferDemo01 test = new ValueTransferDemo01();
        test.swap(m,n);

        //这里输出的还是方法外的 m | n 的数据值
        System.out.println("m = " + m + " | n = " + n);

        //输出方法内的数据值
    }

    //构造一个交换变量值的方法
    public void swap(int m,int n) {
        int temp = m;
        m = n;
        n = temp;
    }
}
