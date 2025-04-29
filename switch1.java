import java.util.Scanner;
class switch1 {
  
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        switch (a) {
                case 1 :            
                System.out.println("Sunday");                
                break;
                case 2 :                
                System.out.println("Monday");
                break;
                case 3 :                
                System.out.println("tuesday");
                break;        
            case 4:
            System.out.println("wednesday");
            break;
                case 5 :                
                System.out.println("Thusday");                
                break;
                case 6 :                
                System.out.println("Friday");                
                break;
                case 7 :                
                System.out.println("Saturday");
                 break;
                  
        }
       
    }
    
}
