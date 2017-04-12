package Lesson9;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by P-C on 3/24/2017.
 */
public class MapExample {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("one", 111);
        map.put("two", 222);
        map.put("three", 333);
        map.put("four", 333);
        //get and show all keys
       System.out.println("Set of keys: " + map.keySet());
        //get and show value by keys
        Integer val = (Integer)map.get("one");
        System.out.println("one= " + val);
        //get and show all values
        System.out.println("collaction of values:" + map.values());
        //get and show all pairs
        System.out.println("set of entries" + map.entrySet());
    }
}
