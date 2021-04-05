package B10_变量的赋值;

/*
    关于变量的赋值
        1. 如果变量是基本数据类型，此时赋值的是变量多保存的数据值
        2. 如果变量是引用数据类型，此时赋值的是变量所报错的数据的地址值

 */

public class ValueTransferDemo01 {

    public static void main(String[] args) {

        System.out.println("**************  基本数据类型    **************");
        int m = 10;
        int n = m;

        System.out.println("m = " + m + " | n = " + n);

        n = 20;

        System.out.println("m = " + m + " | n = " + n);
        System.out.println("****************************");

        System.out.println("**************  引用数据类型    **************");

        Other o1 = new Other();
        o1.otherId = 10001;

        Other o2 = o1;

        System.out.println("o1.orderId: " + o1.otherId);
        System.out.println("o2.orderId: " + o2.otherId);

        o2.otherId = 10086;
        System.out.println("o2.orderId: " + o2.otherId);
    }

}
