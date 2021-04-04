package A04_循环结构_for循环;

/*
    For循坏结构的使用
        1.循环结构的4要素
            1.初始化条件
            2.循环条件   --- blllen 类型
            3.循环体
            4.迭代条件
        2.循环的结构
        for(1;2;4) {
            3
        }
 */
public class forTest01_100以内偶数 {
    public static void main(String[] args) {
        //例题：输出100以内的 偶数 ,并输出所有偶数的和 ,输出偶数的个数
        int sum = 0;
        int num = 0;
        for (int i = 1; i <= 100; i ++) {
            if ( i % 2 == 0) {
                sum += i;
                num += 1;
                System.out.println(i);
            }
        }
        System.out.println(sum);
        System.out.println(num);
    }
}