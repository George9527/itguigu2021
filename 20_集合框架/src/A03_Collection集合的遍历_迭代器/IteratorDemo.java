package A03_Collection集合的遍历_迭代器;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
    Iterator：迭代器，集合的专用遍历方式
        Iterator<E> iterator()：返回此集合中元素的迭代器，通过集合的iterator()方法得到
        迭代器是通过集合的iterator()方法得到的，所以我们说它是依赖于集合而存在的

    Iterator中的常用方法
        E next()：返回迭代中的下一个元素
        boolean hasNext()：如果迭代具有更多元素，则返回 true
 */

public class IteratorDemo {
    public static void main(String[] args) {
        //创建集合对象
        Collection<String> c = new ArrayList<String>();

        //添加元素
        c.add("Hello");
        c.add("World");
        c.add("Test");

        //Iterator<E> iterator()：返回此集合中元素的迭代器，通过集合的iterator()方法得到
        Iterator<String> it = c.iterator();

        /*
        public Iterator<E> iterator() {
            return new Itr();
        }

         */

        //E next()：返回迭代中的下一个元素
        // 多次使用后，如果没有元素还继续迭代下一个就会报错
        System.out.println(it.next());
//        System.out.println(it.next());
//        System.out.println(it.next());

        //boolean hasNext()：如果迭代具有更多元素，则返回 true
        //多次使用后，如果没有元素就返回 false 停止迭代不再输出
        if (it.hasNext()) {
            System.out.println(it.next());
        }

        if (it.hasNext()) {
            System.out.println(it.next());
        }

        if (it.hasNext()) {
            System.out.println(it.next());
        }

        if (it.hasNext()) {
            System.out.println(it.next());
        }

        //可以用于循环中改进
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
