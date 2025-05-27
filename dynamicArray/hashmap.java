package dynamicArray;

import java.util.HashMap;

public class hashmap {
    // if the id is same than the last map.put will be print

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("id1", 1);
        map.put("id2", 2);
        map.put("id3", 3);
        map.remove("id2");
        System.out.println(map);
        System.out.println(map.get("id2"));
        System.out.println(map.containsKey("id1"));
        System.out.println(map.containsValue(5));
        
    }
}
