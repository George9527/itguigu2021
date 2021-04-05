package B11_变量值的传递机制;

/*
        二：值传递机制
        2.如果参数时引用数据类型，此时实参赋给实参的是 存储数据的地址值
 */

public class ValueTransferDemo01 {

    public static void main(String[] args) {

        //新建一个对象
        Data d = new Data();

        //给对象赋值
        d.m = 10;
        d.n = 20;

        System.out.println("m = " + d.m + " | n = " + d.n);

        //交换 m 和 n 的值

        ValueTransferDemo01 test = new ValueTransferDemo01();
        test.swap02(d);

        System.out.println("m = " + d.m + " | n = " + d.n);

    }

    public void swap02(Data data) {
        int temp = data.m;
        data.m = data.n;
        data.n = temp;
    }

}
