package A07_元素的基本查询;
/**
 *  数组元素的就基本查询
 *  参数是数组,和要查找的关键字
 *  返回关键字所在的索引
 */
public class baseSearch {
    public static void main(String[] args) {
        int[] arr = {6, 9, 3, 1, 4};

        int key = 11;

        boolean isFind = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println("已找到!索引值： " + i);
                isFind = true;
            }
        }

        if (isFind != true) {
            System.out.println("没有找到元素： " + key);
        }
    }
}
