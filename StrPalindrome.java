import java.util.Scanner;

public class StrPalindrome {
    public static void main(String[] args) {
 //       String str ="racecar";
        Scanner sc = new Scanner(System.in);
        String in = sc.nextLine();
        String rev = "";
        for(int i=0;i<in.length();i++)
        {
            rev+=in.charAt(i);
            System.out.println(in.charAt(i));
        
        }
        System.out.println("reverse of string");
        String rev1 ="";
        for(int j=in.length()-1;j>=0;j--)
        {
            rev1+=in.charAt(j);
           System.out.println(in.charAt(j));
             
            }
            
            
            if(rev.equals(rev1)){
                System.out.println("Its a palindrome");
            }
            else{
                System.out.println("Not a palindrome");
            }
        }
    }
    

