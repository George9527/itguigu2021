package C02_ArrayList构造方法和添加方法;

/*
    ArrayList构造方法：
        public ArrayList()：创建一个空的集合对象

    ArrayList添加方法：
        public boolean add(E e)：将指定的元素追加到此集合的末尾
        public void add(int index,E element)：在此集合中的指定位置插入指定的元素
 */

import java.util.ArrayList;

public class ArrayListDemo01 {
    public static void main(String[] args) {

        //public ArrayList()：创建一个空的集合对象
        ArrayList<String> array =new ArrayList<String>();

        //public boolean add(E e)：将指定的元素追加到此集合的末尾

        //boolean 表示添加是否成功
        System.out.println(array.add("Hello!!"));

        array.add("Hello ");
        array.add("World");
        array.add("Test");

        // 能否使用链式编程 --- 不能使用
//        array.add("Test01").add("Test02");

        //public void add(int index,E element)：在此集合中的指定位置插入指定的元素
        array.add(2,"!!!");
        array.add(3,"Test01");

        //array.add(4,"Test");----报错，索引值找过最大的范围值

        //输出集合
        System.out.println("array:" + array);
    }
}
