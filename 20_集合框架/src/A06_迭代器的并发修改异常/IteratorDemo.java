package A06_迭代器的并发修改异常;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
    并发修改异常
        如何不发生这个异常
        异常的产生原因 : 在迭代器遍历集合的过程中,使用了集合的功能,改变了集合的长度造成
 */
public class IteratorDemo extends RuntimeException{

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

        //迭代器遍历集合
        Iterator<String> it = coll.iterator();

        try {
            while ( it.hasNext() ){
                String str = it.next();
                //判断,遍历到的集合元素是不是java
                if (str.equals("java")){
                    //添加元素 出现并发修改异常
                    coll.add("add");
                }
                System.out.println(str);
            }
        } catch (RuntimeException error) {
            System.out.println("出现并发异常了!!!");
        }

    }
}
