public class sum {
    public static void main(String[] args) {
        int a=123;
        int sum=0;
        int original=a;
        while (a!=0) {
            int i =a%10;
           
            sum+=i;
            a/=10;
            System.out.println(sum);
        }
    }
    
}
