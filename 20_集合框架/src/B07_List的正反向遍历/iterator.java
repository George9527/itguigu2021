package B07_List的正反向遍历;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * List接口的方法:
 *   listIterator() List集合的特有迭代器
 *   反向遍历
 */
public class iterator {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a") ;//集合的尾部添加
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        //获取特有迭代器接口实现类对象
        ListIterator<String> lit = list.listIterator();
        //先要正向遍历
        while (lit.hasNext()){
            String s = lit.next();
            System.out.println(s);
        }
        System.out.println("=============");
        //判断上一个元素
        while (lit.hasPrevious()){
            //取出元素
            String s = lit.previous();
            System.out.println(s);
        }
    }
}
