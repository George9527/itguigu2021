package A01_Map集合的概述;

/*
    Map集合概述
        Interface Map<K,V>	K：键的类型；V：值的类型
        将键映射到值的对象；不能包含重复的键；每个键可以映射到最多一个值
        举例：学生的学号和姓名
              itheima001	林青霞
              itheima002	张曼玉
              itheima003	王祖贤

    创建Map集合的对象
        多态的方式
        具体的实现类HashMap
 */

import java.util.HashMap;
import java.util.Map;

public class MapDemo01 {
    public static void main(String[] args) {
        //创建集合对象
        Map<String,String> map = new HashMap<String,String>();

        //添加元素 --- V put (K key, V value) 将指定的值与该映射中的指定键相关联
        map.put("001","张国荣");
        map.put("002","刘德华");
        map.put("003","郭富城");
        map.put("004","黎明");

        map.put("004","林青霞");
        //小结：键值唯一，不能重复 如果键值相同，则会覆盖掉 value

        //输出集合对象
        System.out.println(map);

    }
}
