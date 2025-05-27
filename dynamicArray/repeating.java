package dynamicArray;

import java.util.HashSet;
import java.util.TreeSet;

public class repeating {

    public static void main(String[] args) {
        int[] a={12,1,2,2,54,56};
        HashSet<Integer> set=new HashSet();
        for(int i=0;i<a.length;i++){
            for(int j=1;j<a.length;j++){
                if(a[i]==a[j+1]);
            }
        }

    }
}