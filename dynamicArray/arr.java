package dynamicArray;

import java.sql.Array;
import java.util.ArrayList;

public class arr {
    public static void main(String[] args) {
        ArrayList<String> arr= new ArrayList<>();
        arr.add("hello");
        arr.add("hii");
        arr.add("bye");
        arr.set(0, "keseHO");
        arr.remove(1);
        arr.clear();
        System.out.println(arr);
        System.out.println(arr.get(1));
    }
    
}
