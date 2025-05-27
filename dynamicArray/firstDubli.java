package dynamicArray;

import java.util.HashSet;

public class firstDubli {

    public static void main(String[] args) {
        int[] a={1,12,12,3,2,12,3,3,1};
        HashSet<Integer> set=new HashSet<>() ; 
        // int count=0;
        for(int i=1;i<a.length;i++){
            for(int j=1;j<a.length)
            if(a[i]==a[i-1]){
        set.add(a[i]);
        
        } 

        }
        System.out.println(set);
    }
    
}
