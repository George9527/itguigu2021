package D06_LinkedHashSet集合概述和特点;

import java.util.LinkedHashSet;

/*
    LinkedHashSet集合特点
        1:哈希表和链表实现的Set接口，具有可预测的迭代次序
        2:由链表保证元素有序，也就是说元素的存储和取出顺序是一致的
        3:由哈希表保证元素唯一，也就是说没有重复的元素
 */
public class LinkedHashSetDemo {
    public static void main(String[] args) {
        //创建集合对象
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>();

        //添加元素
        linkedHashSet.add("张国荣");
        linkedHashSet.add("刘德华");
        linkedHashSet.add("郭富城");
        linkedHashSet.add("黎明");

        //测试重复元素
        //linkedHashSet.add("黎明"); --- 由哈希表保证元素唯一，也就是说没有重复的元素

        //遍历集合 增强For
        for (String s :linkedHashSet) {
            System.out.println(s); // --- 由链表保证元素有序，也就是说元素的存储和取出顺序是一致的
        }
    }
}
