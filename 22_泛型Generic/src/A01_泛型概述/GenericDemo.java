package A01_泛型概述;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
    需求：Collection集合存储字符串并遍历

     泛型的书写格式 :
     集合类<存储的数据类型>  变量名 = new 集合类<存储的数据类型>();
                                       类型可以不写:钻石操作符

 */

/**
 *  JDK没有泛型技术,就是这样写
 *  集合可以存储任何数据类型
 *  添加元素的数据类型是Object
 */

public class GenericDemo {
    public static void main(String[] args) {
        //创建集合对象
        //Collection c = new ArrayList();
        Collection<String> c = new ArrayList<String>();

        //添加元素
        c.add("Hello");
        c.add("World");

        //c.add(100); --- ClassCastException:

        //遍历集合
        //Iterator it = c.iterator();
        Iterator<String> it = c.iterator();
        while (it.hasNext()) {
//            Object obj = it.next();
//            System.out.println(obj);
            //强转为String类型
            //String s = (String) it.next();

            String s = it.next();
            System.out.println(s);
        }
    }
}
