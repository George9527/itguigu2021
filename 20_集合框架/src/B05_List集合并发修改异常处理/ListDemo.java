package B05_List集合并发修改异常处理;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
    需求：
        我有一个集合：List<String> list = new ArrayList<String>();
        里面有三个元素：list.add("hello");list.add("world");list.add("java");
        遍历集合，得到每一个元素，看有没有"world"这个元素，如果有，我就添加一个"javaee"元素，请写代码实现

    ConcurrentModificationException:当不允许这样的修改时，可以通过检测到对象的并发修改的方法来抛出此异常
 */
public class ListDemo {
    public static void main(String[] args) {
        //创建集合对象
        List<String> list = new ArrayList<String>();

        //添加元素
        list.add("Hello");
        list.add("World");
        list.add("Test");

        //遍历集合，得到每一个元素，看有没有"world"这个元素，
        // 如果有，我就添加一个"javaee"元素，请写代码实现

        /*
        我的方法：
        使用迭代遍历，判断集合中是否存在 world 元素
        若存在则输出结果，并在 if 语句中 完成添加功能
        boolean str_world = false;
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String s = it.next();
            if (s.equals("World")) {
                str_world = true;
                System.out.println(str_world);
            }
        }

        if (str_world = true) {
            list.add("jacaee");
        }

         */

        /*
            出现并发错误的代码例子：
//        Iterator<String> it = list.iterator();
//        while (it.hasNext()) {
//            String s = it.next();
//            if(s.equals("world")) {
//                list.add("javaee");
//            }
//        }
         */

        //使用 for 循环完成需求
        for (int i=0; i<list.size(); i++) {
            String s = list.get(i);
            if (s.equals("World")) {
                list.add("Javaes");
            }
        }

        // 出现并发错误的代码例子
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String s = it.next();
            if(s.equals("world")) {
                list.add("javaee");
            }
        }

        //输出结果
        System.out.println(list);

    }
}
