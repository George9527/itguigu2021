package A08_集合嵌套之ArrayList嵌套;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/*
    需求：
        创建一个ArrayList集合，存储三个元素，每一个元素都是HashMap，每一个HashMap的键和值都是String，并遍历

    思路：
        1:创建ArrayList集合
        2:创建HashMap集合，并添加键值对元素
        3:把HashMap作为元素添加到ArrayList集合
        4:遍历ArrayList集合

    给出如下的数据:
        第一个HashMap集合的元素：
  		    孙策		大乔
  		    周瑜		小乔
        第二个HashMap集合的元素：
  		    郭靖		黄蓉
  		    杨过		小龙女
        第三个HashMap集合的元素：
  		    令狐冲	任盈盈
  		    林平之	岳灵珊
 */
public class ArrayListIncludeHashMapDemo {
    public static void main(String[] args) {
        // 1:创建一个ArrayList集合，存储三个元素，
        // 每一个元素都是HashMap，每一个HashMap的键和值都是String
        ArrayList<HashMap<String,String>> array = new ArrayList<HashMap<String,String>>();

        //2.1:创建第一个 HashMap集合，并添加键值对元素
        HashMap<String,String> hm1 = new HashMap<String,String>();
        //2.1:添加 第一个HashMap集合的元素：
        hm1.put("孙策","大乔");
        hm1.put("周瑜","小乔");

        //2.2:创建第二个 HashMap集合，并添加键值对元素
        HashMap<String,String> hm2 = new HashMap<String,String>();
        //2.2:添加 第二个HashMap集合的元素：
        hm1.put("郭靖","黄蓉");
        hm1.put("杨过","小龙女");

        //2.3:创建第三个 HashMap集合，并添加键值对元素
        HashMap<String,String> hm3 = new HashMap<String,String>();
        //2.3:添加 第三个HashMap集合的元素：
        hm1.put("令狐冲","任盈盈");
        hm1.put("林平之","岳灵珊");

        //3:把HashMap作为元素添加到ArrayList集合
        array.add(hm1);
        array.add(hm2);
        array.add(hm3);

        //4:遍历ArrayList集合
        for (HashMap<String,String> hm : array) {
            Set<String> keySet = hm.keySet();
            for (String key : keySet) {
                String value = hm.get(key);
                System.out.println(key + ":" + value);
            }
        }

    }
}