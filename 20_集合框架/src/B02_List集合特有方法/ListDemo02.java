package B02_List集合特有方法;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
    List集合特有方法：
        void add(int index,E element)：在此集合中的指定位置插入指定的元素
        E remove(int index)：删除指定索引处的元素，返回被删除的元素
        E set(int index,E element)：修改指定索引处的元素，返回被修改的元素
        E get(int index)：返回指定索引处的元素
 */
public class ListDemo02 {
    public static void main(String[] args) {
        //创建集合对象
        List<String> list = new ArrayList<String>();

        //添加元素
        list.add("hello");
        list.add("world");
        list.add("java");

        //void add(int index,E element)：在此集合中的指定位置插入指定的元素
        list.add(2, "Test");
        //注意索引值不能越界

        //E remove(int index)：删除指定索引处的元素，返回被删除的元素
        //list.remove(3);  --- 这样是不会输出被删除的元素
        System.out.println(list.remove(3));

        //E set(int index,E element)：修改指定索引处的元素，返回被修改的元素
        list.set(2, "HaHa");

        //E get(int index)：返回指定索引处的元素
        System.out.println("返回指定索引处的元素:" + list.get(2));

        //输出集合对象
        System.out.println("输出集合对象:" + list);

        //遍历集合
        Iterator<String> it = list.iterator();

        //用循环改进遍历
        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }
}