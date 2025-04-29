public class stringLength {
    public static void main(String[] args) {
        String str1 ="HelIo";
        String str2 ="HHIII";
        int count = 0;
        for(int i=0;i<str1.length();i++){
             if(str1.charAt(i)==str2.charAt(i)){
                 count ++;
                //  System.out.println("");
                System.out.println(str1.charAt(i));
             }
        }
    }
    
}
