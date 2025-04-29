import java.util.Scanner;
public class arrmax {
    public static void main(String[] args) 
    {
        Scanner in= new Scanner (System.in);
        System.out.println("Enter Size Of Array");
        int n=in.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter Element Of Array");
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
            
        }
        //maximum num
        int MAX =0;
        for(int j=0;j<=n-1;j++){
           if(arr[j]>MAX){
            MAX=arr[j];  
               
           }
          
           
       } System.out.println("Maximum " + MAX);

    }
}
