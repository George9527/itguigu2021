package A05_Map集合的遍历方法二;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
    Map集合的遍历(方式2):
        1:获取所有键值对对象的集合
            Set<Map.Entry<K,V>> entrySet()：获取所有键值对对象的集合
        2:遍历键值对对象的集合，得到每一个键值对对象
            用增强for实现，得到每一个Map.Entry
        3:根据键值对对象获取键和值
            用getKey()得到键
            用getValue()得到值
 */
public class MapDemo02 {
    public static void main(String[] args) {
        //创建集合对象
        Map<String, String> map = new HashMap<String, String>();

        //添加元素
        map.put("张无忌", "赵敏");
        map.put("郭靖", "黄蓉");
        map.put("杨过", "小龙女");

        //1:获取所有键值对对象的集合
        Set<Map.Entry<String, String>> entrySet = map.entrySet();

        //2:遍历键值对对象的集合，得到每一个键值对对象
        //用增强for实现，得到每一个Map.Entry
        for (Map.Entry<String, String> s : entrySet) {
            //根据键值对对象获取键和值

            //用getKey()得到键
            String key = s.getKey();
            //用getValue()得到值
            String value = s.getValue();

            //输出结果
            System.out.println(key + ":" + value);
        }

    }
}
