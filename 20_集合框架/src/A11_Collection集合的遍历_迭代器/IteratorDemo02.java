package A11_Collection集合的遍历_迭代器;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorDemo02 {
    public static void main(String[] args) {
        //迭代器遍历集合
        //接口多态创建集合容器对象,存储的数据类型是字符串
        Collection<String> coll = new ArrayList<>();
        //集合对象的方法add添加元素
        coll.add("hello");
        coll.add("world");
        coll.add("java");
        coll.add("money");
        coll.add("wife");
        //1 遍历 集合对象,调用方法iterator() 获取迭代器接口的实现类对象
        Iterator<String> it = coll.iterator();
        //2 迭代器对象的方法,判断集合是否有下元素
        //boolean b = it.hasNext();
        //System.out.println(b);
        //3 迭代器对象的方法,取出元素
        //String str = it.next();
        //System.out.println(str);
        //条件,集合中有下一个元素就可以
        while ( it.hasNext() ){
            String str =  it.next();
            System.out.println(str);
        }
    }
}
