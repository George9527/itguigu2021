package A01_Math类的概述与常用方法;

/*
    Math类的常用方法2：
        - static double PI  圆周率
        - static double E 自然数的底数
        - static int abs(int a) 返回参数的绝对值
        - static double ceil(double d)返回大于或者等于参数的最小整数
        - static double floor(double d)返回小于或者等于参数的最大整数
        - static long round(double d)对参数四舍五入
        - static double pow(double a,double b ) a的b次幂
        - static double random() 返回随机数 0.0-1.0之间
        - static double sqrt(double d)参数的平方根
 */
public class MathDemo02 {
    public static void main(String[] args) {

        // static double PI  圆周率
         System.out.println("Math.PI = " + Math.PI);

         // static double E 自然数的底数
          System.out.println("Math.E = " + Math.E);

        //static int abs(int a) 返回参数的绝对值
        System.out.println(Math.abs(-6));

        //static double ceil(double d)返回大于或者等于参数的最小整数
        System.out.println(Math.ceil(12.3)); //向上取整数

        //static double floor(double d)返回小于或者等于参数的最大整数
        System.out.println("Math.floor(5.5) = " + Math.floor(5.5));//向下取整数

        //static long round(double d)对参数四舍五入
        long round = Math.round(5.5); //取整数部分  参数+0.5
        System.out.println("round = " + round);

        //static double pow(double a,double b ) a的b次幂
        System.out.println("Math.pow(2,3) = " + Math.pow(2, 3));

        //static double sqrt(double d)参数的平方根
        System.out.println("Math.sqrt(4) = " + Math.sqrt(3));

        // static double random() 返回随机数 0.0-1.0之间
        for(int x = 0 ; x < 10 ; x++){
            System.out.println(Math.random()); //伪随机数
        }
    }
}
