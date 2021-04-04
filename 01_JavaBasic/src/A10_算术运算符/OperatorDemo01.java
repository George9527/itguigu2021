package A10_算术运算符;
/*
    算术运算符：

 */
public class OperatorDemo01 {
    public static void main(String[] args) {

        //自定义两个变量
        int num1 = 12;
        int num2 = 5;

        //除号 %(取余数) /(取商)
        int result1 = num1 / num2;
        System.out.println(result1); // 2......2 商2余2

        int result2 = num1 / num2 * num2;
        System.out.println(result2); // 2 * 5 = 10

        //精确取数 --- 整数相除只能得到整数,要想得到小数,必须有浮点数的参与
        double d = 0.0D;
        double result3 = num1 / (num2 + d);
        System.out.println(result3);

        //整数相除只能得到整数,要想得到小数,必须有浮点数的参与
        double result4 = num1 / (num2 + 0.0);
        System.out.println(result4);

        // 先把num1转为double，让double类型参与运算过程
        double result6 = (double) num1 / num2;
        System.out.println(result6);

        //double result5 = num1 / num2; --- 错误例子

        // % --- 取余运算
        //结果的符号与被除数的符号相同
        int m1 = 12;
        int n1 = 5;
        System.out.println("m1 % n1 =" + m1 % n1);

        int m2 = -12;
        int n2 = 5;
        System.out.println("m2 % n2 =" + m2 % n2);

        int m3 = 12;
        int n3 = -5;
        System.out.println("m3 % n3 =" + m3 % n3);

        int m4 = -12;
        int n4 = -5;
        System.out.println("m4 % n4 =" + m4 % n4);

        //(前)++ 小结：先自增 1 ，后运算
        int a1 = 10;
        int b1 = ++a1; // a1先自增 +1 (10+1=11) ,再运算(a1赋值给b1) b1 = a1 = 11
        System.out.println("a1 = " + a1 + ": b1 = " + b1);

        //(后)++ 小结：先运算 ，后自增 1
        int a2 = 10;
        int b2 = a2++; // 先运算(a2赋值给b2) b2 = a2 = 10 ,a2再自增 +1 (10+1=11)
        System.out.println("a2 = " + a2 + ": b2 = " + b2);


        //(前)-- 小结：先自减 1 ，后运算
        //(后)-- 小结：先运算 ，后自减 1
        int a4 = 10;
        int b4 = a4--; // 先运算(a4赋值给b4) b4 = a4 = 10 ,a4再自减 -1 (10-1=9)
        System.out.println("a4 = " + a4 + ": b4 = " + b4);

        int a = 3;
        int b = 4;

        System.out.println(a + b);// 7
        System.out.println(a - b);// -1
        System.out.println(a * b);// 12
        System.out.println(a / b);// 计算机结果是0，为什么不是0.75呢？
        System.out.println(a % b);// 3

        System.out.println(5%2);//1
        System.out.println(5%-2);//1
        System.out.println(-5%2);//-1
        System.out.println(-5%-2);//-1
        //商*除数 + 余数 = 被除数
        //5%-2  ==>商是-2，余数时1    (-2)*(-2)+1 = 5
        //-5%2  ==>商是-2，余数是-1   (-2)*2+(-1) = -4-1=-5

    }
}