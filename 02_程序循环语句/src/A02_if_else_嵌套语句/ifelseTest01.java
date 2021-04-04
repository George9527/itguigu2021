package A02_if_else_嵌套语句;

public class ifelseTest01 {
    public static void main(String[] args) {
        int i = 20;
        int j = 50;

        int m = 40;
        int n = 60;

        if (i > j){								// 执行条件判断①
            System.out.println("i 比 j 大");	// ①为true时执行
        } else if (i < j) {						// ①为false继续执行下一个条件判断②
            System.out.println("i 比 j 小");	// ②为true时执行
        } else {
            System.out.println("i 和 j 相等");	// ②为false时执行

            // 嵌套在其他if...else结构内的if
            if (m > n){
                System.out.println("m 比 n 大");
            }
        }
    }
}
