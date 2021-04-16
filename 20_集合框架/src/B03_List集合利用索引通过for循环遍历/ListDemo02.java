package B03_List集合利用索引通过for循环遍历;

import java.util.ArrayList;
import java.util.List;

public class ListDemo02 {
    public static void main(String[] args) {

        //创建List集合对象
        List<String> list = new ArrayList<>();

        //添加元素
        list.add("Hello");
        list.add("World");
        list.add("Test");

        //利用索引值完成遍历
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));

        System.out.println("---------");

        //使用 for 循环优化遍历
        for (int i=0; i<list.size(); i++) {
            System.out.println(list.get(i));
        }

    }
}
