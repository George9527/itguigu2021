package A06_Map集合案例存储学生对象;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
    需求：
        创建一个HashMap集合，键是学号(String)，值是学生对象(Student)。存储三个键值对元素，并遍历

    思路：
        1:定义学生类
        2:创建HashMap集合对象
        3:创建学生对象
        4:把学生添加到集合
        5:遍历集合
            方式1：键找值
            方式2：键值对对象找键和值
 */
public class HashMapDemo {
    public static void main(String[] args) {

        //创建HashMap集合对象
        HashMap<String, Student> hm = new HashMap<String, Student>();

        //创建学生对象
        Student s1 = new Student("张国荣", 30);
        Student s2 = new Student("刘德华", 35);
        Student s3 = new Student("郭富城", 33);
        Student s4 = new Student("黎明",40);

        //把学生添加到集合 --- 键是学号(String)，值是学生对象(Student)
        hm.put("001", s1);
        hm.put("002", s2);
        hm.put("003", s3);
        hm.put("004", s4);

        //方式1：键找值
        Set<String> keySet = hm.keySet();
        for (String key : keySet) {
            Student student = hm.get(key);
            System.out.println(key + ":" + student.getName() + ":" + student.getAge());
        }

        System.out.println("----------");

        //方式2：键值对对象找键和值 --- 调用方法
        Set<Map.Entry<String, Student>> entries = hm.entrySet();
        //2:遍历键值对对象的集合，得到每一个键值对对象
        //用增强for实现，得到每一个Map.Entry
        for (Map.Entry<String, Student> me : entries) {
            String key = me.getKey();
            Student value = me.getValue();
            System.out.println(key + ":" + value.getName() + ":" + value.getAge());
        }
    }
}
