package A04_循环结构_for循环;
/*
    3.输出所有的水仙花数，所谓水仙花数是指一个3位数，其各个位上数字立方和等于其本身。
例如： 153 = 1*1*1 + 3*3*3 + 5*5*5
 */
public class forTest06_水仙花数 {
    public static void main(String[] args) {
        //输出所有的水仙花数必然要使用到循环，遍历所有的三位数，三位数从100开始，到999结束
        for (int i = 100; i <= 999; i++) {
            // 计算之前获取三位数中的每位上的值
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 10 / 10 % 10;

            //判定条件是将三位数中的每个数值取出来，计算立方和后与原始数字比较是否相等
            if (ge * ge * ge + shi * shi * shi + bai * bai * bai == i) {
                //输出满足条件的数字就是水仙花数
                System.out.println(i);
            }
        }
    }
}
