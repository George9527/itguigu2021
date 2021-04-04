package A01_if_else语句;
/*
    编写程序，声明2个int型变量并赋值。判断两数之和，如果大于等
于50，打印“hello world!”
 */
public class ifTest04_大小判断 {
    public static void main(String[] args) {
        //声明2个int型变量并赋值
        int num1 = 20;
        int num2 = 20;

        //判断两数之和，如果大于等于50，打印“hello world!”
        int sum = num1 + num2;

        if (sum >= 50) {
            System.out.println("Hello World");
        } else {
            System.out.println("小于50");
        }
    }
}
