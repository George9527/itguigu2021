package C03_ArrayList常用方法;

/*
    ArrayList常用方法：
        public boolean remove(Object o)：删除指定的元素，返回删除是否成功
        public E remove(int index)：删除指定索引处的元素，返回被删除的元素
        public E set(int index,E element)：修改指定索引处的元素，返回被修改的元素
        public E get(int index)：返回指定索引处的元素
        public int size()：返回集合中的元素的个数
 */

import java.util.ArrayList;

public class ArrayListDemo02 {
    public static void main(String[] args) {
        //创建集合
        ArrayList<String> array = new ArrayList<String>();

        //添加元素
        array.add("Hello ");
        array.add("World");
        array.add("!!!");

        //public boolean remove(Object o)：删除指定的元素，返回删除是否成功
        //System.out.println(array.remove("Hello "));
        //小结：指定的元素存在则输出ture，否则为False

        //public E remove(int index)：删除指定索引处的元素，返回被删除的元素
        //System.out.println(array.remove(1));
        //小结：指定的元素索引存在则输出ture，否则为False

        // public E set(int index,E element)：修改指定索引处的元素，返回被修改的元素
        System.out.println(array.set(2,"Test"));
        //System.out.println(array.set(20,"Test"));
        //注意不能索引越界，会报错，修改成功会输出被修改的元素(返回被删除的元素)

        //public E get(int index)：返回指定索引处的元素
        System.out.println(array.get(2));
        //System.out.println(array.get(20));----索引越界
        //小结：返回指定索引处的元素

        //public int size()：返回集合中的元素的个数
        System.out.println(array.size());

        //输出集合
        System.out.println("array:" + array);
    }
}
