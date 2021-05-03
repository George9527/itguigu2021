package test;

import java.util.HashMap;
import java.util.Set;

public class Something {

    public static void main(String[] args){

        HashMap<String, Integer> map = new HashMap<>();

        map.put(null, 0);

        Set<String> keySet = map.keySet();

        for (String key : keySet) {

            System.out.println(key+":"+map.get(key));

        }

    }

}