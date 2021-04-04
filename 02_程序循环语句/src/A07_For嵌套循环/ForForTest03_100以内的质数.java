package A07_For嵌套循环;
/*
    输出100以内的质数
    质数：素数，只能被1和它本身整除的自然数
    最小的质数：2
 */
public class ForForTest03_100以内的质数 {
    public static void main(String[] args) {

        int count = 0;

        // 获取当前时间距离 1970-01-01 00：00:00 的毫秒数
        long start = System.currentTimeMillis();
        for (int i = 2; i <= 100000; i++) { //遍历100以内的自然数
            boolean isFlag = true; //标识 i 是否被 j 整除，一旦整除则标识为非质数
            for (int j = 2; j < Math.sqrt(i); j++) { // 优化三
            //for (int j = 2; j < i; j++) {
                if (i % j == 0) {  // 被 j 整除为非质数
                    isFlag = false;
                    break; // 优化 有没有break的对比
                }
            }
            if (isFlag == true) { // 将标识时的质数输出
                //System.out.println(i);
                count ++;
            }
        }
        // 获取当前时间距离 1970-01-01 00：00:00 的毫秒数
        long end = System.currentTimeMillis();

        System.out.println("100000 以内的质数共： " + count);
        System.out.println("所花费的时间为：" + (end - start));
    }
}
