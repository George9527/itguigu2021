package D14_哈希表存储对象的过程;

import java.util.HashSet;
import java.util.Set;

public class Demo {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();
        //存储对象
        set.add("abc");
        set.add("bbc");
        set.add(new String("abc"));
        set.add("通话");
        set.add("重地");
        System.out.println("set = " + set);
    }
}
