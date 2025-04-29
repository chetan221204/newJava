import java.util.Scanner;
public class greater_of_two {

    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter First Number:");

        int a = in.nextInt();

        System.out.println("Enter Second Number:");
        int b = in.nextInt();
        
        if(b<a){
            System.out.println("a is greater");
        }
        else if(b>a){
            System.out.println("b is greater");
        }      
        else 
            System.out.println("a & b are equal");
         
         }
}