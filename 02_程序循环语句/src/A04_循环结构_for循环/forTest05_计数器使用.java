package A04_循环结构_for循环;
/*
    2.打印1~100之间所有是7的倍数的整数的个数及总和（体会设置计数器的思想）
 */
public class forTest05_计数器使用 {
    public static void main(String[] args) {

        //自定义变量
        int count = 0;
        int sum = 0;

        for (int i = 1; i <= 100; i++) {
            if (i % 7 ==0 ) {
                count += 1;
                sum = sum + i;
                System.out.println(i);
            }
        }
        System.out.println(count);
        System.out.println(sum);
    }
}
