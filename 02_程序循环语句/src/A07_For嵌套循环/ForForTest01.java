package A07_For嵌套循环;
/*
嵌套循环的使用
1.嵌套循环：将一个循环结构A声明在另一个循环结构B的循环体中,就构成了嵌套循环

2.
外层循环：循环结构B
内层循环：循环结构A

3. 说明
① 内层循环结构遍历一遍，只相当于外层循环循环体执行了一次
② 假设外层循环需要执行m次，内层循环需要执行n次。此时内层循环的循环体一共执行了m * n次

4. 技巧：
   外层循环控制行数，内层循环控制列数
*/
public class ForForTest01 {
    public static void main(String[] args) {

        // ******
        for (int i = 1;i <= 6; i++) {
            System.out.print("*");
        }

        System.out.println(" ");
        System.out.println("===========");

        // 输出4行星号 每行6个星星
        for (int x = 1; x <= 4; x++) {
            for (int y = 1; y <= 6; y++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

        System.out.println("===========");

        //输出5行星号，并依次递增
        for (int a = 1; a <= 5; a++) {
            for (int b = 1; b <= a; b++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

        System.out.println("===========");

        //输出5行星号，并依次减
        for (int c = 5; c >= 1; c--) {
            for (int d = c; d >= 1; d--) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

        System.out.println("===========");
        //先输出5行正星星再输出5行倒星星
        for (int j = 1; j <= 10; j++) {
            if (j <= 6) {
                for (int k = 1; k <= j; k++) {
                    System.out.print("*");
                }
                System.out.println(" ");
            } else {
                for (int z = j; z <= 10; z++) {
                    System.out.print("*");
                }
                System.out.println(" ");
            }
        }

    }
}
