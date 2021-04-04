package A11_自加自减运算;
/*
    二、复合使用
        1. 和其他变量放在一起使用或者和输出语句放在一起使用，前++和后++就产生了不同。
        2. 变量 前++ ：变量先自身加1，然后再取值。
        3. 变量 后++ ：变量先取值，然后再自身加1。
 */
public class OperatorDemo02 {
    public static void main(String[] args) {
        // 其他变量放在一起使用
        int x = 3;
        //int y = ++x; // y的值是4，x的值是4，
        int y = x++; // y的值是3，x的值是4

        System.out.println(x);
        System.out.println(y);
        System.out.println("==========");

        // 和输出语句一起
        int z = 5;
        //System.out.println(++z);// 输出结果是6，z的值也是6
        System.out.println(z++);// 输出结果是5，z的值是6
        System.out.println(z);

        int a = 1;
        a = a++;//(1)先取a的值“1”放操作数栈(2)a再自增,a=2(3)再把操作数栈中的"1"赋值给a,a=1

        int i = 1;
        int j = i++ + ++i * i++;
        /*
        从左往右加载
        (1)先算i++
        ①取i的值“1”放操作数栈
        ②i再自增 i=2
        （2）再算++i
        ①i先自增 i=3
        ②再取i的值“3”放操作数栈
        （3）再算i++
        ①取i的值“3”放操作数栈
        ②i再自增 i=4
        （4）先算乘法
        用操作数栈中3 * 3 = 9，并把9压会操作数栈
        （5）再算求和
        用操作数栈中的 1 + 9 = 10
        （6）最后算赋值
        j = 10
        */
    }
}
