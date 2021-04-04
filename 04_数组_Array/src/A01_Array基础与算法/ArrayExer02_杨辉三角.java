package A01_Array基础与算法;

/*
    使用二维数组 打印一个10行的 杨辉三角

    【提示】
    1. 第一行有 1 个元素, 第 n 行有 n 个元素
    2. 每一行的第一个元素和最后一个元素都是 1
    3. 从第三行开始, 对于非第一个元素和最后一个元
    素的元素。即：
    yanghui[i][j] = yanghui[i-1][j-1] + yanghui[i-1][j];
 */
public class ArrayExer02_杨辉三角 {
    public static void main(String[] args) {
        //1.声明并初始化二维数组 --- 10行
        int[][] yangHui = new int[10][];

        //2.给新数组的元素赋值
        for (int i = 0; i < yangHui.length; i++) {
            yangHui[i] = new int[i + 1];

            //2.1 首末行元素均为 1
            yangHui[i][0] = yangHui[i][i] = 1;

            //2.2 给每行的非首末元素赋值
            if (i > 1) {
                for (int j = 1; j < yangHui[i].length - 1; j++) {
                    yangHui[i][j] = yangHui[i - 1][j - 1] + yangHui[i - 1][j];
                }
            }
        }

        //3.遍历数组
        for (int i = 0; i < yangHui.length; i++) {
            for (int j = 0; j < yangHui[i].length; j++) {
                System.out.print(yangHui[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
