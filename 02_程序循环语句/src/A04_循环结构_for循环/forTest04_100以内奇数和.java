package A04_循环结构_for循环;
/*
    1.打印1~100之间所有奇数的和
 */
public class forTest04_100以内奇数和 {
    public static void main(String[] args) {

        //自定义变量
        int sum = 0;

        for (int i = 1; i <= 100; i++) {
            if (i %2 != 0) {
                sum = sum + i;
                System.out.println(i);
            }
        }
        System.out.println(sum);
    }
}