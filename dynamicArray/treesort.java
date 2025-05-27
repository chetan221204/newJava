package dynamicArray;
import java.util.TreeSet;
public class treesort {
    public static void main(String[] args) {
        int[] a={2,54,10,34,76,78};
        TreeSet<Integer> set=new TreeSet<>();
        for(int i=0;i<a.length;i++){
            set.add(a[i]);
        }
        System.out.println(set);
    }
}
