package A12_赋值运算符;
/*
    赋值运算符
        注意连续赋值这个小技巧

 */
public class SetValueDemo {
    public static void main(String[] args) {
        //赋值符号： =
        int i1 = 10;
        int j1 = 10;

        int i2,j2;
        //连续赋值
        i2 = j2 = 10;

        //表示 i3与j3 公用一个int类型
        int i3 = 10,j3 = 20;

        // ==============================

        int num1 = 10;
        num1 += 2; // num1 = num1 + 2 = 12
        System.out.println(num1);

        int num2 = 12;
        num2 %= 5; // num2 = num2 % 5 = 12 ÷ 5 = 2...2  --- 2

        // ===============================

        //  把10赋值给 int 类型的变量
        int i = 10;
        System.out.println(i);
        System.out.println("i:>>>" + i);

        // +=   >>>把左边和右边的数据做加法操作，结果赋值给左边
        i += 10;
        System.out.println("i:>>>" + i);

        // 注意：扩展的赋值运算符底层隐含了强制类型转换
        short s = 10;
        //s += 20; --- 这种不会改变原来的类型
        //s = s + 20; //报错：这里的加法是int类型，a 本身是short类型
        s = (short)(s+20); //需要强制转换为short类型
        System.out.println("s:>>>" + s);

        //小结：如果希望变量实现 +2 的操作，有几种方法？ int num = 10；
        //方法一： num = num + 2
        //方法二： num = num += 2
        //方法三： 循环 n 次  num++
    }
}
