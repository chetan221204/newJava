public class StrCount {
    public static void main(String[] args) {
        
    String str ="raer";
    String str1 ="r";
     
   int count=0;
    for(int i=0;i<str.length();i++){
        if(str1.charAt(0)==str.charAt(i)){
            count ++;
        }
    }
    System.out.println(count);
}
}
