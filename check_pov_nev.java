import java.util.Scanner;
public class check_pov_nev {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter a Number:");
        int a = in.nextInt();
        
        if(a<0){
            System.out.println("NUM IS NEGATIVE");
        } 
        else if(a>0){
            System.out.println("NUM IS POSITIVE");
        }
        else{
            System.out.println("NUM IS ZERO");
        }
    }
    
}
