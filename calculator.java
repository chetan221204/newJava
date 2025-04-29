import java.util.Scanner;
public class calculator {
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter First Number"); //input a
        int a=in.nextInt();

        System.out.println("Enter Second Number"); //input b
        int b = in.nextInt();

        System.out.println("Enter Your Command"); //input char
         char c= in.next().charAt(0);

      switch (c) {
        case '+' :
            System.out.println(a+b);
            break;
        case '-' :
            System.out.println(a-b);
            break; 
        case '*' :
            System.out.println(a*b);
            break;
        case '/' :
            System.out.println(a/b);
            break;           

      
        default:
        System.out.println("INVALID INPUT");
            break;
      }   




    }
    
}
