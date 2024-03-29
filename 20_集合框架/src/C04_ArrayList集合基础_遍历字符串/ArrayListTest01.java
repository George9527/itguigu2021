package C04_ArrayList集合基础_遍历字符串;

/*
    需求：
        创建一个存储字符串的集合，存储3个字符串元素，使用程序实现在控制台遍历该集合

    思路：
        1:创建集合对象
        2:往集合中添加字符串对象
        3:遍历集合，首先要能够获取到集合中的每一个元素，这个通过get(int index)方法实现
        4:遍历集合，其次要能够获取到集合的长度，这个通过size()方法实现
        5:遍历集合的通用格式
 */

import java.util.ArrayList;

public class ArrayListTest01 {
    public static void main(String[] args) {
        //创建集合对象
        ArrayList<String> array = new ArrayList<String>();

        //往集合中添加字符串对象
        array.add("张学友");
        array.add("刘德华");
        array.add("郭富城");
        array.add("黎明");

        //遍历集合

        /*
        //方法一(不推荐)  --- for循环改进
        System.out.println(array.get(0));
        System.out.println(array.get(1));
        System.out.println(array.get(2));
        System.out.println(array.get(3));
        */

        //遍历集合，首先要能够获取到集合中的每一个元素，这个通过get(int index)方法实现
        //小结；确定是 i<4 这个循环条件
        for (int i = 0; i < 4; i++) {
            System.out.println(array.get(i));
        }

        System.out.println("===================");

        //遍历集合，其次要能够获取到集合的长度，这个通过size()方法实现
        //遍历集合的通用格式
        for (int i = 0; i < array.size(); i++) {
            //推介方法 --- 保存到一个变量中
            //新建变量名为 Sting 的原因是集合中的元素为字符串类型
            String s = array.get(i);
            System.out.println(s);
        }

        // 增强for方法
        System.out.println("==================");
        for (String s : array) {
            System.out.println(s);
        }
    }
}
