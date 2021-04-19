package A05_类型通配符;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GenericTest {

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<String>();
        stringList.add("abc");
        stringList.add("bbc");

        List<Integer> integerList =  new ArrayList<Integer>();
        integerList.add(1);
        integerList.add(2);

        each(stringList);
        each(integerList);
    }

    /**
     * 定义方法,可以同时迭代器 遍历这两个集合
     * 方法的参数,是要遍历的集合,不确定是哪个集合
     * 定义参数,写接口类型,不要写实现类
     */
    public static void each(List<?> list){
        Iterator<?> it = list.iterator();
        while (it.hasNext()){
            Object obj = it.next();
            System.out.println(obj);
        }
    }

}
