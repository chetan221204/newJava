package dynamicArray;
import java.util.HashSet;
public class rovDublicate {
    public static void main(String[] args) {
        int[] a={1,12,3,2,12,3,1};
        HashSet<Integer> set=new HashSet<>() ; 
        for(int i=0;i<a.length;i++){
        set.add(a[i]);
        }
        System.out.println(set);
    }
    
}
