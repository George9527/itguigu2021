package D03_HashSet集合概述和特点;

import java.util.HashSet;

/*
    HashSet集合特点
        1:底层数据结构是哈希表
        2:对集合的迭代顺序不作任何保证，也就是说不保证存储和取出的元素顺序一致
        3:没有带索引的方法，所以不能使用普通for循环遍历
        4:由于是Set集合，所以是不包含重复元素的集合
 */
public class HashSetDemo01 {
    public static void main(String[] args) {
        //创建集合对象
        HashSet<String> hs = new HashSet<String>();

        //添加元素
        hs.add("张国荣");
        hs.add("黎明");
        hs.add("刘德华");
        hs.add("郭富城");

        //使用 增强for 遍历 HashSet 集合
        for (String s : hs) {
            System.out.println(s);
        }

        HashSet<Integer> hs2 = new HashSet<Integer>();
        hs2.add(110);
        hs2.add(120);
        hs2.add(119);
        hs2.add(911);

        for (Integer integer : hs2) {
            System.out.println(integer);
        }
    }
}
