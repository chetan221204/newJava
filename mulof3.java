import java.util.Scanner;
public class mulof3 {
        public static void main(String[] args) {
            Scanner in= new Scanner(System.in);
            System.out.println("Enter a Number:");
            int a = in.nextInt();
            if(a%3==0){
                System.out.println("Number is multiple of 3");
            }
            else
            System.out.println("Num is not a multiple of 3");
            
        
    }
}