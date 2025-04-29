import java.util.Scanner;
public class array1 {
    public static void main(String[] args) {
        Scanner in= new Scanner (System.in);
        System.out.println("Enter Size Of Array");
        int n=in.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter Element Of Array");
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        System.out.println("Array is");
        //  for(int k=0;k<arr.length;k++){
        //     System.out.println(arr[k]);3

        // }
        for(int k=n-1;k>=0;k--){
            System.out.println(arr[k]);
        }
    }
}
