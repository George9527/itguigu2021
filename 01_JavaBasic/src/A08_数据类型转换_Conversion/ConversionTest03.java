package A08_数据类型转换_Conversion;
/*
    基本数据类型转换（Conversion）
      2021年3月25日 19点20分
 */
public class ConversionTest03 {
    public static void main(String[] args) {

        // 一、自动类型转换（隐式类型转换


        // （1）当把存储范围小的值（常量值、变量的值、表达式计算的结果值）赋值给了存储范围大的变量时
        int i = 'A'; // char自动升级为int ---- 65 (输出ASCII码)
        double d = 10; // int自动升级为double --- 10.0

        byte b = 127; //右边的整数常量值必须在-128~127范围内
        //byte bigB = 130;//错误，右边的整数常量值超过byte范围

        //右边的整数常量值如果在int范围呢，编译和运行都可以通过，这里涉及到数据类型转换
        long num = 1234567;
        //右边的整数常量值如果超过int范围，必须加L，否则编译不通过
        long bigNum = 12345678912L;
        // 总结： 对于long类型的值，如果在int的取值范围内，则允许不加 L 来赋值

        // （2）当存储范围小的数据类型与存储范围大的数据类型一起混合运算时，会按照其中最大的类型运算
        int i1 = 1;
        byte b1 = 1;
        double d1 = 1.0;

        double sum = i1 + b1 + d1;//混合运算，升级为double

        // （3）当byte,short,char数据类型进行算术运算时，按照int类型处理
        byte b3 = 1;
        byte b4 = 2;
        // byte b5 = b3 + b4;//编译报错，b1 + b2自动升级为int
        char c1 = '0';
        char c2 = 'A';
        System.out.println(c1 + c2); // 113

        // （4）boolean类型不参与 只有 false 与 true 两种

        // 二、强制类型转换（显示类型转换）


        // 将 1.5 赋值到 int 类型变量会发生什么？产生编译失败，肯定无法赋值。
        //想要赋值成功，只有通过强制类型转换，将 double 类型强制转换成 int 类型才能赋值。
        //强制类型转换：将 取值范围大的类型 强制转换成 取值范围小的类型 。
        //比较而言，自动转换是Java自动执行的，而强制转换需要我们自己手动执行。

        // int i = 3.14; // 错误

        /*
        强制类型转换：将 取值范围大的类型 强制转换成 取值范围小的类型 。
        比较而言，自动转换是Java自动执行的，而强制转换需要我们自己手动执行。
        转换格式：
        数据类型 变量名 = （数据类型）被强转数据值；

        (1）当把存储范围大的值（常量值、变量的值、表达式计算的结果值）赋值给了存储范围小的变量时，
        需要强制类型转换，提示：有风险，可能会损失精度或溢出

         */

        int i2 = (int)3.14;//强制类型转换，损失精度
        double d2 = 1.2;
        int num1 = (int)d2;//损失精度
        int i3 = 200;
        byte b6 = (byte)i;//溢出

        // （2）boolean类型不参与

        // （3）当某个值想要提升数据类型时，也可以使用强制类型转换
        int i4 = 1;
        int j4 = 2;
        double shang = (double)i4/j4; // 相当于 i4 变为 double 再参与运算


        // 三、特殊的数据类型转换


        // 1、任意数据类型的数据与String类型进行“+”运算时，结果一定是String类型
        System.out.println("" + 1 + 2); //12 相当于 [null] + 1 + 2 做字符串拼接

        // 2、但是String类型不能通过强制类型()转换，转为其他的类型
        String str = "123";
        // int num2 = (int)str;//错误的
        int num3 = Integer.parseInt(str);//后面才能讲到，借助包装类的方法才能转
    }
}
