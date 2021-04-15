package A04_数组的扩容;

public class arrayElementAdd {
    public static void main(String[] args) {
        String[] str = {"张三", "李四", "王五",};
        //添加元素,赵六,放在1索引
        String[] newArr = new String[str.length + 1];
        for (int i = 0; i < str.length; i++) {
            newArr[i] = str[i];
        }
        //张三,李四,王五,null,  newArray的元素
        System.arraycopy(newArr, 1, newArr, 2, 2);
        // 从源数组的(newArr)索引值1开始复制，复制的长度为2，从下标2开始替换

        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + ",");
        }

        System.out.println(" ");

        newArr[1] = "赵六";

        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + ",");
        }

        // 优化处理，节省内存空间
        str = newArr;
        newArr = null; // 清空newArr 中的内容

        System.out.println(" ");

        // 遍历str数组 (原来的数组)
        for (String s : str) {
            System.out.print(s + " ");
        }
    }

}
