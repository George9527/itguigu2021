package A04_数组的扩容;

/*
    数组的扩容(数组添加新的元素)
        1.使用静态方法新建一个数组
        2.对指定索引处添加新元素

    注意：
        数组在创建时，长度是固定的，所以数组在添加新的元素时
        1.创建一个新的数字，长度 = 旧数组长度 + 添加元素的个数

    思路：
        1.创建一个数组
        2.创建一个新的数组
        3.将旧数组的元素遍历复制进新的数组中
        4.将添加的元素添加进新数组的指定索引值处
        5.利用 arraycopy(Object src,  int  srcPos, Object dest, int destPos,int length)
            看 ArrayTest05 例子；

   优化：
       1.复制完后的旧数组可以将其 清空 已节约内存空间
       数组 = “null”；

       public static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
        将指定源数组中的数组从指定位置开始复制到目标数组的指定位置。
 */
public class ArrayTest04 {
    public static void main(String[] args) {
        // 使用静态方法新建一个数组
        String[] str = {"张三","李四","王五",};

        // 添加元素,赵六,放在1索引

        // 创建一个新的数组
        String[] newArr = new String[str.length + 1];

        // 方法一：推介使用
//        // 使用遍历方法将旧数组元素复制进新数组中
//        for (int i = 0; i < str.length; i++) {
//            newArr[i] = str[i];
//        }
//
//        // 数组最后的索引处添加元素
//        newArr[str.length] = "赵六";

        // 方法二： 在遍历时，指定位置添加
        int index = 2;
        for (int i = 0; i <= str.length; i++) {
            if ((i >= 0 && i != index) && (i < (index + 1))) {
                newArr[i] = str[i];
            }else if(i == index) {
                newArr[index] = "赵六";
            } else if (i >= (index + 1)) {
                newArr[i] = str[i - 1];
            }
        }

        // 遍历输出新的数组
        for (String s : newArr) {
            System.out.println(s);
        }
    }
}
