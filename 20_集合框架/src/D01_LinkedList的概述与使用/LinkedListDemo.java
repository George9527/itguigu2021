package D01_LinkedList的概述与使用;

import java.util.LinkedList;

/*
  java.util.LinkedList集合  implements List接口
  LinkedList集合的特点：
      1.底层是一个链表结构
      2.里边包含了大量操作首尾元素的方法
      注意：使用LinkedList集合特有的方法，不能使用多态
 */
public class LinkedListDemo {
    public static void main(String[] args) {
        show01();
        show02();
        show03();

    }
    /*
      -public void addFirst（E e):将指定元素插入此列表的开头。
      —public void addLast(E e)：将指定元素添加到此列表的结尾  等效于add()
      -public void push(E e):将元素推入此列表所表示的堆栈  此方法等效于addFirst
     */
    private static void show01() {
        //创建LinkedList集合对象
        LinkedList<String> linked = new LinkedList<>();
        //使用add方法往集合中添加元素
        linked.add("a");
        linked.add("b");
        linked.add("h");
        System.out.println(linked); //[a, b, h]

        // public void addFirst（E e):将指定元素插入此列表的开头。
//        linked.addFirst("www");
        linked.push("www");
        System.out.println(linked); //[www, a, b, h]

        //—public void addLast(E e)：将指定元素添加到此列表的结尾  等效于add()
        linked.addLast("com");
        System.out.println(linked);  //[www, a, b, h, com]

    }
    /*
    —public E getFirst():返回此列表的第一个元素。
    —public E getLast()：返回此列表的最后一个元素
   */
    private static void show02() {
        //创建LinkedList集合对象
        LinkedList<String> linked = new LinkedList<>();
        //使用add方法往集合中添加元素
        linked.add("a");
        linked.add("b");
        linked.add("h");

        linked.clear();  //清空集合中的元素，在获取集合中的元素会抛出NoSuchElementException

        //-public boolean isEmpty():如果列表不包含元素，则返回true
        if (!linked.isEmpty()){
            String first = linked.getFirst();
            System.out.println(first); //a

            String last = linked.getLast();
            System.out.println(last);  //h
        }
    }
    /*
      -public E removeFirst():移除并返回此列表的第一个元素
      -public E removeLast():移除并返回此列表的最后一个元素
      -public E pop():从此列表所表示的堆栈处弹出一个元素,此方法相当于removeFirst
 */

    private static void show03() {
        //创建LinkedList集合对象
        LinkedList<String> linked = new LinkedList<>();
        //使用add方法往集合中添加元素
        linked.add("a");
        linked.add("b");
        linked.add("h");
        System.out.println(linked); //[a, b, h]

//        String f = linked.removeFirst();
        String f = linked.pop();
        System.out.println("被移除的第一个元素："+f); //被移除的第一个元素：a

        String l = linked.removeLast();
        System.out.println("被移除的最后一个元素："+l); //被移除的最后一个元素：h
        System.out.println(linked); //[b]
    }
}

