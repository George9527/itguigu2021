package A01_Collection集合概述和使用;

import java.util.ArrayList;
import java.util.Collection;

/*
    创建Collection集合的对象
        多态的方式
        ArrayList()
 */
public class CollectionDemo01 {
    public static void main(String[] args) {
        //创建Collection集合的对象
        Collection<String> c = new ArrayList<String>();

        //添加元素 boolen add(E e)
        c.add("Hello");
        c.add("World");

        //输出集合对象
        System.out.println(c);
    }
}
