package dynamicArray;
import java.util.HashSet;
public class rovDublicate {
    public static void main(String[] args) {
        int[] a={1,12,12,3,2,12,3,3,1};
        HashSet<Integer> set=new HashSet<>() ; 
        int count=0;
        for(int i=1;i<a.length;i++){
            if(a[i]==a[i-1]){
        set.add(a[i]);
        count =1;
        }if(count==1){
            break;
        }
        }
        System.out.println(set);
    }
    
}
