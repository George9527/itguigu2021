package B01_List集合概述与特点;

/*
    List集合特点
        有序：存储和取出的元素顺序一致
        可重复：存储的元素可以重复
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo01 {
    public static void main(String[] args) {
        //创建集合对象
        List<String> list = new ArrayList<String>();

        //添加元素
        list.add("Hello");
        list.add("World");
        list.add("Test");

        //测试添加重复元素
        list.add("Hello");

        //输出集合对象
        //System.out.println(list);

        //遍历 List 集合
        // 使用迭代器方法
        Iterator<String> list_it = list.iterator();
        while (list_it.hasNext()) {
            System.out.println(list_it.next());
        }
    }
}
