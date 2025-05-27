package dynamicArray;

import java.util.HashMap;

public class hashmap1 {
    public static void main(String[] args) {
        HashMap<Integer , Integer> map=new HashMap<>();
        map.put(1, 1);
        map.put(2,2);
        map.put(3, 3);
        
        map.forEach((key,value)->{ 

            if(key>2){

            System.out.println(key + " " +value);
            }
        });
    

    }
    
}
