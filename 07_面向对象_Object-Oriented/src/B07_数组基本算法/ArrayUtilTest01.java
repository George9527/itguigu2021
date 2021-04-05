package B07_数组基本算法;
/*
    自定义数组的测试类
 */
public class ArrayUtilTest01 {
    public static void main(String[] args) {

        //新建一个对象
        ArrayUtil util = new ArrayUtil();

        //新建一个数组
        int[] arr = new int[]{32,34,54,12,67,84,132,-3,3,0};

        //调用方法
        int max = util.getMax(arr);
        System.out.println("最大值：" + max);

        int mix = util.getMix(arr);
        System.out.println("最小值：" + mix);

        double avg = util.getAvg(arr);
        System.out.println("平均数：" + avg);

        int sunnum = util.getSum(arr);
        System.out.println("总和：" + sunnum);

        System.out.print("反转后");
        util.reverse(arr);
        util.print(arr);
        System.out.println(" ");

        System.out.print("复制后");
        int[] arr2 = util.copy(arr);
        util.print(arr2);
        System.out.println(" ");

        System.out.print("排序后");
        util.sort(arr);
        util.print(arr);
        System.out.println(" ");

        System.out.println("查找指定元素： ");
        int dest = 84;
        int index = util.getIndex(arr,dest);
        if (index > 0) {
            System.out.println("找到元素: " + dest + " | 索引值：" + index);
        } else {
            System.out.println("元素: " + dest + "没有找到");
        }
    }
}
