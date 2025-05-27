package dynamicArray;

import java.util.LinkedList;

public class linklist {

        public static void main(String[] args) {
            
            LinkedList<Integer> arr= new LinkedList<>();
            // long start =System.nanoTime();
            // arr.add(5);
            // System.out.println(arr.contains(5));
            // long end =System.nanoTime();
            arr.add(5);
            arr.add(10);
            arr.add(15);
            arr.set(0, 20);
            // arr.remove(1);
            System.out.println(arr.contains(30));
        }

    
}
