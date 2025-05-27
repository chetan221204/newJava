import java.util.ArrayList;

public class array {
    public static void main(String[] args) {
        int[] arr1={1,2,8,6,7,9,10};
        ArrayList<String> arr = new ArrayList<>();
        arr.add("ram");
        arr.add("om");
        arr.add("rahul");
        arr.add("mohit");
        arr.add("A");
          
        arr.add(0, "khan");
        // arr.get(0);
        System.out.println(arr);
        System.out.println(arr.get(4));
        System.out.println(arr.set(2, null));
        
        
    }    
}
