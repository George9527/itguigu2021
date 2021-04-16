package A02_Collection集合常用方法;

import java.util.ArrayList;
import java.util.Collection;

/*
    Collection集合常用方法:
        boolean add(E e):添加元素
        boolean remove(Object o):从集合中移除指定的元素
        void clear():清空集合中的元素
        boolean contains(Object o):判断集合中是否存在指定的元素
        boolean isEmpty():判断集合是否为空
        int size():集合的长度，也就是集合中元素的个数

    Alt+7   打开一个窗口，能够看到类的所有信息
 */

public class CollectionDemo02 {
    public static void main(String[] args) {
        //创建集合对象
        Collection<String> c = new ArrayList<String>();

        //boolean add(E e):添加元素
        c.add("Hello");
        c.add("World");

        System.out.println(c);
        /**
         *  输出语句中,输出集合对象,调用的是方法toString()
         *  看到的内容是一个完整的字符串, 不叫遍历
         */


//        c.add("Test").add("Demo"); 这里不能使用链式编程

        //boolean remove(Object o):从集合中移除指定的元素
        c.remove("World");

        //boolean contains(Object o):判断集合中是否存在指定的元素
        String s = "Hello";
        if (c.contains(s)) {
            System.out.println("存在此元素");
        } else {
            System.out.println("不存在此元素");
        }

        System.out.println(c.contains("Hello"));

        //boolean isEmpty():判断集合是否为空
        System.out.println(c.isEmpty());

        //void clear():清空集合中的元素
        //c.clear();

        //int size():集合的长度，也就是集合中元素的个数
        System.out.println(c.size());

        //输出集合对象
        System.out.println(c);
    }
}
