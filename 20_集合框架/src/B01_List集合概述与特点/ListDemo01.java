package B01_List集合概述与特点;

/*
    List集合特点
        有序：存储和取出的元素顺序一致
        可重复：存储的元素可以重复

    List接口
List接口,继承Collection接口,是单列集合, Collection接口中的方法不需要在讲解了

2.5.1 List接口的特点
这个接口的集合都具有索引
这个接口中的元素允许重复
这个接口中的元素是有序的
元素不会排序 ,有序指的是 ,元素存储和取出的顺序是一致的
List接口的所有实现类,都具有以上三个特征
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

        //指定的索引上,添加元素 ,3索引添加元素
        list.add(3,"QQ");
        System.out.println(list);

        // list.get(index) 输出指定索引值元素
        System.out.println(list.get(3));

        // 修改指定位置的索引
        list.set(3,"Test");

        //删除指定索引上的元素,删除3索引
        System.out.println("删除指定索引上的元素:" + list.remove(3));;

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
