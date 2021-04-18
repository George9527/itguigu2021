package E02_TreeSet集合使用;

/*
    ### 4.1 TreeSet集合使用

  TreeSet集合,底层是红黑树结构,依赖于TreeMap的实现

  红黑树特点查找速度快,线程不安全

> 可以对存储到红黑树的元素进行排序,元素的自然顺序 abcd.. 字典顺序
 */

import java.util.Set;
import java.util.TreeSet;

public class treeSetString {

    public static void main(String[] args) {

        // 新建一个TreeSet集合
        Set<String> set = new TreeSet<>();

        //存储元素
        set.add("abcd");
        set.add("ccdd");
        set.add("z");
        set.add("wasd");
        set.add("bbaa");

        // 输出集合内容
        // 可以对存储到红黑树的元素进行排序,
        // 元素的自然顺序 abcd.. 字典顺序
        System.out.println("set = " + set);

    }
}
