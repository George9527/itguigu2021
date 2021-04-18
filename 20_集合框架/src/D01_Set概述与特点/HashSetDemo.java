package D01_Set概述与特点;

/*
    Set集合特点
        不包含重复元素的集合
        没有带索引的方法，所以不能使用普通for循环遍历

    HashSet:对集合的迭代顺序不作任何保证
 */

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args) {

        //创建集合对象
        Set<String> set = new HashSet<>();

        //添加元素
        set.add("张国荣");
        set.add("林青霞");
        set.add("黎明");
        //set.add("林青霞"); --- 不包含重复元素的集合

        //遍历 ---- HashSet:对集合的迭代顺序不作任何保证
        // for 增强器
        for (String s : set) {
            System.out.println(s);
        }

        Set<Integer> ints = new HashSet<Integer>();
        ints.add(11);
        ints.add(22);
        ints.add(33);

        for (Integer anInt : ints) {
            System.out.print(anInt + ":");
        }

        // 没有带索引的方法，所以不能使用普通for循环遍历
        for (int i = 0; i < set.size(); i++) {
            System.out.println(i + ":");
        }
    }
}
