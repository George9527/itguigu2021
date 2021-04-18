package D01_LinkedList的概述与使用;

import java.util.LinkedList;

public class LinkedListDemo02 {
    public static void main(String[] args) {
        linkedPushPop();
    }
//- void push(E e)元素推入堆栈中
//- E pop()元素从堆栈中弹出

    public static void linkedPushPop(){
        LinkedList<String> linkedList = new LinkedList<String>();
        //元素推入堆栈中
        linkedList.push("a"); //本质就是addFirst() 开头添加
        linkedList.push("b");
        linkedList.push("c");
        System.out.println("linkedList = " + linkedList);

        String pop = linkedList.pop(); // removeFirst()移除开头
        System.out.println(pop);
        System.out.println("linkedList = " + linkedList);
    }

    //- E removeFirst() 移除链表开头的元素
//- E removeLast() 移除链表结尾的元素
    public static void linkedRemove(){
        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add("a"); //结尾添加
        linkedList.add("b"); //结尾添加
        linkedList.add("c"); //结尾添加
        linkedList.add("d"); //结尾添加
        System.out.println("linkedList = " + linkedList);
        //移除开头元素,返回被移除之前
        String first = linkedList.removeFirst();
        //移除结尾元素,返回被移除之前的
        String last = linkedList.removeLast();
        System.out.println("first = " + first);
        System.out.println("last = " + last);
        System.out.println("linkedList = " + linkedList);
    }

    //- E getFirst() 获取链表开头的元素
//- E getLast() 获取链表结尾的元素
    public static void linkedGet(){
        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add("a"); //结尾添加
        linkedList.add("b"); //结尾添加
        linkedList.add("c"); //结尾添加
        linkedList.add("d"); //结尾添加
        System.out.println("linkedList = " + linkedList);
        //获取开头元素
        String first = linkedList.getFirst();
        //获取结尾元素
        String last = linkedList.getLast();
        System.out.println("first = " + first);
        System.out.println("last = " + last);
        System.out.println("linkedList = " + linkedList);
    }

    // void addFirst(E e) 元素插入到链表开头
// void addLast(E e) 元素插入到链表结尾
    public static void linkedAdd(){
        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add("a"); //结尾添加
        linkedList.add("b"); //结尾添加
        linkedList.add("c"); //结尾添加
        linkedList.add("d"); //结尾添加
        System.out.println("linkedList = " + linkedList);
        //结尾添加
        linkedList.addLast("f");
        linkedList.add("g");

        //开头添加
        linkedList.addFirst("e");
        System.out.println("linkedList = " + linkedList);
    }
}
