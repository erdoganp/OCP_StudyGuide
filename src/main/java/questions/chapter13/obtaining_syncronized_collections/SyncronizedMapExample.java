package questions.chapter13.obtaining_syncronized_collections;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class SyncronizedMapExample {

    public static void main(String[] args) {

        Map<String,String> map =new HashMap<>();

        map.put("value1", "20");
        map.put("value2", "30");
        map.put("value3" , "40");

        System.out.println("Map : " + map);
        Map<String, String > synchronizedMap= Collections.synchronizedMap(map);

        System.out.println("Synchronized map is : " + synchronizedMap);
    }
}
